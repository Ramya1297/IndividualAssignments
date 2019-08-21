<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome to Employee Portal</h1>
<hr>
<h2>
<form action="displayAll">
Click here to view all employees <br>
<input type="submit" name="submit" value="display all employees">
</form>
<hr>
<form action="displayEmp" method="post">
Enter emp id <br>
<input type="text" name="eid"> <br>
<input type="submit" name="submit" value="display">
</form>
<hr>
<form action="displayByDesig" method="post">
Enter designation <br>
<input type="text" name="designation"> <br>
<input type="submit" name="submit" value="display">
</form>
<hr>
<form action="displayByName" method="post">
Enter Name <br>
<input type="text" name="name"> <br>
<input type="submit" name="submit" value="display">
</form>
<hr>

<form action="sortByAge" method="post">
Enter Designation<input type="text" name="designation"> <br>
<input type="submit" name="submit" value="display">
</form>

<form action="insert" method="post">
Enter id<input type="text" name="eid"> <br>
Enter name<input type="text" name="name"> <br>
Enter Age<input type="text" name="age"> <br>
Enter Designation<input type="text" name="designation"> <br>
<input type="submit" name="submit" value="insert">
<input type="reset" name="reset" value="reset">
</form>
<hr>
<form action="update" method="post">
Enter id<input type="text" name="eid"> <br>
Enter name<input type="text" name="name"> <br>
Enter Age<input type="text" name="age"> <br>
Enter Designation<input type="text" name="designation"> <br>
<input type="submit" name="submit" value="update">
<input type="reset" name="reset" value="reset">
</form>
<hr>
<form action="delete" method="post">
Enter eid<input type="text" name="eid"> <br>
<input type="submit" name="submit" value="delete">
</form>

</h2>
</body>
</html>