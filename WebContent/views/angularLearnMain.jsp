<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="kbApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KB Angular Learn</title>
	<link href='http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700|Open+Sans:400,600,700' rel='stylesheet' type='text/css' />
	<link href="<c:url value="/resources/css/default.css"/>" rel="stylesheet" type="text/css" media="all" />
</head>
<body ng-controller="AdminCtrl as ctrl">
	<img src="<c:url value="/resources/images/main-bg.jpg"/>" width="100%" height="100%" id="full-screen-background-image" />
	
	<div id="wrapper">
		<div id="header-wrapper">
			<div id="header" class="container">
				<div id="logo">
					<img src="<c:url value="/resources/images/angularLogo.jpg"/>" height="100px">
				</div>
				<div id="menu">
					<ul>
						<li ng-repeat="menu in ctrl.menuList track by menu.menuIndex" 
							ng-class="ctrl.isSelected(menu)" 
							ng-click="ctrl.clickMenu(menu)">
							<a ng-href="#/{{menu.menuWaitingPage}}"><span ng-bind="menu.menuName"></span></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div id="page" class="container" style="min-height: 500px;">
			<div id="content" style="min-height: 400px;max-height: 400px;overflow:auto;">
				<div ng-view></div>
			</div>
			<div id="sidebar" style="min-height: 400px;max-height: 400px;overflow:auto;">
				<h2>Function List</h2>
				<ul id="functionList" class="style3">
					<li ng-repeat="detail in ctrl.currentMenu.menuDetailList track by detail.menuDetailIndex">
						<p class="date"><span ng-bind="detail.createDate | date:'yyyy/MM/dd'"></span></p>
						<p>
							<H3>
								<a ng-href="#/{{detail.menuFunctiongPage}}" style="color:red;"><span ng-bind="detail.menuDetailName"></span></a>
							</H3>
						</p>
						<p><span ng-bind="detail.menuDetailDesc"></span></p>
					</li>
				</ul>
			</div>
		</div>
		<div id="footer">
			<p>
				&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.
				&emsp;<fmt:message key="kb.springLearnMain.warning" />
			</p>
		</div>
	</div>
	
	<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
	</script>
	<script type="text/javascript" src="<c:url value="/resources/js/common/angular.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/common/angular-route.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/common/angular-resource.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/angularjs/app/admin/kbApp.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/angularjs/app/admin/MenuService.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/angularjs/app/admin/AdminController.js"/>"></script>
</body>
</html>