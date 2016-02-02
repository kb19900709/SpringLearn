package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.myBatis.dao.MenuDetailMapper;
import com.myBatis.dao.MenuMainMapper;
import com.myBatis.model.MenuMain;

@Service
@Transactional
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuMainMapper menuMainMapper;
	
	@Autowired
	private MenuDetailMapper menuDetailMapper;

	@Override
	public boolean createMenu(String menuName, Integer menuOrder, String menuWaitingPage) throws Exception{
		if(StringUtils.isEmpty(menuName)){
			return false;
		}
		MenuMain menuMain = new MenuMain();
		menuMain.setMenuName(menuName);
		menuMain.setMenuOrder(menuOrder);
		menuMain.setMenuWaitingPage(menuWaitingPage);
		menuMainMapper.insert(menuMain);
		return true;
	}

	@Override
	public List<MenuMain> getAllMenu() throws Exception{
		return menuMainMapper.selectAll();
	}
}
