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
		<h1>조직뷰</h1>
			<div class="search-box">		 
			 		<span>기준일자</span>
			 		<span><input type="date" name="startDate" id="startDate"/></span>
			 		<button class="manaselectBtn btn">조회</button>
			 </div>
			 
			<div class="right-box">
		
		
			<div class="left-content">
				<form id="frm">	
				<ul class="box">
				    <li class="main"><input type="button" class="up" value="+"> <span class="menu-click">(주)피플데이타</span>
                        <ul class="menu">
                            <li> <p class="menu-click">영업팀</p></li>
                            <li> <p class="menu-click">바다의별</p></li>
                            <li><input type="button" class="up" value="+"> <span class="menu-click">테스트</span>
                                <ul class="menu">
                                    <li> <p class="menu-click">다의 별</p></li>
                                    <li ><p class="menu-click">지역사회</p></li>
                                </ul>
                            </li>
                            <li><p class="menu-click"> 개발팀</p>개발팀</li>
                            <li ><input type="button" class="up" value="+"><span class="menu-click"> 전략기획팀</span>
                                <ul class="menu">
                                    <li><p class="menu-click"> 회계파트</p></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
				</form>
			</div>
			<div class="right-content">
			
			<div class="content">
			
			</div>
	</form>
		</div>
		</div>
		</div>


<%@ include file="../include/footer.jsp" %>
