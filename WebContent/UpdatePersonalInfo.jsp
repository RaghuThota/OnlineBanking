<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updating Personal Information......</title>
</head>
<body>
<jsp:include page="./html/Header.html"></jsp:include>
<jsp:include page="./html/UserMenu.html"></jsp:include>
<br></br>

<s:form action="UpdatePersonalInfo"> 

<table align="center" width='90%' border="0" cellpadding="0" cellspacing="5"  height="35">
<tr>
<td colspan="1" bgcolor='#009999' align="center" style="font-family: verdana;font-size: 18px;color: white;">Updating Personal Details</td>
</tr>
</table>

<table  align="center" width='60%' border="0" cellpadding="10" cellspacing="0" style="font-family: verdana;font-size: 14px;color: green;">

<tr>
<td><s:textarea name='address' label="Address" cols="30" rows="5" ></s:textarea>
</td>
</tr>
<tr>
<td><s:file name='addressProof' label="Upload Address Proof" ></s:file>
</td> 
</tr>

<tr>
<td><s:select name="occupation" list="{'Select Occupation','Software Engineer','HardWare Engineer','CEO','Student','Others'}"  label="Occupation"></s:select>
</td> 
</tr>
<tr>
<td><s:textarea name='officeAddress' label="office Address"></s:textarea>
</td> 
</tr>
<tr>
<td><s:textfield name="mobile" label="Mobile Number"></s:textfield>
</td> 
</tr>
<tr>
<td><s:textfield name="alternateMobileNumber" label="Alternate Mobile Number"></s:textfield>
</td> 
</tr>

<tr>
<td><s:submit value="Change Password" align="center"></s:submit>
</td>
</tr>

</table>

</s:form>

<br></br>
<jsp:include page="./html/Footer.html"></jsp:include>
</body>
</html>