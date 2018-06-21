package org.apache.jsp.WEB_002dINF.views.def;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"footer\" style=\"border-top:4px #c72226 solid\">\r\n");
      out.write("    <div class=\"submenu\" style=\"position: relative;\">\r\n");
      out.write("        <ul style=\"display: block;width: 600px;margin: 0 auto;position: relative;\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"/index/aboutUs\" target=\"_blank\" style=\"color: black;font-size:15px;\">关于我们</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li >\r\n");
      out.write("               \t<a href=\"/account/goRegister\" target=\"_blank\" style=\"color: black;font-size:15px;\"> 新用户注册</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li >\r\n");
      out.write("                <a href=\"/index/legalDeclaration\" target=\"_blank\" style=\"color: black;font-size:15px;\">法律声明</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li >\r\n");
      out.write("                <a href=\"/index/contactUs\" target=\"_blank\" style=\"color: black;font-size:15px;\">联系我们</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"submenu\" style=\"position: relative;\">\r\n");
      out.write("        <ul style=\"display: block;width: 313px;margin: 0 auto;position: relative;\">\r\n");
      out.write("            <li>\r\n");
      out.write("               \t客服热线：010-62870819 \r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"submenu\" style=\"position: relative;\">\r\n");
      out.write("        <ul style=\"display: block;width: 730px;margin: 0 auto;position: relative;\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"http://www.12377.cn/\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/foot_1.png\" width=\"100px;\" height=\"48px;\"/></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li >\r\n");
      out.write("               \t<a href=\"http://www.cyberpolice.cn/wfjb/\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/foot_2.png\" width=\"100px;\" height=\"48px;\"/></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li >\r\n");
      out.write("                <a href=\"http://www.bnia.cn/\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/foot_3.png\" width=\"100px;\" height=\"48px;\"/></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li >\r\n");
      out.write("                <a href=\"http://www.hd315.gov.cn/\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/foot_4.png\" width=\"100px;\" height=\"48px;\"/></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
