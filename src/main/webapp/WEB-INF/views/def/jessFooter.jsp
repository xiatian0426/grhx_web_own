<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
</head>
<style>
    .footer .submenu {
        border-bottom: 1px solid #e7e7e7;
        padding-bottom: 50px;
        font-size: 15px;
        height: 150px;
        border-bottom: none;
    }
    .header{
        width: 1000px;
        margin: 0 auto;
    }
</style>
<
<script type="text/javascript">
    function test(){
        alert("题目还没写，哪来的超链接!");
    }
</script>
<body>
    <div class="header">
        <div class="footer" style="border-top:4px #307DB4 solid;height: 300px;">
        <div class="submenu" style="position: relative;background-image: url(${imageRoot }/jessFoot.jpg;);background-size:1000px 200px;">
            <ul style="display: block;width: 600px;margin: 0 auto;position: relative;">
                <li>
                    <div style="cursor:pointer;" onclick="test();">第一</div>
                </li>
                <li >
                    <div style="cursor:pointer;" onclick="test();">第二</div>
                </li>
                <li >
                    <div style="cursor:pointer;" onclick="test();">第三</div>
                </li>
                <li >
                    <div style="cursor:pointer;" onclick="test();">第四</div>
                </li>
                <li >
                    <div style="cursor:pointer;" onclick="test();">第五</div>
                </li>
            </ul>
        </div>
    </div>
</body>
</html>
