package org.apache.jsp.Services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Services</title>\r\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./services.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header-image\">\r\n");
      out.write("            <h1 class=\"header-text\">SERVICES</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container card-list\">\r\n");
      out.write("            <div class=\"row main-row\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-8 content\"> \r\n");
      out.write("                                <h4 class=\"card-title\">Rooms</h4>\r\n");
      out.write("                                <p class=\"card-text\">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <div class=\"row img1\"></div>\r\n");
      out.write("                                <div class=\"row img2\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row main-row\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">                            \r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <div class=\"row img3\"></div>\r\n");
      out.write("                                <div class=\"row img4\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-8 content2\"> \r\n");
      out.write("                                <h4 class=\"card-title\">Restaurant</h4>\r\n");
      out.write("                                <p class=\"card-text\">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row main-row\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-8 content\"> \r\n");
      out.write("                                <h4 class=\"card-title\">Events</h4>\r\n");
      out.write("                                <p class=\"card-text\">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <div class=\"row img5\"></div>\r\n");
      out.write("                                <div class=\"row img6\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row main-row\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">                            \r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <div class=\"row img7\"></div>\r\n");
      out.write("                                <div class=\"row img8\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-8 content2\"> \r\n");
      out.write("                                <h4 class=\"card-title\">Spa</h4>\r\n");
      out.write("                                <p class=\"card-text\">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row main-row\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-8 content\"> \r\n");
      out.write("                                <h4 class=\"card-title\">Beach</h4>\r\n");
      out.write("                                <p class=\"card-text\">The Arena Grand Hotel, luxurious and detail oriented, is a paradise for relaxation. Every suite includes a plunge pool, and spa services are available in the suite upon request. Dining is top notch, and all sorts of cultural and adventure experiences can be had around the area, from amazing foods to sea diving to walking tours of the local village. The main pool overlooks the ocean in a bay lined with coconut palms, and you won’t want to leave once you get there.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <div class=\"row img9\"></div>\r\n");
      out.write("                                <div class=\"row img10\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
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
