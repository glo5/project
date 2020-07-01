<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file=".././include/head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
	<div class="container">
		<div class="left">
			<%@include file=".././include/menu.jsp" %>
		</div>
		<div class="right">
			<div>
				<div>기준일자<input type="date" name="reqStartDate" id="reqStartDate"/>~<input type="date" name="reqEndDate" id="reqEndDate"/>
					부서  <input type="text" name="reqDept" id="reqDept"/>
					직원 <input type="text" name="reqStaff" id="reqStaff">
					<button class="workSelectList">조회</button>
				</div>
				<table id="workList">
					
					
					
				</table>
				
				
			</div>
		</div>
	</div>
	<%@ include file=".././include/footer.jsp" %>
</body>
</html>