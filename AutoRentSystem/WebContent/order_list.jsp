<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String path = request.getContextPath();
	String flag = request.getParameter("flag");
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>小二租车</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/home.css"/>
<link rel="stylesheet" type="text/css" href="<%=path%>/city/city.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/city/style.css">
<script type="text/javascript" src="<%=path%>/script/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="<%=path%>/script/home_ban.js"></script>
<script type="text/javascript" src="<%=path%>/script/eg_top_search.js"></script>
<script type="text/javascript" src="<%=path%>/script/city.js"></script>
<script type="text/javascript" src="<%=path%>/script/snncar.js"></script>
<script type="text/javascript" src="<%=path%>/script/superslide.2.1.js"></script>
<script type="text/javascript">
$(function(){
	$('.navmenu li').hover(function(){
		$('span',this).stop().css('height','2px');
		$('span',this).animate({
			left:'0',
			width:'100%',
			right:'0'
		},200);
	},function(){
		$('span',this).stop().animate({
			left:'50%',
			width:'0'
		},200);
	});
});
</script>

<!--搜搜框获取焦点-->
<script type="text/javascript">
$(function () {
$('.sea-ipt-txt').focus(function() { 
$(this).addClass("on");
$('.search-btn').addClass("on"); 
}); 
$('.sea-ipt-txt').blur(function() { 
$(this).removeClass("on");
$('.search-btn').removeClass("on");
}); 
});
</script>
<!--stress搜索关闭-->
<script type="text/javascript">
$(function () {
	var setTime;
	$(".sercat .weixin").hover(function () {
		setTime = setTimeout(function () {
			$(".sercat .wxewm").show();
		}, 300);
	}, function () {
		if (setTime) {
			clearTimeout(setTime);
		}
		$(".sercat .wxewm").hide();
	});
});
function validate(){
	var message = "您确认提交订单吗？"
	if(confirm(message)==true){
		window.location.href = "<%=path%>/order/allin.do";
	}
	else{
		window.location.href = "<%=path%>/order/cancel.do";
	}
}
</script>
</head>
<body>
<div class="egc-top">
   <div class="nav-cent">
  <%if(session.getAttribute("username")==null){%>
    <div class="top-r"> 
    <a href="#" id="b-regist">注册</a>|<a href="#" id="b-login" class="b-login">登陆</a> </div><%} %>
    <%if(session.getAttribute("username")!=null){%>
    <div class="top-r"> 
    <p >${username}|<a href = "<%=path %>/login/remove.do" id = "b-return">退出</a></p></div><%} %>
    <div class="top-l">全国统一客服热线：400-877-9288</div>
    <div class="clear_fix"></div>
  </div>
</div>
<div class="navigation">
  <div class="nav-cent">
    <div class="logo"><a href="index.jsp"><img src="<%=path%>/images/logo.png" width="240" /></a></div>
    <div class="city"> <span id="DY_site_name" class="red city-name Left">合肥</span>
      <div id="JS_hide_city_menu_11" class="city-select cut_handdler Left"> <a href="javascript:void(0);" class="common-bg selector">切换城市</a>
        <div id="JS_header_city_bar_box" class="hide_city_group">
          <div class="hideMap">
            <div class="showPanel clearfix">
              <div class="Left mycity">
                <div id="JS_current_city_box"> 当前城市：<strong id="JS_city_current_city">合肥</strong> </div>
                <div id="JS_default_city_delete" style="display: none;"></div>
              </div>
            </div>
            <div class="showPanel showPanel2 clearfix">
              <div class="hot_city" id="JS_header_city_hot"> </div>
              <div class="city_words mt10" id="JS_header_city_char"> </div>
            </div>
            <div class="scrollBody">
              <div class="cityMap clearfix">
                <table id="JS_header_city_list" class="city_list" style="margin-top: 0px;">
                  <tbody>
                  </tbody>
                </table>
              </div>
              <div class="scrollBar"> <span id="JS_header_city_bar" style="margin-top: 0px;"></span> </div>
            </div>
          </div>
        </div>
      </div>
      <span class="common-bg city-logo"></span> </div>
    <div class="sea">
      <div class="egc-sea-box">
        <input type="text" class="sea-ipt-txt" placeholder="搜索您想要的车" />
        <a href="#" class="search-btn">搜索</a> </div>
    </div>
    <div class="hot-phone"> <i></i> <span class="js-change-phone">400-877-9288</span> </div>
  </div>
</div>
<ul class="navmenu">
  <li class="active"><a href="index.jsp">首页</a><span></span></li>
  <li><a href="list.jsp">我要租车</a><span></span></li>
  <li><a href="#">关于小二</a><span></span></li>
  <li><a href="#">常见问题</a><span></span></li>
  <li><a href="#">英才加盟</a><span></span></li>
