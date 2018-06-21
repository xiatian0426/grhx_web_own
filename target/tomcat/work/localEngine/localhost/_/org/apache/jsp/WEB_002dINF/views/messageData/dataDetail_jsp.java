package org.apache.jsp.WEB_002dINF.views.messageData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>中国招投标项目网</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/main.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/detail.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.lujing{\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t\tline-height: 60px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.lujing a{\r\n");
      out.write("\t\tcolor: #000000;\r\n");
      out.write("\t}\r\n");
      out.write("\t.zhengwen { border-top: 1px solid #dcdddd;}\r\n");
      out.write("</style>\t\t\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/top.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"main\" style=\"width: 1000px;margin: 0 auto;\">\r\n");
      out.write("  \t<div class=\"lujing\">\r\n");
      out.write("\t  \t<a href=\"#\" style=\"font-size: 14px;border-left:5px solid #448aca\">&nbsp;位置&nbsp;></a>\r\n");
      out.write("\t   \t<a href=\"/index/index\" style=\"font-size: 14px;\">首页&nbsp;></a>\r\n");
      out.write("\t   \t<a href=\"#\" style=\"font-size: 14px;\">信息详情页</a>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t<div class=\"zhengwen\">\r\n");
      out.write("  \t\t<span class=\"tit\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("  \t\t<div class=\"sjdd\"><font>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.provincename }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>&nbsp;&nbsp;&nbsp;<font>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.messagename }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>&nbsp;&nbsp;&nbsp;<font>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.dateString }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></div>\r\n");
      out.write("  \t\t<div class=\"nrr\">\r\n");
      out.write("  \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.content }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t</div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
