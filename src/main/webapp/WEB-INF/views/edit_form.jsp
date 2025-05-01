<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Edit Student</title>
</head>
<body>

<h2>Edit Student Information</h2>

<form method="post" action="${pageContext.request.contextPath}/update">
    <input type="hidden" name="nationalID" value="${student.nationalID}" />

    <label>Full Name:</label>
    <input type="text" name="fullName" value="${student.fullName}" /><br><br>

    <label>Email:</label>
    <input type="email" name="email" value="${student.email}" /><br><br>

    <label>Phone Number:</label>
    <input type="text" name="phoneNumber" value="${student.phoneNumber}" /><br><br>

    <label>Address:</label>
    <input type="text" name="address" value="${student.address}" /><br><br>

    <button type="submit">Update</button>
</form>

</body>
</html>
