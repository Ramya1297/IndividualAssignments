<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to employees portal</h1>
<hr>
<form action="displayAll" method="post">
<h2>Click here to see all the Employee records</h2>
<br>
<input type="submit" value="display all employees">


</form>
<form action="displayEmp" method="post">
<h2>enter Employee Id</h2>
<input type="text" name="emp_id">
<br>
<input type="submit" value="display employee">
<br>
</form>
<form action="displayDesig" method="post">
<h2>enter Employee Designation</h2>
<input type="text" name="designation">
<br>
<input type="submit" value="display designation">
</form>

<form action="displayByage" method="post">
<h2>Click here to see all the employees in sorted age</h2>
<input type="text" name="designation">
<input type="submit" value="display by age">
</form>

<form action="insertEmp" method="post">
Enter ID <input type="text" name="eid"><br>
Enter Name<input type="text" name="name"><br>
Enter Age<input type="text" name="age"><br>
Enter Designation<input type="text" name="designation"><br>
Enter salary<input type="text" name="salary"><br>

<input type="submit" value="INSERT">
<input type="reset" value="RESET">
<hr><br>
</form>

<form action="updateEmp" method="post">
ENTER EID <input type="text" name="eid"><br>

ENTER NAME<input type="text" name="name"><br>

ENTER Age<input type="text" name="age"><br>

ENTER DESIGNATION<input type="text" name="designation">
<br>
<input type="submit" name="submit" value="UPDATE"><br>
<input type="submit" name="submit" value="RESET">
<hr><br>
</form>

<hr>

<form action="deleteEmp" method="post">
ENTER EID <input type="text" name="eid"><br>

<input type="submit" name="submit" value="DELETE"><br>
<hr><br>
</form>
</body>
</html>