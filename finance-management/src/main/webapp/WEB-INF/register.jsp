<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Register User</h1>
    <form action="user" method="post">
        <input type="hidden" name="action" value="register">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <label for="balance">Initial Balance:</label>
        <input type="number" id="balance" name="balance" required><br>
        <button type="submit">Register</button>
    </form>
</body>
</html>
