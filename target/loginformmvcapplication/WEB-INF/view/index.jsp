<head>
<%@ page isELIgnored="false"%>
</head>
<html>
<body>
<h2> Greeting : ${greeting} </h2>
<table>
    <tr>
        <td>Username:</td>
        <td>${user1.userName}</td>
    </tr>
    <tr>
            <td>Userphone:</td>
            <td>${user1.userPhone}</td>
    </tr>
    <tr>
                <td>Userdob:</td>
                <td>${user1.userDOB}</td>
    </tr>
    <tr>
                <td>Userskills:</td>
                <td>${user1.userSkills}</td>
    </tr>
</table>
</body>
</html>
