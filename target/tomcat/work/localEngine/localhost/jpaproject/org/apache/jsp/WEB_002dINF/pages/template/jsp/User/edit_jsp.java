package org.apache.jsp.WEB_002dINF.pages.template.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div data-ng-controller=\"springController\" data-ng-init=\"edit()\">\r\n");
      out.write("\r\n");
      out.write("\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t<li><a href=\"/jpaproject/home\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"home\">User</a></li>\r\n");
      out.write("\t\t<li><a href=\"List\">List</a></li>\r\n");
      out.write("\t\t<li class=\"active\">Edit</li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-center \">\r\n");
      out.write("\t\t<form class=\"form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<label for=\"Username\" class=\"sr-only\">Username</label> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control input-group-lg reg_name\"\r\n");
      out.write("\t\t\t\t\t\tname=\"username\" data-ng-model=\"user.username\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<label for=\"password\" class=\"sr-only\"></label> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"password\" class=\"form-control input-group-lg\"\r\n");
      out.write("\t\t\t\t\t\tname=\"password\" placeholder=\"Password:*\" data-ng-model=\"user.password\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<label for=\"name\" class=\"sr-only\">Name:*</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-group-lg reg_name\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\tdata-ng-model=\"user.name\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 container-button\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"update\" value=\"Update\" data-ng-click=\"send()\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-info\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
