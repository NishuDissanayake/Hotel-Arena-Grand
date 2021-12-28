<%-- 
    Document   : ReservationsPay
    Created on : Dec 28, 2021, 6:07:49 PM
    Author     : Mahima
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
        
        <div class="container Pay-form-container">
            <div class="reserve2">
                <div class="form">
                    <br/><br/>
                    <div class="input_field">
                        <label>Number of Rooms</label>
                        <input type="text" class="Num_input">
                    </div>
                    <div class="input_field">
                        <label>Full Name</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Date</label>
                        <input id="date" type="date" class="input">
                    </div>
                    <div class="input_field">
                        <label>Number of Guests</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Rooms</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Unit Price</label>
                        <input type="text" class="input">
                    </div>
                    <div class="input_field">
                        <label>Total Price</label>
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
                        <input type="submit" value="Pay Now" class="btn" onclick="window.location.href='./ReservationsAvailable.jsp';">
                    </div>
                    
                </div>
            </div>
        </div>        
    </body>
</html>