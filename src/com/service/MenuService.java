package com.service;

import java.util.List;
import com.myBatis.model.MenuDetail;
import com.myBatis.model.MenuMain;

public interface MenuService {
	public boolean createMenu(MenuMain menuMain) throws Exception;
	public boolean createMenuDetail(MenuDetail menuDetail) throws Exception;
	public List<MenuMain> getAllMenu() throws Exception;
	
	/**
	 * for quartz job test
	 * @throws Exception
	 */
	public void menuJobTest() throws Exception;
}
