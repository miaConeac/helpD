package com.affingostore.helpDesk.support.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			HttpSession session = request.getSession();
			session.removeAttribute("userId");
			session.invalidate();
			return mapping.findForward("succes");
		} catch( Exception exp) {
			System.out.println("error removing userId");
		}
		return mapping.findForward("failure");
		
		
		
	}
			
		
}

