<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 	uri="http://java.sun.com/jsp/jstl/core"%>      
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KB Spring Learn</title>
	<link href='http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700|Open+Sans:400,600,700' rel='stylesheet' type='text/css' />
	<link href="<c:url value="/resources/css/default.css"/>" rel="stylesheet" type="text/css" media="all" />
	<!-- script reference -->
	<script type="text/javascript" src="<c:url value="/resources/js/common/jquery-2.2.0.js"/>"></script>
	<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
	</script>
</head>
<body>
	<img src="<c:url value="/resources/images/main-bg.jpg"/>" width="100%" height="100%" id="full-screen-background-image" />
	<div id="wrapper">
		<div id="header-wrapper">
			<div id="header" class="container">
				<div id="logo">
					<img src="<c:url value="/resources/images/springLogo.jpg"/>" height="100px">
				</div>
				<div id="menu"></div>
			</div>
		</div>
		<div id="page" class="container" style="min-height: 500px;">
			<div id="content" style="min-height: 400px;"></div>
			<div id="sidebar" style="min-height: 400px;">
				<h2>Function List</h2>
				<ul id="functionList" class="style3"></ul>
			</div>
		</div>
		<div id="footer">
			<p>
				&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.
				&emsp;<fmt:message key="kb.springLearnMain.warning" />
			</p>
		</div>
	</div>
	
	<script type="text/javascript" src="<c:url value="/resources/js/system/springLearnMain.js"/>"></script>  
</body>
</html>