<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Learn</title>
	<link href='http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700|Open+Sans:400,600,700' rel='stylesheet' type='text/css' />
	<link href="<c:url value="/resources/css/default.css"/>" rel="stylesheet" type="text/css" media="all" />
	<script type="text/javascript" src="<c:url value="/resources/js/common/jquery-2.2.0.js"/>"></script>
	<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
		$(document).ready(function(){
			$('#enter').click(function(){
				window.open(contextPath+'/index/forwardToPracticePage','_self');
			});
		});
	</script>
</head>
<body>
	<img src="<c:url value="/resources/images/main-bg.jpg"/>" width="100%" height="100%" id="full-screen-background-image" />
	<div align="center">
		<img width="60%" height="60%" src='<c:url value="/resources/images/java-spring-tutorials.jpg"/>'>
		<br><br>
		<button id="enter">基本設置備忘錄 by KB</button>
		<br>
		<h6>一切資源分享皆來自網路，有侵權請來信告知 : o922431962@yahoo.com.tw</h6>
	</div>
</body>
</html>