package org.apache.jsp.WEB_002dINF.pages.template.jsp.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div data-ng-controller=\"cartController\" data-ng-init=\"viewCartLines()\">\r\n");
      out.write("<ol class=\"breadcrumb\">\r\n");
      out.write("\t<li><a href=\"/jpaproject/home\">Home</a></li>\r\n");
      out.write("\t<li><a href=\"List\">List</a></li>\r\n");
      out.write("\t<li class=\"active\">Cart # {{cartId}}</li>\r\n");
      out.write("</ol>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<a data-ng-href=\"/jpaproject/Item/List#?cartId={{cartId}}\">\r\n");
      out.write("<button class=\"btn btn-primary\">Add Product</button>\r\n");
      out.write("</a>\r\n");
      out.write("<div class=\"table-responsive\">\r\n");
      out.write("\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t<thead class=\"thead-inverse\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">Id</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"25%\">Description</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"25%\">Unit Price</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">Quantity</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t<tr data-ng-repeat=\"cartLine in cartLines\">\r\n");
      out.write("\t\t\t\t<td data-ng-bind=\"cartLine.id\"></td>\r\n");
      out.write("\t\t\t\t<td data-ng-bind=\"cartLine.item.description\"></td>\r\n");
      out.write("\t\t\t\t<td data-ng-bind=\"cartLine.item.price | currency\"></td>\r\n");
      out.write("\t\t\t\t<td data-ng-bind=\"cartLine.quantity\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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