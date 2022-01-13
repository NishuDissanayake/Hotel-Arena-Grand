package org.apache.jsp.Gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Gallery</title>\r\n");
      out.write("         <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./gallery.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header-image\">\r\n");
      out.write("            <h1 class=\"header-text\">GALLERY</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container btn-group\">\r\n");
      out.write("           <button type=\"button\" class=\"btn btn-outline-primary\">Exterior</button>\r\n");
      out.write("           <button type=\"button\" class=\"btn btn-outline-primary\">Interior</button>\r\n");
      out.write("           <button type=\"button\" class=\"btn btn-outline-primary\">Beach & Pool</button>\r\n");
      out.write("           <button type=\"button\" class=\"btn btn-outline-primary\">Dinning</button>\r\n");
      out.write("           <button type=\"button\" class=\"btn btn-outline-primary\">Wedding</button>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\" container img-section\">\r\n");
      out.write("            <div class=\"row main-text\">\r\n");
      out.write("                <div class=\"col-4\">Exterior</div>\r\n");
      out.write("                 <div class=\"col-8 img-strip\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row img-set1\">\r\n");
      out.write("                <div class=\"col-2 ex-img1\"></div>\r\n");
      out.write("                <div class=\"col-4 ex-img2\"></div>\r\n");
      out.write("                <div class=\"col-2 ex-img3\"></div>\r\n");
      out.write("                <div class=\"col-4 ex-img4\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"row img-set2\">\r\n");
      out.write("                <div class=\"col-4 ex-img5\"></div>\r\n");
      out.write("                <div class=\"col-2 ex-img6\"></div>\r\n");
      out.write("                <div class=\"col-4 ex-img7\"></div>\r\n");
      out.write("                <div class=\"col-2 ex-img8\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\" container img-section\">\r\n");
      out.write("            <div class=\"row main-text\">\r\n");
      out.write("                \r\n");
      out.write("                 <div class=\"col-8\">Interior Interior Interior</div>\r\n");
      out.write("                 <div class=\"col-4\">Interior</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row img-set1\" class=\"img-set3\">\r\n");
      out.write("                <div class=\"col-2 in-img1\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-4 in-img2\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-2 in-img3\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-4 in-img4\" class=\"img-set\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"row img-set2\" class=\"img-set4\">\r\n");
      out.write("                <div class=\"col-4 in-img5\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-2 in-img6\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-4 in-img7\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-2 in-img8\" class=\"img-set\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\" container img-section\">\r\n");
      out.write("            <div class=\"row main-text\">\r\n");
      out.write("                <div class=\"col-4\">Beach & Pool</div>\r\n");
      out.write("                 <div class=\"col-8\">Beach & pool</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row img-set1\">\r\n");
      out.write("                <div class=\"col-2 bp-img1\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-4 bp-img2\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-2 bp-img3\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-4 bp-img4\" class=\"img-set\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"row img-set2\" class=\"img-set6\">\r\n");
      out.write("                <div class=\"col-4 bp-img5\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-2 bp-img6\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-4 bp-img7\" class=\"img-set\"></div>\r\n");
      out.write("                <div class=\"col-2 bp-img8\" class=\"img-set\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\" container img-section\">\r\n");
      out.write("            <div class=\"row main-text\">\r\n");
      out.write("                \r\n");
      out.write("                 <div class=\"col-8\">Dinning Dinning</div>\r\n");
      out.write("                 <div class=\"col-4\">Dinning</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row img-set1\">\r\n");
      out.write("                <div class=\"col-2 di-img1\"></div>\r\n");
      out.write("                <div class=\"col-4 di-img2\"></div>\r\n");
      out.write("                <div class=\"col-2 di-img3\"></div>\r\n");
      out.write("                <div class=\"col-4 di-img4\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"row img-set2\">\r\n");
      out.write("                <div class=\"col-4 di-img5\"></div>\r\n");
      out.write("                <div class=\"col-2 di-img6\"></div>\r\n");
      out.write("                <div class=\"col-4 di-img7\"></div>\r\n");
      out.write("                <div class=\"col-2 di-img8\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\" container img-section\">\r\n");
      out.write("            <div class=\"row main-text\">\r\n");
      out.write("                <div class=\"col-4\">Wedding</div>\r\n");
      out.write("                 <div class=\"col-8\">Wedding exterior exterior</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row img-set1\">\r\n");
      out.write("                <div class=\"col-2 wd-img1\"></div>\r\n");
      out.write("                <div class=\"col-4 wd-img2\"></div>\r\n");
      out.write("                <div class=\"col-2 wd-img3\"></div>\r\n");
      out.write("                <div class=\"col-4 wd-img4\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"row img-set2\">\r\n");
      out.write("                <div class=\"col-4 wd-img5\"></div>\r\n");
      out.write("                <div class=\"col-2 wd-img6\"></div>\r\n");
      out.write("                <div class=\"col-4 wd-img7\"></div>\r\n");
      out.write("                <div class=\"col-2 wd-img8\"></div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            ");
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
