package org.apache.jsp.Reservations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservations_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Reservations</title>\r\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./reservations.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"reserve-header-image\">\r\n");
      out.write("            <h1 class=\"header-text\">Reservations</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container reserve \">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-6 form-header\">\r\n");
      out.write("                    <span>Book Now</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container form-container \">\r\n");
      out.write("            <div class=\"reserve2\">\r\n");
      out.write("                <form class=\"form\" method=\"POST\" action=\"../reservation\" >\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Select room type</label>\r\n");
      out.write("                         <select class=\"browser-default custom-select select_input\" name=\"roomType\">\r\n");
      out.write("                            <option selected> - Select room type </option>\r\n");
      out.write("                            <option value=\"Regular\">Regular</option>\r\n");
      out.write("                            <option value=\"SemiDeluxe\">Semi Deluxe</option>\r\n");
      out.write("                            <option value=\"Deluxe\">Deluxe</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Number of Rooms</label>\r\n");
      out.write("                        <input type=\"text\" class=\"Num_input\" name=\"num_of_rooms\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Full Name</label>\r\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"fname\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Check In</label>\r\n");
      out.write("                        <input id=\"date\" type=\"date\" class=\"input\" name=\"checkIn\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Check Out</label>\r\n");
      out.write("                        <input id=\"date\" type=\"date\" class=\"input\" name=\"checkOut\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Phone Number</label>\r\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"phoneNum\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Email Address</label>\r\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"emailAdd\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write(" \r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <label>Estimated Arrival Time</label>\r\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"arrTime\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-6\">\r\n");
      out.write("                            <div class=\"input_field\">\r\n");
      out.write("                                <label>Adults</label>\r\n");
      out.write("                                <input type=\"text\" class=\"Num_input\" name=\"adults\" value=\"0\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-6\">\r\n");
      out.write("                            <div class=\"input_field\">\r\n");
      out.write("                                <label>Kids</label>\r\n");
      out.write("                                <input type=\"text\" class=\"Num_input\" name=\"kids\" value=\"0\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input_field\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Check Availability\" class=\"btn\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
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