</ul>
<div class="clear_fix"></div>
<!--所在位置-->
<div class="crumbp"> <a href="#">首页</a> <em>&gt;</em> <span>订单页面</span></div>
<div class="mainbox"> 
  
  
  <!--订单信息-->
  <div id="config">
    <div class="titles">
      <h2>订单总价:${money}元</h2>
    </div>
 
    <div class="ca-table">
      <form class="dForm" method="post">
      <table>
        <tbody>
          <tr>
            <td class="ca-td1">订单号：</td>
            <td> ${order_take_cars.order_no}</td>
            <td class="ca-td1">租车人</td>
            <td>${order_take_cars.user_real_name}</td>            
          </tr>
          
          <tr>
            <td class="ca-td1">租期</td>
            <td>${day}天</td>
            <td class="ca-td1">证件号码：</td>
            <td>${order_take_cars.user_idcard}</td>          
          </tr>
         </tbody>
      </table>
      </form>
    </div>
  </div>
  
  <div id="config">
    <div class="titles">
      <h2>车辆基本信息</h2>
    </div>
 
    <div class="ca-table">      
      <table>
        <tbody>
          <tr>
            <td colspan="2" rowspan="2">
            
             <table>
                <tr>
                <td>
                <img src="<%=path%>/images/car3.jpg" weight="200px">
                </td>
                </tr>
                <tr> 
                <td>
                  <div class="item-box" text_align="center">
          			    <div class="itemlist rightline">
            				<p>${cars.car_name}</p>
          				</div>
          				<div class="itemlist rightline">
           				 	<p>${cars.car_type}</p>
          				</div>
          				<div class="itemlist rightline">
            				<p>乘坐${cars.seating}人</p>
          				</div>
          			</div>
                  </td>
                </tr>
             </table>
            </td> 
            <td class="ca-td1">取车时间：</td>
            <td>${ordercars.order_start_time}</td>
            <td class="ca-td1">取车地点：</td>
            <td>${ordercars.tack_address}</td>          
          </tr>          
          <tr>           
           <td class="ca-td1">还车时间：</td>
            <td>${ordercars.order_end_time}</td>
            <td class="ca-td1">还车地点：</td>
            <td>${ordercars.return_address}</td>                 
          </tr>         
         
        </tbody>
      </table>
     
    </div>
  </div>
  
  
  
  <!--费用明细信息-->
  <div id="config">
    
 
    <div class="ca-table">      
      <table>
        <tbody>
          <tr>
            <td>
            <!--<button type="submit" value="submit" class="b-r orange">提交</button>-->
             <div class="order_button"> <span  class="wanttoprice orderbut" id="sendMESS"><a href="javascript:void(0);" onclick="validate()">确认信息</a></span> </div>
            </td>
          </tr>
        </tbody>
      </table>
      </form>
    </div>
  </div>
  
  <div id="picture"> 
   
    <div class="clear_fix"></div>
  <!--猜你喜欢-->
  <div class="titles">
    <h2>猜你喜欢</h2>
  </div>
  <ul class="carList">
    <li>
      <div class="list-infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" target="_blank" class="imgtype" href="#"> <img width="290" height="194" src="<%=path%>/images/carimg.jpg" alt="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版"> </a>
        <p class="infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" href="#" target="_blank" class="info-title">奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版</a> </p>
        <p class="fc-gray"> <span class="tag-gray">石家庄</span> <span class="">2014年11月上牌</span> <em class="shuxian">|</em> 行驶2.4万公里 </p>
        <p class="priType-s"> <span> <i class="fc-org priType"> ¥190/日均 </i> </span> </p>
      </div>
    </li>
    <li>
      <div class="list-infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" target="_blank" class="imgtype" href="#"> <img width="290" height="194" src="<%=path%>/images/carimg.jpg" alt="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版"> </a>
        <p class="infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" href="#" target="_blank" class="info-title">奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版</a> </p>
        <p class="fc-gray"> <span class="tag-gray">石家庄</span> <span class="">2014年11月上牌</span> <em class="shuxian">|</em> 行驶2.4万公里 </p>
        <p class="priType-s"> <span> <i class="fc-org priType"> ¥190/日均 </i> </span>  </p>
      </div>
    </li>
    <li>
      <div class="list-infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" target="_blank" class="imgtype" href="#"> <img width="290" height="194" src="<%=path%>/images/carimg.jpg" alt="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版"><i class="sup-yellow"> <em></em> 急降<br>
        200元 </i> </a>
        <p class="infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" href="#" target="_blank" class="info-title">奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版</a> </p>
        <p class="fc-gray"> <span class="tag-gray">石家庄</span> <span class="">2014年11月上牌</span> <em class="shuxian">|</em> 行驶2.4万公里 </p>
        <p class="priType-s"><em class="tag-blue">里程少</em> <span> <i class="fc-org priType"> ¥190/日均  </i> </span> </p>
      </div>
    </li>
    <li>
      <div class="list-infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" target="_blank" class="imgtype" href="#"> <img width="290" height="194" src="<%=path%>/images/carimg.jpg" alt="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版"> </a>
        <p class="infoBox"> <a title="奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版" href="#" target="_blank" class="info-title">奇瑞QQ3 2012款 QQ3 0.8 手动 梦想版</a> </p>
        <p class="fc-gray"> <span class="tag-gray">石家庄</span> <span class="">2014年11月上牌</span> <em class="shuxian">|</em> 行驶2.4万公里 </p>
        <p class="priType-s"> <em class="tag-red">急售</em> <em class="tag-green">准新车</em> <em class="tag-yellow">超值</em> <span> <i class="fc-org priType"> ¥190/日均 </i> </span> </p>
      </div>
    </li>
  </ul>
  <div class="clear_fix"></div>
 
