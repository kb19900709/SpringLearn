CREATE TABLE MENU_MAIN(
  MENU_INDEX NUMBER(20) NOT NULL PRIMARY KEY
  ,MENU_NAME VARCHAR(20)
  ,MENU_ORDER NUMBER(2)
  ,MENU_WAITING_PAGE VARCHAR(20)
);
CREATE SEQUENCE MENU_MAIN_SEQ;

CREATE TABLE MENU_DETAIL(
  MENU_DETAIL_INDEX NUMBER(20) NOT NULL PRIMARY KEY
  ,MENU_DETAIL_NAME VARCHAR(20)
  ,MENU_DETAIL_ORDER NUMBER(2)
  ,MENU_DETAIL_DESC VARCHAR(200)
  ,MENU_FUNCTIONG_PAGE VARCHAR(20)
);
CREATE SEQUENCE MENU_DETAIL_SEQ;