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
		<h1>조직원확인</h1>
		
			 
			<div class="right-box row">
		
		
			<div class="left-content">
				<form id="frm">	
				<ul class="box">
				    <li class="main"><input type="button" class="up" value="+"> <span class="menu-click">(주)피플데이타</span>
                        <ul class="menu">
                            <li><p style="padding-left: 20px;" class="menu-click">영업팀</p></li>
                            <li><p style="padding-left: 20px;" class="menu-click">바다의별</p></li>
                            <li><input style="margin-left: 20px;" type="button" class="up" value="+"> <span class="menu-click">테스트</span>
                                <ul class="menu">
                                    <li ><p style="padding-left: 40px;" class="menu-click">지역사회</p></li>
                                </ul>
                            </li>
                            <li><p style="padding-left: 20px;" class="menu-click">개발팀</p></li>
                            <li ><input  style="margin-left: 20px;" type="button" class="up" value="+"><span class="menu-click"> 전략기획팀</span>
                                <ul class="menu">
                                    <li><p style="padding-left: 40px; class="menu-click"> 회계파트</p></li>
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
