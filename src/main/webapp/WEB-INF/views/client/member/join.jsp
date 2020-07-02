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
 		<link href="resources/css/client/join.css" rel="stylesheet">
	</head>
	<body>
		<div class="container"><br>
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h2 class="card-title mt-3 text-center" style="font-size:35px">개인회원가입</h2>
				<br>
				<br>
				<p>
					<a href="" class="btn btn-block btn-twitter" id="google"> <i class="fab fa-google"></i> Login Google</a>
				    <a href="" class="btn btn-block btn-facebook" id="facebook"> <i class="fab fa-facebook-f"></i> Login facebook</a>
					<a href="" class="btn btn-block btn-facebook" id="kakao"> <i class="fa fa-comment"></i> Login kakao</a>
				</p>
				<p class="divider-text"><span class="bg-light">OR</span></p>
				<form:form commandName="memberDTO" method="POST" action="join.reo">
						<small><form:errors path="mem_email" cssClass="errmsg"/></small>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-envelope"></i></span>
						</div>
						<form:input path="mem_email" class="form-control" placeholder="Email"/>
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i></span>
						</div>
						<form:password class="form-control" path="mem_pw" placeholder="최소 8자리에 숫자, 문자, 특수문자 각각 1개 이상 포함" />
					</div>
						<small><form:errors path="mem_pw" cssClass="errmsg"/></small>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i></span>
						</div>
						<input class="form-control" placeholder="Repeat password" type="password">
					</div>
						<small><form:errors path="mem_name" cssClass="errmsg"/></small>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i></span>
						</div>
						<form:input class="form-control" placeholder="Name" path="mem_name"/>
					</div>
					<!-- form-group// -->
						<small><form:errors path="mem_tel" cssClass="errmsg"/></small>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-phone"></i></span>
						</div>
						<select class="custom-select" style="max-width: 80px;">
							<option vlaue="010">010</option>
							<option value="011">011</option>
							<option value="016">016</option>
						</select> 
						<form:input path="mem_tel" class="form-control" placeholder="Phone number" />
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-building"></i></span>
						</div>
						<select class="form-control" name="mem_role">
							<option value="개인회원">개인회원</option>
							<option value="부동산중개인">부동산중개인</option>
						</select>
					</div>
					<!-- form-group end.// -->
					<!-- form-group// -->
					<div class="form-group">
						<input type="submit" class="btn btn-primary btn-block" value="가입">
						<input type="reset"  class="btn btn-primary btn-block" value="재작성">
					</div>
					<!-- form-group// -->
					<p class="text-center">이미 가입되어 있습니까? <a href="login.reo">Log In</a></p>
				</form:form>
			</article>
		</div>
	</div>
</body>
</html>