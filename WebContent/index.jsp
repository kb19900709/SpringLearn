<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Learn by KB</title>
	<script type="text/javascript" src="<c:url value="/resources/js/common/jquery-2.2.0.js"/>"></script>
	<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
		$(document).ready(function(){
			$('#hyperLink').click(function(){
				window.open(contextPath+'/index/forwardToPracticePage','_self');
			});
		});
	</script>
</head>
<body>
	<div align="center">
		<img width="60%" height="60%" src='<c:url value="/resources/images/java-spring-tutorials.jpg"/>'>
		<br>
		<a id="hyperLink" href="#" style="color:blue;">基本設置備忘錄 by KB</a>
	</div>
</body>
</html>