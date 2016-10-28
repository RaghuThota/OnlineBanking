<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page....</title>
</head>
<body>

<jsp:include page="./html/Header.html"></jsp:include>
<jsp:include page="./html/UserMenu.html"></jsp:include>
<br/>


<table width="90%" align="center" border="0">
<tr>
<td style="font-family: verdana;font-size: 20px;color: purple;">
Welcome To <s:property value="userName" default="%{user}"/>
</td>
</tr>

<tr>
<td style="font-family: verdana;font-size: 14px;color: purple;">
Your Total Balance is : <s:property value="account.amount"/>
</td>
</tr>

</table>


<br></br>
<jsp:include page="./html/Footer.html"></jsp:include>

</body>
</html>