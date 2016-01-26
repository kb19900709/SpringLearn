package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/index")
public class IndexCtrl {
	
	private static final String PRATICE_VIEW = "springPracticeMain";
	
	//可攜帶額外參數的寫法
//	@RequestMapping(value = "/forwardToPracticePage")
//	public ModelAndView forwardToPracticePage(){
//		ModelAndView mav = new ModelAndView(PRATICE_VIEW);
//		mav.addObject("KB", new Date());
//		return mav;
//	}
	
	//單純回傳邏輯名稱，將會被 InternalResourceViewResolver 解析成對應路徑(view)
	//接著再由DispatcherServlet 派發
	@RequestMapping(value = "/forwardToPracticePage")
	public String forwardToPracticePage(){
		return PRATICE_VIEW;
	}
}
