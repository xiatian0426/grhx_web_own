package org.apache.jsp.WEB_002dINF.views.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/main.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/main2.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/style.css\"/>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('#tab-div div').mouseover(function(){\r\n");
      out.write("\t\t\t$('#tab-div div').removeClass('no_left').addClass('no_right');\r\n");
      out.write("\t\t\t$(this).addClass('no_left');\r\n");
      out.write("\t\t\tvar index = $(this).index();\r\n");
      out.write("\t\t\t$('#div-cont>div').addClass('divNone');\r\n");
      out.write("\t\t\t$('#div-cont>div').eq(index).removeClass('divNone');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\tfunction liChange(sign){\r\n");
      out.write("\t\t$('#move_li li').removeClass('no_left').addClass('no_right');\r\n");
      out.write("\t\tif(sign=='1'){\r\n");
      out.write("\t\t\t$(\"#li_1\").addClass('no_left');\r\n");
      out.write("\t\t\tdocument.getElementById(\"div_1\").style.display=\"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"div_2\").style.display=\"none\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#li_2\").addClass('no_left');\r\n");
      out.write("\t\t\tdocument.getElementById(\"div_1\").style.display=\"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"div_2\").style.display=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t$(document).ready(function(){ \r\n");
      out.write("\t　　   var loginSign = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginSign}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\tif(loginSign=='1'){\r\n");
      out.write("\t\t\tdocument.getElementById(\"unlogin\").style.display=\"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"logined\").style.display=\"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"unlogin_div\").style.display=\"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"logined_div\").style.display=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/top.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"middle\">\r\n");
      out.write("\t<a href=\"/index/index\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/hengfu1.png\" width=\"100%\" height=\"80px;\"/></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("\t<div id=\"middle\">\r\n");
      out.write("        <!--首页第一栏-->\r\n");
      out.write("        <div class=\"diyilan\">\r\n");
      out.write("            <div class=\"yi_left\">\r\n");
      out.write("                <div class=\"kuang\">\r\n");
      out.write("                    <div class=\"title\" style=\"background-color: #f6f6f6; border-bottom: 1px solid #e7e7e7;\r\n");
      out.write("                        padding-left: 0px;\">\r\n");
      out.write("                        <div class=\"bghh\">\r\n");
      out.write("                            <h3 class=\"Y-t\">\r\n");
      out.write("                                <a href=\"#\" title=\"热点信息\" target=\"_blank\" style=\"font-size: 18px;font-weight: bold;\">热点信息</a>\r\n");
      out.write("                            </h3>\r\n");
      out.write("                            <div class=\"clear\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"kuang_list\">\r\n");
      out.write("                       ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"yi_center\">\r\n");
      out.write("                <div class=\"hot_banner\">\r\n");
      out.write("                    <div class=\"main_visual\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"flicking_con\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"a01\" href=\"http://www.ynsslaw.com/Default.aspx\" target=\"_blank\">1</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"a01\" href=\"http://www.topsky.com.cn/topskyNew/index.aspx\" target=\"_blank\">2</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"a03\" href=\"http://www.gemdale-pm.com/Default.aspx\" target=\"_blank\">3</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://www.whlaw.cn/\" target=\"_blank\">4</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://www.security.sh.cn/\" target=\"_blank\">5</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main_image\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"http://www.gemdale-pm.com/Default.aspx\" target=\"_blank\"><span class=\"img_3\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"http://www.whlaw.cn/\" target=\"_blank\"><span class=\"img_4\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"http://www.snfchina.com\" target=\"_blank\"><span class=\"img_1\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"http://www.topsky.com.cn/topskyNew/index.aspx\" target=\"_blank\"><span class=\"img_2\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"http://www.ynsslaw.com/Default.aspx\" target=\"_blank\"><span class=\"img_5\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" id=\"btn_prev\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" id=\"btn_next\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"kuang\">\r\n");
      out.write("                    <div class=\"title\" style=\"border-bottom: 1px solid #e7e7e7; height: 32px;\">\r\n");
      out.write("                        <h3 class=\"vip_sj\">\r\n");
      out.write("                            <a href=\"#\" title=\"\" target=\"_blank\" class=\"ff\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                              \t 推荐项目\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"clear\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"kuang_list\">\r\n");
      out.write("                \t\t\t");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                        <div class=\"clear\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"yi_right\">\r\n");
      out.write("                <div class=\"zhuce\" id=\"unlogin\" style=\";height: 40px;\">\r\n");
      out.write("                    <a href=\"/account/goRegister\" title=\"注册\"  class=\"denglu\" style=\"color: #fff;\">\r\n");
      out.write("                        <b>注册</b>\r\n");
      out.write("                    </a> \r\n");
      out.write("                    <a href=\"/account/login\" title=\"登录\" class=\"zc\" style=\"color: #fff;\">\r\n");
      out.write("                    \t<b>登录</b>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"\" id=\"logined\" style=\"display: none;height: 40px;font-size:16px;font-weight:bold;line-height:40px;text-align:left;\">\r\n");
      out.write("                    &nbsp;&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(",您好!&nbsp;\r\n");
      out.write("                    <a href=\"/account/logout\" title=\"注销\" style=\"font-size:16px;\">\r\n");
      out.write("                    \t注销\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"kuang\" id=\"unlogin_div\">\r\n");
      out.write("                    <div class=\"tool\">\r\n");
      out.write("                        <a href=\"/account/goRegister\" title=\"查看最新招标\">\r\n");
      out.write("                                                                       查看最新招标\r\n");
      out.write("                        </a> \r\n");
      out.write("                        <a href=\"/account/goRegister\" title=\"发布招标信息\">\r\n");
      out.write("\t\t\t\t\t\t\t发布招标信息\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("                        <a href=\"/account/goRegister\" title=\"了解业主状态\">\r\n");
      out.write("                                                                     了解业主状态\r\n");
      out.write("                        </a> \r\n");
      out.write("                        <a href=\"/account/goRegister\" title=\"项目深度跟踪\">\r\n");
      out.write("                        \t项目深度跟踪\r\n");
      out.write("                        </a> \r\n");
      out.write("                        <a href=\"/account/goRegister\" title=\"热点项目推荐\">\r\n");
      out.write("                        \t热点项目推荐\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"/account/goRegister\" title=\" 专属团队服务\">\r\n");
      out.write("                                                                    专属团队服务\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"clear\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"kuang\" id=\"logined_div\" style=\"display: none;\">\r\n");
      out.write("                    <div class=\"tool\">\r\n");
      out.write("                        <a href=\"/index/contactUs\" target=\"_blank\" title=\"查看最新招标\">\r\n");
      out.write("                                                                       查看最新招标\r\n");
      out.write("                        </a> \r\n");
      out.write("                        <a href=\"/index/contactUs\" target=\"_blank\" title=\"发布招标信息\">\r\n");
      out.write("\t\t\t\t\t\t\t发布招标信息\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("                        <a href=\"/index/contactUs\" target=\"_blank\" title=\"了解业主状态\">\r\n");
      out.write("                                                                     了解业主状态\r\n");
      out.write("                        </a> \r\n");
      out.write("                        <a href=\"/index/contactUs\" target=\"_blank\" title=\"项目深度跟踪\">\r\n");
      out.write("                        \t项目深度跟踪\r\n");
      out.write("                        </a> \r\n");
      out.write("                        <a href=\"/index/contactUs\" target=\"_blank\" title=\"热点项目推荐\">\r\n");
      out.write("                        \t热点项目推荐\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"/index/contactUs\" target=\"_blank\" title=\" 专属团队服务\">\r\n");
      out.write("                                                                    专属团队服务\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"clear\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"kuang\">\r\n");
      out.write("                    <div class=\"title\" style=\"border-bottom: 1px solid #e7e7e7; height: 32px;\">\r\n");
      out.write("                        <h3 class=\"vip_sj\">\r\n");
      out.write("                            <a href=\"#\" title=\"\" target=\"_blank\" class=\"ff\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                              \t 优秀供应商\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"clear\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <style>\r\n");
      out.write("                    #golist{position:relative; padding:3px 13px;}\r\n");
      out.write("                    #golist ul{position:relative;}\r\n");
      out.write("                    .item #golist ul li{float:none; width:227px;}\r\n");
      out.write("                    </style>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"kuang_list\" id=\"golist\">\r\n");
      out.write("                \t\t<ul>\r\n");
      out.write("                \t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.superslide.2.1.1.js\"></script>\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\tjQuery(\".item\").slide({mainCell:\"#golist ul\",autoPlay:true,effect:\"topMarquee\",vis:5,interTime:50,trigger:\"click\"});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("                        <div class=\"clear\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--首页第一栏结尾-->\r\n");
      out.write("        <div id=\"middle\">\r\n");
      out.write("        <a href=\"http://www.rqxghg.com/cn/index.asp\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/hengfu2.png\" width=\"100%\" height=\"80px;\"/></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--招标专区-->\r\n");
      out.write("        <div class=\"dierlan\">\r\n");
      out.write("            <div class=\"er_left\">\r\n");
      out.write("                <div class=\"title3\" style=\"font-size: 18px;font-weight: bold;\"> 行业专区</div>\r\n");
      out.write("                <div class=\"classify\">\r\n");
      out.write("                    <ul id=\"accoradion02\" class=\"accoradion\" style=\"width: 223px;\" hovering=\"false\">\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\" class=\"header closed opened\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                                <em class=\"\">&nbsp;</em>服务\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul style=\"display: block; height: 100px;\">\r\n");
      out.write("                                <li style=\"display: block;\">\r\n");
      out.write("                                    <div class=\"tubiaoHH\">\r\n");
      out.write("                                        <div class=\"fl_liet\">\r\n");
      out.write("                                            <span class=\"dddd\">\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=物业\" target=\"_blank\" title=\"\">物业</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=保洁\" target=\"_blank\" title=\"\" class=\"duoyu\">保洁</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=保安\" target=\"_blank\" title=\"\">保安</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=清洗\" target=\"_blank\" title=\"\" class=\"duoyu\">清洗</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=评估\" target=\"_blank\" title=\"\">评估</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=审计\" target=\"_blank\" title=\"\" class=\"duoyu\">审计</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=律师\" target=\"_blank\" title=\"\">律师</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=设计\" target=\"_blank\" title=\"\" class=\"duoyu\">设计</a>\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=餐饮\" target=\"_blank\" title=\"\">餐饮</a> -->\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=汽车租赁\" target=\"_blank\" title=\"\" class=\"duoyu\">汽车租赁</a> -->\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=汽车维修\" target=\"_blank\" title=\"\">汽车维修</a> -->\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=保险\" target=\"_blank\" title=\"\" class=\"duoyu\">保险</a> -->\r\n");
      out.write("                                                <div class=\"clear\"> </div>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\" class=\"header closed opened\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                                <em class=\"\">&nbsp;</em>工程\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul style=\"display: block; height: 100px;\">\r\n");
      out.write("                                <li style=\"display: block;\">\r\n");
      out.write("                                    <div class=\"tubiaoHH\">\r\n");
      out.write("                                        <div class=\"fl_liet\">\r\n");
      out.write("                                            <span class=\"dddd\">\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=建筑\" target=\"_blank\" title=\"\">建筑</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=装饰\" target=\"_blank\" title=\"\" class=\"duoyu\">装饰</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=园林\" target=\"_blank\" title=\"\">园林</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=绿化\" target=\"_blank\" title=\"\" class=\"duoyu\">绿化</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=环保\" target=\"_blank\" title=\"\">环保</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=食堂承包\" target=\"_blank\" title=\"\" class=\"duoyu\">食堂承包</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=钢结构\" target=\"_blank\" title=\"\">钢结构</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=市政\" target=\"_blank\" title=\"\" class=\"duoyu\">市政</a>\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=安防\" target=\"_blank\" title=\"\">安防</a> -->\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=弱电\" target=\"_blank\" title=\"\" class=\"duoyu\">弱电</a> -->\r\n");
      out.write("                                                <div class=\"clear\"> </div>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\" class=\"header closed opened\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                                <em class=\"\">&nbsp;</em>设备\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul style=\"display: block; height: 100px;\">\r\n");
      out.write("                                <li style=\"display: block;\">\r\n");
      out.write("                                    <div class=\"tubiaoHH\">\r\n");
      out.write("                                        <div class=\"fl_liet\">\r\n");
      out.write("                                            <span class=\"dddd\">\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=电梯\" target=\"_blank\" title=\"\">电梯</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=厨房设备\" target=\"_blank\" title=\"\" class=\"duoyu\">厨房设备</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=分析仪\" target=\"_blank\" title=\"\">分析仪</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=无人机\" target=\"_blank\" title=\"\" class=\"duoyu\">无人机</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=阀门\" target=\"_blank\" title=\"\">阀门</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=泵\" target=\"_blank\" title=\"\" class=\"duoyu\">泵</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=医疗器械\" target=\"_blank\" title=\"\">医疗器械</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=机器人\" target=\"_blank\" title=\"\" class=\"duoyu\">机器人</a>\r\n");
      out.write("                                                <div class=\"clear\"> </div>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\" class=\"header closed opened\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                                <em class=\"\">&nbsp;</em>产品\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul style=\"display: block; height: 100px;\">\r\n");
      out.write("                                <li style=\"display: block;\">\r\n");
      out.write("                                    <div class=\"tubiaoHH\">\r\n");
      out.write("                                        <div class=\"fl_liet\">\r\n");
      out.write("                                            <span class=\"dddd\">\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=标识\" target=\"_blank\" title=\"\">标识</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=标牌\" target=\"_blank\" title=\"\" class=\"duoyu\">标牌</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=家具\" target=\"_blank\" title=\"\">家具</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=药剂\" target=\"_blank\" title=\"\" class=\"duoyu\">药剂</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=健身器材\" target=\"_blank\" title=\"\">健身器材</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=耗材\" target=\"_blank\" title=\"\" class=\"duoyu\">耗材</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=物资\" target=\"_blank\" title=\"\">物资</a>\r\n");
      out.write("                                                <a href=\"/messageData/goSearch?title=劳保\" target=\"_blank\" title=\"\" class=\"duoyu\">劳保</a>\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=服装\" target=\"_blank\" title=\"\">服装</a> -->\r\n");
      out.write("<!--                                                 <a href=\"/messageData/goSearch?title=门窗\" target=\"_blank\" title=\"\" class=\"duoyu\">门窗</a> -->\r\n");
      out.write("                                                <div class=\"clear\"> </div>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"li_last\" style=\"border:1px solid #e7e7e7; border-top:0;\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\" class=\"header closed opened\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("                                <em class=\"\">&nbsp;</em>展会信息\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul style=\"padding-top:12px; padding-bottom:9px;\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fimport_005f2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"er_center\">\r\n");
      out.write("                <div class=\"notice\">\r\n");
      out.write("                    <div class=\"n_title\" id=\"move-animate-top1\">\r\n");
      out.write("                        <h3 class=\"x_hua\" style=\"font-size: 18px;font-weight: bold;\"> \r\n");
      out.write("                        \t<a href=\"/messageData/goSearch?messagetype=5\" title=\"\" target=\"_blank\" class=\"ff\" style=\"font-size: 18px;font-weight: bold;\">VIP独家</a>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"n_content\" id=\"con_BC_1\" style=\"padding-bottom: 0;\">\r\n");
      out.write("                    \t");
      if (_jspx_meth_c_005fimport_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"notice\">\r\n");
      out.write("                    <div class=\"n_title\" id=\"move-animate-top1\">\r\n");
      out.write("                        <h3 class=\"x_hua\" style=\"font-size: 18px;font-weight: bold;\"> \r\n");
      out.write("                        \t<a href=\"/messageData/goSearch?messagetype=4\" title=\"\" target=\"_blank\" class=\"ff\" style=\"font-size: 18px;font-weight: bold;\">拟在建项目</a>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"n_content\" id=\"con_BC_1\" style=\"padding-bottom: 0;\">\r\n");
      out.write("            \t\t\t");
      if (_jspx_meth_c_005fimport_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"notice\">\r\n");
      out.write("                    <div class=\"n_title\" id=\"move-animate-top1\">\r\n");
      out.write("                        <h3 class=\"x_hua\" style=\"font-size: 18px;font-weight: bold;\"> \r\n");
      out.write("                        \t<a href=\"/messageData/goSearch?messagetype=1\" title=\"\" target=\"_blank\" class=\"ff\" style=\"font-size: 18px;font-weight: bold;\">招标公告</a>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"n_content\" id=\"con_BC_1\" style=\"padding-bottom: 0;\">\r\n");
      out.write("\t            \t\t");
      if (_jspx_meth_c_005fimport_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"notice\">\r\n");
      out.write("                    <div class=\"n_title\" id=\"move-animate-top1\">\r\n");
      out.write("                        <h3 class=\"x_hua\" style=\"font-size: 18px;font-weight: bold;\"> \r\n");
      out.write("          \t\t\t\t\t<a href=\"/messageData/goSearch?messagetype=2\" title=\"\" target=\"_blank\" class=\"ff\" style=\"font-size: 18px;font-weight: bold;\">中标公告</a></h3>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"n_content\" id=\"con_BC_1\" style=\"padding-bottom: 0;\">\r\n");
      out.write("\t            \t\t");
      if (_jspx_meth_c_005fimport_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"notice\">\r\n");
      out.write("                    <div class=\"n_title clearfix\" id=\"tab-div\">\r\n");
      out.write("                        <div class=\"no_left\" id=\"BCC1\">\r\n");
      out.write("                            <a href=\"/messageData/goSearchProprietor?type=1\" style=\"font-size: 15px;font-weight: bold;\"><b>业主库</b></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"no_right\" id=\"BCC2\">\r\n");
      out.write("                            <a href=\"/messageData/goSearchProprietor?type=2\" style=\"font-size: 15px;font-weight: bold;\"><b>设计院库</b></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"no_right\" id=\"BCC3\">\r\n");
      out.write("                            <a href=\"/messageData/goSearchProprietor?type=3\" style=\"font-size: 15px;font-weight: bold;\"><b>代理机构库</b></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                   <div id=\"div-cont\">\r\n");
      out.write("                   \t\t <div class=\"n_content\" id=\"con_BCC_1\" style=\"_padding: 0;\">\r\n");
      out.write("                \t\t");
      if (_jspx_meth_c_005fimport_005f7(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"n_content divNone\" id=\"con_BCC_2\" style=\"_padding: 0;\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fimport_005f8(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"n_content divNone\" id=\"con_BCC_3\" style=\"_padding: 0;\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fimport_005f9(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"er_right\">\r\n");
      out.write("            \t<div class=\"kuang\" style=\"margin-top: 10px;\">\r\n");
      out.write("                    <div class=\"title2\" style=\"padding-left: 0px;\">\r\n");
      out.write("                        <h3 class=\"Y-t\">\r\n");
      out.write("                            <div class=\"bggg\">\r\n");
      out.write("                                <a href=\"#\" title=\"标王推荐\" target=\"_blank\" class=\"rightcss\" style=\"color: #fff;font-size: 15px;font-weight: bold;\"> 会员中标榜</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"kuang_list\" style=\"padding: 6px 10px;\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                              <li>\r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"ico_t_pic\" style=\"border-bottom: 1px solid #e7e7e7;width:233px;\"><a href=\"http://www.qinfang.cn/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/member_1.png\" height=\"61\" width=\"230\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t  </li>\r\n");
      out.write("\t   \t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"ico_t_pic\" style=\"border-bottom: 1px solid #e7e7e7;width:233px;\"><a href=\"http://www.qdnasen.com/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/member_2.png\" height=\"61\" width=\"230\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li>\r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"ico_t_pic\"><a href=\"http://www.netstar-soft.com/index.html\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/member_3.png\" height=\"61\" width=\"230\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t  </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"kuang\">\r\n");
      out.write("                    <div class=\"kuang_list\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("\t                        ");
      if (_jspx_meth_c_005fimport_005f10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"kuang\">\r\n");
      out.write("                    <div class=\"title2\">\r\n");
      out.write("                        <h3 class=\"Y-t\">\r\n");
      out.write("                            <a href=\"#\" title=\"\" target=\"_blank\" class=\"rightcss\" style=\"font-size: 18px;font-weight: bold;\">行业动态</a>\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"kuang_list\">\r\n");
      out.write("                    \t\r\n");
      out.write("                        <ul>\r\n");
      out.write("                    \t<li class=\"li_last\" style=\"border:1px solid #e7e7e7; border-top:0;\">\r\n");
      out.write("                    \t\t<ul>\r\n");
      out.write("                    \t\t\t");
      if (_jspx_meth_c_005fimport_005f11(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                    \t\t</ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<div id=\"middle\">\r\n");
      out.write("        <a href=\"http://www.henganweishi.com/\" target=\"_blank\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/hengfu3.png\" width=\"100%\" height=\"80px;\"/></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<div class=\"other\">\r\n");
      out.write("\t\t    <div class=\"lan\">\r\n");
      out.write("\t\t        <div class=\"er_title\">\r\n");
      out.write("\t\t            <h3 class=\"x_hua\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("\t\t                \t地区导航\r\n");
      out.write("\t\t            </h3>\r\n");
      out.write("\t\t            <div class=\"clear\">\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"map_list\">\r\n");
      out.write("\t\t            <ul>\r\n");
      out.write("\t\t                <li class=\"huadong\">\r\n");
      out.write("\t\t                    <b>华东:</b>\r\n");
      out.write("\t\t                    <a href=\"/messageData/goSearch?province=31\" target=\"_blank\">上海</a>\r\n");
      out.write("\t\t                    <a href=\"/messageData/goSearch?province=32\" target=\"_blank\">江苏</a>\r\n");
      out.write("\t\t                    <a href=\"/messageData/goSearch?province=33\" target=\"_blank\">浙江</a>\r\n");
      out.write("\t\t                    <a href=\"/messageData/goSearch?province=34\" target=\"_blank\">安徽</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=35\">福建</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=36\">江西</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=37\">山东</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <li class=\"huadong2\">\r\n");
      out.write("\t\t                    <b>东北:</b>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=21\">辽宁</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=22\">吉林</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=23\">黑龙江</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <li class=\"huadong2\">\r\n");
      out.write("\t\t                    <b>西北:</b>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=61\">陕西</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=62\">甘肃</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=63\">青海</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=64\">宁夏</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=65\">新疆</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <li class=\"huadong2\">\r\n");
      out.write("\t\t                    <b>华中:</b>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=41\">河南</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=42\">湖北</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=43\">湖南</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <li class=\"huadong\">\r\n");
      out.write("\t\t                    <b>华北:</b>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=11\">北京</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=13\">河北</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=12\">天津</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=14\">山西</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=15\">内蒙古</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <li class=\"huadong2\">\r\n");
      out.write("\t\t                    <b>华南:</b>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=44\">广东</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=46\">海南</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=45\">广西</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=81\">香港</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=82\">澳门</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <li class=\"huadong\">\r\n");
      out.write("\t\t                    <b>西南:</b>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=51\">四川</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=50\">重庆</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=52\">贵州</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=53\">云南</a>\r\n");
      out.write("\t\t                    <a target=\"_blank\" href=\"/messageData/goSearch?province=54\">西藏</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t                <div class=\"clear\">\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </ul>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  <div class=\"lan\">\r\n");
      out.write("\t\t        <div class=\"er_title\">\r\n");
      out.write("\t\t            <h3 class=\"x_hua\" style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("\t\t                \t友情链接\r\n");
      out.write("\t\t            </h3>\r\n");
      out.write("\t\t            <div class=\"clear\">\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"map_list\">\r\n");
      out.write("\t\t            <ul>\r\n");
      out.write("\t\t                <li class=\"huadong\" style=\"width: 100%;\">\r\n");
      out.write("\t\t                    <a href=\"http://www.ecpmi.org.cn/\" target=\"_blank\">中国物业管理协会</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.caepi.org.cn/\" target=\"_blank\">中国环境保护产业协会</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.fjgpc.cn/\" target=\"_blank\">陕西招标网福建省政府采购中心</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.cida.org.cn/\" target=\"_blank\">中国室内装饰协会</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.ndrc.gov.cn/\" target=\"_blank\">国家发展改革委员会</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.dv37.com/\" target=\"_blank\">加盟网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"www.bidwin.cn\" target=\"_blank\">国睿招标网</a>\r\n");
      out.write("\t\t\t\t             <br/>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.caec.org.cn/\" target=\"_blank\">中国展览馆协会</a>\r\n");
      out.write("\t\t\t\t             <a href=\"www.bidwin.cn\" target=\"_blank\">项目网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.ctba.org.cn/\" target=\"_blank\">中国招标投标协会</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.acla.org.cn/home/toPage\" target=\"_blank\">中国律师网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://china-jt.com/\" target=\"_blank\">高速招标网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"www.bidwin.cn\" target=\"_blank\">招标网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"https://bj.lianjia.com/\" target=\"_blank\">北京房产网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.114chn.com/\" target=\"_blank\">114黄页</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://jobs.zhaopin.com/\" target=\"_blank\">人才网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"https://www.chinapp.com/\" target=\"_blank\">中国品牌网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"http://www.k18.com\" target=\"_blank\">中国餐饮加盟网</a>\r\n");
      out.write("\t\t\t\t             <a href=\"https://www.autohome.com.cn\" target=\"_blank\">汽车之家</a>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("\t\t            </ul>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.event.drag-1.5.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.touchSlider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\t$dragBln = false;\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".main_image\").touchSlider({\r\n");
      out.write("\t\tflexible : true,\r\n");
      out.write("\t\tspeed : 300,\r\n");
      out.write("\t\tbtn_prev : $(\"#btn_prev\"),\r\n");
      out.write("\t\tbtn_next : $(\"#btn_next\"),\r\n");
      out.write("\t\tpaging : $(\".flicking_con a\"),\r\n");
      out.write("\t\tcounter : function (e){\r\n");
      out.write("\t\t\t$(\".flicking_con a\").removeClass(\"on\").eq(e.current-1).addClass(\"on\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".main_image\").bind(\"mousedown\", function() {\r\n");
      out.write("\t\t$dragBln = false;\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".main_image\").bind(\"dragstart\", function() {\r\n");
      out.write("\t\t$dragBln = true;\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".main_image .a\").click(function(){\r\n");
      out.write("\t\tif($dragBln) {\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\ttimer = setInterval(function(){\r\n");
      out.write("\t\t$(\"#btn_next\").click();\r\n");
      out.write("\t}, 3000);\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".main_visual\").hover(function(){\r\n");
      out.write("\t\tclearInterval(timer);\r\n");
      out.write("\t},function(){\r\n");
      out.write("\t\ttimer = setInterval(function(){\r\n");
      out.write("\t\t\t$(\"#btn_next\").click();\r\n");
      out.write("\t\t},3000);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".main_image\").bind(\"touchstart\",function(){\r\n");
      out.write("\t\tclearInterval(timer);\r\n");
      out.write("\t}).bind(\"touchend\", function(){\r\n");
      out.write("\t\ttimer = setInterval(function(){\r\n");
      out.write("\t\t\t$(\"#btn_next\").click();\r\n");
      out.write("\t\t}, 2000);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /WEB-INF/views/index/index.jsp(76,23) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("/messageData/getHotMessageData?frontmodule=1");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f1.setParent(null);
    // /WEB-INF/views/index/index.jsp(118,19) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f1.setUrl("/messageData/getProjectData?frontmodule=2");
    int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
      if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/index/index.jsp(208,19) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index/index.jsp(208,19) '${frontDataThreeList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${frontDataThreeList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/index/index.jsp(208,19) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("frontData");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                \t\r\n");
          out.write("\t\t\t\t\t\t        <li>\r\n");
          out.write("\t\t\t\t\t\t         \t<span class=\"nn_left\" style=\"width: 230px;\"><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontData.url }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontData.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frontData.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></span>\r\n");
          out.write("\t                            \t<div class=\"clear\"></div>\r\n");
          out.write("\t\t\t\t\t\t        </li>\r\n");
          out.write("\t\t\t\t\t\t    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f2.setParent(null);
    // /WEB-INF/views/index/index.jsp(347,32) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f2.setUrl("/messageData/getFrontDataByType?type=2&num=5");
    int[] _jspx_push_body_count_c_005fimport_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f2 = _jspx_th_c_005fimport_005f2.doStartTag();
      if (_jspx_th_c_005fimport_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f3 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f3.setParent(null);
    // /WEB-INF/views/index/index.jsp(362,21) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f3.setUrl("/messageData/getDataByMessagetype?messagetype=5&frontmodule=3");
    int[] _jspx_push_body_count_c_005fimport_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f3 = _jspx_th_c_005fimport_005f3.doStartTag();
      if (_jspx_th_c_005fimport_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f4 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f4.setParent(null);
    // /WEB-INF/views/index/index.jsp(373,15) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f4.setUrl("/messageData/getDataByMessagetype?messagetype=4&frontmodule=3");
    int[] _jspx_push_body_count_c_005fimport_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f4 = _jspx_th_c_005fimport_005f4.doStartTag();
      if (_jspx_th_c_005fimport_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f5 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f5.setParent(null);
    // /WEB-INF/views/index/index.jsp(384,15) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f5.setUrl("/messageData/getDataByMessagetype?messagetype=1&frontmodule=3");
    int[] _jspx_push_body_count_c_005fimport_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f5 = _jspx_th_c_005fimport_005f5.doStartTag();
      if (_jspx_th_c_005fimport_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f6 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f6.setParent(null);
    // /WEB-INF/views/index/index.jsp(394,15) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f6.setUrl("/messageData/getDataByMessagetype?messagetype=2&frontmodule=3");
    int[] _jspx_push_body_count_c_005fimport_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f6 = _jspx_th_c_005fimport_005f6.doStartTag();
      if (_jspx_th_c_005fimport_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f7 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f7.setParent(null);
    // /WEB-INF/views/index/index.jsp(412,18) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f7.setUrl("/messageData/getProprietorByType?type=1");
    int[] _jspx_push_body_count_c_005fimport_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f7 = _jspx_th_c_005fimport_005f7.doStartTag();
      if (_jspx_th_c_005fimport_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f7.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f8 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f8.setParent(null);
    // /WEB-INF/views/index/index.jsp(415,24) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f8.setUrl("/messageData/getProprietorByType?type=2");
    int[] _jspx_push_body_count_c_005fimport_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f8 = _jspx_th_c_005fimport_005f8.doStartTag();
      if (_jspx_th_c_005fimport_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f8.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f9 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f9.setParent(null);
    // /WEB-INF/views/index/index.jsp(418,24) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f9.setUrl("/messageData/getProprietorByType?type=3");
    int[] _jspx_push_body_count_c_005fimport_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f9 = _jspx_th_c_005fimport_005f9.doStartTag();
      if (_jspx_th_c_005fimport_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f9.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f10 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f10.setParent(null);
    // /WEB-INF/views/index/index.jsp(459,25) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f10.setUrl("/messageData/getFrontDataByType?type=4&num=10");
    int[] _jspx_push_body_count_c_005fimport_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f10 = _jspx_th_c_005fimport_005f10.doStartTag();
      if (_jspx_th_c_005fimport_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f10.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f11 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f11.setParent(null);
    // /WEB-INF/views/index/index.jsp(476,23) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f11.setUrl("/messageData/getFrontDataByType?type=1&num=5");
    int[] _jspx_push_body_count_c_005fimport_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f11 = _jspx_th_c_005fimport_005f11.doStartTag();
      if (_jspx_th_c_005fimport_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f11.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f11);
    }
    return false;
  }
}
