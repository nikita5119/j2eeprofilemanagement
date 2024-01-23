<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    <style>
    

body {
    font-family: 'Arial', sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
}

header {
    background-color: #333;
    color: #fff;
    padding: 20px;
    text-align: center;
}

section {
    margin: 20px;
    padding: 20px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
    color: #333;
}

footer {
    background-color: #333;
    color: #fff;
    padding: 10px;
    text-align: center;
    position: fixed;
    bottom: 0;
    width: 100%;
}

    
    </style> 
    
</head>
<body>
    <header>
        <h1>Welcome to Your Profile Management Application</h1>
    </header>

    <section>
        <h2>Hello, Welcome Back <%= request.getAttribute("username") %></h2>
        <p>You have successfully logged in.</p>
       
    </section>
    <section>
    <h2> Change Password</h2>
    <a href="changePasswordPage">Change Password</a>
    </section>
    <section>
    <!-- Display success message if available -->
    <div class="success">
        <p>${successMessage}</p>
    </div>

    <!-- Display error message if available -->
    <div class="error">
        <p>${errorMessage}</p>
    </div>
</section>

    <footer>
        <p>Nikita &copy; 2024 Profile Management Application</p>
    </footer>

    <!-- Add your scripts or other body elements here -->
</body>
</html>
