<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>annotation::param</title>
	</head>
	<body>
		<h3>@RequestParam 어노테이션 실습</h3>
		
		<a href="/Ch04/index">index</a>
		
		<h4>param1 실습</h4>
		<form action="/Ch04/annotation/param1" method="post">
			<input type="text" name="uid" placeholder="uid"/><br>
			<input type="submit" value="전송"/>
		</form>
	
		<h4>param2 실습</h4>
		<form action="/Ch04/annotation/param2" method="post">
			<input type="text" name="uid" placeholder="uid"/><br>
			<input type="text" name="name" placeholder="name"/><br>
			<input type="submit" value="전송"/>
		</form>
	
		<h4>param3 실습</h4>
		<form action="/Ch04/annotation/param3" method="post">
			<input type="text" name="uid" placeholder="uid"/><br>
			<input type="text" name="name" placeholder="name"/><br>
			<input type="text" name="hp" placeholder="hp"/><br>
			<input type="number" name="age" placeholder="age"/><br>
			<input type="submit" value="전송"/>
		</form>
	</body>
</html>