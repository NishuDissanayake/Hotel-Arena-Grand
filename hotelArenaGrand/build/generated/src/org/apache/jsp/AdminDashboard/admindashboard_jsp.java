package org.apache.jsp.AdminDashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.dbConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admindashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String email = (String) session.getAttribute("AdminEmail");

    if (email != null) {
      out.write("\r\n");
      out.write("\r\n");

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Admin Dashboard</title>\r\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./admindashboard.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./navbar.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../navbar.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./footer.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../footer.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"./../index.jsp\">\r\n");
      out.write("                    <img src=\"./../ArenaGrand Logo.png\" alt=\"Logo\" width=\"300\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarText\">\r\n");
      out.write("            <div class=\"navbar-itemlist justify-content-end\">\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Services/services.jsp\">Services</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Accommodations/accommodations.jsp\">Accommodations</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Gallery/gallery.jsp\">Gallery</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#footer-div\">Contact Us</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Signup/signup.jsp\">Sign In</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container admin-table\">\r\n");
      out.write("            <h2>All Bookings</h2>\r\n");
      out.write("            <div class=\"container table-1\">\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"col\">ID</th>\r\n");
      out.write("                            <th scope=\"col\">Full Name</th>\r\n");
      out.write("                            <th scope=\"col\">Email</th>\r\n");
      out.write("                            <th scope=\"col\">Check-In</th>\r\n");
      out.write("                            <th scope=\"col\">Check-Out</th>\r\n");
      out.write("                            <th scope=\"col\">Room Type</th>\r\n");
      out.write("                            <th scope=\"col\">No. Of Rooms</th>\r\n");
      out.write("                            <th scope=\"col\">Adults</th>\r\n");
      out.write("                            <th scope=\"col\">Kids</th>\r\n");
      out.write("                            <th scope=\"col\">Manage</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    ");

                        try {
                            dbConnection con = new dbConnection();
                            statement = con.createConnection().createStatement();
                            String sql = "SELECT * FROM reservations";
                            resultSet = statement.executeQuery(sql);

                            while (resultSet.next()) {
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("reservationID"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("fullname"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("email"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("checkIn"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("chackOut"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("roomType"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("numberOfRooms"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("adults"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("kids"));
      out.write("</td>\r\n");
      out.write("                            ");

                                String reservationID = resultSet.getString("reservationID");
                                String roomType = resultSet.getString("roomType");
                                String roomCount = resultSet.getString("numberOfRooms");
                            
      out.write("    \r\n");
      out.write("                            <td>\r\n");
      out.write("                                <form action=\"../deleteBooking\" method=\"POST\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"bookingID\" value=\"");
      out.print(reservationID);
      out.write("\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"roomType\" value=\"");
      out.print(roomType);
      out.write("\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"roomCount\" value=\"");
      out.print(roomCount);
      out.write("\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"Delete\" class=\"btn btn-dark delete-booking\"/>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    ");

                            }
                            connection.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                <div class=\"container admin-table\">\r\n");
      out.write("            <h2>Feedback Form</h2>\r\n");
      out.write("            <div class=\"container table-1\">\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"col\">Reservation ID</th>\r\n");
      out.write("                            <th scope=\"col\">Full Name</th>\r\n");
      out.write("                            <th scope=\"col\">Phone Number</th>\r\n");
      out.write("                            <th scope=\"col\">Message</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    ");

                        try {
                            dbConnection con = new dbConnection();
                            statement = con.createConnection().createStatement();
                            String sql = "SELECT * FROM feedback";
                            resultSet = statement.executeQuery(sql);

                            while (resultSet.next()) {
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getInt("feedbackid"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("phone"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("message"));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    ");

                            }
                            connection.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container update-booking\">\r\n");
      out.write("            <h2>Update Booking</h2>\r\n");
      out.write("            <div class=\"container table-2\">\r\n");
      out.write("                <form method=\"POST\" action=\"../updateBooking\">\r\n");
      out.write("                    <div class=\"row row-1\">\r\n");
      out.write("                        <div class=\"col-4\"><span class=\"from-txt\">Update by Booking ID</div>\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Booking ID\" name=\"reservationID\"></div>\r\n");
      out.write("                        <div class=\"col-4 justify-content-end\"><button class=\"btn btn-primary update-booking-btn\" type=\"submit\">Update Now!</button></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Number of Rooms\" name=\"noRooms\"></div>\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Room Type\" name=\"roomType\"></div>\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Check In\" name=\"checkIn\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Check Out\" name=\"checkOut\"></div>\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Adults\" name=\"adults\"></div>\r\n");
      out.write("                        <div class=\"col-4\"><input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Kids\" name=\"kids\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"container-fluid footer\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <div class=\"row img-footer\">\r\n");
      out.write("                        <img src=\"./../ArenaGrand Logo.png\" alt=\"logo\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views. Designed to inspire rest and relaxation, our sleek.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <i class=\"fab fa-facebook\"></i>\r\n");
      out.write("                        <i class=\"fab fa-facebook\"></i>\r\n");
      out.write("                        <i class=\"fab fa-facebook\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-8 footer-form\">\r\n");
      out.write("                    <h3>Contact Us</h3>\r\n");
      out.write("                    <form method=\"POST\" action=\"../ContactUsForm\">\r\n");
      out.write("                        <div class=\"form-group row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Name</label>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <input type=\"text\" name=\"Fname\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Full Name\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Phone Number</label>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <input type=\"text\" name=\"PhoneNum\" class=\"form-control\" id=\"inputPassword\" placeholder=\"07X-XXXXXXX\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Message</label>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <textarea class=\"form-control\" name=\"Message\" id=\"exampleFormControlTextarea1\" rows=\"3\" required></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group row btn-form-group\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container-fluid footer-copyright\">\r\n");
      out.write("            <p>Copyright: Arena Grand 2022</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
 } else {
        response.sendRedirect("../AdminLogin/adminlogin.jsp");
    }
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
