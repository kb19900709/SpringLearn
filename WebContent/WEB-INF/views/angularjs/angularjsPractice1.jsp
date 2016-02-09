<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" 	uri="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KB Spring Learn</title>
</head>
<body>
	<div ng-app>
		<input type="text" ng-model="name" placeholder="Enter your name"/>
		<H1>Hello <span ng-bind="name"></span></H1>
		<!-- <H1>Hello {{name}} -->
	</div>

	<script type="text/javascript" src="<c:url value="/resources/js/common/angular.min.js"/>"></script>
</body>
</html>