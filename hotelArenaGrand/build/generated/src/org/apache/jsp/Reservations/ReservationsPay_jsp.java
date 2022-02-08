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
      out.write("\r\n");
      out.write("        <div class=\"reserve-header-image\">\r\n");
      out.write("            <h1 class=\"header-text\">Reservations</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <h1>Proceed to pay</h1>\r\n");
      out.write("        <!--Paypal Integration-->\r\n");
      out.write("        <div id=\"smart-button-container\">\r\n");
      out.write("            <div style=\"text-align: center;\">\r\n");
      out.write("                <div id=\"paypal-button-container\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://www.paypal.com/sdk/js?client-id=AdNH0V50CjsGNdacW_MycidixGny38li19VxpYZR3TJA2d4DtbWIDGcuJlCxhl9G0vChoGxEH2U__P9L&disable-funding=venmo&currency=USD\" data-sdk-integration-source=\"button-factory\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function initPayPalButton() {\r\n");
      out.write("                paypal.Buttons({\r\n");
      out.write("                    style: {\r\n");
      out.write("                        shape: 'rect',\r\n");
      out.write("                        color: 'gold',\r\n");
      out.write("                        layout: 'vertical',\r\n");
      out.write("                        label: 'paypal',\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("\r\n");
      out.write("                    createOrder: function (data, actions) {\r\n");
      out.write("                        return actions.order.create({\r\n");
      out.write("                            purchase_units: [{\"amount\": {\"currency_code\": \"USD\", \"value\": 1}}]\r\n");
      out.write("                        });\r\n");
      out.write("                    },\r\n");
      out.write("\r\n");
      out.write("                    onApprove: function (data, actions) {\r\n");
      out.write("                        return actions.order.capture().then(function (orderData) {\r\n");
      out.write("\r\n");
      out.write("                            // Full available details\r\n");
      out.write("                            console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));\r\n");
      out.write("\r\n");
      out.write("                            // Show a success message within this page, e.g.\r\n");
      out.write("                            const element = document.getElementById('paypal-button-container');\r\n");
      out.write("                            element.innerHTML = '';\r\n");
      out.write("                            element.innerHTML = '<h3>Thank you for your payment!</h3>';\r\n");
      out.write("\r\n");
      out.write("                            // Or go to another URL:  actions.redirect('thank_you.html');\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("                    },\r\n");
      out.write("\r\n");
      out.write("                    onError: function (err) {\r\n");
      out.write("                        console.log(err);\r\n");
      out.write("                    }\r\n");
      out.write("                }).render('#paypal-button-container');\r\n");
      out.write("            }\r\n");
      out.write("            initPayPalButton();\r\n");
      out.write("        </script>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>   \r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid footer\">\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
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
