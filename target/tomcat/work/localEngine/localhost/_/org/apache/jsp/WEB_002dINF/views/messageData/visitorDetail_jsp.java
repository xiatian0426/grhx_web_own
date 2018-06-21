package org.apache.jsp.WEB_002dINF.views.messageData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class visitorDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("\t.lujing{\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t\tline-height: 60px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.lujing a{\r\n");
      out.write("\t\tcolor: #000000;\r\n");
      out.write("\t}\r\n");
      out.write("\t.content { border-top: 1px solid #dcdddd; padding-top: 122px; padding-left:260px;}\r\n");
      out.write("\t.content h3 { width: 295px; margin: auto; padding-left: 155px;  height: 78px; font-size: 18px; color: #666666; font-weight: normal; line-height: 44px;}\r\n");
      out.write("\t.content h3 a { line-height: 22px; color: #0e8bcf; width: 60px; font-size: 14px;}\r\n");
      out.write("\t.content h3 a:hover { text-decoration: underline;}\r\n");
      out.write("</style>\t\t\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/top.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"main\" style=\"height: 600px;width: 1000px;margin: 0 auto; background:#ecebeb;\">\r\n");
      out.write("\t<div class=\"lujing\">\r\n");
      out.write("\t  \t<a href=\"#\" style=\"font-size: 14px;border-left:5px solid #448aca\">&nbsp;位置&nbsp;></a>\r\n");
      out.write("\t   \t<a href=\"/index/index\" style=\"font-size: 14px;\">首页&nbsp;></a>\r\n");
      out.write("\t   \t<a href=\"#\" style=\"font-size: 14px;\">信息详情页</a>\r\n");
      out.write("  \t</div>\r\n");
      out.write("\t<div class=\"content clearfix\" style=\"text-align:center;\">\r\n");
      out.write("\t\t<h2 style=\"float:left;\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/timg.jpg\" width=\"150px;\" height=\"150px;\"/>\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<h3 style=\"float:left; padding-left:30px; line-height:34px; padding-top:40px;\">\r\n");
      out.write("\t\t\t您还不是会员，请先<a href=\"/account/goRegister\">注册</a>!<br />如已注册，请<a href=\"/account/login\">登录</a>！\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t</div>\r\n");
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
