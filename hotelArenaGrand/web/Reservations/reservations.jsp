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
                        <input type="text" class="input" name="arrTime" required>
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
    </body>
</html>
