package com.myBatis.model;

import java.math.BigDecimal;

public class MenuDetail {
    private BigDecimal menuDetailIndex;

    private BigDecimal menuIndex;

    private String menuDetailName;

    private Integer menuDetailOrder;

    private String menuDetailDesc;

    private String menuFunctiongPage;

    public BigDecimal getMenuDetailIndex() {
        return menuDetailIndex;
    }

    public void setMenuDetailIndex(BigDecimal menuDetailIndex) {
        this.menuDetailIndex = menuDetailIndex;
    }

    public BigDecimal getMenuIndex() {
        return menuIndex;
    }

    public void setMenuIndex(BigDecimal menuIndex) {
        this.menuIndex = menuIndex;
    }

    public String getMenuDetailName() {
        return menuDetailName;
    }

    public void setMenuDetailName(String menuDetailName) {
        this.menuDetailName = menuDetailName == null ? null : menuDetailName.trim();
    }

    public Integer getMenuDetailOrder() {
        return menuDetailOrder;
    }

    public void setMenuDetailOrder(Integer menuDetailOrder) {
        this.menuDetailOrder = menuDetailOrder;
    }

    public String getMenuDetailDesc() {
        return menuDetailDesc;
    }

    public void setMenuDetailDesc(String menuDetailDesc) {
        this.menuDetailDesc = menuDetailDesc == null ? null : menuDetailDesc.trim();
    }

    public String getMenuFunctiongPage() {
        return menuFunctiongPage;
    }

    public void setMenuFunctiongPage(String menuFunctiongPage) {
        this.menuFunctiongPage = menuFunctiongPage == null ? null : menuFunctiongPage.trim();
    }
}