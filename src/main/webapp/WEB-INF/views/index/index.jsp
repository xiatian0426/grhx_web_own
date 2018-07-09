<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>中国物业招标网</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${cssRoot}/main.css"/>
    <link rel="stylesheet" href="${cssRoot}/main2.css"/>
    <link rel="stylesheet" href="${cssRoot}/style.css"/>
    <script src="${jsRoot}/jquery-1.11.1.min.js"></script>

    <script>
        $(function () {
            $('#tab-div div').mouseover(function () {
                $('#tab-div div').removeClass('no_left').addClass('no_right');
                $(this).addClass('no_left');
                var index = $(this).index();
                $('#div-cont>div').addClass('divNone');
                $('#div-cont>div').eq(index).removeClass('divNone');
            });
        })

        function liChange(sign) {
            $('#move_li li').removeClass('no_left').addClass('no_right');
            if (sign == '1') {
                $("#li_1").addClass('no_left');
                document.getElementById("div_1").style.display = "";
                document.getElementById("div_2").style.display = "none";
            } else {
                $("#li_2").addClass('no_left');
                document.getElementById("div_1").style.display = "none";
                document.getElementById("div_2").style.display = "";
            }
        }

        $(document).ready(function () {
            var loginSign = ${loginSign};
            if (loginSign == '1') {
                document.getElementById("unlogin").style.display = "none";
                document.getElementById("logined").style.display = "";
                document.getElementById("unlogin_div").style.display = "none";
                document.getElementById("logined_div").style.display = "";
            }
        });
    </script>
</head>
<body>
<jsp:include page="../def/top.jsp"/>

<div id="middle">
    <a href="http://agile-living.agile.com.cn/yjl/Index/index" target="_blank"><img src="${imageRoot }/hengfu1.png" width="100%" height="80px;"/></a>