</div>


<div class="clear_fix"></div>
<!--底部-->
<div class="ftWrap">
  <div class="foot">
    <div class="cent">
      <div class="relate">
        <div class="items">
          <div class="tit"><i class="icon-angle-right"></i>交易帮助</div>
          <div class="con"> <a href="#">租车帮助</a> <a href="#">卖车帮助</a> <a href="#">过户帮助</a> </div>
        </div>
        <div class="items">
          <div class="tit"><i class="icon-angle-right"></i>客服中心</div>
          <div class="con"> <a href="abut.html">网站合作</a> <a href="about.html">关于我们</a> <a href="contact.html">联系我们</a> </div>
        </div>
        <div class="items">
          <div class="tit"><i class="icon-angle-right"></i>购车指南</div>
          <div class="con"> <a href="#">购车帮助</a></div>
        </div>
        <div class="app-section"> <img class="<%=path%>/js-delayed-img"  src="<%=path%>/images/f_wx.jpg">
          <div class="title">扫码关注微信</div>
          <p> 随时随地，秒杀好车<br />
            优质个人二手车 </p>
        </div>
        <div class="items last">
          <div class="tel">
            <h1>400-877-9288</h1>
            <p>周一至周日 8:00-18:00</p>
            <p>免费咨询(咨询、建议、投诉)</p>
            <a href="#" class="kf"><i class="kf-icon"></i>在线客服</a> </div>
          <div class="tel-mb">
            <p><span>400-710-8886</span>周一至周日 8:00-18:00(仅收市话费)</p>
            <a href="#" class="kf"><i class="kf-icon"></i>在线客服</a> </div>
        </div>
      </div>
    </div>
  </div>
  <div class="copyright">
    <div class="cent"> Copyright © 2016-2017, snncar.com,All Rights Reserved 皖ICP备16022456号-1</div>
  </div>
</div>
<script type="text/javascript" src="<%=path%>/script/3c-menu.js"></script> 
<script type="text/javascript" src="<%=path%>/script/lg_reg.js"></script> 
<!--会员登录和注册弹出框开始-->
<div id="popBox">
  <div class="popCont"> <a class="p_closed">关闭</a>
    <div class="p-tab"> <a>会员登录<i></i></a><a>会员注册<i></i></a> </div>
    <div class="p-detail">
      <div class="p-dl">
        <form onsubmit="return check();" enctype="multipart/form-data" method="post" name="form" id="form">
          <ul class="login-items">
            <li>
              <label>用户名(手机号)</label>
              <input class="input" type="text" value="" maxlength="32"  name="username" placeholder="请输入您的手机号">
            </li>
            <li>
              <label>密码</label>
              <input class="input" type="password" value="" maxlength="16"  name="password">
            </li>
          </ul>
          <div class="login-check">
            <input type="checkbox" name="checkbox" style=" width:auto;" />
            <label>记住我</label>
            <a href="Meet/editPass">忘记登录密码？</a> </div>
          <div class="login-button">
            <input type="hidden" value="" name="carid" class="ordercarid" />
            <input type="hidden" value="" name="carstatus" class="orderstatus" />
            <input type="button"  value="登&nbsp;&nbsp;&nbsp;&nbsp;陆" class="fM" onclick="$('#form').submit()" />
          </div>
        </form>
      </div>
      <div class="p-dl">
        <form class="registForm" onsubmit="return regcheck();" enctype="multipart/form-data" method="post" name="reg" id="reg">
          <ul class="login-items">
            <li class="clearfix">
              <input class="input" name="mobile" id="mobile" type="text" value="" placeholder="手机号码（登录帐号）">
            </li>
            <li class="clearfix">
              <input class="input left" type="text" value=""  name="verify" placeholder="输入验证码" style="width:100px;" />
              <div id="send"><a href="#" class="send_code right">获取验证码</a></div>
            </li>
            <li class="clearfix">
              <input class="input" type="text" value=""  name="realname" placeholder="姓名">
            </li>
            <li class="clearfix sex">
              <input type="radio" checked="" name="gender" value="M" />
              男&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="radio" name="gender" value="F" />
              女 </li>
            <li class="clearfix">
              <input id="" class="input" type="password" name="password" value="" placeholder="输入密码（六位字符）">
            </li>
          </ul>
          <div class="login-button">
            <input type="hidden" value="" name="carid" class="ordercarid" />
            <input type="hidden" value="" name="carstatus" class="orderstatus" />
            <input type="button"  value="立即注册" class="fM" onclick="$('#reg').submit()" />
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>