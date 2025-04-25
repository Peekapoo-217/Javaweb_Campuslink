<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Search Student</title>
</head>
<body>
    <h2>Search Basic Student Info</h2>

    <form method="post" action="${pageContext.request.contextPath}/search_form">
        <input type="text" name="keyword" placeholder="Enter National ID or Full Name" required />
        <button type="submit">Search</button>
    </form>

    <c:if test="${not empty students}">
        <h3>Results:</h3>
        <table border="1" cellpadding="5">
            <tr>
                <th>National ID</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Address</th>
            </tr>
            <c:forEach var="s" items="${students}">
                <tr>
                    <td>${s.nationalID}</td>
                    <td>${s.fullName}</td>
                    <td>${s.email}</td>
                    <td>${s.phoneNumber}</td>
                    <td>${s.address}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
