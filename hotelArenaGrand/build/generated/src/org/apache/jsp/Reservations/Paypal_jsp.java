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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"smart-button-container\">\n");
      out.write("      <div style=\"text-align: center;\">\n");
      out.write("        <div id=\"paypal-button-container\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  <script src=\"https://www.paypal.com/sdk/js?client-id=AdNH0V50CjsGNdacW_MycidixGny38li19VxpYZR3TJA2d4DtbWIDGcuJlCxhl9G0vChoGxEH2U__P9L&enable-funding=venmo&currency=USD\" data-sdk-integration-source=\"button-factory\"></script>\n");
      out.write("  <script>\n");
      out.write("    function initPayPalButton() {\n");
      out.write("      paypal.Buttons({\n");
      out.write("        style: {\n");
      out.write("          shape: 'rect',\n");
      out.write("          color: 'gold',\n");
      out.write("          layout: 'vertical',\n");
      out.write("          label: 'paypal',\n");
      out.write("          \n");
      out.write("        },\n");
      out.write("\n");
      out.write("        createOrder: function(data, actions) {\n");
      out.write("          return actions.order.create({\n");
      out.write("            purchase_units: [{\"amount\":{\"currency_code\":\"USD\",\"value\":1}}]\n");
      out.write("          });\n");
      out.write("        },\n");
      out.write("\n");
      out.write("        onApprove: function(data, actions) {\n");
      out.write("          return actions.order.capture().then(function(orderData) {\n");
      out.write("            \n");
      out.write("            // Full available details\n");
      out.write("            console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));\n");
      out.write("\n");
      out.write("            // Show a success message within this page, e.g.\n");
      out.write("            const element = document.getElementById('paypal-button-container');\n");
      out.write("            element.innerHTML = '';\n");
      out.write("            element.innerHTML = '<h3>Thank you for your payment!</h3>';\n");
      out.write("\n");
      out.write("            // Or go to another URL:  actions.redirect('thank_you.html');\n");
      out.write("            \n");
      out.write("          });\n");
      out.write("        },\n");
      out.write("\n");
      out.write("        onError: function(err) {\n");
      out.write("          console.log(err);\n");
      out.write("        }\n");
      out.write("      }).render('#paypal-button-container');\n");
      out.write("    }\n");
      out.write("    initPayPalButton();\n");
      out.write("  </script>\n");
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
