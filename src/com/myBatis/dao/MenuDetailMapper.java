package com.myBatis.dao;

import com.myBatis.model.MenuDetail;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MenuDetailMapper {
    int deleteByPrimaryKey(BigDecimal menuDetailIndex);

    int insert(MenuDetail record);

    MenuDetail selectByPrimaryKey(BigDecimal menuDetailIndex);

    List<MenuDetail> selectAll();

    int updateByPrimaryKey(MenuDetail record);
    
    List<MenuDetail> selectByMenuIndex(@Param("menuIndex") BigDecimal menuIndex);
}