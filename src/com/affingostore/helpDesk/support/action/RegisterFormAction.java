package com.affingostore.helpDesk.support.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionFormBean;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.ValidatorForm;

import com.affingostore.helpDesk.support.form.RegisterForm;
import com.affingostore.helpDesk.user.UserSupport;



public class RegisterFormAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		
		RegisterForm registerForm = (RegisterForm) form;
		String email = registerForm.getEmail();
		String password = registerForm.getPwd1();
		ActionMessages errors = new ActionMessages();
		
		if(UserSupport.exists()) {
			errors.add("email", new ActionMessage("reg.error.email.exists"));
			//saveErrors(request, errors);
			return mapping.getInputForward();
		} else {
			
			UserSupport newUser = new UserSupport();
			newUser.setEmail(email);
			//newUser.setPas(password);
			return mapping.findForward("success");
		}
	}
}
