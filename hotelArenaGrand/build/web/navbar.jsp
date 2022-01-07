<%-- 
    Document   : navbar
    Created on : Dec 26, 2021, 9:06:07 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Navigation bar</title>
        <link rel="stylesheet" href="./navbar.css" />
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="#">
                    <img src="./Images/ArenaGrand Logo.png" alt="Logo" width="300">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarText">
            <div class="navbar-itemlist justify-content-end">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
                    <li class="nav-item">
                        <a class="nav-link" href="./Services/services.jsp">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./Accommodations/accommodations.jsp">Accommodations</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./Gallery/gallery.jsp">Gallery</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#footer-div">Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./Signup/signup.jsp">Sign In</a>
                    </li>
                </ul>
            </div>
    </div>
  </div>
</nav>
    </body>
</html>
