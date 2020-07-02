<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../include/head.jsp" %>
<body>
	<div class="container">
		<div class="left">
			<%@include file="../include/menu.jsp" %>
		</div>
		<div class="right">
			<h1>기본사항</h1>
			<div class="date-box">
			 	<div>
			 		<span>기준일자</span>
			 		<span><input type="date" name="startDate" id="startDate"/></span>
			 	</div>
			 	<div><button class="manaBtn btn">조회</button></div>
			</div>
			<div class="content">
			
			</div>
		</div>
		</div>

<%@ include file="../include/footer.jsp" %>
