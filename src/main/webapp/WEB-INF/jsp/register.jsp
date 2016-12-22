<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<title>Java Home Sign up page</title>
</head>
<body>
	<form:form action="register.htm" commandName="reg">
		Name: <form:input path="fullName"/>
		Email: <form:input path="mail"/>
		Password: <form:password path="password"/>
		<input type="submit" value="Sign Up`">
		<%= request.getAttribute("error") %>
	</form:form>
</body>
</html>