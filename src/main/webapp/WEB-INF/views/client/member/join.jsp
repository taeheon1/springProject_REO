<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "No-cache");
	response.addHeader("Cache-Control", "No-store");
	response.setDateHeader("Expires", 1L);
%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>Insert title here</title>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<link type="text/css" rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
 		<link href="resources/css/client/member.css" rel="stylesheet">
	</head>
	<body>
		<div class="container"><br><hr>
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h2 class="card-title mt-3 text-center" style="font-size:35px">회원가입</h2>
				<br>
				<br>
				<p>
					<a href="" class="btn btn-block btn-twitter" id="twitter"> <i class="fab fa-twitter"></i> Login Twitter</a>
				    <a href="" class="btn btn-block btn-facebook" id="facebook"> <i class="fab fa-facebook-f"></i> Login facebook</a>
					<a href="" class="btn btn-block btn-facebook" id="kakao"> <i class="fa fa-comment"></i> Login kakao</a>
				</p>
				<p class="divider-text"><span class="bg-light">OR</span></p>
				<form:form>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-envelope"></i></span>
						</div>
						<input name="mem_email" class="form-control" placeholder="Email" type="text">
							<select class="custom-select" style="max-width: 160px;">
								<option selected="">메일주소</option>
								<option value="@naver.com">@naver.com</option>
								<option value="@daum.net">@daum.net</option>
								<option value="@google.com">@google.com</option>
								<option value="">직접입력</option>
							</select>
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"></span>
						</div>
						<input class="form-control" name="mem_pw" placeholder="Create password" type="password">
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i></span>
						</div>
						<input class="form-control" name="mem_pw" placeholder="Create password" type="password">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i></span>
						</div>
						<input class="form-control" placeholder="Repeat password" type="password">
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i></span>
						</div>
						<input name="" class="form-control" placeholder="Name" name="mem_name" type="text">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-phone"></i></span>
						</div>
						<select class="custom-select" style="max-width: 120px;">
							<option vlaue="010">010</option>
							<option value="011">011</option>
							<option value="016">016</option>
						</select> 
						<input name="mem_tel" class="form-control" placeholder="Phone number" type="text">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-building"></i></span>
						</div>
						<select class="form-control" name="mem_role">
							<option selected="">분류</option>
							<option>개인회원</option>
							<option>부동산중개인</option>
						</select>
					</div>
					<!-- form-group end.// -->
					<!-- form-group// -->
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">가입</button>
					</div>
					<!-- form-group// -->
					<p class="text-center">이미 가입되어 있습니까? <a href="">Log In</a></p>
				</form:form>
			</article>
		</div>
	</div>
</body>
</html>