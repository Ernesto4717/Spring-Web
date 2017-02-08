package org.apache.jsp.WEB_002dINF.pages.template.jsp.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div data-ng-controller=\"itemController\">\r\n");
      out.write("<ol class=\"breadcrumb\">\r\n");
      out.write("\t<li><a href=\"/jpaproject/home\">Home</a></li>\r\n");
      out.write("\t<li><a href=\"/jpaproject/Item/home\">Item</a></li>\r\n");
      out.write("\t<li class=\"active\">List</li>\r\n");
      out.write("</ol>\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("\t<thead class=\"thead-inverse\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"5%\">Id</th>\r\n");
      out.write("\t\t\t<th width=\"20%\">Description</th>\r\n");
      out.write("\t\t\t<th width=\"15%\">Price</th>\r\n");
      out.write("\t\t\t<th width=\"10%\">Stock</th>\r\n");
      out.write("\t\t\t<th width=\"15%\">Add to cart</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t\t<tr data-ng-repeat=\"item in items\">\r\n");
      out.write("\t\t\t<td><a data-ng-href=\"/jpaproject/Item/edit#?itemId={{item.id}}\">{{item.id}}</a></td>\r\n");
      out.write("\t\t\t<td data-ng-bind=\"item.description\"></td>\r\n");
      out.write("\t\t\t<td data-ng-bind=\"item.price | currency\"></td>\r\n");
      out.write("\t\t\t<td data-ng-bind=\"item.stock\"></td>\r\n");
      out.write("\t\t\t<td><button type=\"button\" data-ng-click=\"createCartLine(item.id)\" class=\"btn btn-primary btn-lg btn-block\" data-ng-disabled=\"!cartId\">Add</button></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>");
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
