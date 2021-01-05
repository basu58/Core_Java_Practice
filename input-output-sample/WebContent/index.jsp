<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr colspan="2">
			<td><b>Expected input sample:</b></td>
			<td><b>Expected output sample:</b></td>
		</tr>
		<tr colspan="2">
			<td>Enter your name:&nbsp;&nbsp;&nbsp;<input name="name"></td>
			<td> Your encoded name is:&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<td>Are you a fresher(Y/N)?:&nbsp;&nbsp;&nbsp;<select name="fr">
														<option>Y</option>
														<option>N</option>
													</select></td>
		</tr>
		<tr colspan="2">
			<td>Enter your department:&nbsp;&nbsp;&nbsp;<input name="dept"></td>
			<td>Your department is:&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr colspan="2">
			<td>Enter your password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="pwd"></td>
			<td>Your password is:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr colspan="2">
			<td>Re-type your password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="rpwd"></td>
			<td>Re-type your password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
		
	</table>
	<input type="submit" value="SUBMIT" name="submit">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="reset" value="RESET">
	
</body>
</html>