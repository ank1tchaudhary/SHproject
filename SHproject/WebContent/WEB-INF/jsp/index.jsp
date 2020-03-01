<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<!-- Including JSTL Libraries -->
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ page import="java.util.*,java.text.*"%>

<head>
<title>Registration</title>
</head>
<body>

<form action="registerEmployee" method="get">
<label>Name: </label>
<input type="text" name="name"/><br>
<label>Email: </label>
<input type="text" name="email"/><br>
<label>Address: </label>
<input type="text" name="address"/><br>
<label>phone: </label>
<input type="text" name="phone"/><br>
<input type="submit" value="Save" id="save"></input>
<input type="submit" value="Update" id="update"></input>
<input type="submit" value="Delete" id="delete"></input>
</form>
</body>
</html>