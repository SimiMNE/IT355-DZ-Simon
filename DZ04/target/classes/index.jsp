<!DOCTYPE html>
<html>
<head>
    <title>Registracija i Login</title>
</head>
<body>
<h1>Registracija</h1>
<form action="register.jsp" method="post">
    Email: <input type="text" name="email"><br>
    Password: <input type="password" name="password"><br>
    Confirm Password: <input type="password" name="confirmPassword"><br>
    <input type="submit" value="Register">
</form>
<h1>Login</h1>
<form action="login.jsp" method="post">
    Email: <input type="text" name="email"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
