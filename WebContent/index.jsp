<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KB Spring Learn</title>
	<link href='http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700|Open+Sans:400,600,700' rel='stylesheet' type='text/css' />
	<link href="<c:url value="/resources/css/default.css"/>" rel="stylesheet" type="text/css" media="all" />
	<script type="text/javascript" src="<c:url value="/resources/js/common/jquery-2.2.0.js"/>"></script>
</head>
<body>
	<img src="<c:url value="/resources/images/main-bg.jpg"/>" width="100%" height="100%" id="full-screen-background-image" />
	<div align="center">
		<img width="60%" height="60%" src='<c:url value="/resources/images/java-spring-tutorials.jpg"/>'>
		<br><br>
		<div align="center">
			<input type="radio" name="type" value="springLearnMain" checked="checked">guest
			<input type="radio" name="type" value="adminPage">admin
		</div>
		<br>
		<img id="enter" style="cursor: pointer; " src='<c:url value="/resources/images/enter.jpg"/>'>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('#enter').click(function(){
				var pageName = $('input[name=type]:checked').val();
				window.open('${pageContext.request.contextPath}/forward/dispatcher?pageName='+pageName,'_self');
			});
		});
	</script>
</body>
</html>