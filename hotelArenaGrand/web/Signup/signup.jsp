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
    </head>

    <body>
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
    </body>
</html>