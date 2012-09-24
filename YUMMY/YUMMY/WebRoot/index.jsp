<%@page import="java.sql.Blob"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>在线点餐系统</title>
<meta name="description" content="全宇宙最大、最安全的网上订餐系统，无污染，无残留，方便，有趣！" />
	<meta name="keywords" content="订餐，外卖，美食，粥粉面饭，菜单，店铺" />
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<style type="text/css">
body { font-family: Verdana; font-size: 12px; line-height: 1.5; }
a { color: #000; text-decoration: none; }
a:hover { color: #F00; }
#menu { border: 1px solid #CCC; height:26px; background: #eee;}
#menu ul { list-style: none; margin: 0px; padding: 0px; }
#menu ul li { float:left; padding: 0px 8px; height: 26px; line-height: 26px; }
</style>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body  background="text/background.jpg">
<div id="menu">
	<ul>
        <li class="home"><a href="http://？/">Yummy首页</a></li>
        <li class="shoucang"><a href="http://?/">我的收藏</a></li>     
        <li class="shoppingCart"><a href="">我的购物车</a></li>
        <li class="MyYummy"><a href="accountCenter.jsp/">我的Yummy账户</a></li>
        <li class="login"><a href="login.jsp">登录</a></li>
        <li class="register"><a href="register.jsp">注册</a></li>
    </ul>
        </div>
	 <a href="index.jsp"><img src="picture/logo.jpg" width="250" height="88"></a>						                                                                                         
	<br>
	<form action="search">
	    <label for="searchItem">输入您想要的宝贝</label>
		<input name="searchItem" id="searchItem" autocomplete="off" accesskey="s" />
		<input type="button" id="search" value="搜索" />
	</form>
	<br>

	<br>
	<a href="accountCenter.jsp">我的账户</a>
	<br>
	<a href="giftCenter.jsp">礼品中心</a>
	<hr>
	<s:property value="highQualifiedFoodsList.size()" />
	<hr>


	<table border=1>
		<tr>
			<td>物品名称</td>
			<td>图片</td>
			<td>物品价格</td>
			<td>评分</td>
			<td>所属店</td>
		</tr>
		<c:forEach var="dish" items="${highQualifiedFoodsList}">
			<tr>
				<td><a href="foodDetails?id=${dish.dishId}">${dish.name}</a>
				</td>
				<td><a href="foodDetails?id=${dish.dishId}"><img src="${dish.picOne}"/></a></td>
				<td>${dish.price}</td>
				<td>${dish.point}</td>
				<td><a href="shopDetails?shopname=${dish.shop.shopname}">${dish.shop.shopname}</a></td>
				<form action="addToCart" method="get">
						<input type="hidden" name="type" value="add"/>
						<input type="hidden" name="id" value="${dish.dishId}"/>
						<input type="hidden" name="shopname" value="${dish.shop.shopname}"/>
						<input type="hidden" name="itemname" value="${dish.name}"/>
						<input type="hidden" name="picPath" value="${dish.picOne}"/>
						<input type="hidden" name="price" value="${dish.price}"/>
					<td><input name="orderCount"/></td>
					<td><input type="submit" value="加入"/></td>
				</form>
				</c:forEach>
	</table>



</body>
</html>
