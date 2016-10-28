<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Opening An Account</title>
</head>
<body>

<jsp:include page="./html/Header.html"></jsp:include>
<br/>


<table align="center" width='90%' border="0" cellpadding="5" cellspacing="0"  height="15">
<tr>
<td colspan="1" bgcolor='#009999' align="center" style="font-family: verdana;font-size: 18px;color: white;">Account Opening Form</td>
</tr>
</table>

<s:form action="OpenAccount" enctype="multipart/form-data" method="post"> 

<table  align="center" width='60%' border="0" cellpadding="2" cellspacing="0" style="font-family: verdana;font-size: 14px;color: green;">
<tr>
<td><s:textfield name="firstName" label="First Name" required="true"></s:textfield>
</td>
</tr>
<tr>
<td><s:textfield name="lastName" label="Last Name" required="true"></s:textfield>
</td>
</tr>
<tr><td>
<s:radio list="{'Male','Female'}" name="gender" label="Gender" required="true"  value="%{'Male'}"></s:radio>
</td></tr>
<tr>
<td><s:textarea name='address' label="Address" cols="30" rows="5" required="true"></s:textarea>
</td>
</tr>
<tr>
<td><s:file name='addressUpload' label="Upload Address Proof" required="true" ></s:file>
</td> 
</tr>
<tr>
<td><s:file name='photoUpload' label="Upload Photo" required="true"></s:file>
</td> 
</tr>
<tr>
<td><s:select name="accountType" list="{'Select','Salary Account','Savings Account'}" required="true" label="Account Type"></s:select>
</td> 
</tr>
<tr>
<td><s:select name="occupation" list="{'Select','Software Engineer','HardWare Engineer','CEO','Student','Others'}" required="true" label="Occupation"></s:select>
</td> 
</tr>
<tr>
<td><s:textarea name='officeAddress' label="office Address" required="true"></s:textarea>
</td> 
</tr>
<tr>
<td><s:textfield name="mobile" label="Mobile Number" required="true"></s:textfield>
</td> 
</tr>
<tr>
<td><s:textfield name="alternateMobileNumber" label="Alternate Mobile Number"></s:textfield>
</td> 
</tr>
<tr>
<td><s:textfield name="amount" label="Enter Amount (Opening Amount)"></s:textfield>
</td> 
</tr>
</table>

<br></br>

<table align="center" width='90%' border="0" cellpadding="5" cellspacing="0"  height="15">
<tr>
<td colspan="1" bgcolor='#009999' align="center" style="font-family: verdana;font-size: 18px;color: white;">Login Details</td>
</tr>
</table>

<br/>

<table  align="center" width='50%' border="0" cellpadding="5" cellspacing="0" style="font-family: verdana;font-size: 14px;color: green;">
<tr>
<td><s:textfield name="userName" label="User Name" required="true"></s:textfield>
</td>
</tr>
<tr>
<td><s:password name='password' label="Password" required="true"></s:password>
</td>
</tr>
<tr>
<td><s:password name='rePassword' label="Retype Password" required="true"></s:password>
</td>
</tr>
<tr>
<td><s:submit value="Submit" align="center" theme="simple"></s:submit></td>
<td>
<s:reset value="Reset" align="center" theme="simple"></s:reset>
</td>
</tr>

</table>

</s:form>

<br/>
<jsp:include page="./html/Footer.html"></jsp:include>

</body>
</html>