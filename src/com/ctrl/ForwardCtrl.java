package com.ctrl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/forward")
public class ForwardCtrl {
	
	private Logger logger = LoggerFactory.getLogger(ForwardCtrl.class);
	
	private static final String MAIN_PAGE = "springLearnMain";
	private static final String PRACTICE_PAGE = "springPractice";
	
	@Autowired
	private DataSource ds;
	
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
		try {
			Connection conn = ds.getConnection();
			logger.info("test conn >>> "+conn);
			conn.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		logger.info("ForwardCtrl.forwardToMainPage");
		return MAIN_PAGE;
	}
	
	@RequestMapping(value = "/practicePage")
	public String forwardToPracticePage(){
		logger.info("ForwardCtrl.forwardToPracticePage");
		return PRACTICE_PAGE;
	}
}
