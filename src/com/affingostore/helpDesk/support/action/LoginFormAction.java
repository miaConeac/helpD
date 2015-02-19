package com.affingostore.helpDesk.support.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.affingostore.helpDesk.support.form.LoginForm;
import com.affingostore.helpDesk.user.UserSupport;

public class LoginFormAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("in loginform action");
		LoginForm loginForm = (LoginForm)form;
		
		String email =	loginForm.getEmail();
		String password = loginForm.getPassword();
		
		ActionErrors errors = new ActionErrors();
		
		if(UserSupport.exists()) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userId", email);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failure");
		}
			
	}
}
