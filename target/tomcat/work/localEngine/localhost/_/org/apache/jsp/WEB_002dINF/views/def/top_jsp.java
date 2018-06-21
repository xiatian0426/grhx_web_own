package org.apache.jsp.WEB_002dINF.views.def;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.Cookie;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

 	boolean flag = false;
 	String userid = "";
	Cookie[] cook = request.getCookies();
	if(cook != null && cook.length > 0){
		for(int k = 0;k < cook.length;k++){
			if("cookieUserName_web".equals(cook[k].getName())){
				userid = cook[k].getValue();
				flag = true;
			}
		} 
	} 
	

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction topSearch(){\r\n");
      out.write("\t\tvar selected = $(\"#selected\").text();\r\n");
      out.write("\t\tvar contentQuery = $(\"#contentQuery\").val();\r\n");
      out.write("\t\tif(contentQuery==''){\r\n");
      out.write("\t\t\talert(\"请输入关键字!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(selected=='标题'){//搜标题\r\n");
      out.write("\t\t\t$(\"#title\").val(contentQuery);\r\n");
      out.write("\t\t}else{//搜全文\r\n");
      out.write("\t\t\t$(\"#content\").val(contentQuery);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#topSearch\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('.selected').click(function(){\r\n");
      out.write("\t\t\t$('.selBox').show();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('.selBox p').click(function(){\r\n");
      out.write("\t\t\t$('.selected').html($(this).text());\r\n");
      out.write("\t\t\t$('.selBox').hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(document).click(function(ev){\r\n");
      out.write("\t\t\tif(ev.target==$('#selected')[0]){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('.selBox').hide();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    .top-nav{width:1000px; height:50px; background:#1d59bd; margin:0 auto;}\r\n");
      out.write("    .clearfix:after{display:block; content:'';clear:both;}\r\n");
      out.write("    .clearfix{zoom:1;}\r\n");
      out.write("    .nav-left{float:left; width:198px; border-right:1px solid #ccc; text-align:center; line-height:50px; font-size:26px; font-weight:700;color:#fff;}\r\n");
      out.write("    .nav-right{float:left; width:800px;}\r\n");
      out.write("    .nav-right a{display:inline-block; width:150px; line-height:50px; text-align:center; color:#fff; font-size:18px; font-weight:600;}\r\n");
      out.write("\t.clearfix:after{clear:both; content:'';display:block;}\r\n");
      out.write("\t.header .div_sear .sel{cursor:pointer; margin-right:3px; line-height:40px; width:100px; text-align:center; height:40px; background:#fff; float:left;position:relative;}\r\n");
      out.write("\t.header .div_sear input{width:300px;float:left;}\r\n");
      out.write("\t.header .div_sear span{ width:60px; height:40px; font-weight:600; color:#fff; text-align:center; border:none; float:left; line-height:40px; cursor:pointer; background:#e83939;}\r\n");
      out.write("\t.sel{position:relative;}\r\n");
      out.write("\t.selected{background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/icon2.jpg) 68px 17px no-repeat;}\r\n");
      out.write("\t.sel .selBox{position:absolute; left:0; top:40px; background:#fff; width:100%; display:none;}\r\n");
      out.write("\t.sel .selBox p{line-height:30px;text-align:center;} \r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"h-top header\" style=\"background: rgba(200,200,200,.3);\">\r\n");
      out.write("\t<div class=\"h-banner\">\r\n");
      out.write("\t    <div class=\"hleft\">\r\n");
      out.write("\t    \t");
 if(flag){
      out.write("\r\n");
      out.write("\t    \t\t您好！<a class=\"zcbtn1\" target=\"_blank\" href=\"#\" style=\"color: red;font-size: 16px;line-height:18px;\">");
      out.print(userid);
      out.write("</a>，欢迎来到国睿招标\r\n");
      out.write("\t    \t\t<a class=\"dlbtn\" href=\"/account/logout\">注销</a>\r\n");
      out.write("\t    \t");
}else{
      out.write("\r\n");
      out.write("\t    \t\t<a class=\"zcbtn\" href=\"/account/goRegister\">注册</a>\r\n");
      out.write("\t    \t\t<a class=\"dlbtn\" href=\"/account/login\">登录</a>\r\n");
      out.write("\t    \t");
}
      out.write("\r\n");
      out.write("\t    </div>\t\r\n");
      out.write("\t    <div class=\"hright\">\r\n");
      out.write("\t    \t服务热线：010-62870819&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t    \t<a href=\"/index/serviceList\" target=\"_blank\">服务列表</a>\r\n");
      out.write("\t    \t<a href=\"/index/payGuidance\" target=\"_blank\">付费指导</a>\r\n");
      out.write("\t    \t<a href=\"#\" target=\"_blank\">帮助中心</a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <p class=\"clear\"></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("    <div class=\"h-bg\">\r\n");
      out.write("    \t<div class=\"h-con\">\r\n");
      out.write("    \t\t<div class=\"logo\"><a href=\"/index/index\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logo.jpg\" width=\"100%\" width=\"100%\"/> </a></div>\r\n");
      out.write("    \t    <div class=\"search\">\r\n");
      out.write("    \t    \t<form action=\"/messageData/goSearch\" id=\"topSearch\" method=\"POST\">\r\n");
      out.write("    \t    \t\t<input type=\"hidden\" name=\"title\" id=\"title\"/>\r\n");
      out.write("    \t    \t\t<input type=\"hidden\" name=\"content\" id=\"content\"/>\r\n");
      out.write("\t    \t    \t<div class=\"div_sear clearfix\">\r\n");
      out.write("\t    \t    \t\t<div class=\"sel\">\r\n");
      out.write("\t    \t    \t\t\t<div class=\"selected\" id=\"selected\">标题</div>\r\n");
      out.write("\t    \t    \t\t\t<div class=\"selBox\">\r\n");
      out.write("\t    \t    \t\t\t\t<p>标题</p>\r\n");
      out.write("\t    \t    \t\t\t\t<p>全文</p>\r\n");
      out.write("\t    \t    \t\t\t</div>\r\n");
      out.write("\t    \t    \t\t</div>\r\n");
      out.write("\t    \t    \t\t<input type=\"text\" name=\"contentQuery\" id=\"contentQuery\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentQuery }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"请输入您的产品关键字\"/>\r\n");
      out.write("\t    \t    \t\t<span onclick=\"topSearch();\">搜索</span>\r\n");
      out.write("\t    \t    \t</div>\r\n");
      out.write("    \t    \t</form>\r\n");
      out.write("    \t    \t<div class=\"ssgjz\" style=\"margin-top:8px;\">\r\n");
      out.write("    \t    \t\t<a href=\"#\">热门招标：</a>\r\n");
      out.write("    \t    \t\t<a href=\"/messageData/goSearch?title=物业\">物业</a>\r\n");
      out.write("    \t    \t\t<a href=\"/messageData/goSearch?title=律师\">律师</a>\r\n");
      out.write("    \t    \t\t<a href=\"/messageData/goSearch?title=环保\">环保</a>\r\n");
      out.write("    \t    \t\t<a href=\"/messageData/goSearch?title=餐饮\">餐饮</a>\r\n");
      out.write("    \t    \t\t<a href=\"/messageData/goSearch?title=装饰\">装饰</a>\r\n");
      out.write("    \t    \t\t<a href=\"/messageData/goSearch?title=电梯\">电梯</a>\r\n");
      out.write("    \t    \t</div>\r\n");
      out.write("    \t    </div>\r\n");
      out.write("    \t    <div style=\"width:148px;float:right;margin-top: 18px;\">\r\n");
      out.write("    \t    \t<span style=\"background: url(http://img_al.qianlima.com/newDefault/images/guohui.gif) no-repeat left center;display: block;height: 20px;text-indent: 25px;font-size: 12px;line-height:25px;\"><a href=\"http://www.ndrc.gov.cn/\" target=\"_blank\">中华人民共和国发改委</a></span>\r\n");
      out.write("    \t    \t<span style=\"background: url(http://img_al.qianlima.com/newDefault/images/guohui.gif) no-repeat left center;display: block;height: 20px;text-indent: 25px;font-size: 12px;line-height:25px;\"><a href=\"http://www.mohurd.gov.cn/\" target=\"_blank\">中华人民共和国建设部</a></span>\r\n");
      out.write("    \t    \t<span style=\"background: url(http://img_al.qianlima.com/newDefault/images/guohui.gif) no-repeat left center;display: block;height: 20px;text-indent: 25px;font-size: 12px;line-height:25px;\"><a href=\"http://www.mof.gov.cn/\" target=\"_blank\">中华人民共和国财政部</a></span>\r\n");
      out.write("    \t    \t<span style=\"background: url(http://img_al.qianlima.com/newDefault/images/guohui.gif) no-repeat left center;display: block;height: 20px;text-indent: 25px;font-size: 12px;line-height:25px;\"><a href=\"http://www.mofcom.gov.cn/\" target=\"_blank\">中华人民共和国商务部</a></span>\r\n");
      out.write("    \t    </div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"top-nav clearfix\">\r\n");
      out.write("    \t<a href=\"/index/index\"><div class=\"nav-left\">国睿招标</div></a>\r\n");
      out.write("    \t<div class=\"nav-right\">\r\n");
      out.write("    \t\t<a href=\"/index/index\">平台首页</a>\r\n");
      out.write("    \t\t<a href=\"/messageData/goSearch?messagetype=1\">招标公告</a>\r\n");
      out.write("    \t\t<a href=\"/messageData/goSearch?messagetype=2\">中标公示</a>\r\n");
      out.write("    \t\t<a href=\"/messageData/goSearch?messagetype=4\">拟在建项目</a>\r\n");
      out.write("    \t\t<a href=\"/messageData/goSearch?messagetype=5\">VIP独家</a>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
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
