package org.apache.jsp.Reservations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ReservationsPay_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Reservations</title>\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./reservations.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"reserve-header-image\">\n");
      out.write("            <h1 class=\"header-text\">Reservations</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container Pay-form-container\">\n");
      out.write("            <div class=\"reserve2\">\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Number of Rooms</label>\n");
      out.write("                        <input type=\"text\" class=\"Num_input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Full Name</label>\n");
      out.write("                        <input type=\"text\" class=\"input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Date</label>\n");
      out.write("                        <input id=\"date\" type=\"date\" class=\"input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Number of Guests</label>\n");
      out.write("                        <input type=\"text\" class=\"input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Rooms</label>\n");
      out.write("                        <input type=\"text\" class=\"input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Unit Price</label>\n");
      out.write("                        <input type=\"text\" class=\"input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Total Price</label>\n");
      out.write("                        <input type=\"text\" class=\"input\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-6\">\n");
      out.write("                            <div class=\"input_field\">\n");
      out.write("                                <label>Adults</label>\n");
      out.write("                                <input type=\"text\" class=\"Num_input\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-6\">\n");
      out.write("                            <div class=\"input_field\">\n");
      out.write("                                <label>Kids</label>\n");
      out.write("                                <input type=\"text\" class=\"Num_input\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <input type=\"submit\" value=\"Pay Now\" class=\"btn\" onclick=\"window.location.href='./ReservationsAvailable.jsp';\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
