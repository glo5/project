<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file=".././include/head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
	<div class="con">
		<div class="left collapse" id="left">
			<%@include file=".././include/menu.jsp" %>
		</div>
		<div class="right">
		<h1>출퇴근 리스트</h1>
		<div class="right-box column">
		<form id="frm">
			<div class="column">
				<div><input type="button" class="downloadBtn" value="download"/>
				
				<input type="file" id="uploadFile">
				<input type="button" class="uploadBtn" value="upload">
				</div>
				<div>기준일자<input type="date" name="reqStartDate" id="reqStartDate"/>~<input type="date" name="reqEndDate" id="reqEndDate"/>
					부서  <input type="text" name="reqDept" id="reqDept"/>
					직원 <input type="text" name="reqStaff" id="reqStaff">
					<input type="button" class="workSelectList btn btn-secondary " value="조회"/>
				</div>
			</div>
		</form>
				<div class="content flex-center"> 
				
				</div>
				
				
			</div>
		</div>
	</div>
	<%@ include file=".././include/footer.jsp" %>
</body>
</html>