package com.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	
	
	@RequestMapping("/login") 
	public String createLogin() {
		return "logins";
	}
	
	@RequestMapping("/registration")
	public String createRegistration() {
		return "Registration";
		
	}
	@RequestMapping("/btnRegisterClick")
	public String RegistrationButton(HttpServletRequest request, Model model) {
		
		if(request.getParameter("user_name") != "" && request.getParameter("user_email")!= ""
				&& request.getParameter("user_password") != "")
		{String amk = (String) request.getParameter("user_name");
		String amt = (String) request.getParameter("user_email");
		model.addAttribute("username", amk);
		model.addAttribute("useremail", amt);
		model.addAttribute("msg", "Registration Successful");
		return "logins";}
		else {
			return "Registration";
		}
		
	}
}
