<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Students</title>
</head>
<body>
	<h1>Welcome to Spring MVC</h1>
	<form action="processV2" method="POST">
		<label for="fname">First name:</label><br>
		<input type="text" id="fname" name="fname" placeholder="First Name" /><br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>