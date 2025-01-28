<!DOCTYPE html>
<html lang="en">
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Welcome to Your Dashboard</h1>
    <form action="transaction" method="post">
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required><br>
        <label for="amount">Transaction Amount:</label>
        <input type="number" id="amount" name="amount" required><br>
        <button type="submit">Add Transaction</button>
    </form>
</body>
</html>
