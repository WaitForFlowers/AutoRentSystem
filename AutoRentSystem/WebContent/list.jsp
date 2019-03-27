<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>小二租车</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css"/>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/home.css"/>
<link rel="stylesheet" type="text/css" href="<%=path %>/city/city.css">
<script type="text/javascript" src="<%=path %>/script/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="<%=path %>/script/home_ban.js"></script>
<script type="text/javascript" src="<%=path %>/script/eg_top_search.js"></script>
<script type="text/javascript" src="<%=path %>/script/city.js"></script>
<script type="text/javascript" src="<%=path %>/script/snncar.js"></script>
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
<!--导航登陆网页版下拉-->
<script type="text/javascript">
$(function () {
	var setTime;
	$(".egc-top .nav-cent .operate").hover(function () {
		var _this = $(this);
		setTime = setTimeout(function () {
			_this.find(".sec-version").slideDown(200);
			_this.find("i").removeClass("icon-angle-down").addClass("icon-angle-up");
		}, 200);
	}, function () {
		if (setTime) {
			clearTimeout(setTime);
		}
		$(".egc-top .nav-cent .sec-version").slideUp(200);
		$(".egc-top .nav-cent .operate i").removeClass("icon-angle-up").addClass("icon-angle-down");
	});
});
</script>

<!--点击确定筛选-->
<script type="text/javascript">
$(function(){
	 var brand;
	   var serial;
	$("input[id='submit']").click(function(){
		console.log("%%%%%%%%%%%%%%%%%%%%$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	   $("a[id='brand']").parent().find("a").each(function(i,element){
		  
		  if($(this).attr("class")=="on")
			  {
			 brand =$(this).attr("title");
			  console.log("brand*************:"+brand);
			  }
	  })
	  
	  $("a[id='serial']").parent().find("a").each(function(i,element){
		  if($(this).attr("class")=="on")
			  {
			 serial =$(this).attr("title");
			  }
	  })
	  console.log("brand:"+brand);
	   console.log("serial:"+serial);
      var type=null;
      if(brand=='不限'){
    	  brand==null;
      }
      window.location.href="<%=path%>/rent/findlist.do?brand="+brand+"&serial="+serial+"&type="+type;
<%-- 	  $.ajax({
			dataType:"json",
		   type: "GET",
	 	   url: "../rent/findlist.do",
		   data: "brand="+brand+"&serial="+serial+"&type="+type,
		   success: function(data){
			   alert(data);
			   console.log("fer");
			   console.log($(".carList").html());
			   for(var i=0;i<data.length;i++){
				   $(".carList").prepend("<li><div class='list-infoBox'><img width='290' height='194' src ="+data[i].car_src+" alt="+data[i].car_name+"><p class='infoBox'>"+data[i].car_name+ data[i].car_brand+ data[i].car_type+ data[i].car_desc+"</p>"
			                 +"<p class='infoBox'>"+data[i].car_name+ data[i].car_brand+ data[i].car_type+ data[i].car_desc+"</p>"
			            	  +"<p class='fc-gray'> <span class='tag-gray'><a href='"+<%=path%>+"/rent/findlist.do/"+data[i].id+">租车</a></span> <span class=''>"+data[i].updown_state+"</span> <em class='shuxian'>|</em> 行驶2.4万公里 </p>"
			                  +"<p class='priType-s'> <span> <i class='fc-org priType'>"+data[i].normal_price+"/日均 </i> </span>  </p>"
			                  +"</div></li>");

				
			   }
			  /*  var jsonData = JS.parse(data);
			   console.log("jsonData.result: "+jsonData);
			   for(var i=0;i<jsonData;i++){
				   console.log("jsonData[i]: "+jsonData[i]);
			   } */
	  	   }
	});  --%>

	});
	
	
})
</script>
<script type="text/javascript">
	$(document).ready(function(){
		$("a[id='brand']").click(function(){
			
			});
		});
