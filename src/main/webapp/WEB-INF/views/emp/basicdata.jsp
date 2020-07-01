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
			<div class="search-box">
			 	<div>
			 		<span><lable for="requestGroup">부서:</lable></span>
			 		<span><input type="text" name="requestGroup" id="requestGroup"></span>
			 	</div>
			 	<div>
			 		<span><label for="requestId">사원번호</label></span>
			 		<span><input type="text" name="requestId" id="requestId"></span>
			 	</div>
			 	<div><button class="selectBtn btn">조회</button></div>
			</div>
			<div class="btn-box">
				<div>
				<button class="newBtn btn">새로만들기</button><button class="updateBtn btn">저장</button><button class="deleteBtn btn">삭제</button>
				</div>
			</div>
			<form id="frm">
			<table width="1200">
				<tr>
					<td><label for="id">사원번호</label></td>
					<td><input type="text" name="id" value="${id}" id="id" readonly="readonly"/></td>
					<td><label for="name">사원명</label></td>
					<td><input type="text" name="name" id="name"/></td>
					<td colspan="2"><label for="number">주민등록번호</label></td>
					<td colspan="2"><input type="text" name="number" id="number" maxlength="13"/></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<select name="gender" id="gender">
							<option value="남">남</option>
							<option value="녀">녀</option>
						</select>
					</td>
					<td>혈액형</td>
					<td>
						<select name="blodType" id="blodType">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="O">O</option>
							<option value="AB">AB</option>
						</select>
					</td>
					<td><label for="department">부서</label></td>
					<td><input type="text" name="department" id="department"/></td>
					<td><label for="staff">직위</label></td>
					<td><input type="text" name="staff" id="staff"> </td>
				</tr>
				<tr>
					<td><label for="officePhone">사내전화</label></td>
					<td><input type="text" name="officePhone" id='officePhone' maxlength="13"/></td>
					<td><label for="phone">휴대폰</label></td>
					<td><input type="text" name="phone" id="phone" maxlength="13"/></td>
					<td><label for="email">이메일</label></td>
					<td colspan="3"><input width="100%" type="text" name="email" id="email"/></td>
				</tr>
				<tr>
					<td><label for="jobType">채용구분</label></td>
					<td><input type="text" name="jobType" id="jobType"/></td>
					<td>입사일</td>
					<td><input type="date" name="startDate" id="startDate"/></td>
					<td>근속년월</td>
					<td><input type="text" name="longDate" disabled="disabled" id="longDate"></td>
					<td>퇴사일</td>
					<td><input type="date" name="lastDate" id="lastDate"></td>
				</tr>
				
			</table>
	</form>
		</div>
	</div>
	<%@ include file="../include/footer.jsp" %>
