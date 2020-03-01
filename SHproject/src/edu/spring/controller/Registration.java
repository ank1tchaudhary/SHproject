package edu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.spring.service.RegistrationService;

@Controller
public class Registration {
@Autowired
RegistrationService service;

	@RequestMapping(value="registerEmployee",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView registration(@ModelAttribute() edu.spring.model.Registration registration,HttpServletRequest request) {
	int i=	service.save(registration);
	if(i > 0)	{
		System.out.println("success");
	return new ModelAndView("success");
	}
	else {
		System.out.println("fail");
		return new ModelAndView("index");
	}
	}
	
}