</script>
<!--点击车辆信息筛选-->
<script type="text/javascript">
$(function(){
	$("a[id='brand']").click(function(){
		
		var brand = $(this).attr('title');
		console.log("brand  "+brand);
		$.ajax({
				dataType:"json",
			   type: "GET",
		 	   url: "../rent/brand.do",
			   data: "brand="+brand,
			   success: function(data){
				   $(".clickTagWidget").empty();
				   for(var i=0;i<data.length;i++){					   
						   $(".clickTagWidget").prepend(
							"<a id='serial' class='off' title="+data[i]+">"+data[i]+"</a>");
					  }
				   //$.parser.parse(".clickTagWidget");
				   }
		  	   });
		
		 console.log("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		   var brand1=$(this).text();
		   $(".sel-a").after(brand1);
		   $(this).parent().find("a").attr("class","off");
		   $(this).attr("class","on");

		});   
		
		$("a[id='serial']").click(function(){
			console.log("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%serial");
			 var serial = $(this).text();
			$(".sel-a").after(serial);
			$(this).parent().find("a").attr("class","off");
			 $(this).attr("class","on"); 
		});
		
		$(".ctype").click(function(){
			var type = $(this).text();
			$(".sel-a").after(type);
		}); 	
})

</script>


<script type="text/javascript">
	$(function(){
		/* $("a[id='serial']").click(function(){
			console.log("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%serial");
			/* 
		}); */
		
		$(".clickTagWidget").on('click',"[id='serial']",function(){
			console.log("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%serial");
			var serial = $(this).text();
			$(".sel-a").after(serial);
			$(this).parent().find("a").attr("class","off");
			 $(this).attr("class","on"); 
		});
	});
</script>

<!--底部信息下拉-->
<script type="text/javascript">
$(function () {
	var wind_wd = $(window).width();
	if(wind_wd<=735){
		/* $submenu.first().delay(400).slideDown(700);*/
			$('.relate .tit').on('click', function() {
			$(this).next('.con').slideToggle()
			$(this).parent().siblings('.items').find('.con').slideUp();
			});
		}else{
			 $('.relate .tit').unbind("click");
			 $('.relate .con').show();
			}
	$(window).resize(function(){
 		var wind_wd = $(window).width();
		if(wind_wd<=735){
		/* $submenu.first().delay(400).slideDown(700);*/
			$('.relate .tit').on('click', function() {
			$(this).next('.con').slideToggle()
			$(this).parent().siblings('.items').find('.con').slideUp();
			});
		}else{
			 $('.relate .tit').unbind("click");
			 $('.relate .con').show();
			}
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
<!--下拉导航关闭-->
<script type="text/javascript">
$(function () {
 $('.menu-mb i').click(function() { 
   $(".navigation-mb-list").slideDown(300);
 }); 
 $('.navigation-mb-list .list-close-btn').click(function() { 
   $(".navigation-mb-list").slideUp(300);
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
</script>
<script type="text/javascript">
$(function () {
	var scroll_heitht = $('body').offset().top;
	var isShow = true;
	$(window).scroll(function () {
       if ($(window).scrollTop() > scroll_heitht && isShow) {
			 $('.stress-search-box').slideDown(200);
       }else{
		   $('.stress-search-box').slideUp(200);
		   }
       });
   $('.stress-close a').click(function(){
	   isShow=false;
	   $('.stress-search-box').slideUp(200).unbind(window,aa);
	   });
});
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
    <div class="logo"><a href="<%=path%>/index.jsp"><img src="<%=path%>/images/logo.png" width="240" /></a></div>
    <div class="city"> <span id="DY_site_name" class="red city-name Left">西安</span>
      <div id="JS_hide_city_menu_11" class="city-select cut_handdler Left"> <a href="javascript:void(0);" class="common-bg selector">切换城市</a>
        <div id="JS_header_city_bar_box" class="hide_city_group">
          <div class="hideMap">
            <div class="showPanel clearfix">
              <div class="Left mycity">
                <div id="JS_current_city_box"> 当前城市：<strong id="JS_city_current_city">西安</strong> </div>
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
  <li><a href="<%=path%>/list.jsp">我要租车</a><span></span></li>
  <li><a href="wymc.jsp">关于小二</a><span></span></li>
  <li><a href="#">常见问题</a><span></span></li>
  <li><a href="#">英才加盟</a><span></span></li>
</ul>
<div class="clear_fix"></div>
<div class="stress-search-box row">
  <div class="stress-close"><a href="javascript:;"></a></div>
  <div class="nav-cents">
    <ul>
      <li class="logo"><a href="index.jsp"><img src="<%=path%>/images/logo.png"  width="180"/></a></li>
      <li><a href="index.jsp">首页</a></li>
      <li><a href="<%=path%>/list.jsp">我要租车</a><span></span></li>
      <li><a href="wymc.html">关于小二</a><span></span></li>
      <li><a href="#">常见问题</a><span></span></li>
      <li><a href="#">英才加盟</a><span></span></li>
    </ul>
    <div class="seas">
      <div class="egc-sea-box">
        <input type="text" class="sea-ipt-txt" placeholder="搜索您想要租的车">
        <a href="#" class="search-btn">搜索</a> </div>
    </div>
  </div>
</div>
<div class="clear_fix"></div>
<!--所在位置-->
<div class="crumbp"> <a href="#">首页</a> <em>&gt;</em> <span>我要租车</span> </div>
<div class="mainbox"> 
  <!--搜索条件-->
  <div class="comfilter-bd">
    <div class="filterBox">
      <dl class="fliter-bd clearfix">
        <dt>品牌：</dt>
        <dd class="clickBrandWidget"> 
         <a class="on" id="bx" href="#">不限</a>
         <c:choose>
        	<c:when test="${empty brandList }">
            	no brand!
            </c:when>
            <c:otherwise>
            	<c:forEach items="${brandList}" var="b">
            	 <a id="brand" class="off" title="${b}"> ${b}</a>
            	</c:forEach>
            	
            </c:otherwise>
            </c:choose>

        
        </dd>
      </dl>
      <dl class="fliter-bd clearfix">
        <dt>车系：</dt>
        <dd class="clickTagWidget">
        	  <a class="on" href="#">不限</a>
        	  <c:choose>
        	<c:when test="${empty serialList }">
            	no brand!
            </c:when>
            <c:otherwise>
            	<c:forEach items="${serialList }" var="s">
            		 <a  class="off" id="serial"  title="${s}"> ${s}</a>
            	</c:forEach>
            </c:otherwise>
            </c:choose>
      
        </dd>
      </dl>
     
     
      <div class="moreitem clearfix">
        <span>更多：</span>
        <dl class="selecter">
		<dt>车型</dt>
			<dd class="type">
				<ul>
				<li> <a class="on" href="#">不限</a></li>
				 <c:choose>
					<c:when test="${empty typeList }">
						<li>no brand!</li>
					</c:when>
					<c:otherwise>
						<c:forEach items="${typeList }" var="t">
							<li><a class="ctype" href="javascript:void(0);">${t}</a></li>
						</c:forEach>
					</c:otherwise>
					</c:choose>
				</ul>
			</dd>
		</dl>
    <dl class="selecter">
		<dt>座位</dt>
		<dd>
			<ul>
				<li><a href="javascript:void(0);">不限</a></li>
				<li><a href="javascript:void(0);" > 2座 </a></li>
				<li><a href="javascript:void(0);"> 4座 </a></li>
				<li><a href="javascript:void(0);"> 5座 </a></li>
				<li><a href="javascript:void(0);"> 6座 </a></li>
				<li><a href="javascript:void(0);"> 7座及以上 </a></li>
			</ul>
		</dd>
	</dl>
    <dl class="selecter">
		<dt>行驶里程</dt>
		<dd>
			<ul>
				<li><a href="javascript:void(0);">不限</a></li>
				<li><a href="javascript:void(0);"> 1万公里内 </a></li>
				<li><a href="javascript:void(0);"> 3万公里内 </a></li>
				<li><a href="javascript:void(0);"> 5万公里内 </a></li>
				<li><a href="javascript:void(0);"> 5万公里以上 </a></li>
			</ul>
		</dd>
	</dl>
   
   
    <dl class="selecter">
		<dt>颜色</dt>
		<dd>
			<ul>
				<li><a href="javascript:void(0);">不限</a></li>
				<li><a href="javascript:void(0);"> <i class="c-lump03"></i>黑色 </a> </li>
				<li><a href="javascript:void(0);"> <i class="c-lump04"></i>白色 </a></li>
				<li><a href="javascript:void(0);"> <i class="c-lump10"></i>银灰色 </a></li>
				<li><a href="javascript:void(0);"> <i class="c-lump09"></i>红色 </a> </li>
                <li><a href="javascript:void(0);"> <i class="c-lump15"></i>深灰色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump11"></i>橙色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump02"></i>绿色 </a></li>
                <li><a href="javascript:void(0);" > <i class="c-lump05"></i>蓝色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump06"></i>咖啡色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump07"></i>紫色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump08"></i>香槟色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump12"></i>多彩色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump13"></i>黄色 </a></li>
                <li><a href="javascript:void(0);"> <i class="c-lump14"></i>其它 </a></li>
			</ul>
		</dd>
	</dl>
   
      </div>
      
      <input type="button" id="submit" value="筛选"/>
     
    </div>
    
    
   <!--  <div class="sel-menu clearfix">
      <p class="sel-p">当前筛选&gt;</p>
      <a href="#"  class="sel-a">大众</a> <a href="#"  class="sel-reset">重置</a>
      <p class="sel-p">共为您找到<b>508</b>辆好车</p>
    </div> -->
  </div>
 
  <ul class="carList">
     
    
     <c:choose>
        	<c:when test="${empty carList}">
            	no car!
            </c:when>
            <c:otherwise>
            	<c:forEach items="${carList}" var="cl">
            	<li>
            	 <div class="list-infoBox">
                 <img width="290" height="194" src = "${cl.car_pic}" alt="${cl.car_name}">
            	 <p class="infoBox">${cl.car_name} ${cl.car_brand} ${cl.car_type} ${cl.car_desc}</p>
            	  <p class="fc-gray"> <span class="tag-gray"><a href="<%=path%>/rent/findone.do/${cl.id}.do">租车</a></span> <span class="">${cl.updown_state}</span> <em class="shuxian">|</em> 行驶2.4万公里 </p>
                  <p class="priType-s"> <span> <i class="fc-org priType">${cl.normal_price}/日均 </i> </span>  </p>
                  </div>
                  </li>
            	</c:forEach>
            	 
            </c:otherwise>
            </c:choose>
         
            

  </ul>
</div>
<div class="pages"> 
<p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
                页,总 ${pageInfo.total } 条记录</p>
        <a class="on" href="<%=path%>/rent/list.do?pageNo=${pageInfo.firstPage}">第一页</a>
        <c:if test="${pageInfo.hasPreviousPage }">
            <a href="<%=path%>/rent/list.do?pageNo=${pageInfo.pageNum-1}">上一页</a>
        </c:if>
      
        <c:if test="${pageInfo.hasNextPage }">
            <a href="<%=path%>/rent/list.do?pageNo=${pageInfo.pageNum+1}">下一页</a>
        </c:if>
        
        <a href="<%=path%>/rent/list.do?pageNo=${pageInfo.lastPage}">最后页</a>

</div>
<div class="clear_fix"></div>
<!--底部-->
<div class="ftWrap">
  <div class="foot">
    <div class="cent">
      <div class="relate">
        <div class="items">
          <div class="tit"><i class="icon-angle-right"></i>交易帮助</div>
          <div class="con"> <a href="#">买车帮助</a> <a href="#">卖车帮助</a> <a href="#">过户帮助</a> </div>
        </div>
        <div class="items">
          <div class="tit"><i class="icon-angle-right"></i>客服中心</div>
          <div class="con"> <a href="abut.html">网站合作</a> <a href="about.html">关于我们</a> <a href="contact.html">联系我们</a> </div>
        </div>
        <div class="items">
          <div class="tit"><i class="icon-angle-right"></i>购车指南</div>
          <div class="con"> <a href="#">购车帮助</a></div>
        </div>
        <div class="app-section"> <img class="js-delayed-img"  src="<%=path%>/images/f_wx.jpg">
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
<!--会员登录和注册弹出框结束--> 
<script>
$(function(){
	var t=null,$this,i=0;
	//品牌
	$(".brand-all").bind({
		mouseenter:function(){
			$(this).find(".otherbrand").show();
		},
		mouseleave:function(){
			$(this).find(".otherbrand").hide();
		}
	});
	
});
</script> 
<script type="text/javascript">
$(".hoverWidget").each(function() {
				$(this).mouseenter(function() {
					$(this).addClass("active")
				}).mouseleave(function() {
					$(this).removeClass("active")
				})
			});
</script>
<div id="leftsead">
	<ul>
	     <li>
			<a id="top_btn">
				<img src="<%=path%>/images/foot03/ll06.png" width="47" height="49" class="hides"/>
				<img src="<%=path%>/images/foot03/l06.png" width="47" height="49" class="shows" />
			</a>
		</li>

		<li>
			<a href="">
				<img src="<%=path%>/images/foot03/ll03.png"  width="47" height="49" class="hides"/>
				<img src="<%=path%>/images/foot03/l03.png" width="47" height="49" class="shows" />
			</a>
		</li>

		<li>
			<a href="">
					<img src="<%=path%>/images/foot03/ll02.png" width="166" height="49" class="hides"/>
				<img src="<%=path%>/images/foot03/l04.png" width="47" height="49" class="shows" />
			</a>
		</li>

		<li>
			<a class="youhui">
				<img src="<%=path%>/images/foot03/l02.png" width="47" height="49" class="shows" />
				<img src="<%=path%>/images/foot03/zfew.jpg" width="196" height="205" class="hides" usemap="#taklhtml"/>
			</a>
		</li>
	
	
	
	</ul>
</div><!--leftsead end-->


<script type="text/javascript">
$(document).ready(function(){

	$("#leftsead a").hover(function(){
		if($(this).prop("className")=="youhui"){
			$(this).children("img.hides").show();
		}else{
			$(this).children("img.hides").show();
			$(this).children("img.shows").hide();
			$(this).children("img.hides").animate({marginRight:'0px'},'slow'); 
		}
	},function(){ 
		if($(this).prop("className")=="youhui"){
			$(this).children("img.hides").hide('slow');
		}else{
			$(this).children("img.hides").animate({marginRight:'-143px'},'slow',function(){$(this).hide();$(this).next("img.shows").show();});
		}
	});

	$("#top_btn").click(function(){if(scroll=="off") return;$("html,body").animate({scrollTop: 0}, 600);});

});
</script>
<script type="text/javascript">
$(function(){
	$(".selecter").each(function(){
		var s=$(this);
		var z=parseInt(s.css("z-index"));
		var dt=$(this).children("dt");
		var dd=$(this).children("dd");
		var _show=function(){dd.slideDown(200);dt.addClass("cur");s.css("z-index",z+1);};   //展开效果
		var _hide=function(){dd.slideUp(200);dt.removeClass("cur");s.css("z-index",z);};    //关闭效果
		dt.click(function(){dd.is(":hidden")?_show():_hide();});
		dd.find("a").click(function(){dt.html($(this).html());_hide();});     //选择效果（如需要传值，可自定义参数，在此处返回对应的“value”值 ）
		$("body").click(function(i){ !$(i.target).parents(".selecter").first().is(s) ? _hide():"";});
	})
})
</script>
</body>
</html>