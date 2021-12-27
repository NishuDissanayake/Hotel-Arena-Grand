<%-- 
    Document   : index
    Created on : Dec 26, 2021, 7:14:53 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./index.css" />
    </head>
    <body>
        <%@ include file="./navbar.jsp"%>
        <div class="header-image">
            <h1 class="header-text">ARENA GRAND</h1>
        </div>
        <div class="container about">
            <div class="row">
                <div class="col-6">
                    <h3>About Arena grand</h3>
                    <hr />
                    <p class="main-paragraph">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there. <br />
                    The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences.</p>
                    <hr />
                </div>
                <div class="col-3">
                    <div class="card first-card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Hotel Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Deluxe Room</span><br /><br />
Designed to inspire rest and relaxation, our sleek, a modern hotel accommodation deluxe rooms become a home away from home. Each room features a king of facilities and incredible sea views.</p>
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Hotel Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Restaurant</span><br /><br />
Designed to inspire rest and relaxation, our sleek, a modern hotel accommodation deluxe rooms become a home away from home. Each room features a king of facilities and incredible sea views.</p>
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
        
        <div class="banner-image"></div>
        
        <h2>Ongoing Offers</h2>
        
        <div class="container offers">
            <div class="row">
                <div class="col-4">
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
                <div class="col-4">
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
                <div class="col-4">
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
        <div id="footer-div"><%@ include file="./footer.jsp"%></div>
    </body>
</html>
