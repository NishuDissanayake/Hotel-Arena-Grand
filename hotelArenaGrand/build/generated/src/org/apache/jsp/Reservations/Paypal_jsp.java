package org.apache.jsp.Reservations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Paypal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"smart-button-container\">\r\n");
      out.write("      <div style=\"text-align: center;\">\r\n");
      out.write("        <div id=\"paypal-button-container\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  <script src=\"https://www.paypal.com/sdk/js?client-id=AdNH0V50CjsGNdacW_MycidixGny38li19VxpYZR3TJA2d4DtbWIDGcuJlCxhl9G0vChoGxEH2U__P9L&enable-funding=venmo&currency=USD\" data-sdk-integration-source=\"button-factory\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("    function initPayPalButton() {\r\n");
      out.write("      paypal.Buttons({\r\n");
      out.write("        style: {\r\n");
      out.write("          shape: 'rect',\r\n");
      out.write("          color: 'gold',\r\n");
      out.write("          layout: 'vertical',\r\n");
      out.write("          label: 'paypal',\r\n");
      out.write("          \r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        createOrder: function(data, actions) {\r\n");
      out.write("          return actions.order.create({\r\n");
      out.write("            purchase_units: [{\"amount\":{\"currency_code\":\"USD\",\"value\":1}}]\r\n");
      out.write("          });\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        onApprove: function(data, actions) {\r\n");
      out.write("          return actions.order.capture().then(function(orderData) {\r\n");
      out.write("            \r\n");
      out.write("            // Full available details\r\n");
      out.write("            console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));\r\n");
      out.write("\r\n");
      out.write("            // Show a success message within this page, e.g.\r\n");
      out.write("            const element = document.getElementById('paypal-button-container');\r\n");
      out.write("            element.innerHTML = '';\r\n");
      out.write("            element.innerHTML = '<h3>Thank you for your payment!</h3>';\r\n");
      out.write("\r\n");
      out.write("            // Or go to another URL:  actions.redirect('thank_you.html');\r\n");
      out.write("            \r\n");
      out.write("          });\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        onError: function(err) {\r\n");
      out.write("          console.log(err);\r\n");
      out.write("        }\r\n");
      out.write("      }).render('#paypal-button-container');\r\n");
      out.write("    }\r\n");
      out.write("    initPayPalButton();\r\n");
      out.write("  </script>\r\n");
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
