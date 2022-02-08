<%-- 
    Document   : admindashboard
    Created on : Dec 26, 2021, 7:18:38 PM
    Author     : HP
--%>
<%@page import="Model.dbConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String email = (String) session.getAttribute("AdminEmail");

    if (email != null) {%>

<%
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./admindashboard.css" />
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
        
        
        <div class="container admin-table">
            <h2>All Bookings</h2>
            <div class="container table-1">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Full Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Check-In</th>
                            <th scope="col">Check-Out</th>
                            <th scope="col">Room Type</th>
                            <th scope="col">No. Of Rooms</th>
                            <th scope="col">Adults</th>
                            <th scope="col">Kids</th>
                            <th scope="col">Manage</th>
                        </tr>
                    </thead>
                    <%
                        try {
                            dbConnection con = new dbConnection();
                            statement = con.createConnection().createStatement();
                            String sql = "SELECT * FROM reservations";
                            resultSet = statement.executeQuery(sql);

                            while (resultSet.next()) {%>
                    <tbody>
                        <tr>
                            <td><%=resultSet.getString("reservationID")%></td>
                            <td><%=resultSet.getString("fullname")%></td>
                            <td><%=resultSet.getString("email")%></td>
                            <td><%=resultSet.getString("checkIn")%></td>
                            <td><%=resultSet.getString("chackOut")%></td>
                            <td><%=resultSet.getString("roomType")%></td>
                            <td><%=resultSet.getString("numberOfRooms")%></td>
                            <td><%=resultSet.getString("adults")%></td>
                            <td><%=resultSet.getString("kids")%></td>
                            <%
                                String reservationID = resultSet.getString("reservationID");
                                String roomType = resultSet.getString("roomType");
                                String roomCount = resultSet.getString("numberOfRooms");
                            %>    
                            <td>
                                <form action="../deleteBooking" method="POST">
                                    <input type="hidden" name="bookingID" value="<%=reservationID%>">
                                    <input type="hidden" name="roomType" value="<%=roomType%>">
                                    <input type="hidden" name="roomCount" value="<%=roomCount%>">
                                    <input type="submit" value="Delete" class="btn btn-dark delete-booking"/>
                                </form>
                            </td>
                        </tr>

                    </tbody>
                    <%
                            }
                            connection.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                </table>
            </div>
        </div>
                <div class="container admin-table">
            <h2>Feedback Form</h2>
            <div class="container table-1">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Reservation ID</th>
                            <th scope="col">Full Name</th>
                            <th scope="col">Phone Number</th>
                            <th scope="col">Message</th>
                        </tr>
                    </thead>
                    <%
                        try {
                            dbConnection con = new dbConnection();
                            statement = con.createConnection().createStatement();
                            String sql = "SELECT * FROM feedback";
                            resultSet = statement.executeQuery(sql);

                            while (resultSet.next()) {%>
                    <tbody>
                        <tr>
                            <td><%=resultSet.getInt("feedbackid")%></td>
                            <td><%=resultSet.getString("name")%></td>
                            <td><%=resultSet.getString("phone")%></td>
                            <td><%=resultSet.getString("message")%></td>
                        </tr>

                    </tbody>
                    <%
                            }
                            connection.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                </table>
            </div>
        </div>
        <div class="container update-booking">
            <h2>Update Booking</h2>
            <div class="container table-2">
                <form method="POST" action="../updateBooking">
                    <div class="row row-1">
                        <div class="col-4"><span class="from-txt">Update by Booking ID</div>
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Booking ID" name="reservationID"></div>
                        <div class="col-4 justify-content-end"><button class="btn btn-primary update-booking-btn" type="submit">Update Now!</button></div>
                    </div>
                    <div class="row">
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Number of Rooms" name="noRooms"></div>
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Room Type" name="roomType"></div>
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Check In" name="checkIn"></div>
                    </div>
                    <div class="row">
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Check Out" name="checkOut"></div>
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Adults" name="adults"></div>
                        <div class="col-4"><input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Kids" name="kids"></div>
                    
                    </div>
                </form>
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

<% } else {
        response.sendRedirect("../AdminLogin/adminlogin.jsp");
    }%>
