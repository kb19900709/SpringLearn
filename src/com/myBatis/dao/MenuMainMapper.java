package com.myBatis.dao;

import com.myBatis.model.MenuMain;
import java.math.BigDecimal;
import java.util.List;

public interface MenuMainMapper {
    int deleteByPrimaryKey(BigDecimal menuIndex);

    int insert(MenuMain record);

    MenuMain selectByPrimaryKey(BigDecimal menuIndex);

    List<MenuMain> selectAll();

    int updateByPrimaryKey(MenuMain record);
}