</div>
<div class="content">
    <div id="middle">
        <!--首页第一栏-->
        <div class="diyilan">
            <div class="yi_left">
                <div class="kuang">
                    <div class="title" style="background-color: #C5021B; border-bottom: 1px solid #e7e7e7;
                        padding-left: 0px;">
                        <div class="bghh">
                            <h3 class="Y-t">
                                <a href="#" title="热点信息" target="_blank"
                                   style="font-size: 18px;font-weight: bold;color: #fff">热点信息</a>
                            </h3>
                            <div class="clear">
                            </div>
                        </div>
                    </div>
                    <div class="kuang_list" style="height: 259px;">
                        <c:import url="/messageData/getHotMessageData?frontmodule=1"/>
                    </div>
                </div>

            </div>
            <div class="yi_center">
                <div class="hot_banner">
                    <div class="main_visual">
                        <div class="flicking_con">
                            <a class="a01" href="http://www.kleclean.com/index.asp" target="_blank">1</a>
                            <a class="a01" href="http://www.chinacityguard.com.cn/" target="_blank">2</a>
                            <a class="a03" href="http://www.hzbjwy.com/" target="_blank">3</a>
                            <a href="http://www.cspbj.com/" target="_blank">4</a>
                            <a href="http://www.cc-pg.cn/index.aspx" target="_blank">5</a>
                        </div>
                        <div class="main_image">
                            <ul>
                                <li><a href="http://www.hzbjwy.com/" target="_blank"><span
                                        class="img_3"></span></a></li>
                                <li><a href="http://www.cspbj.com/" target="_blank"><span class="img_4"></span></a></li>
                                <li><a href="http://www.cc-pg.cn/index.aspx" target="_blank"><span class="img_1"></span></a>
                                </li>
                                <li><a href="http://www.chinacityguard.com.cn/" target="_blank"><span
                                        class="img_2"></span></a></li>
                                <li><a href="http://www.kleclean.com/index.asp" target="_blank"><span
                                        class="img_5"></span></a></li>
                            </ul>
                            <a href="javascript:;" id="btn_prev"></a>
                            <a href="javascript:;" id="btn_next"></a>
                        </div>
                    </div>
                </div>
                <div class="kuang">
                    <div class="title" style="border-bottom: 1px solid #e7e7e7; height: 32px;width: 493px;">
                        <h3 class="vip_sj" style="background-color: #C5021B;width: 111px;">
                            <a href="#" title="" target="_blank" style="font-size: 18px;font-weight: bold;color: #fff;">
                                推荐项目
                            </a>
                            <div class="clear">
                            </div>
                        </h3>
                        <div class="clear">
                        </div>
                    </div>
                    <div class="item" style="background-color:#f9f9f9">
                        <div class="kuang_list" style="height: 128px;">
                            <c:import url="/messageData/getProjectData?frontmodule=2"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="yi_right">
                <div class="zhuce" id="unlogin" style=";height: 40px;">
                    <a href="/account/goRegister" title="注册" class="denglu" style="color: #fff;">
                        <b>注册</b>
                    </a>
                    <a href="/account/login" title="登录" class="zc" style="color: #fff;">
                        <b>登录</b>
                    </a>
                </div>
                <div class="" id="logined"
                     style="display: none;height: 40px;font-size:16px;font-weight:bold;line-height:40px;text-align:left;">
                    &nbsp;&nbsp;${member.userid },您好!&nbsp;
                    <a href="/account/logout" title="注销" style="font-size:16px;">
                        注销
                    </a>
                </div>
                <div class="kuang" id="unlogin_div">
                    <div class="tool">
                        <a href="/account/goRegister" title="查看最新招标">
                            查看最新招标
                        </a>
                        <a href="/account/goRegister" title="发布招标信息">
                            发布招标信息
                        </a>
                        <a href="/account/goRegister" title="了解业主状态">
                            了解业主状态
                        </a>
                        <a href="/account/goRegister" title="项目深度跟踪">
                            项目深度跟踪
                        </a>
                        <a href="/account/goRegister" title="热点项目推荐">
                            热点项目推荐
                        </a>
                        <a href="/account/goRegister" title=" 专属团队服务">
                            专属团队服务
                        </a>
                        <div class="clear">
                        </div>
                    </div>
                </div>
                <div class="kuang" id="logined_div" style="display: none;">
                    <div class="tool">
                        <a href="/index/contactUs" target="_blank" title="查看最新招标">
                            查看最新招标
                        </a>
                        <a href="/index/contactUs" target="_blank" title="发布招标信息">
                            发布招标信息
                        </a>
                        <a href="/index/contactUs" target="_blank" title="了解业主状态">
                            了解业主状态
                        </a>
                        <a href="/index/contactUs" target="_blank" title="项目深度跟踪">
                            项目深度跟踪
                        </a>
                        <a href="/index/contactUs" target="_blank" title="热点项目推荐">
                            热点项目推荐
                        </a>
                        <a href="/index/contactUs" target="_blank" title=" 专属团队服务">
                            专属团队服务
                        </a>
                        <div class="clear">
                        </div>
                    </div>
                </div>
                <div class="kuang">
                    <div class="title" style="border-bottom: 1px solid #e7e7e7; height: 32px;background-color: #C5021B;">
                        <h3 class="vip_sj">
                            <a href="#" title="" target="_blank" style="font-size: 18px;font-weight: bold;color: #fff;">
                                优秀供应商
                            </a>
                            <div class="clear">
                            </div>
                        </h3>
                        <div class="clear">
                        </div>
                    </div>
                    <style>
                        #golist {
                            position: relative;
                            padding: 3px 13px;
                        }

                        #golist ul {
                            position: relative;
                        }

                        .item #golist ul li {
                            float: none;
                            width: 227px;
                        }
                    </style>
                    <div class="item">
                        <div class="kuang_list" id="golist">
                            <ul>
                                <c:forEach items="${frontDataThreeList}" var="frontData">
                                    <li style="height: 24px">
                                        <span class="nn_left" style="width: 230px;"><a href="${frontData.url }"
                                                                                       title="${frontData.name }"
                                                                                       target="_blank">${frontData.name }</a></span>
                                        <div class="clear"></div>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>
                        <script src="${jsRoot}/jquery.superslide.2.1.1.js"></script>
                        <script>
                            jQuery(".item").slide({
                                mainCell: "#golist ul",
                                autoPlay: true,
                                effect: "topMarquee",
                                vis: 5,
                                interTime: 50,
                                trigger: "click"
                            });
                        </script>
                        <div class="clear">
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear">
            </div>
        </div>
        <!--首页第一栏结尾-->
        <div id="middle">
            <a href="http://www.henganweishi.com/" target="_blank"><img src="${imageRoot }/hengfu2.png"
                                                                              width="100%" height="80px;"/></a>
        </div>
        <!--招标专区-->
        <div class="dierlan">
            <div class="er_left">
                <div class="title3" style="font-size: 18px;font-weight: bold;"> 行业专区</div>
                <div class="classify">
                    <ul id="accoradion02" class="accoradion" style="width: 223px;" hovering="false">
                        <li class="active">
                            <a href="#" target="_blank" class="header closed opened"
                               style="font-size: 18px;font-weight: bold;color: #000;">
                                <em class="">&nbsp;</em>物业
                            </a>
                            <ul style="display: block; height: 130px;">
                                <li style="display: block;">
                                    <div class="tubiaoHH">
                                        <div class="fl_liet">
                                            <span class="dddd">
                                                <a href="/messageData/goSearch?title=物业" target="_blank" style="padding-left:3px;">
                                                    <img src="${imageRoot }/area_1.png" height="120px" width="200px">
                                                </a>
                                            </span>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <li class="active">
                            <a href="#" target="_blank" class="header closed opened"
                               style="font-size: 18px;font-weight: bold;color: #000;">
                                <em class="">&nbsp;</em>保洁
                            </a>
                            <ul style="display: block; height: 130px;">
                                <li style="display: block;">
                                    <div class="tubiaoHH">
                                        <div class="fl_liet">
                                            <span class="dddd">
                                                <a href="/messageData/goSearch?title=保洁" target="_blank" style="padding-left:3px;">
                                                    <img src="${imageRoot }/area_3.png" height="120px" width="200px">
                                                </a>
                                            </span>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <li class="active">
                            <a href="#" target="_blank" class="header closed opened"
                               style="font-size: 18px;font-weight: bold;color: #000;">
                                <em class="">&nbsp;</em>保安
                            </a>
                            <ul style="display: block; height: 130px;">
                                <li style="display: block;">
                                    <div class="tubiaoHH">
                                        <div class="fl_liet">
                                            <span class="dddd">
                                                <a href="/messageData/goSearch?title=保安" target="_blank" style="padding-left:3px;">
                                                    <img src="${imageRoot }/area_2.png" height="120px" width="200px">
                                                </a>
                                            </span>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <li class="active" style="height: 169px;border-left:1px solid #e7e7e7;border-right:1px solid #e7e7e7;">
                            <a href="#" target="_blank" class="header closed opened" style="font-size: 18px;font-weight: bold;color: #000;">
                                <em class="">&nbsp;</em>其它
                            </a>
                            <ul style="display: block; height: 100px;">
                                <li style="display: block;">
                                    <div class="tubiaoHH">
                                        <div class="fl_liet" style="margin-top: 15px;">
                                            <span class="dddd">
                                                <a href="/messageData/goSearch?title=物业" target="_blank" title="">物业</a>
                                                <a href="/messageData/goSearch?title=保安" target="_blank" title="" class="duoyu">保安</a>
                                                <a href="/messageData/goSearch?title=保洁" target="_blank" title="">保洁</a>
                                                <a href="/messageData/goSearch?title=安保" target="_blank" title="" class="duoyu">安保</a>
                                                <a href="/messageData/goSearch?title=清洁" target="_blank" title="">清洁</a>
                                                <a href="/messageData/goSearch?title=清洗" target="_blank" title="" class="duoyu">清洗</a>
                                                <a href="/messageData/goSearch?title=开荒" target="_blank" title="">开荒</a>
                                                <a href="/messageData/goSearch?title=家政" target="_blank" title="" class="duoyu">家政</a>
                                                <div class="clear"> </div>
                                            </span>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <li class="li_last" style="border:1px solid #e7e7e7; border-top:0;height: 238px;">
                            <a href="#" target="_blank" class="header closed opened"
                               style="font-size: 18px;font-weight: bold;color: #fff;background-color: #C5021B; ">
                                <em class="">&nbsp;</em>展会信息
                            </a>
                            <ul style="padding-top:12px; padding-bottom:9px;">
                                <c:import url="/messageData/getFrontDataByType?type=2&num=7"/>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="er_center">
                <div class="notice">
                    <div class="n_title" id="move-animate-top1">
                        <h3 class="x_hua" style="font-size: 18px;font-weight: bold;">
                            <a href="/messageData/goSearch?messagetype=5" title="" target="_blank" class="ff"
                               style="font-size: 18px;font-weight: bold;background-color: #fff;color: #C5021B;">VIP独家</a>
                        </h3>
                        <div class="clear"></div>
                    </div>
                    <div class="n_content" id="con_BC_1" style="padding-bottom: 0;">
                        <c:import url="/messageData/getDataByMessagetype?messagetype=5&frontmodule=3"/>
                    </div>
                </div>
                <div class="notice">
                    <div class="n_title" id="move-animate-top1">
                        <h3 class="x_hua" style="font-size: 18px;font-weight: bold;">
                            <a href="/messageData/goSearch?messagetype=4" title="" target="_blank" class="ff"
                               style="font-size: 18px;font-weight: bold;background-color: #fff;color: #C5021B;">拟在建项目</a>
                        </h3>
                        <div class="clear"></div>
                    </div>
                    <div class="n_content" id="con_BC_1" style="padding-bottom: 0;">
                        <c:import url="/messageData/getDataByMessagetype?messagetype=4&frontmodule=3"/>
                    </div>
                </div>
                <div class="notice">
                    <div class="n_title" id="move-animate-top1">
                        <h3 class="x_hua" style="font-size: 18px;font-weight: bold;">
                            <a href="/messageData/goSearch?messagetype=1" title="" target="_blank" class="ff"
                               style="font-size: 18px;font-weight: bold;background-color: #fff;color: #C5021B;">招标公告</a>
                        </h3>
                        <div class="clear"></div>
                    </div>
                    <div class="n_content" id="con_BC_1" style="padding-bottom: 0;">
                        <c:import url="/messageData/getDataByMessagetype?messagetype=1&frontmodule=3"/>
                    </div>
                </div>
                <div class="notice">
                    <div class="n_title" id="move-animate-top1">
                        <h3 class="x_hua" style="font-size: 18px;font-weight: bold;">
                            <a href="/messageData/goSearch?messagetype=2" title="" target="_blank" class="ff"
                               style="font-size: 18px;font-weight: bold;background-color: #fff;color: #C5021B;">中标公告</a></h3>
                        <div class="clear"></div>
                    </div>
                    <div class="n_content" id="con_BC_1" style="padding-bottom: 0;">
                        <c:import url="/messageData/getDataByMessagetype?messagetype=2&frontmodule=3"/>
                    </div>
                </div>
                <div class="notice" style="height: 187px;">
                    <div class="n_title clearfix" id="tab-div" style="border:0px solid #1d59bd;">
                        <div class="no_left" id="BCC1">
                            <a href="/messageData/goSearchProprietor?type=1" style="font-size: 15px;font-weight: bold;background-color: #fff;color: #C5021B;"><b>业主库</b></a>
                        </div>
                        <div class="no_right" id="BCC2">
                            <a href="/messageData/goSearchProprietor?type=2" style="font-size: 15px;font-weight: bold;"><b>设计院库</b></a>
                        </div>
                        <div class="no_right" id="BCC3">
                            <a href="/messageData/goSearchProprietor?type=3" style="font-size: 15px;font-weight: bold;"><b>代理机构库</b></a>
                        </div>

                    </div>
                    <div id="div-cont">
                        <div class="n_content" id="con_BCC_1" style="_padding: 0;">
                            <c:import url="/messageData/getProprietorByType?type=1"/>
                        </div>
                        <div class="n_content divNone" id="con_BCC_2" style="_padding: 0;">
                            <c:import url="/messageData/getProprietorByType?type=2"/>
                        </div>
                        <div class="n_content divNone" id="con_BCC_3" style="_padding: 0;">
                            <c:import url="/messageData/getProprietorByType?type=3"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="er_right">
                <div class="kuang">
                    <div class="title2" style="padding-left: 0px;">
                        <h3 class="Y-t">
                            <div class="bggg">
                                <a href="#" title="标王推荐" target="_blank" class="rightcss"
                                   style="color: #fff;font-size: 15px;font-weight: bold;"> 会员中标榜</a>
                            </div>
                        </h3>
                        <div class="clear"></div>
                    </div>
                    <div class="kuang_list" style="padding: 6px 10px;">
                        <ul>
                            <li>
                                <div class="ico_t_pic" style="border-bottom: 1px solid #e7e7e7;width:233px;"><a
                                        href="https://www.vankeservice.com/" target="_blank">
                                    <img src="${imageRoot }/member_1.png" height="61" width="230">
                                </a></div>
                                <div class="clear"></div>
                            </li>
                            <li>
                                <div class="ico_t_pic" style="border-bottom: 1px solid #e7e7e7;width:233px;"><a
                                        href="http://www.lvchengfuwu.com/" target="_blank">
                                    <img src="${imageRoot }/member_2.png" height="61" width="230">
                                </a></div>
                                <div class="clear"></div>
                            </li>
                            <li>
                                <div class="ico_t_pic" style="border-bottom: 1px solid #e7e7e7;width:233px;"><a
                                        href="http://www.hxza.com/" target="_blank">
                                    <img src="${imageRoot }/member_3.png" height="61" width="230">
                                </a></div>
                                <div class="clear"></div>
                            </li>
                            <li>
                                <div class="ico_t_pic" style="border-bottom: 1px solid #e7e7e7;width:233px;"><a
                                        href="http://www.shqjet.com/" target="_blank">
                                    <img src="${imageRoot }/member_4.png" height="61" width="230">
                                </a></div>
                                <div class="clear"></div>
                            </li>
                            <li>
                                <div class="ico_t_pic"><a href="http://www.itcpm.com/category.aspx?NodeID=1&siteid=27546" target="_blank">
                                    <img src="${imageRoot }/member_5.png" height="61" width="230">
                                </a></div>
                                <div class="clear"></div>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="kuang" style="height:289px;">
                    <div class="kuang_list">
                        <ul>
                            <c:import url="/messageData/getFrontDataByType?type=4&num=11"/>
                        </ul>
                    </div>
                </div>

                <div class="kuang" style="height: 235px;">
                    <div class="title2" style="background-color: #C5021B;">
                        <h3 class="Y-t">
                            <a href="#" title="" target="_blank" class="rightcss"
                               style="font-size: 18px;font-weight: bold;color: #fff;">行业动态</a>
                        </h3>
                        <div class="clear"></div>
                    </div>
                    <div class="kuang_list">

                        <ul>
                            <li class="li_last" style="border:0px solid #e7e7e7; border-top:0;">
                                <ul>
                                    <c:import url="/messageData/getFrontDataByType?type=1&num=7"/>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
        <div id="middle">
            <a href="http://www.xywy168.com/" target="_blank"><img src="${imageRoot }/hengfu3.png" width="100%"
                                                                        height="80px;"/></a>
        </div>
        <div class="other">
            <div class="lan">
                <div class="er_title">
                    <h3 class="x_hua" style="font-size: 18px;font-weight: bold;border-bottom:2px solid #C5021B;color:#C5021B;">
                        地区导航
                    </h3>
                    <div class="clear">
                    </div>
                </div>
                <div class="map_list">
                    <ul>
                        <li class="huadong">
                            <b>华东:</b>
                            <a href="/messageData/goSearch?province=31" target="_blank">上海</a>
                            <a href="/messageData/goSearch?province=32" target="_blank">江苏</a>
                            <a href="/messageData/goSearch?province=33" target="_blank">浙江</a>
                            <a href="/messageData/goSearch?province=34" target="_blank">安徽</a>
                            <a target="_blank" href="/messageData/goSearch?province=35">福建</a>
                            <a target="_blank" href="/messageData/goSearch?province=36">江西</a>
                            <a target="_blank" href="/messageData/goSearch?province=37">山东</a>
                        </li>
                        <li class="huadong2">
                            <b>东北:</b>
                            <a target="_blank" href="/messageData/goSearch?province=21">辽宁</a>
                            <a target="_blank" href="/messageData/goSearch?province=22">吉林</a>
                            <a target="_blank" href="/messageData/goSearch?province=23">黑龙江</a>
                        </li>
                        <li class="huadong2">
                            <b>西北:</b>
                            <a target="_blank" href="/messageData/goSearch?province=61">陕西</a>
                            <a target="_blank" href="/messageData/goSearch?province=62">甘肃</a>
                            <a target="_blank" href="/messageData/goSearch?province=63">青海</a>
                            <a target="_blank" href="/messageData/goSearch?province=64">宁夏</a>
                            <a target="_blank" href="/messageData/goSearch?province=65">新疆</a>
                        </li>
                        <li class="huadong2">
                            <b>华中:</b>
                            <a target="_blank" href="/messageData/goSearch?province=41">河南</a>
                            <a target="_blank" href="/messageData/goSearch?province=42">湖北</a>
                            <a target="_blank" href="/messageData/goSearch?province=43">湖南</a>
                        </li>
                        <li class="huadong">
                            <b>华北:</b>
                            <a target="_blank" href="/messageData/goSearch?province=11">北京</a>
                            <a target="_blank" href="/messageData/goSearch?province=13">河北</a>
                            <a target="_blank" href="/messageData/goSearch?province=12">天津</a>
                            <a target="_blank" href="/messageData/goSearch?province=14">山西</a>
                            <a target="_blank" href="/messageData/goSearch?province=15">内蒙古</a>
                        </li>
                        <li class="huadong2">
                            <b>华南:</b>
                            <a target="_blank" href="/messageData/goSearch?province=44">广东</a>
                            <a target="_blank" href="/messageData/goSearch?province=46">海南</a>
                            <a target="_blank" href="/messageData/goSearch?province=45">广西</a>
                            <a target="_blank" href="/messageData/goSearch?province=81">香港</a>
                            <a target="_blank" href="/messageData/goSearch?province=82">澳门</a>
                        </li>
                        <li class="huadong">
                            <b>西南:</b>
                            <a target="_blank" href="/messageData/goSearch?province=51">四川</a>
                            <a target="_blank" href="/messageData/goSearch?province=50">重庆</a>
                            <a target="_blank" href="/messageData/goSearch?province=52">贵州</a>
                            <a target="_blank" href="/messageData/goSearch?province=53">云南</a>
                            <a target="_blank" href="/messageData/goSearch?province=54">西藏</a>
                        </li>
                        <div class="clear">
                        </div>
                    </ul>
                </div>
            </div>
            <div class="lan">
                <div class="er_title">
                    <h3 class="x_hua" style="font-size: 18px;font-weight: bold;border-bottom:2px solid #C5021B;color:#C5021B; ">
                        友情链接
                    </h3>
                    <div class="clear">
                    </div>
                </div>
                <div class="map_list">
                    <ul>
                        <li class="huadong" style="width: 100%;">
                            <a href="http://www.ecpmi.org.cn/" target="_blank">中国物业管理协会</a>
                            <a href="http://www.zgwyhyxh.org/" target="_blank">中国物业行业管理协会</a>
                            <a href="http://www.zgba.org/" target="_blank">中国保安协会</a>
                            <a href="www.zhongxiangzhaobiao.com" target="_blank">中项招标网</a>
                            <a href="http://www.ctba.org.cn/" target="_blank">中国招标投标协会</a>
                            <a href="http://www.chinaclean.org/html/index.html" target="_blank">中国清洁网</a>
                            <a href="http://120.55.118.116:9080/" target="_blank">北京物业管理行业协会</a>
                            <a href="http://www.szpmi.org/" target="_blank">深圳市物业管理行业协会</a>
                            <br/>
                            <a href="http://www.shwy.org.cn/shwyWeb/" target="_blank">上海市物业管理行业协会</a>
                            <a href="http://60.28.130.106:81/wyxh/" target="_blank">天津市物业管理协会</a>
                            <a href="http://www.cqpma.com/" target="_blank">重庆物业管理协会</a>
                            <a href="http://www.fjwygl.org.cn/" target="_blank">福建省物业管理协会</a>
                            <a href="http://www.gdsbaxh.com/" target="_blank">广东省保安协会</a>
                            <a href="http://www.bjbaw.cn/" target="_blank">北京保安网</a>
                            <a href="http://www.jsbaw.net:1818/index.html" target="_blank">江苏保安协会</a>
                            <a href="http://www.hbclean.org/" target="_blank">湖北省清洗保洁行业协会</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../def/footer.jsp"/>

