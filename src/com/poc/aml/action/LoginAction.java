package com.poc.aml.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.poc.aml.bean.LoginBean;
import com.poc.aml.mapping.UserMapping;

public class LoginAction  extends Action{

	public ActionForward execute ( ActionMapping mapping, ActionForm form,
									HttpServletRequest request, HttpServletResponse response) {

		LoginBean loginBean = (LoginBean) form;

		String mode = request.getParameter("mode");
		String page = request.getParameter("page");

		if (UserMapping.LOGIN.equalsIgnoreCase(mode)){

			String email = loginBean.getEmailId();
			String password = loginBean.getPassword();

			loginBean.checkLoginCredentials(email,password);

			return mapping.findForward("success");
		}

return mapping.findForward("success");


	}

}
