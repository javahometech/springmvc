<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<title>Java Home Sign up page</title>
</head>
<body>
	<form:form action="register.htm" commandName="reg">
	<br>
		Name: <form:input path="fullName"/><form:errors path="fullName"/> <br>
		Email: <form:input path="mail"/><form:errors path="mail"/><br>
		Password: <form:password path="password"/><form:errors path="password"/><br>
		<input type="submit" value="Sign Up`">
		<%= request.getAttribute("error") == null ? "" : request.getAttribute("error")%>
	</form:form>
</body>
</html>