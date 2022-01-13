<%-- 
    Document   : userprofile
    Created on : Dec 31, 2021, 4:20:04 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String email = (String) session.getAttribute("Email");

    if (email != null) {%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./UserProfile/userprofile.css" />
    </head>
    <body>
        <div class="header-image">
            <h1 class="header-text">Hello Mahima</h1>
        </div>
        <div class="profile-pic">

        </div>
        <div class="container form-1">
            <form>
            <div class="row table-row">
                <div class="col-6 txt-col-1">Full Name</div>
                <div class="col-6 txt-col-2">Mahima Induwara</div>
            </div>
            <div class="row table-row">
                <div class="col-6 txt-col-1">Email</div>
                <div class="col-6 txt-col-2">mahi97@gmail.com</div>
            </div>
            <div class="row table-row">
                <div class="col-6 txt-col-1">Telephone</div>
                <div class="col-6 txt-col-2">086765432</div>
            </div>
            </form>
        </div>
        <div class="container user-table">
            <h2>Your Bookings</h2>
            <div class="container table-1">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Check-In</th>
                            <th scope="col">Check-Out</th>
                            <th scope="col">Duration</th>
                            <th scope="col">Adults</th>
                            <th scope="col">Kids</th>
                            <th scope="col">Manage</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>01-05-2021</td>
                            <td>01-08-2021</td>
                            <td>3 Days</td>
                            <td>2</td>
                            <td>2</td>
                            <td><a href="#" class="btn btn-primary delete-booking">Cancel</a></td>
                        </tr>
                        <tr>
                            <td>01-05-2021</td>
                            <td>01-08-2021</td>
                            <td>3 Days</td>
                            <td>2</td>
                            <td>2</td>
                            <td><a href="#" class="btn btn-primary delete-booking">Cancel</a></td>
                        </tr>
                        <tr>
                            <td>01-05-2021</td>
                            <td>01-08-2021</td>
                            <td>3 Days</td>
                            <td>2</td>
                            <td>2</td>
                            <td><a href="#" class="btn btn-primary delete-booking">Cancel</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>

<% } else {
        response.sendRedirect("../Login/login.jsp");
    }%>