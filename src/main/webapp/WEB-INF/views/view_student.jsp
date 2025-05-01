<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Student Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }
        .info {
            max-width: 500px;
            margin: auto;
            padding: 20px;
            background: #f2f2f2;
            border-radius: 8px;
        }
        h2 {
            text-align: center;
        }
        p {
            font-size: 16px;
            margin-bottom: 10px;
        }
    </style>
</head>

<body>
    <div class="info">
        <h2>Student Information</h2>
        <p><strong>National ID:</strong> ${student.nationalID}</p>
        <p><strong>Full Name:</strong> ${student.fullName}</p>
        <p><strong>Email:</strong> ${student.email}</p>
        <p><strong>Phone Number:</strong> ${student.phoneNumber}</p>
        <p><strong>Address:</strong> ${student.address}</p>
    </div>
</body>
</html>
