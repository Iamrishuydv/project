package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@Autowired
	LoginService service; //= new LoginService();
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
//	@ResponseBody
	
	public String showLoginPage() {
		return "login";
	}


@RequestMapping(value="/login", method= RequestMethod.POST)

public String handleLoginRequest(@RequestParam String name, 
		@RequestParam String password,	ModelMap model) {
	
	if(!service.validateUser(name, password)) {
		model.put("errorMessage", "Invalid Credentials");
return "login";
}
	model.put("name", name);
	model.put("password", password);
	return "welcome";
	}
}

 