<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Page Visit Counter</title>
    <!-- Include Bootstrap via CDN -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"></head>
<body class="text-center">
    <div class="container">
        <h1 class="mt-5">Welcome to the Page Visit Counter</h1>
        <p class="lead">You are visitor number <span class="badge badge-primary" style="color:blue">${visitCount}</span></p>
    </div>
</body>
</html>
