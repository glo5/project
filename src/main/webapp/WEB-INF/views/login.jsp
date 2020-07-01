<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<body>

	<div class="login-box">
		<div class="left">
		
		</div>

		<div class="right">
		<form action="/login" method="post" id="frm">
				<div class="form-box">
					<label for="id">id : </label>
					<input type="text" placeholder="아이디를 입력하세요." name="id" id="id"/>
				</div>
				<div class="form-box">
					<label for="password">password :</label>
					<input type="password" placeholder="비밀번호를 입력하세요." name="password" id="password"/>
				</div>
				<div class='form-btn'>
					<input type="button" name="btn" value="Login"/>
				</div>	
		</form>
		</div>
	</div>

</body>
</html>
