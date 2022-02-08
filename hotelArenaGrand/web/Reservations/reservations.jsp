<%-- 
    Document   : reservations
    Created on : Dec 26, 2021, 7:19:08 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reservations</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./reservations.css" />
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

        <div class="reserve-header-image">
            <h1 class="header-text">Reservations</h1>
        </div>

        <div class="container reserve ">
            <div class="row">
                <div class="col-6 form-header">
                    <span>Book Now</span>
                </div>
            </div>
        </div>

        <div class="container form-container ">
            <div class="reserve2">
                <form class="form" method="POST" action="../reservation" >
                    <div class="input_field">
                        <label>Select room type</label>
                         <select class="browser-default custom-select select_input" name="roomType">
                            <option selected> - Select room type </option>
                            <option value="Regular">Regular</option>
                            <option value="SemiDeluxe">Semi Deluxe</option>
                            <option value="Deluxe">Deluxe</option>
                            <option value="King">King</option>
                        </select>
                    </div>
                    <div class="input_field">
                        <label>Number of Rooms</label>
                        <input type="text" class="Num_input" name="num_of_rooms" required>
                    </div>
                    <div class="input_field">
                        <label>Full Name</label>
                        <input type="text" class="input" name="fname" required>
                    </div>
                    <div class="input_field">
                        <label>Check In</label>
                        <input id="date" type="date" class="input" name="checkIn" required>
                    </div>
                    <div class="input_field">
                        <label>Check Out</label>
                        <input id="date" type="date" class="input" name="checkOut" required>
                    </div>
                    <div class="input_field">
                        <label>Phone Number</label>
                        <input type="text" class="input" name="phoneNum" required>
                    </div>
                    <div class="input_field">
                        <label>Email Address</label>
                        <input type="text" class="input" name="emailAdd" required>
                    </div>
 
                    <div class="input_field">
                        <label>Estimated Arrival Time</label>
                        <input type="time" class="input" name="arrTime" required>
                    </div>
                    <div class="row">
                        <div class="col-6">
                            <div class="input_field">
                                <label>Adults</label>
                                <input type="text" class="Num_input" name="adults" value="0" required>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="input_field">
                                <label>Kids</label>
                                <input type="text" class="Num_input" name="kids" value="0" required>
                            </div>
                        </div>
                    </div>
                    <div class="input_field">
                        <input type="submit" value="Check Availability" class="btn">
                    </div>
                    
                </form>
            </div>
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
