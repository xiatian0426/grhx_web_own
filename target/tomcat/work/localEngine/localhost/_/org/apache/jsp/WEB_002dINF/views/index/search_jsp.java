package org.apache.jsp.WEB_002dINF.views.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_1.mapFunction("fn:replace", org.apache.taglibs.standard.functions.Functions.class, "replace", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_1.mapFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\t<!-- 日历控件 -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("\t<!-- 引入分页 -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/page.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/main.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tvar province = $(\"#province\").val();\r\n");
      out.write("\t\t\tif(province==\"\" || province==\"0\" ||province==null){\r\n");
      out.write("\t\t\t\t$(\"#provinceShow\").show();\r\n");
      out.write("\t\t\t\t$(\"#provinceHide\").hide();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#provinceShow\").hide();\r\n");
      out.write("\t\t\t\t$(\"#provinceHide\").show();\r\n");
      out.write("\t\t\t\t$(\"#cityBox\").show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#provinceShow\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#provinceShow\").hide();\r\n");
      out.write("\t\t\t\t$(\"#provinceHide\").show();\r\n");
      out.write("\t\t\t\t$(\"#cityBox\").show();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#provinceHide\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#provinceShow\").show();\r\n");
      out.write("\t\t\t\t$(\"#provinceHide\").hide();\r\n");
      out.write("\t\t\t\t$(\"#cityBox\").hide();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\".cityBox span\").click(function(){\r\n");
      out.write("\t\t\t\t$(\".cityBox span\").removeClass(\"on\");\r\n");
      out.write("\t\t\t\t$(this).addClass(\"on\");\r\n");
      out.write("\t\t\t\tvar pro = $(this).attr(\"id\");\r\n");
      out.write("\t\t\t\t$(\"#province\").val(pro.split(\"_\")[1]);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t//函数来源page.js\r\n");
      out.write("\t\t\tpage(\"searchForm\", ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.pageInfo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(", \"pageDataList\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction check(){\r\n");
      out.write("\t\t\tvar selected = $(\"#selected\").text();\r\n");
      out.write("\t\t\tvar contentQuery = $(\"#contentQuery\").val();\r\n");
      out.write("\t\t\tif(selected=='标题'){\r\n");
      out.write("\t\t\t\t$(\"#titlee\").val(contentQuery);\r\n");
      out.write("\t\t\t\t$(\"#contentt\").val(\"\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#contentt\").val(contentQuery);\r\n");
      out.write("\t\t\t\t$(\"#titlee\").val(\"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.active{\r\n");
      out.write("\t\t\tbackground-color:#A0E0F7;\r\n");
      out.write("\t\t\tborder-radius:4px;\r\n");
      out.write("\t\t\tborder:1px solid transparent;\r\n");
      out.write("\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    .r_box table tr{\r\n");
      out.write("\t       height:40px;\r\n");
      out.write("\t        }\r\n");
      out.write("\t    .r_box table td{\r\n");
      out.write("\t       font-size:14px;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    .tit-td{\r\n");
      out.write("\t       text-align: left;\r\n");
      out.write("           text-indent: 20px;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    .pagination li{float:left; padding:2px 10px;font-size:10px;font-weight:bold;}\r\n");
      out.write("\t    .on{\r\n");
      out.write("\t    \tcolor:#ffffff;\r\n");
      out.write("\t    \tbackground-color: #c12121;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    .cityBox span{\r\n");
      out.write("\t    \tdisplay: inline-block;\r\n");
      out.write("\t    \theight:20px;\r\n");
      out.write("\t    \tline-height: 20px;\r\n");
      out.write("\t    \tpadding: 0 3px;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    .pro_span{\r\n");
      out.write("\t    \tpadding: 6px 13px;\r\n");
      out.write("\t    \tbackground-color:#4562ef;\r\n");
      out.write("\t    \tcolor: #fff;\r\n");
      out.write("\t    \tborder-radius:10px;\r\n");
      out.write("\t    }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/top.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- 引入 select2 -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/select/select2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/select/select2.full.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/select/select2-self.js\"></script>\r\n");
      out.write("<div class=\"content\" style=\"width: 1000px;margin: 0 auto;\">\r\n");
      out.write("\t<form action=\"/messageData/goSearch\" name=\"searchForm\" method=\"post\" target=\"_self\" id=\"searchForm\" onsubmit=\"return check();\">\r\n");
      out.write("\t\t<div class=\"r_box\" style=\"margin-top: 10px;margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t<div style=\"height: 15px; width: 100%;\"><span></span></div>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"title\" id=\"titlee\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("    \t    \t<input type=\"hidden\" name=\"content\" id=\"contentt\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.content }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("    \t    \t<input type=\"hidden\" name=\"province\" id=\"province\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.province }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t筛选条件：&nbsp;<select class=\"select-nosearch\" name=\"messagetype\" style=\"width: 130px;height: 28px;\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\">-----类型-----</option>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>&nbsp;\r\n");
      out.write("<!-- \t\t\t\t时间：<input style=\"margin-top: 2px;height:27px;border-radius:5px;\" type=\"text\" class=\"Wdate\" -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\tonfocus=\"WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})\" -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\tname=\"date\" id=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> -->\r\n");
      out.write("\t\t\t\t<select class=\"\" name=\"date\" style=\"width: 130px;height: 28px;\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\">----日期----</option>\r\n");
      out.write("\t\t\t\t\t<option value='1' ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(">近一周</option>\r\n");
      out.write("\t\t\t\t\t<option value='2' ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(">近一月</option>\r\n");
      out.write("\t\t\t\t\t<option value='3' ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write(">近三月</option>\r\n");
      out.write("\t\t\t\t\t<option value='4' ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write(">近半年</option>\r\n");
      out.write("\t\t\t\t\t<option value='5' ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write(">近一年</option>\r\n");
      out.write("\t\t\t\t</select>&nbsp;\r\n");
      out.write("\t\t\t\t<span id=\"provinceShow\" class=\"pro_span\">显示省份</span>\r\n");
      out.write("\t\t\t\t<span id=\"provinceHide\" class=\"pro_span\">隐藏省份</span>\r\n");
      out.write("<!-- \t\t\t\t<select class=\"select-nosearch\" style=\"width: 130px;height: 28px;\" > -->\r\n");
      out.write("<!-- \t\t\t\t\t<option value=\"\">-----省份-----</option> -->\r\n");
      out.write("<!-- \t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write(" -->\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<div class=\"cityBox\" id=\"cityBox\" style=\"width:800px; line-height: 26px;margin-top: 10px;display:none;\">\r\n");
      out.write("    \t    \t\t<span id=\"province_0\" ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write(">全国</span>\r\n");
      out.write("    \t    \t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t    \t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\tstyle=\"background-color:#4562ef;padding: 6px 13px;border:none;color:#fff;\">搜索</button>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<div><span></span></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"r_box\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" class=\"table-bordered\" style=\"border: 2px solid #307DB4;\">\r\n");
      out.write("\t\t<tr style=\"height:30px;background-color: #CCE4F7;\">\r\n");
      out.write("\t\t\t<td width=\"76%\" align=\"left\" style=\"padding-left:60px; font-size: 17px;font-weight: bold;border: 1px solid #CCE4F7;\">\r\n");
      out.write("\t\t\t\t标题");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentQuery }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"8%\" align=\"center\" style=\"font-size: 17px;font-weight: bold;border: 1px solid #CCE4F7;\">\r\n");
      out.write("\t\t\t\t地区\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"8%\" align=\"center\" style=\"font-size: 17px;font-weight: bold;border: 1px solid #CCE4F7;\">\r\n");
      out.write("\t\t\t\t类型\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"8%\" align=\"center\" style=\"font-size: 17px;font-weight: bold;border: 1px solid #CCE4F7;\">\r\n");
      out.write("\t\t\t\t日期\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f3.setParent(null);
      // /WEB-INF/views/index/search.jsp(171,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index/search.jsp(171,2) '${page.result}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${page.result}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/index/search.jsp(171,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setVar("messageData");
      // /WEB-INF/views/index/search.jsp(171,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setVarStatus("count");
      int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
        if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td align=\"left\"  title=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" style=\"border: 1px solid #CCE4F7;\">\r\n");
            out.write("\t\t\t\t\t<a href=\"/messageData/dataDetail?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" target=\"_blank\" style=\"font-size:14px;color: black;\">\r\n");
            out.write("\t\t\t\t\t\t");

							String contentQuery2 = "<font color='red'>" +(String)request.getAttribute("contentQuery")+"</font>"; 
							request.setAttribute("contentQuery2",contentQuery2);
						
            out.write("\r\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
              return;
            out.write("\t\r\n");
            out.write("\t\t\t\t\t</a>\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t<td align=\"center\"  style=\"border: 1px solid #CCE4F7;\">\r\n");
            out.write("\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.provincename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t<td align=\"center\"  style=\"border: 1px solid #CCE4F7;\">\r\n");
            out.write("\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.messagename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t<td align=\"center\"  style=\"border: 1px solid #CCE4F7;\">\r\n");
            out.write("\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageData.dateString}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f3.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
      }
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"4\" height=\"40\"  align=\"left\" class=\"pageDataList\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/index/search.jsp(116,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index/search.jsp(116,5) '${messageTypeList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${messageTypeList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/index/search.jsp(116,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("messageType");
    // /WEB-INF/views/index/search.jsp(116,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageType.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageType.messageName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" \r\n");
          out.write("\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/index/search.jsp(117,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.messagetype==messageType.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/index/search.jsp(127,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.date=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/views/index/search.jsp(128,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.date=='2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/views/index/search.jsp(129,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.date=='3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /WEB-INF/views/index/search.jsp(130,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.date=='4'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /WEB-INF/views/index/search.jsp(131,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.date=='5'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/index/search.jsp(137,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index/search.jsp(137,10) '${provinceList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${provinceList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/index/search.jsp(137,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("province");
    // /WEB-INF/views/index/search.jsp(137,10) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" -->\r\n");
          out.write("<!-- \t\t\t\t\t\t<option value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${province.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("> -->\r\n");
          out.write("<!-- \t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${province.provinceName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("  -->\r\n");
          out.write("<!-- \t\t\t\t\t\t</option> -->\r\n");
          out.write("<!-- \t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/index/search.jsp(138,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.province==province.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /WEB-INF/views/index/search.jsp(144,33) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.province==0 ||query.province=='' || query.province==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"on\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/index/search.jsp(145,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index/search.jsp(145,11) '${provinceList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${provinceList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/index/search.jsp(145,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("province");
    // /WEB-INF/views/index/search.jsp(145,11) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    \t    \t\t\t<span id=\"province_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${province.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${province.provinceName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("    \t    \t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/index/search.jsp(146,47) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.province==province.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"on\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/index/search.jsp(179,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(messageData.title)>=40}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:replace(fn:substring(messageData.title,0,40),contentQuery,contentQuery2)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
        out.write("...\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/index/search.jsp(182,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(messageData.title)<40}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:replace(messageData.title,contentQuery,contentQuery2)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
    return false;
  }
}
