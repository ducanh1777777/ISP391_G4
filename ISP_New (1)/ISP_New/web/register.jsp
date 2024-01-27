<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: #f7f7f7;
            }
            .form-container {
                width: 300px; /* Reduced width */
                margin: 50px auto; /* Adjusted margin for smaller form */
                padding: 20px; /* Reduced padding */
                background: #fff;
                border: 1px solid #ccc;
                border-radius: 5px;
                box-shadow: 2px 2px 10px #aaa;
            }
            h2.form-heading {
                text-align: center;
                margin-bottom: 15px; /* Adjusted margin for heading */
            }
            input[type=text], input[type=password], input[type=date], input[type=submit] {
                width: calc(100% - 20px); /* Adjust width to account for padding */
                padding: 8px; /* Slightly reduced padding */
                margin: 6px 0; /* Adjusted margin */
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            input[type=submit] {
                background-color: #4CAF50;
                color: white;
                padding: 12px 16px; /* Adjusted padding for button */
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            input[type=submit]:hover {
                background-color: #45a049;
            }
            /* Add other styles as needed */
        </style>
    </head>
    <body>
        <div class="form-container">
            <% if (request.getAttribute("error") != null) { %>
                <p style="color: red;"><%= request.getAttribute("error") %></p>
            <% } %>

            <form action="Register" method="POST">
                <h2 class="form-heading">Register</h2> <!-- Heading for the form -->
                Username: <input type="text" name="username" required /><br>
                Password: <input type="password" name="pass" required /><br>
                Fullname: <input type="text" name="fullname" required /><br>
                DOB: <input type="date" name="dob" required /><br>
                Email: <input type="text" name="email" required /><br>
                <input type="submit" value="Register" />
            </form>
        </div>
    </body>
</html>