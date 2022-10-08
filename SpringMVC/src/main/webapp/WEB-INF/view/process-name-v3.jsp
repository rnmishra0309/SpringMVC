<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Name V3</title>
<style>
	.error-message {color: red;}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name (*): <form:input path="firstName" />
		<form:errors path="firstName"  cssClass="error-message" />
		<br><br>
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName"  cssClass="error-message" />
		<br><br>
		<br><br>
		IT Course Code (*): <form:input path="courseCode" />
		<form:errors path="courseCode"  cssClass="error-message" />
		<br><br>
		<br><br>
		Math Course Code (*): <form:input path="mathCourseCode" />
		<form:errors path="mathCourseCode"  cssClass="error-message" />
		<br><br>
		Country (*):
		<form:select path="country">
			<form:option value="Brazil" label="Brazil" />
			<form:option value="India" label="India" />
			<form:option value="America" label="America" />
			<form:option value="UK" label="UK" />
		</form:select>
		<form:errors path="country"  cssClass="error-message" />
		<br><br>
		Favourite Programming Language (*):
		Java <form:radiobutton path="favouriteLanguage" value="Java" />
		Python <form:radiobutton path="favouriteLanguage" value="Python" />
		Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />
		C/C++ <form:radiobutton path="favouriteLanguage" value="C/C++" />
		<form:errors path="favouriteLanguage"  cssClass="error-message" />
		<br><br>
		Operating Systems Familiarity (*):
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		MacOS <form:checkbox path="operatingSystems" value="MacOS" />
		<form:errors path="operatingSystems"  cssClass="error-message" />
		<br><br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>