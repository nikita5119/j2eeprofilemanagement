<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
    <link rel="stylesheet" href="test.css">
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
     <script src="test.js"></script>
</head>
<body>

    <h2>Change Password</h2>

    <form action="changePassword" method="post">
    	
    	<label for="userid">User ID:</label>
    	<input type="text" id="userid" name="userid" required><br>
    
        <label for="current_password">Current Password:</label>
        <input type="password" id="current_password" name="password" required><br>

        <label for="new_password">New Password:</label>
        <input type="password" id="new_password" name="newPassword" required><br>

        <label for="confirm_password">Confirm New Password:</label>
        <input type="password" id="confirm_password" name="confirmPassword" required><br>

        <input type="submit" value="Change Password" onclick="validateForm()">
    </form>

</body>
</html>