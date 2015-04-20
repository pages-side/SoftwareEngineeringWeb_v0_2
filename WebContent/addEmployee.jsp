<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<form action="Controller" method="post">
		<h2>Add Employee</h2>
		<input type="hidden" name="requester" value="addemployee" />
		<input type="hidden" name="mode" value="insert" />
		<table>
			<tbody>
				<tr>
					<td>Employee Number:</td>
					<td><input type="text" name="eno" /></td>
					<td>Employee Name:</td>
					<td><input type="text" name="ename" /></td>
				</tr>
				<tr>
					<td>Street:</td>
					<td><input type="text" name="street" /></td>
					<td>City:</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>Zip Code:</td>
					<td><input type="text" name="zip" /></td>
					<td>Phone:</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				
				<tr>
					<td>Social Security Number:</td>
					<td><input type="text" name="ssno" /></td>
					<td>Hire Date:</td>
					<td><input type="text" name="hdate" /></td>
				</tr>
				
				<tr>
					<td>Manager:</td>
					<td><select name="status">
							<option value="">Select a Status</option>
							<option value="TRUE">Manager</option>
							<option value="FALSE">Employee</option>
					</select></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" />
	</form>
</body>
</html>