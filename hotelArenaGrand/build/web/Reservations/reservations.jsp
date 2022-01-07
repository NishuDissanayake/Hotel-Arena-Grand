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
    </head>
    <body>
        
        <div class="reserve-header-image">
            <h1 class="header-text">Reservations</h1>
        </div>
        
        <div class="container reserve ">
            <div class="row">
                <div class="col-6 form-header">
                    <span>Book Now</span>
                </div>
                <div class="col-3 dropdown-text justify-content-end">
                    <span>Room Type</span>
                </div>
                <div class="col-3 justify-content-end">
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Select
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </div>
                </div>               
            </div>
        </div>
        
        <div class="container form-container ">
            <div class="reserve2">
                <div class="form">
                    <div class="input_field">
                        <label>Number of Rooms</label>
                        <input type="text" class="Num_input">
                    </div>
                    <div class="input_field">
                        <label>Full Name</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Duration</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Check In</label>
                        <input id="date" type="date" class="input">
                    </div>
                    <div class="input_field">
                        <label>Check Out</label>
                        <input id="date" type="date" class="input">
                    </div>
                    <div class="input_field">
                        <label>Phone Number</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Email Address</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Confirm Email Address</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Estimated Arrival Time</label>
                        <input type="text" class="input">
                    </div>
                    <div class="row">
                        <div class="col-6">
                            <div class="input_field">
                                <label>Adults</label>
                                <input type="text" class="Num_input">
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="input_field">
                                <label>Kids</label>
                                <input type="text" class="Num_input">
                            </div>
                        </div>
                    </div>
                    <div class="input_field">
                        <input type="submit" value="Check Availability" class="btn" onclick="window.location.href='./ReservationsAvailable.jsp';">
                    </div>
                    
                </div>
            </div>
        </div>        
    </body>
</html>
