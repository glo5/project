<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file=".././include/head.jsp" %>
<body>
	<div class="con">
		<div class="left collapse" id="left">
			<%@include file=".././include/menu.jsp" %>
		</div>
		<div class="right">
		<h1>출퇴근 기록</h1>
		<div class="right-box column flex-center">
		<form action="/work/insert" method="get" name="frm" id="frm">
			<table>
				<tr>
					<td><label for="id">사원번호: </label></td>
					<td><input type="text" name="id" id="id"></td>
					<td><label for="name">이름: </label></td>
					<td><input type="text" name="name" id="name"></td>
					<td><label for="date">출근일: </label></td>
					<td><input type="date" name="date" id="date"></td>
				</tr>
				<tr>
					<td><label for="startTime">시작시간: </label></td>			
					<td><input type="text" name="startTime" id="startTime" placeholder="00:00 형식"></td>					
					<td><label for="endTime">끝나는시간:</label></td>	
					<td><input type="text" name="endTime"  id="endTime" placeholder="00:00 형식"></td>
					<td><label for="addTime">연장근무시간:</label></td>	
					<td><input type="text" name="addTime" id="addTime" placeholder="00:00 형식"></td>
				</tr>
				<tr>
					<td><input type="button" value="전송" id="workBtn btn-secondary "/></td>
				</tr>		
		
			</table>
			</form>
		</div>
		</div>
	</div>
	<%@ include file=".././include/footer.jsp" %>
</body>
</html>