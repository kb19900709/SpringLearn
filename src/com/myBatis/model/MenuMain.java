package com.myBatis.model;

import java.math.BigDecimal;

public class MenuMain {
    private BigDecimal menuIndex;

    private String menuName;

    private Short menuOrder;

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

    public Short getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Short menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuWaitingPage() {
        return menuWaitingPage;
    }

    public void setMenuWaitingPage(String menuWaitingPage) {
        this.menuWaitingPage = menuWaitingPage == null ? null : menuWaitingPage.trim();
    }
}