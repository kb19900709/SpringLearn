package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/index")
public class IndexCtrl {
	
	private static final String PRATICE_VIEW = "springPractice";
	
	@RequestMapping(value = "/forwardToPracticePage")
	public ModelAndView forwardToPracticePage(){
		return new ModelAndView(PRATICE_VIEW);
	}
}
