<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="adminApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KB Angular Learn</title>
	<link href='http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700|Open+Sans:400,600,700' rel='stylesheet' type='text/css' />
	<link href="<c:url value="/resources/css/default.css"/>" rel="stylesheet" type="text/css" media="all" />
</head>
<body ng-controller="MainCtrl">
	<img src="<c:url value="/resources/images/main-bg.jpg"/>" width="100%" height="100%" id="full-screen-background-image" />
	
	<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
	</script>
	<script type="text/javascript" src="<c:url value="/resources/js/common/angular.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/angularjs/app/admin/adminPageApp.js"/>"></script>
</body>
</html>