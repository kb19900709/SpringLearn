package com.service;

import java.util.List;

import com.myBatis.model.MenuMain;

public interface MenuService {
	public boolean createMenu(String menuName,Integer menuOrder,String menuWaitingPage) throws Exception;
	public List<MenuMain> getAllMenu() throws Exception;
}
