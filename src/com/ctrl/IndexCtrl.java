package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/forward")
public class IndexCtrl {
	
	private static final String MAIN_PAGE = "springLearnMain";
	private static final String PRACTICE_PAGE = "springPractice";
	
	//可攜帶額外參數的寫法
//	@RequestMapping(value = "/mainPage")
//	public ModelAndView forwardToMainPage(){
//		ModelAndView mav = new ModelAndView(MAIN_PAGE);
//		mav.addObject("KB", new Date());
//		return mav;
//	}
	
	//單純回傳邏輯名稱，將會被 InternalResourceViewResolver 解析成對應路徑(view)
	//接著再由DispatcherServlet 派發
	@RequestMapping(value = "/mainPage")
	public String forwardToMainPage(){
		return MAIN_PAGE;
	}
	
	@RequestMapping(value = "/practicePage")
	public String forwardToPracticePage(){
		return PRACTICE_PAGE;
	}
}
