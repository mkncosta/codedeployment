package org.costa.codedeploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView homeRequest() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("status","This is done by me");
		return mv;
	}
	
	@RequestMapping(value= {"/error"})
	public ModelAndView errorRequest() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("error","Error found..");
		return mv;
	}
}