<script src="${jsRoot}/jquery.event.drag-1.5.min.js"></script>
<script src="${jsRoot}/jquery.touchSlider.js"></script>
<script type="text/javascript">
    $(document).ready(function () {

        $dragBln = false;

        $(".main_image").touchSlider({
            flexible: true,
            speed: 300,
            btn_prev: $("#btn_prev"),
            btn_next: $("#btn_next"),
            paging: $(".flicking_con a"),
            counter: function (e) {
                $(".flicking_con a").removeClass("on").eq(e.current - 1).addClass("on");
            }
        });

        $(".main_image").bind("mousedown", function () {
            $dragBln = false;
        });

        $(".main_image").bind("dragstart", function () {
            $dragBln = true;
        })

        $(".main_image .a").click(function () {
            if ($dragBln) {
                return false;
            }
        });

        timer = setInterval(function () {
            $("#btn_next").click();
        }, 3000);

        $(".main_visual").hover(function () {
            clearInterval(timer);
        }, function () {
            timer = setInterval(function () {
                $("#btn_next").click();
            }, 3000);
        });

        $(".main_image").bind("touchstart", function () {
            clearInterval(timer);
        }).bind("touchend", function () {
            timer = setInterval(function () {
                $("#btn_next").click();
            }, 2000);
        });

    });
</script>
</body>
</html>