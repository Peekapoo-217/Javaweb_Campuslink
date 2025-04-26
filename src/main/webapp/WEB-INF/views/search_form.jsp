<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Search Student</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f8f9fa;
        }
        h2 {
            color: #333;
        }
        form {
            margin-bottom: 20px;
        }
        input[type="text"] {
            padding: 8px;
            width: 300px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            padding: 8px 16px;
            background-color: #007bff;
            border: none;
            color: white;
            border-radius: 4px;
            cursor: pointer;
            margin-left: 10px;
        }
        button:hover {
            background-color: #0056b3;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            margin-top: 20px;
        }
        th, td {
            padding: 12px;
            border-bottom: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>

    <h2>Search Basic Student Info</h2>

    <form method="post" action="${pageContext.request.contextPath}/search_form">
        <input type="text" name="keyword" placeholder="Enter National ID or Full Name" required />
        <button type="submit">Search</button>
    </form>

    <c:if test="${not empty students}">
        <h3>Results:</h3>
        <table>
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
 