<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<p>Hello user!</p>
	<form:form method="POST" action="/SpringMVC/user" modelAttribute="login">
		<table>
			<tr>
		        <td><form:label path="username">Username</form:label></td>
		        <td><form:input path="username" /></td>
		        <td><form:errors path="username"></form:errors></td>
		    	</tr>
		    <tr>
		        <td><form:label path="password">Password</form:label></td>
		        <td><form:password path="password"/></td>
		        <td><form:errors path="password"></form:errors></td>
		    </tr>
		    <tr>
        		<td colspan="2">
            	<input type="submit" value="Submit"/>
        		</td>
    		</tr>
		</table>
	</form:form>
</body>
</html>