<!DOCTYPE html>
<html lang="en">
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Welcome to Your Dashboard</h1>
    <form action="user" method="post">
        <input type="hidden" name="action" value="updateBalance">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required><br>
        <button type="submit">Update Balance</button>
    </form>
    <form action="transaction" method="post">
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required><br>
        <label for="transaction-amount">Transaction Amount:</label>
        <input type="number" id="transaction-amount" name="amount" required><br>
        <button type="submit">Add Transaction</button>
    </form>
</body>
</html>
