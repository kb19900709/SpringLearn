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
	<div id="wrapper">
		<div id="header-wrapper">
			<div id="header" class="container">
				<div id="logo">
					<img src="<c:url value="/resources/images/springLogo.jpg"/>" height="100px">
				</div>
				<div id="menu">
					<ul>
						<li class="active"><a href="#" accesskey="1" title="">Homepage</a></li>
						<li><a href="#" accesskey="2" title="">Spring Practice</a></li>
						<li><a href="#" accesskey="3" title="">Others</a></li>
						<li><a href="#" accesskey="4" title="">About me</a></li>
						<li><a href="#" accesskey="5" title="">Contact me</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="page" class="container">
			<div id="content">
				<div id="box1">
					<h2 class="title"><a href="#">Welcome to KB Spring Learn</a></h2>
					<p>這是<strong>Spring Learn</strong>，免費且公開的學習網站。</p>
				</div>
				<!--  
				<div>
					<ul class="style1">
						<li class="first">
							<h3><em><img src="images/img02.jpg" alt="" width="130" height="130" class="alignleft border" /></em>Lorem ipsum dolor interdum</h3>
							<p>Ut vel nisl tristique justo ornare iaculis. Suspendisse suscipit, orci ac interdum viverra, nulla orci facilisis mi, a ultrices mi lectus vitae felis. Morbi suscipit adipiscing orci et blandit. Morbi a nulla ut tellus blandit placerat a quis eros.</p>
							<p><a href="#" class="button-style">Read More</a></p>
						</li>
						<li>
							<h3><em><img src="images/img03.jpg" alt="" width="130" height="130" class="alignleft border" /></em>Magna phasellus etiam ultrices</h3>
							<p>Ut vel nisl tristique justo ornare iaculis. Suspendisse suscipit, orci ac interdum viverra, nulla orci facilisis mi, a ultrices mi lectus vitae felis. Morbi suscipit adipiscing orci et blandit. Morbi a nulla ut tellus blandit placerat a quis eros.</p>
							<p><a href="#" class="button-style">Read More</a></p>
						</li>
					</ul>
				</div>
				-->
			</div>
			<!-- 
			<div id="sidebar">
				<h2>Fusce ultrices</h2>
				<ul class="style3">
					<li class="first">
						<p class="date">01-14-2013</p>
						<p><a href="#">Vestibulum laoreet lorem sed amet condimentum eget ultrices et mago porttitor nequese blandit.</a></p>
					</li>
					<li>
						<p class="date">01-13-2013</p>
						<p><a href="#">Vestibulum laoreet lorem sed amet condimentum eget ultrices et mago porttitor nequese blandit.</a></p>
					</li>
					<li>
						<p class="date">01-07-2013</p>
						<p><a href="#">Vestibulum laoreet lorem sed amet condimentum eget ultrices et mago porttitor nequese blandit.</a></p>
					</li>
				</ul>
			</div>
			 -->
		</div>
		<div id="footer">
			<p>&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
		</div>
	</div>
</body>
</html>