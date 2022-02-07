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
    </head>
    <body>
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
    </body>
</html>

            
            