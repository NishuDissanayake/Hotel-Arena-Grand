<%-- 
    Document   : signup
    Created on : Dec 26, 2021, 7:19:32 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./signup.css" />
        <link rel="stylesheet" href="./navbar.css" />
        <link rel="stylesheet" href="./../navbar.css" />
        <link rel="stylesheet" href="./footer.css" />
        <link rel="stylesheet" href="./../footer.css" />
    </head>

    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="./../index.jsp">
                    <img src="./../ArenaGrand Logo.png" alt="Logo" width="300">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarText">
            <div class="navbar-itemlist justify-content-end">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
                    <li class="nav-item">
                        <a class="nav-link" href="./../Services/services.jsp">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./../Accommodations/accommodations.jsp">Accommodations</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./../Gallery/gallery.jsp">Gallery</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#footer-div">Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./../Signup/signup.jsp">Sign In</a>
                    </li>
                </ul>
            </div>
    </div>
  </div>
</nav>
        
        
        <div class="cotainer signup-form">
            <form method="POST" action="../register">
                <h2>Sign up</h2>
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="fname" placeholder="Full Name">
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" id="exampleFormControlInput1" name="email"placeholder="Email Address">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="phone" placeholder="Phone Number">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="exampleFormControlInput1" name="pass" placeholder="Password">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="exampleFormControlInput1" name="confpass" placeholder="Confirm Password">
                </div>
                
                <div class="button-signup"><button class="btn btn-primary" type="submit">Submit</button></div>
                <p><span class="text-1">Already have an account? </span><span class="text-2"><a href="./../Login/login.jsp">Login</a></span></p>
            </form>
        </div>
        
        <div class="container-fluid footer">
            <div class="row">
                <div class="col-4">
                    <div class="row img-footer">
                        <img src="./../ArenaGrand Logo.png" alt="logo" />
                    </div>
                    <div class="row">
                        <p>
                            Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views. Designed to inspire rest and relaxation, our sleek.
                        </p>
                    </div>
                    <div class="row">
                        <i class="fab fa-facebook"></i>
                        <i class="fab fa-facebook"></i>
                        <i class="fab fa-facebook"></i>
                    </div>
                </div>
                <div class="col-8 footer-form">
                    <h3>Contact Us</h3>
                    <form method="POST" action="../ContactUsForm">
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-4 col-form-label">Name</label>
                        <div class="col-sm-8">
                            <input type="text" name="Fname" class="form-control" id="inputPassword" placeholder="Full Name" required>
                        </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-4 col-form-label">Phone Number</label>
                        <div class="col-sm-8">
                            <input type="text" name="PhoneNum" class="form-control" id="inputPassword" placeholder="07X-XXXXXXX" required>
                        </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-4 col-form-label">Message</label>
                        <div class="col-sm-8">
                            <textarea class="form-control" name="Message" id="exampleFormControlTextarea1" rows="3" required></textarea>
                        </div>
                        </div>
                        <div class="form-group row btn-form-group">
                            <div class="col-sm-12">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="container-fluid footer-copyright">
            <p>Copyright: Arena Grand 2022</p>
        </div>
        
    </body>
</html>
