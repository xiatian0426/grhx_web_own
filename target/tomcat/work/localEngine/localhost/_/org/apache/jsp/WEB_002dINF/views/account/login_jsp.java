package org.apache.jsp.WEB_002dINF.views.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	public String pageNav(String pageUrl,int totalPage,
						  int pageIndex,int count,String reqType,
						  Map<String,String> par){
		reqType = reqType == null || "null".equals(reqType) ? "GET":reqType;
		StringBuffer pagestr = new StringBuffer("");
		StringBuffer parstr = new StringBuffer(setParameter(reqType, par));
		StringBuffer v = new StringBuffer("");
		v.append("<div class='pagination pagination-centered'>");
		v.append("<ul>");
		if (pageIndex <=1){
			v.append("<li><a href=\"#\">上一页</a></li>");
		}else{
			if("POST".equalsIgnoreCase(reqType)){
				v.append("<li><a href=\"#\" onclick=\"goToPage('" + (pageIndex - 1) + "');\" title='上一页'>上一页</a></li>");
			}else{
				if (!"".equals(parstr.toString())){
					v.append("<li><a href='" + pageUrl + "?pageIndex=" + (pageIndex - 1) + "&" + parstr.toString() + "' title='上一页'>上一页</a></li>");
				}else{
					v.append("<li><a href='" + pageUrl + "?pageIndex=" + (pageIndex - 1) + "' title='上一页'>上一页</a></li>");
				}
			}
		}
		if(pageIndex == 1){
			v.append("<li class='active'><a href='#'>1</a></li>");
		}else{
			if("POST".equalsIgnoreCase(reqType)){
				v.append("<li><a href=\"#\" onclick=\"goToPage('1');\">1</a></li>");
			}else{
				if (!"".equals(parstr.toString())){
					v.append("<li><a href='" + pageUrl + "?pageIndex=1&" + parstr.toString() + "'>1</a></li>");
				}else{
					v.append("<li><a href='" + pageUrl + "?pageIndex=1" + parstr.toString() + "'>1</a></li>");
				}
			}
		}
		if (totalPage > 1){
			if (pageIndex<=5){
				v.append(setPageString(2, pageIndex, pageIndex, reqType, parstr.toString(), pageUrl));
			}else{
				 v.append("<li><a>...</a></li>");
				 v.append(setPageString(pageIndex - 3, pageIndex, pageIndex, reqType, parstr.toString(), pageUrl));
			}
			
			if (pageIndex>=totalPage-4 || totalPage-4<=0){
				v.append(setPageString(pageIndex + 1, totalPage, pageIndex, reqType, parstr.toString(), pageUrl));
			}else{
				  v.append(setPageString(pageIndex + 1, pageIndex+3, pageIndex, reqType, parstr.toString(), pageUrl));
				  v.append("<li><a>...</a></li>");
				  if ("POST".equalsIgnoreCase(reqType)){
				  	v.append("<li><a href=\"#\" onclick=\"goToPage('"+totalPage+"\');\"'>"+totalPage+"</a></li>");
				  }else{
				  	if (!"".equals(parstr.toString())){
						v.append("<li><a href='" + pageUrl + "?pageIndex=" + totalPage + "&" + parstr.toString() + "'>" + totalPage + "</a></li>");
					}else{
						v.append("<li><a href='" + pageUrl + "?pageIndex=" + totalPage + "'>" + totalPage + "</a></li>");
					}
				  }
			}
		}
		if (pageIndex >= totalPage){
			v.append("<li><a href='#' title='已经是最后一页了'>下一页</a></li>");
		}else{
			if("POST".equalsIgnoreCase(reqType)){
				v.append("<li><a title='下一页' href=\"#\" onclick=\"goToPage('" + (pageIndex + 1) + "');\">下一页</a></li>");
			}else{
				if (!"".equals(parstr.toString())){
					v.append("<li><a title='下一页' href='" + pageUrl + "?pageIndex=" + (pageIndex + 1) + "&" + parstr.toString() + "'>下一页</a></li>");
				}else{
					v.append("<li><a title='下一页' href='" + pageUrl + "?pageIndex=" + (pageIndex + 1) + "'>下一页</a></li>");
				}
			}
		}
		v.append("<li><a href='#'>共"+count+"条 | "+pageIndex+"/"+totalPage+"页</a></li>");
		v.append("</div>");
		if("POST".equalsIgnoreCase(reqType)){
			v.append("<form action='" + pageUrl + "' method='POST' name='pagesubForm' id='pagesubForm'>");
			v.append("<input type='hidden' id='selAllFlag' name='selAllFlag'/>");
			v.append(parstr.toString());
			v.append("</form>");
			v.append("<script>");
			v.append("function goToPage(page){");
			//进出口数据列表全选用start
			v.append("if($('.all_check').attr('checked')){");
			v.append("$('#selAllFlag').val('1');");
			v.append("}else{$('#selAllFlag').val('');}");
			//进出口数据列表全选用end
			v.append("document.getElementById('pageIndex').value = page;");
			v.append("document.getElementById('pagesubForm').submit();");
			v.append("}");
			v.append("</script>");
		}
		return v.toString();
	}
	public String setParameter(String type,Map<String,String> par){
		StringBuffer parameter = new StringBuffer("");
		if (par != null && par.size() > 0){
			int parcount = par.size();
			int i = 0;
			Iterator<String> it = par.keySet().iterator();
			while(it.hasNext()){
				String key =it.next();
				String value = par.get(key);
				if ("POST".equalsIgnoreCase(type)){
					parameter.append("<input type='hidden' name='" + key + "' id='" + key + "' value='" + value + "'/>");
				}else if ("GET".equalsIgnoreCase(type)){
					if (i < (parcount -1)){
						parameter.append(key + "=" + value + "&");
					}else{
						parameter.append(key + "=" + value);
					}
				}
				i ++;
			}
		}
		return parameter.toString();
	}
	public String setPageString(int start,int end,int pageIndex,String reqType,String parstr,String pageUrl){
		StringBuffer v = new StringBuffer("");
		for(int i = start; i <= end; i ++){
			if(pageIndex == i){
				v.append("<li class='active'><a href='#'>" + i + "</a></li>");
			}else{
				if("POST".equalsIgnoreCase(reqType)){
					v.append("<li><a href=\"#\" onclick=\"goToPage('" + i + "');\">" + i + "</a></li>");
				}else{
					if (!"".equals(parstr.toString())){
						v.append("<li><a href='" + pageUrl + "?pageIndex=" + i + "&" + parstr.toString() + "'>" + i + "</a></li>");
					}else{
						v.append("<li><a href='" + pageUrl + "?pageIndex=" + i + "'>" + i + "</a></li>");
					}
				}
			}
		}
		return v.toString();
	}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/views/account/../common/pages.jsp");
    _jspx_dependants.add("/WEB-INF/views/account/../common/jsp_contants.jsp");
    _jspx_dependants.add("/WEB-INF/views/account/../common/js_contants.jsp");
  }

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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>客户登陆</title>\r\n");
      out.write("\t");

	String toolRoot      = (String)session.getServletContext().getAttribute("toolRoot");
	String imageRoot     = (String)session.getServletContext().getAttribute("imageRoot");
	String jsRoot        = (String)session.getServletContext().getAttribute("jsRoot");
	String cssRoot       = (String)session.getServletContext().getAttribute("cssRoot");
	//Cookie useridCookie  = (Cookie)WebCookies.getCookieByName(request,Constants.COOKIESUSERNAME);
	//SecStaff sessionStaff = (SecStaff)session.getAttribute(Constants.LOGINUSER);

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("<script>\r\n");
      out.write("\t\tvar imageRoot  = '");
      out.print((String)session.getServletContext().getAttribute("imageRoot"));
      out.write("';\r\n");
      out.write("\t\tvar jsRoot     = '");
      out.print((String)session.getServletContext().getAttribute("jsRoot"));
      out.write("';\r\n");
      out.write("\t\tvar cssRoot    = '");
      out.print((String)session.getServletContext().getAttribute("cssRoot"));
      out.write("';\r\n");
      out.write("\t\tvar toolRoot   = '");
      out.print((String)session.getServletContext().getAttribute("toolRoot"));
      out.write("';\r\n");
      out.write("\t\tvar waterPic  = imageRoot + \"/logosy.png\";\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<!-- 验证 -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/validata/validationEngine.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/validata/jquery.validationEngine.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toolRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/validata/jquery.validationEngine-zh_CN.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cssRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/main.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login/login.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//开启表单验证\r\n");
      out.write("\t\t$(\"#loginForm\").validationEngine();\r\n");
      out.write("\t});\r\n");
      out.write("\t$(document).ready(function(){ \r\n");
      out.write("\t\tvar loginMsg = $(\"#loginMsg\").val();\r\n");
      out.write("\t\tif(loginMsg!=''){\r\n");
      out.write("\t\t\talert(loginMsg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction changeImg() {\r\n");
      out.write("\t\t$(\"#validatecodeimg\").attr(\"src\", \"/account/verifycoderegister?\"+ Math.random());\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t    font-family: \"宋体\", \"Microsoft Yahei\",\"Tahoma\",\"SimSun\";\r\n");
      out.write("\t\t    font-size: 14px;\r\n");
      out.write("\t\t    _background-image: url(about:blank);\r\n");
      out.write("\t\t    _background-attachment: fixed;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../def/top.jsp", out, false);
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<div id=\"main\" style=\"margin-top: 30px;\">\r\n");
      out.write("\t\t<a href=\"/index/index\" style=\"float:left;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageRoot }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logo.jpg\" style=\"width:180px;height:50px;\"></a>\r\n");
      out.write("\t\t<div style=\"border-left:2px solid #ccc;margin-left:10px;height:50px;padding-left:10px;float:left; text-align: left;\">\r\n");
      out.write("\t\t\t<span style=\"font-size:28px;font-weight:bold;line-height:50px;color:#6f99d5;font-family:黑体;\">会员登陆</span><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"m k lognav\"></div>\r\n");
      out.write("\t<div class=\"m k\"></div>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div style=\"width:760px;text-align:left;float:left\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sign }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"sign\">\r\n");
      out.write(" \t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMsg }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"loginMsg\">\r\n");
      out.write(" \t\t\t<form action=\"/account/login\" id=\"loginForm\" name=\"loginForm\" method=\"post\" >\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dd class=\"pd10\">\t\t    \r\n");
      out.write("\t\t\t\t\t\t<div class=\"lab1\">用户名：<span class=\"red bold\">*</span></div>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"userid\" name=\"userid\" type=\"text\"  value=\"\" style=\"width:214px;color:gray;\" class=\"validate[required,noSpecialCaracters,maxSize[11]] text-input self-form-control\">\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd class=\"pd10\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"lab1\">密码：<span class=\"red bold\">*</span></div>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"pwd\" name=\"pwd\" type=\"password\" value=\"\" style=\"width:214px;color:gray;\" class=\"validate[required,noSpecialCaracters,maxSize[11]] text-input self-form-control\"/>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd class=\"rigdd\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"lab1\">验证码：<span class=\"red bold\">*</span></div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"surePwd\" name=\"verifycode\" value=\"\" style=\"width:60px;\" class=\"validate[required,noSpecialCaracters,maxSize[4]] text-input self-form-control\"/>\r\n");
      out.write("\t\t\t\t\t\t<img title='看不清 点一下' onclick=\"javascript:changeImg();\" src=\"/account/verifycoderegister\" id=\"validatecodeimg\" width=\"70\" height=\"28\" cursor: hand;>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:changeImg();\">看不清 换一张</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd class=\"rigdd\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"lab1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"\" class=\"an\" >\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"m k lognav\"></div>\r\n");
      out.write("\t<div class=\"m k\"></div>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t");
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
