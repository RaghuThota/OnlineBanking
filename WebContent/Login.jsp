<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login To Online Banking System</title>
</head>
<body>

<jsp:include page="./html/Header.html"></jsp:include>
<br/>

<table align="center" width='90%' height='35' border="0" cellpadding="5" cellspacing="0">
<tr>
<td colspan="2" bgcolor='#009999' align="center" style="font-family: verdana;font-size: 18px;color: white;">LOGIN PAGE</td>
</tr>
</table>

<s:form action="Login">
<table  align="center" width='50%' border="0" cellpadding="5" cellspacing="0" style="font-family: verdana;font-size: 14px;color: green;">

<tr>
<td><s:textfield name="userName" label="User Name" cssStyle=""></s:textfield></td>
</tr>

<tr>
<td><s:password name="password" label="Password"></s:password></td>
</tr>

<tr>
<td><s:submit value="   Login   " align="center"></s:submit></td>
</tr>

</table>

</s:form>

<br/>
<jsp:include page="./html/Footer.html"></jsp:include>

</body>
</html>