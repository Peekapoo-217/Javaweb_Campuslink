<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Search Graduation & Employment</title>
</head>
<body>
    <h2>Search Graduation and Employment Info</h2>

    <form method="post" action="${pageContext.request.contextPath}/search-employment">
        <input type="text" name="keyword" placeholder="Enter National ID or Full Name" required />
        <button type="submit">Search</button>
    </form>

    <c:if test="${not empty graduationEmploymentList}">
        <h3>Results:</h3>
        <table border="1" cellpadding="5">
            <tr>
                <th>National ID</th>
                <th>Full Name</th>
                <th>Major (Graduation)</th>
                <th>University ID</th>
                <th>Major (Employment)</th>
                <th>Company Address</th>
                <th>Duration (months)</th>
            </tr>
            <c:forEach var="row" items="${graduationEmploymentList}">
                <tr>
                    <td>${row[0]}</td>
                    <td>${row[1]}</td>
                    <td>${row[2]}</td>
                    <td>${row[3]}</td>
                    <td>${row[4]}</td>
                    <td>${row[5]}</td>
                    <td>${row[6]}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
