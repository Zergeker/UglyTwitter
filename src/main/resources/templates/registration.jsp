<%@ taglib prefix

<!DOCTYPE html>
<html lang="en" xmlns:form="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Register now!</title>
</head>
<body>
    <form method="post" modelAttribute="userForm">
        <h1>Введите логин</h1>
        <input type="text" path = "nickname">
        <div>
            <form:errors path="username"></form:errors>
        </div>
        <h1>Введите пароль</h1>
        <input type="password" path="password">
        <h1>Подтвердите пароль</h1>
        <input type="password" path="passwordConfirm">
        <input type="submit">
    </form>
</body>
</html>