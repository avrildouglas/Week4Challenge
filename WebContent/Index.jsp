<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>User Information</h2><br><br>

<form action="CheckUserServlet" method="post">
	First Name:&nbsp;<input type="text" name="firstName" value=""><br>
	Last Name:&nbsp;<input type="text" name="lastName" value=""><br>
	Email:&nbsp;<br><input type="text" name="email" value=""><br><br>

<!--	Education:<br>
<%
import.java.util.Arraylist;
ArrayList arr = (ArrayList) session.getAttribute("listEd");
listEd educate = new listEd("ed");
String myString="";
if(arr.isEmpty()==false)
{
for(int i = 0; i < arr.size(); i++)
{
myString = (String)arr.get(i);
}
}
else
{
System.out.println("Array is empty");
}
%>

<table width="4">
<tr>
<td>
project Name
</td>
<td>
    <input type="text" name="education0" id="education0" size="50" value="<%=myString%>" disabled>
</td>
<td>
    <input type="text" name="education1" id="education1" size="50" value="<%=myString%>" disabled>
</td>
</tr>
<! --
	<input type="text" name="education" value=""><br>
	<!-- <input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br>
	<input type="text" name="education" value=""><br> -->
		
<!--	Experience:<br> */
	<input type="text" name="experience" value=""><br>
	<!-- <input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value="">
	<input type="text" name="experience" value=""> -->
				
<!--	Skills and Rating:<br>
	<input type="text" name="skillrate" value=""><br> -->
	<!-- <input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value="">
	<input type="text" name="skillrate[]" value=""> --> 
	

<button theme="primary" color="pulse" icon="next" disabled>Submit</button>
	
	<input type="submit" value="Add User Info" value=""><br><br>
</form>
</table>
<form action="PopulateResume" method="post">
Populate Resume<br>
	By Email:&nbsp;<input type="text" name="email" value=""><br>
<input type="submit" value="Generate Resume" value=""><br><br>
</form>

</body>
</html>