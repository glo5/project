<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../include/head.jsp" %>
<body>
	<div class="con">
		<div class="left collapse" id="left">
			<%@include file="../include/menu.jsp" %>
		</div>
		<div class="right">
			<h1>조직관리</h1>
			
		<div class="right-box column">
			<div class="date-box">
			 	<div>
			 		<span>기준일자</span>
			 		<span><input type="date" name="startDate" id="startDate"/></span>
			 	</div>
			 	<div><button class="manaBtn btn btn-secondary ">조회</button></div>
			</div>
			<div class="content">
			
			</div>
		</div>
		</div>
		</div>

<%@ include file="../include/footer.jsp" %>
