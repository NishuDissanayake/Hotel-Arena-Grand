 <%-- 
    Document   : gallery
    Created on : Dec 27, 2021, 2:10:13 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gallery</title>
         <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./gallery.css" />
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
        
        
        <div class="header-image">
            <h1 class="header-text">GALLERY</h1>
        </div>
        <div class="container btn-group">
            <button type="button" class="btn btn-outline-primary"> <a href="#Exterior" style="text-decoration: none;"> Exterior </a> </button>
            <button type="button" class="btn btn-outline-primary"> <a href="#Interior" style="text-decoration: none;"> Interior </a> </button>
            <button type="button" class="btn btn-outline-primary"> <a href="#Beach" style="text-decoration: none;"> Beach & Pool </a> </button>
            <button type="button" class="btn btn-outline-primary"> <a href="#Dining" style="text-decoration: none;"> Dining </a> </button>
            <button type="button" class="btn btn-outline-primary"> <a href="#Wedding" style="text-decoration: none;"> Wedding </a> </button>
           
        </div>
        
        <div class=" container img-section" id="Exterior">
            <div class="row main-text">
                <div class="col-4">Exterior</div>
            </div>
            <div class="row img-set1">
                <div class="col-2 ex-img1 img-hover"></div>
                <div class="col-4 ex-img2 img-hover"></div>
                <div class="col-2 ex-img3 img-hover"></div>
                <div class="col-4 ex-img4 img-hover"></div>
                
            </div>
              <div class="row img-set2">
                <div class="col-4 ex-img5 img-hover"></div>
                <div class="col-2 ex-img6 img-hover"></div>
                <div class="col-4 ex-img7 img-hover"></div>
                <div class="col-2 ex-img8 img-hover"></div>
                
            </div>
        </div>
        
         <div class=" container img-section" id="Interior">
            <div class="row main-text">
                
                 <div class="col-4">Interior</div>
            </div>
            <div class="row img-set1">
                <div class="col-2 in-img1 img-hover"></div>
                <div class="col-4 in-img2 img-hover"></div>
                <div class="col-2 in-img3 img-hover"></div>
                <div class="col-4 in-img4 img-hover"></div>
                
            </div>
              <div class="row img-set2">
                <div class="col-4 in-img5 img-hover"></div>
                <div class="col-2 in-img6 img-hover"></div>
                <div class="col-4 in-img7 img-hover"></div>
                <div class="col-2 in-img8 img-hover"></div>
                
            </div>
        </div>
        
        <div class=" container img-section"id="Beach">
            <div class="row main-text">
                <div class="col-4">Beach & Pool</div>
            </div>
            <div class="row img-set1">
                <div class="col-2 bp-img1 img-hover"></div>
                <div class="col-4 bp-img2 img-hover"></div>
                <div class="col-2 bp-img3 img-hover"></div>
                <div class="col-4 bp-img4 img-hover"></div>
                
            </div>
              <div class="row img-set2">
                <div class="col-4 bp-img5 img-hover"></div>
                <div class="col-2 bp-img6 img-hover"></div>
                <div class="col-4 bp-img7 img-hover"></div>
                <div class="col-2 bp-img8 img-hover"></div>
                
            </div>
        </div>
        
         <div class=" container img-section" id="Dining">
            <div class="row main-text">

                 <div class="col-4">Dinning</div>
            </div>
            <div class="row img-set1">
                <div class="col-2 di-img1 img-hover"></div>
                <div class="col-4 di-img2 img-hover"></div>
                <div class="col-2 di-img3 img-hover"></div>
                <div class="col-4 di-img4 img-hover"></div>
                
            </div>
              <div class="row img-set2">
                <div class="col-4 di-img5 img-hover"></div>
                <div class="col-2 di-img6 img-hover"></div>
                <div class="col-4 di-img7 img-hover"></div>
                <div class="col-2 di-img8 img-hover"></div>
                
            </div>
        </div>
        
        <div class=" container img-section"id="Wedding">
            <div class="row main-text">
                <div class="col-4">Wedding</div>
            </div>
            <div class="row img-set1">
                <div class="col-2 wd-img1 img-hover"></div>
                <div class="col-4 wd-img2 img-hover"></div>
                <div class="col-2 wd-img3 img-hover"></div>
                <div class="col-4 wd-img4 img-hover"></div>
                
            </div>
              <div class="row img-set2">
                <div class="col-4 wd-img5 img-hover"></div>
                <div class="col-2 wd-img6 img-hover"></div>
                <div class="col-4 wd-img7 img-hover"></div>
                <div class="col-2 wd-img8 img-hover"></div>
                
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

            
            