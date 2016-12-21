<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<title>Java Home Sign up page</title>
</head>
<body>
	<form:form action="register.htm" commandName="reg">
		Name: <form:input path="fullName"/>
		Email: <form:input path="mail"/>
		City:  <form:input path="addr.city"/>
		Pin:  <form:input path="addr.pin"/>
		Password: <form:password path="password"/>
		<input type="submit" value="Sign Up`">
	</form:form>
</body>
</html>