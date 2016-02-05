package com.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.service.MenuService;

@Controller
@RequestMapping(value = {"/forward","/home"})
public class SpringLearnMainCtrl {
	
	private Logger logger = LoggerFactory.getLogger(SpringLearnMainCtrl.class);
	
	@Autowired
	private MenuService menuService;

	//單純回傳邏輯名稱，將會被 InternalResourceViewResolver 解析成對應路徑(view)
	//接著再由DispatcherServlet 派發
	@RequestMapping(value = "/dispatcher")
	public String dispatcher(@RequestParam("pageName") String pageName){
		logger.info("ForwardCtrl.dispatcher >>> pageName :"+pageName+".jsp");
		return pageName;
	}
	
	@RequestMapping(value = "/getMenu")
	@ResponseBody
	public Map<String,Object> getMenu() throws Exception{
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("menuList", menuService.getAllMenu());
		return result;
	}

	//可攜帶額外參數的寫法
//	@RequestMapping(value = "/dispatcher")
//	public ModelAndView dispatcher(@RequestParam("pageName") String pageName){
//		logger.info("ForwardCtrl.dispatcher >>> pageName :"+pageName);
//		ModelAndView mav = new ModelAndView(pageName);
//		return mav;
//	}
}
