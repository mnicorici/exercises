package co.uk.endava.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.uk.endava.model.User;

@Controller
public class LoginController 
{
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String showAddUserForm(Model model) 
	{
		User user = new User();
		model.addAttribute("login", user);
		return "login"; 
	}

	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("login")User user,BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "login";
		}
		else
		{
			model.addAttribute("username", user.getUsername());
			model.addAttribute("password", user.getPassword());
			
			return "result";
		}
	}
}
