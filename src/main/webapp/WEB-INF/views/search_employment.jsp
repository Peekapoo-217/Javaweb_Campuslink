<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Search Graduation & Employment</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 30px;
        }
        h2 {
            color: #2c3e50;
        }
        form {
            margin-bottom: 20px;
        }
        input[type="text"] {
            padding: 8px;
            width: 300px;
            margin-right: 10px;
        }
        button {
            padding: 8px 16px;
            background-color: #3498db;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #2980b9;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
            background-color: #f9f9f9;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #3498db;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>

<body>
    <h2>Search Graduation and Employment Info</h2>

    <form method="post" action="${pageContext.request.contextPath}/search_employment">
        <input type="text" name="keyword" placeholder="Enter National ID or Full Name" required />
        <button type="submit">Search</button>
    </form>

    <c:if test="${not empty graduationEmploymentList}">
        <h3>Results:</h3>
        <table>
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
 