/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-04-06 12:35:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.blog.entity.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.blog.entity");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- basic -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device- width, initial-scale=1\">\r\n");
      out.write("    <!-- mobile metas -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <!-- site metas -->\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"/images/favicon.png\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <!-- bootstrap css -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!-- style css -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("    <!-- Responsive-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("    <!-- fevicon -->\r\n");
      out.write("    <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\r\n");
      out.write("    <!-- Scrollbar Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("    <!-- Tweaks for older IEs-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\r\n");
      out.write("    <!-- owl stylesheets -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesoeet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\"\r\n");
      out.write("        media=\"screen\">\r\n");
      out.write("         <script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("          \r\n");
      out.write("    <!-- header section start -->\r\n");
      out.write("    <div class=\"header_section\">\r\n");
      out.write("        <div class=\"container-fluid header_main\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("                <a class=\"logo\" href=\"index.jsp\"><img src=\"images/logo.png\"></a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("                    aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"blog.jsp\">Blog</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"contact.jsp\">Contact</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"register.jsp\">Register</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- contact section start -->\r\n");
      out.write("    <div class=\"contact_section layout_padding\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                        <div class=\"carousel-inner\">\r\n");
      out.write("                            <div class=\"carousel-item active\">\r\n");
      out.write("                                <div class=\"login_img\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"mail_section\">\r\n");
      out.write("                        <form action=\"LoginServlet\" method=\"post\" name=\"LoginForm\">\r\n");
      out.write("                            <div class=\"mail_section\">\r\n");
      out.write("                                <h4 class=\"contact_taital\">\r\n");
      out.write("                                    <pre></pre>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <h1 class=\"contact_taital\">Login</h1>\r\n");
      out.write("                                <input type=\"email\" class=\"email_text\" placeholder=\"Email\" name=\"email\" required=\"required\">\r\n");
      out.write("                                <input type=\"password\" class=\"pass_text\" placeholder=\"password\" name=\"password\" required=\"required\">\r\n");
      out.write("                                <div class=\"read_bt\"><a href=\"register.jsp\">Create an Account?</a></div>\r\n");
      out.write("                                <div class=\"send_bt\"><input  class=\"btn btn-primary\" type=\"submit\" value=\"Login\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<script >\r\n");
      out.write("//    $(\"document\").ready(function() {\r\n");
      out.write("//         $(\".send_bt\").click(function(){\r\n");
      out.write("        	\r\n");
      out.write("//          $.ajax({\r\n");
      out.write("//             type : \"POST\",\r\n");
      out.write("//             url : \"LoginServlet\",\r\n");
      out.write("//             data : {\r\n");
      out.write("//             	 Jemail : $(\".email_text\").val(),\r\n");
      out.write("//                  Jpassword :$(\".pass_text\").val(),\r\n");
      out.write("//                  success : function(data) {\r\n");
      out.write("//                          if(data==\"1\"){\r\n");
      out.write("//                         	 alert(\"Password is wrong\")\r\n");
      out.write("//                          }\r\n");
      out.write("//             }\r\n");
      out.write("//             }\r\n");
      out.write("//         });\r\n");
      out.write("//     });     \r\n");
      out.write("// });\r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- contact section end -->\r\n");
      out.write("    <!-- footer section start -->\r\n");
      out.write("    <div class=\"footer_section layout_padding\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"footer_menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("                    <li><a href=\"blog.jsp\">Blog</a></li>\r\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact us</a></li>\r\n");
      out.write("                    <li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer_menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"contact_menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\"><img src=\"images/call-icon.png\"></a></li>\r\n");
      out.write("                                <li><a href=\"#\">Call : +01 1234567890</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"contact_menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"blog.jsp\"><img src=\"images/mail-icon.png\"></a></li>\r\n");
      out.write("                                <li><a href=\"features.jsp\">demo@gmail.com</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- footer section end -->\r\n");
      out.write("    <!-- copyright section start -->\r\n");
      out.write("    <!-- <div class=\"copyright_section\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p class=\"copyright_text\">Copyright 2020 All Right Reserved By.<a href=\"https://html.design\"> Free html\r\n");
      out.write("                    Templates</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> -->\r\n");
      out.write("    <!-- copyright section end -->\r\n");
      out.write("    <!-- Javascript files-->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("    <script src=\"js/plugin.js\"></script>\r\n");
      out.write("    <!-- sidebar -->\r\n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("    <!-- javascript -->\r\n");
      out.write("    <script src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("    <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}