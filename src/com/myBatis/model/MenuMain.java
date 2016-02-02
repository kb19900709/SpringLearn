package com.myBatis.model;

import java.math.BigDecimal;

public class MenuMain {
    private BigDecimal menuIndex;

    private String menuName;

    private Integer menuOrder;

    private String menuWaitingPage;

    public BigDecimal getMenuIndex() {
        return menuIndex;
    }

    public void setMenuIndex(BigDecimal menuIndex) {
        this.menuIndex = menuIndex;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuWaitingPage() {
        return menuWaitingPage;
    }

    public void setMenuWaitingPage(String menuWaitingPage) {
        this.menuWaitingPage = menuWaitingPage == null ? null : menuWaitingPage.trim();
    }
}