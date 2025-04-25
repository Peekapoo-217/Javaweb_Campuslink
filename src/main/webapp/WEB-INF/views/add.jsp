<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title>Graduation Information</title>
</head>

<body>
	<fieldset>
		<form name="graduateForm"
			action="${pageContext.request.contextPath}/save" method="post"
			onsubmit="return validationForm()">
			<h2>Information</h2>

			<c:if test="${not empty error}">
				<div style="color: red"></div>
			</c:if>

			<c:if test="${not empty success}">
				<div style="color: green"></div>
			</c:if>
			
			<label>National ID:</label>
				<input type="text" name="nationalID"><br>
			
			<label>Full name:</label> 
			<input type="text" name="fullName"><br>
			
			<label>Email:</label> 
			<input type="email" name="email"><br>
			
			<label>PhoneNumber:</label> 
			<input type="text" name="phoneNumber"><br>
			
			<label>Address:</label> 
			<input type="text" name="address"><br>

			<label>Major:</label> 
			<select name="majorID">
				<option value="0">--Your major--</option>
				<c:forEach var="m" items="${majors}">
					<option value="${m.majorID}">${m.majorName}</option>
				</c:forEach>
			</select> <br> 
			
			
			
			<label>University:</label> 
			<select name="universityID">
				<option value="0">--Your university--</option>
				<c:forEach var="u" items="${universities}">
					<option value="${u.universityID}">${u.universityName}</option>
				</c:forEach>
			</select> <br>
			
			
			
			<label>Graduation Type:</label>
			<select name="graduationType">
			<option value="0">--Your graduation--</option>
				<c:forEach var="g" items="${graduationTypes}">
					<option value="${g}">${g}</option>
				</c:forEach>
			</select>
			
			<br>
			<label>Graduation Date</label>
			<input type="date" name="graduationDate">

			
			<br>
			<label>Degree Type:</label>
			<select name="degreeType">
			<option value="0">--Degree Type--</option>
				<c:forEach var="dg" items="${degreeTypes}">
					<option value="${dg}">${dg}</option>
				</c:forEach>
			</select>
			
			
			<br>
			<button type="submit">Add</button>

		</form>
	</fieldset>
</body>

<script>
function validationForm(){
	const form = document.forms["graduateForm"];
	const nationID = form["nationalID"].value.trim();
	const universityID = form["universityID"].value.trim();
	const majorID = form["majorID"].value;
	const graduationDate = form["graduationDate"]?.value;
	
	if(nationID === ""){
		alert("National ID is required");
		return false;
	}
	
	if(universityID === "0"){
		alert("University is required");
		return false;
	}
	
	if(majorID === "0"){
		alert("Major is required");
		return false;
	}
	
    if (!graduationDate) {
        alert("Bạn phải nhập ngày tốt nghiệp");
        return false;
    }
	
    return true;
}
</script>


</html>