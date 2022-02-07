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
                        <img src="./Images/hm-pool.jpg" class="card-img-top" alt="Hotel Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Pool</span><br /><br />
A stunning pool perched on the roof top terrace of the hotel, to give you uninterrupted views of the island and its surrounding bays of turquoise and azure blue waters. Perfect for cooking dip in the day or to unwind and watch the vibrant sunsets so infamous with Colombo.</p>
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/hm-rs.jpg" class="card-img-top" alt="Hotel Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Restaurant</span><br /><br />
Indulge in a wide selection of Sri Lankan delicacies with the best hand-picked foods from around the world in our A La Carte menu. We choose only the freshest locally sourced ingredients to ensure the best culinary experience.</p>
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
                        <img src="./Images/hm-rm1.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Regular Room</span><br /><br />
                                Enjoy breathtaking views from the privacy of your own balcony, the Deluxe Sea view Room is a cosy base with a smart en-suite bathroom. </p>
                            <div class="button-book"><a href="./Reservations/reservations.jsp" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Semi Deluxe Room</span><br /><br />
                                Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities. This lavish room has being designed with an element of elegance & has a panoramic view of the Ocean. Contemporary spacious design with wooden flooring, the Semi deluxe Room is the Hotel’s signature accommodation category that ensures total comfort.</p>
                            <div class="button-book"><a href="./Reservations/reservations.jsp" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card" style="width: 18rem;">
                        <img src="./Images/Home Header.jpg" class="card-img-top" alt="Card Image">
                        <div class="card-body">
                            <p class="card-text">
                                <span class="card-header-text">Deluxe Room</span><br /><br />
                                Rooms are equipped with all modern amenities and offer you a spectacular view of the Ocean both day & night. Our Deluxe Rooms are designed to inspire rest and relaxation with comfort & elegance in mind. Situated in the upper floors of the property, larger balconies featuring amazing sea views that blend seamlessly in to the azure of the Indian Ocean all equipped with furnishings made from Maldives’ indigenous materials.
                            </p>
                            <div class="button-book"><a href="./Reservations/reservations.jsp" class="btn btn-primary">Book Now</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="footer-div"><%@ include file="./footer.jsp"%></div>
    </body>
</html>
