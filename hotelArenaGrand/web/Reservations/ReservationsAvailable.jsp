<%-- 
    Document   : ReservationsAvailabe
    Created on : Dec 28, 2021, 9:13:59 AM
    Author     : Mahima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./ReservationsAvailable.css" />
    </head>
    
    <body>
        <div class="header-image">
            <h1 class="header-text">Reservations</h1>
        </div>
        
        <div class="container reserveAvailable">
            <span class="availability">Available!</span>
            <p class="reserve-content">
                The room you have requested is available. please make an<br/>
                advanced payment of 40% to reserve. The rest of the<br/>
                payment should be cleared at checkout.<br/><br/>
                For inquiries: 011-6767672
                <br/>
            </p>
            
            <img class="thankyou" src="./../Images/thankyou.jpg"/>
            
            <div class="input_field">
                <input type="submit" value="Proceed to Pay" class="btn" onclick="window.location.href='./ReservationsNotAvailable.jsp';">
            </div>
        </div>
    </body>
</html>
