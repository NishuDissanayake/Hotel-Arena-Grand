package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./navbar.jsp");
    _jspx_dependants.add("/./footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./index.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Navigation bar</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./navbar.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                    <img src=\"./Images/ArenaGrand Logo.png\" alt=\"Logo\" width=\"300\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarText\">\r\n");
      out.write("            <div class=\"navbar-itemlist justify-content-end\">\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./Services/services.jsp\">Services</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./Accommodations/accommodations.jsp\">Accommodations</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./Gallery/gallery.jsp\">Gallery</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#footer-div\">Contact Us</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"./Signup/signup.jsp\">Sign In</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"header-image\">\r\n");
      out.write("            <h1 class=\"header-text\">ARENA GRAND</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container about\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-6\">\r\n");
      out.write("                    <h3>About Arena grand</h3>\r\n");
      out.write("                    <hr />\r\n");
      out.write("                    <p class=\"main-paragraph\">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there. <br />\r\n");
      out.write("                    The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences.</p>\r\n");
      out.write("                    <hr />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                    <div class=\"card first-card\" style=\"width: 18rem;\">\r\n");
      out.write("                        <img src=\"./Images/hm-pool.jpg\" class=\"card-img-top\" alt=\"Hotel Image\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <span class=\"card-header-text\">Pool</span><br /><br />\r\n");
      out.write("A stunning pool perched on the roof top terrace of the hotel, to give you uninterrupted views of the island and its surrounding bays of turquoise and azure blue waters. Perfect for cooking dip in the day or to unwind and watch the vibrant sunsets so infamous with Colombo.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                        <img src=\"./Images/hm-rs.jpg\" class=\"card-img-top\" alt=\"Hotel Image\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <span class=\"card-header-text\">Restaurant</span><br /><br />\r\n");
      out.write("Indulge in a wide selection of Sri Lankan delicacies with the best hand-picked foods from around the world in our A La Carte menu. We choose only the freshest locally sourced ingredients to ensure the best culinary experience.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"banner-image\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <h2>Ongoing Offers</h2>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container offers\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                        <img src=\"./Images/hm-rm1.jpg\" class=\"card-img-top\" alt=\"Card Image\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <span class=\"card-header-text\">Regular Room</span><br /><br />\r\n");
      out.write("                                Enjoy breathtaking views from the privacy of your own balcony, the Deluxe Sea view Room is a cosy base with a smart en-suite bathroom. </p>\r\n");
      out.write("                            <div class=\"button-book\"><a href=\"./Reservations/reservations.jsp\" class=\"btn btn-primary\">Book Now</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                        <img src=\"./Images/Home Header.jpg\" class=\"card-img-top\" alt=\"Card Image\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <span class=\"card-header-text\">Semi Deluxe Room</span><br /><br />\r\n");
      out.write("                                Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities. This lavish room has being designed with an element of elegance & has a panoramic view of the Ocean. Contemporary spacious design with wooden flooring, the Semi deluxe Room is the Hotel’s signature accommodation category that ensures total comfort.</p>\r\n");
      out.write("                            <div class=\"button-book\"><a href=\"./Reservations/reservations.jsp\" class=\"btn btn-primary\">Book Now</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                        <img src=\"./Images/Home Header.jpg\" class=\"card-img-top\" alt=\"Card Image\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <span class=\"card-header-text\">Deluxe Room</span><br /><br />\r\n");
      out.write("                                Rooms are equipped with all modern amenities and offer you a spectacular view of the Ocean both day & night. Our Deluxe Rooms are designed to inspire rest and relaxation with comfort & elegance in mind. Situated in the upper floors of the property, larger balconies featuring amazing sea views that blend seamlessly in to the azure of the Indian Ocean all equipped with furnishings made from Maldives’ indigenous materials.\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <div class=\"button-book\"><a href=\"./Reservations/reservations.jsp\" class=\"btn btn-primary\">Book Now</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer-div\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Footer</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./footer.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid footer\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <div class=\"row img-footer\">\r\n");
      out.write("                        <img src=\"./Images/ArenaGrand Logo.png\" alt=\"logo\" />\r\n");
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
      out.write("                    <form method=\"POST\" action=\"ContactUsForm\">\r\n");
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
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
