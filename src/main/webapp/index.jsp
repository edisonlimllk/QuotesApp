<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>QuotesApp</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <script src="./js/bootstrap.min.js"></script>
</head>
<body>
<header class="p-3 bg-dark text-white">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="#" class="nav-link px-2 text-white">Home</a></li>
                <li><a href="aboutUs.jsp" class="nav-link px-2 text-white">About</a></li>
            </ul>
            <div class="text-end">
                <button type="button" class="btn btn-outline-light me-2">Login</button>
                <button type="button" class="btn btn-warning">Sign-up</button>
            </div>
        </div>
    </div>
</header>
<div class="bg-dark text-secondary px-4 py-5 text-center">
        <h1 class="display-5 fw-bold text-white">QuoteApp</h1>
        <div class="col-lg-6 mx-auto">
            <p class="fs-5 mb-4">Welcome to the one-stop shop for fantastic quotes. </p>
            <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
                <button type="button" class="btn btn-outline-info btn-lg px-4 me-sm-3 fw-bold"><a style="text-decoration: none" href="hello-servlet">Get Started</a></button>
            </div>
        </div>
</div>
<img src="images/LandingPageImage.png" alt="image" class="img-fluid" style="position: relative;
  left: 50%;
  right: 50%;
  margin-left: -50vw;
  margin-right: -50vw;
  max-width: 100vw;
  width: 100vw;">
<footer class="footer mt-auto py-3 bg-light">
    <div class="container">
        <span class="text-muted">DevOps Group Assignment Part 1 | 2022 | All Rights Reserved</span>
    </div>
</footer>
</body>
</html>