<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <title>Graduation Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f8f9fa;
        }
        fieldset {
            background: white;
            padding: 30px;
            border: 1px solid #ccc;
            border-radius: 8px;
            max-width: 700px;
            margin: auto;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        input[type="date"],
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            margin-top: 20px;
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        .message {
            text-align: center;
            margin-bottom: 15px;
            font-size: 16px;
        }
        .error {
            color: red;
        }
        .success {
            color: green;
        }
    </style>
</head>

<body>

    <fieldset>
        <form name="graduateForm"
              action="${pageContext.request.contextPath}/save" 
              method="post"
              onsubmit="return validationForm()">
              
            <h2>Graduation Information Form</h2>

            <c:if test="${not empty error}">
                <div class="message error">Error saving data!</div>
            </c:if>

            <c:if test="${not empty success}">
                <div class="message success">Saved successfully!</div>
            </c:if>

            <label>National ID:</label>
            <input type="text" name="nationalID" />

            <label>Full Name:</label>
            <input type="text" name="fullName" />

            <label>Email:</label>
            <input type="email" name="email" />

            <label>Phone Number:</label>
            <input type="text" name="phoneNumber" />

            <label>Address:</label>
            <input type="text" name="address" />

            <label>Major:</label>
            <select name="majorID">
                <option value="0">-- Select Major --</option>
                <c:forEach var="m" items="${majors}">
                    <option value="${m.majorID}">${m.majorName}</option>
                </c:forEach>
            </select>

            <label>University:</label>
            <select name="universityID">
                <option value="0">-- Select University --</option>
                <c:forEach var="u" items="${universities}">
                    <option value="${u.universityID}">${u.universityName}</option>
                </c:forEach>
            </select>

            <label>Graduation Type:</label>
            <select name="graduationType">
                <option value="0">-- Select Graduation Type --</option>
                <c:forEach var="g" items="${graduationTypes}">
                    <option value="${g}">${g}</option>
                </c:forEach>
            </select>

            <label>Graduation Date:</label>
            <input type="date" name="graduationDate" />

            <label>Degree Type:</label>
            <select name="degreeType">
                <option value="0">-- Select Degree Type --</option>
                <c:forEach var="dg" items="${degreeTypes}">
                    <option value="${dg}">${dg}</option>
                </c:forEach>
            </select>

            <button type="submit">Submit</button>

        </form>
    </fieldset>

    <script>
    function validationForm() {
        const form = document.forms["graduateForm"];
        const nationID = form["nationalID"].value.trim();
        const universityID = form["universityID"].value.trim();
        const majorID = form["majorID"].value;
        const graduationDate = form["graduationDate"]?.value;

        if (nationID === "") {
            alert("National ID is required");
            return false;
        }

        if (universityID === "0") {
            alert("University is required");
            return false;
        }

        if (majorID === "0") {
            alert("Major is required");
            return false;
        }

        if (!graduationDate) {
            alert("Graduation Date is required");
            return false;
        }

        return true;
    }
    </script>

</body>
</html>
