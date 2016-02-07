package com.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.myBatis.dao.MenuDetailMapper;
import com.myBatis.dao.MenuMainMapper;
import com.myBatis.model.MenuDetail;
import com.myBatis.model.MenuMain;

@Service
@Transactional
public class MenuServiceImpl implements MenuService{
	
	private Logger logger = LoggerFactory.getLogger(MenuService.class); 
	
	@Autowired
	private MenuMainMapper menuMainMapper;
	
	@Autowired
	private MenuDetailMapper menuDetailMapper;

	@Override
	public boolean createMenu(Map<String,Object> params) throws Exception{
		logger.info("createMenu begin >>> params:"+params);
		
		String menuName = MapUtils.getString(params, "menuName");
		if(StringUtils.isEmpty(menuName)){
			return false;
		}
		
		MenuMain menuMain = new MenuMain();	
		String menuWaitingPage = MapUtils.getString(params, "menuWaitingPage");
		Integer menuOrder = MapUtils.getInteger(params, "menuOrder");
		menuMain.setMenuName(menuName);
		menuMain.setMenuOrder(menuOrder);
		menuMain.setMenuWaitingPage(menuWaitingPage);
		menuMainMapper.insert(menuMain);
		return true;
	}

	@Override
	public boolean createMenuDetail(Map<String, Object> params)
			throws Exception {
		logger.info("createMenuDetail begin >>> params:"+params);
		
		String menuIndexStr = MapUtils.getString(params, "menuIndex");
		if(StringUtils.isEmpty(menuIndexStr)){
	    	return false;
	    }

	    MenuDetail menuDetail = new MenuDetail();
	    BigDecimal menuIndex = new BigDecimal(menuIndexStr);
	    String menuDetailName = MapUtils.getString(params, "menuDetailName");
	    String menuDetailDesc = MapUtils.getString(params, "menuDetailDesc");
	    String menuFunctiongPage = MapUtils.getString(params, "menuFunctiongPage");
	    Integer menuDetailOrder = MapUtils.getInteger(params, "menuDetailOrder");
	    menuDetail.setMenuIndex(menuIndex);
	    menuDetail.setMenuDetailName(menuDetailName);
	    menuDetail.setMenuDetailDesc(menuDetailDesc);
	    menuDetail.setMenuFunctiongPage(menuFunctiongPage);
	    menuDetail.setMenuDetailOrder(menuDetailOrder);
	    menuDetail.setCreateDate(new Date());
	    menuDetailMapper.insert(menuDetail);
		return true;
	}
	

	@Override
	public List<MenuMain> getAllMenu() throws Exception{
		logger.info("getAllMenu begin");
		List<MenuMain> menuList = menuMainMapper.selectAll();
		List<MenuDetail> menuDetailList = null;
		for(MenuMain menuMain:menuList){
			menuDetailList = menuDetailMapper.selectByMenuIndex(menuMain.getMenuIndex());
			if(CollectionUtils.isEmpty(menuDetailList)){
				continue;
			}
			menuMain.setMenuDetailList(menuDetailList);
		}
		return menuList;
	}

	@Override
	public void menuJobTest() throws Exception {
		logger.info("forJobTest begin");
		List<MenuMain> allMenu = getAllMenu();
		System.out.println("*****");
		if(CollectionUtils.isEmpty(allMenu)){
			System.out.println("this is job test by KB");
		}else{
			for(MenuMain menu:allMenu){
				System.out.println("menu name:"+menu.getMenuName());
			}
		}
		System.out.println("*****");
	}
}
