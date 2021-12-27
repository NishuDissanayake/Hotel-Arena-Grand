<%-- 
    Document   : accommodations
    Created on : Dec 26, 2021, 9:36:22 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accommodations</title>
        
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./accommodations.css" />
    </head>
    <body>
        <%@ include file="./navbar.jsp"%>
        <div class="header-image">
            <h1 class="header-text">ACCOMMODATIONS</h1>
        </div>
        <div class="container card-set">
            <div class="row">
                <div class="col-6">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Deluxe Room</span><br /><br />
                                Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views.</p>
                            <div class="button-book"><a href="#" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
                <div class="col-6">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Deluxe Room</span><br /><br />
                                Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views.</p>
                            <div class="button-book"><a href="#" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
                
            </div>
            <div class="row">
                <div class="col-6">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Deluxe Room</span><br /><br />
                                Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views.</p>
                            <div class="button-book"><a href="#" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
                <div class="col-6">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Deluxe Room</span><br /><br />
                                Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views.</p>
                            <div class="button-book"><a href="#" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
                
            </div>
            
        </div>
        
        
         <%@ include file="./footer.jsp"%>
    </body>
</html>
