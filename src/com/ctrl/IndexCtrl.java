package com.ctrl;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class IndexCtrl {

	@Autowired
	private ApplicationContext act;

	@RequestMapping(value = "/test")
	public void test() throws SQLException{

		for(String x:act.getBeanDefinitionNames()){
			System.out.println(x);
		}
		
	}
}
