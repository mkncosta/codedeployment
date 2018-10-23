package org.costa.codedeploy.controller;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.Assert;

public class TestDemoController {
	


	DemoController demo = new DemoController();
	
	@Test
	public void testHomeRequest() {
		ModelAndView mv = demo.homeRequest();
		Assert.assertEquals("home", mv.getViewName());
	}
	
	@Test
	public void testError() {
		ModelAndView mv = demo.errorRequest();
		Assert.assertEquals("error", mv.getViewName());
	}
	


}
