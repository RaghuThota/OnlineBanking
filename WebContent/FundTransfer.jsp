<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FundTransfering.......</title>
</head>
<body>
<jsp:include page="./html/Header.html"></jsp:include>
<jsp:include page="./html/UserMenu.html"></jsp:include>
<br></br>

<table align="center" width='90%' border="0" cellpadding="0" cellspacing="5"  height="35">
<tr>
<td colspan="1" bgcolor='#009999' align="center" style="font-family: verdana;font-size: 18px;color: white;">Fund Transfer</td>
</tr>
</table>

<s:form action="FundTransfer"> 

<table  align="center" width='50%' border="0" cellpadding="10" cellspacing="0" style="font-family: verdana;font-size: 14px;color: green;">
<tr>
<td><s:textfield name='toAccountNumber' label="To Account Number" required="true"></s:textfield>
</td>
</tr>

<tr>
<td><s:textfield name='amount' label="Amount To Be Transfered" required="true"></s:textfield>
</td>
</tr>

<tr>
<td><s:submit value="Transfer Amount" align="center"></s:submit>
</td>
</tr>

</table>

</s:form>

<br></br>
<jsp:include page="./html/Footer.html"></jsp:include>
</body>
</html>