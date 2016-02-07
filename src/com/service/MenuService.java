package com.service;

import java.util.List;
import java.util.Map;

import com.myBatis.model.MenuMain;

public interface MenuService {
	public boolean createMenu(Map<String,Object> params) throws Exception;
	public boolean createMenuDetail(Map<String,Object> params) throws Exception;
	public List<MenuMain> getAllMenu() throws Exception;
	public void menuJobTest() throws Exception;
}
