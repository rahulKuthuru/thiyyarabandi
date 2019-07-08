package com.spoors.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	DataDAO obj;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public ModelAndView Hello() {
		ModelAndView model= new ModelAndView("Index");
		return model;
	}
	
	@RequestMapping(value="/Quiz", method= RequestMethod.GET)
	public ModelAndView Hello1() {
		ModelAndView model= new ModelAndView("Quiz");
		return model;
	}
	
	@RequestMapping(value="/display", method= RequestMethod.GET)
	public ModelAndView Hello2(@ModelAttribute("data1") Data data1) {

		ModelAndView model=new ModelAndView("display");
		obj.create(data1);
		return model;
	}
	
}
