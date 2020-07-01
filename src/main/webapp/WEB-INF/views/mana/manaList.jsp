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
			 </div>
			 <div><button class="manaselectBtn btn">조회</button></div>
			<div class="right-box">
		
		
			<div class="left-content">
				<form id="frm">	
				<ul class="box">
				    <li class="main"><input type="button" class="up" value="+"><a href="#">(주)피플데이타</a>
                        <ul class="menu">
                            <li><a href="#">영업팀</a></li>
                            <li><a href="#">바다의별</a></li>
                            <li><input type="button" class="up" value="+"><a href="#">테스트</a>
                                <ul class="menu">
                                    <li><a href="#">바다의 별</a></li>
                                    <li><a href="#">지역사회</a></li>
                                </ul>
                            </li>
                            <li><a href="#">개발팀</a></li>
                            <li><input type="button" class="up" value="+"><a href="#">전략기획팀</a>	
                                <ul class="menu">
                                    <li>회계파트</li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
				</form>
			</div>
			<div class="right-content">
			
			
			<table width="1200">
				<tr>
					<th>No</th>
					<th>직원번호</th>
					<th>성명</th>
					<th>조직명</th>
					<th>시작일자</th>
					<th>직위</th>
					<th>직책</th>
					<th>회사</th>
				</tr>
				<tr>
					<td>${manager.id}<td>
					<td>${manager.groupName}<td>
					<td>${manager.groupId}<td>
					<td>${manager.groupSq}<td>
					<td>${manager.startDate}<td>
					<td>${manager.endDate}<td>
					<td>${manager.groupType}<td>
					<td>${manager.groupCount}<td>
				</tr>
				
			</table>
	</form>
		</div>
		</div>
		</div>


<%@ include file="../include/footer.jsp" %>
