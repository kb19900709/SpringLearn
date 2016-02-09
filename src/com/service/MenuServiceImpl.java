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
	public boolean createMenu(MenuMain menuMain) throws Exception{
		logger.info("createMenu begin");
		
		String menuName = menuMain.getMenuName();
		if(StringUtils.isEmpty(menuName)){
			return false;
		}

		menuMainMapper.insert(menuMain);
		return true;
	}

	@Override
	public boolean createMenuDetail(MenuDetail menuDetail)
			throws Exception {
		logger.info("createMenuDetail begin");
		
		BigDecimal menuIndex = menuDetail.getMenuIndex();
		if(menuIndex == null){
	    	return false;
	    }

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
