<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title>Graduation Information</title>
</head>

<body>
	<form name ="graduateForm" action ="${pageContext.request.contextPath}/save" action ="post" onsubmit="return validationForm()">
		<h2>Information</h2>

		<c:if test="${not empty error}">
			<div style="color: red"></div>
		</c:if>

		<c:if test="${not empty success}">
			<div style="color: green"></div>
		</c:if>

		<label>Full name:</label>
			<input type="text" name="fullName"><br>
		<label>Email:</label>
			<input type="email" name="email"><br>
		<label>PhoneNumber:</label>
			<input type="text" name="phoneNumber"><br>						
		<label>Address:</label>
			<input type="text" name="Address"><br>								
			
			

	</form>

</body>

</html>