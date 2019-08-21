<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Employee Page</h1>
<hr>
<form action="displayAll" method="post">
<h2>
Click here to see employee page
<input type="submit" name="submit" value="Display ALL Employees">
</h2></form>
<hr>
<form action="displayEmp" method="post">
<h2>
Enter empID<input type="text" name="eid">
<input type= "submit" name= "submit" value= "DISPLAY">
</h2>
</form>

<hr>
<form action="displayByDesig" method="post">
<h2>
Enter Designation <input type= "text" name= "designation">
<input type= "submit" name= "submit" value= "DISPLAY">
</h2>
</form>
<form action="displayByAge" method="post">
<h2>
Click here to see employee page sorted by age<br>
Enter Designation <input type= "text" name= "designation">
<input type="submit" name="submit" value="Display ALL Employees">
</h2></form>
<hr>
<form action="insertEmp" method="post">

<h2>
Enter ID <input type="text" name="eid"><br>
Enter Name <input type="text" name="name"><br>
Enter Age <input type="text" name="age"><br>
Enter Designation <input type="text" name="designation"><br>

<input type="submit" name="submit" value="INSERT">
<input type="reset" name="reset" value="RESET">
</h2>
</form>
<form action="updateEmp" method="post">

<h2>
Enter ID <input type="text" name="eid"><br>
Enter Name <input type="text" name="name"><br>
Enter Age <input type="text" name="age"><br>
Enter Designation <input type="text" name="designation"><br>

<input type="submit" name="submit" value="UPDATE">
<input type="reset" name="reset" value="RESET">
</h2>
</form>

<form action="deleteEmp" method="post">

<h2>
Enter ID <input type="text" name="eid"><br>
Enter Name <input type="text" name="name"><br>
Enter Age <input type="text" name="age"><br>
Enter Designation <input type="text" name="designation"><br>

<input type="submit" name="submit" value="DELETE">
<input type="reset" name="reset" value="RESET">
</h2>
</form>

</body>
</html>