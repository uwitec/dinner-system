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
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
        <li class="home"><a href="index">Yummy首页</a></li>
        <li class="register"><a href="shopWorkerReg.jsp">注册</a></li>
        <li class="login"><a href="shop_login.jsp">登录</a></li>
        <li class=""><a href="shopManager.jsp">管理餐厅</a></li>     
    </ul>
</div>

<a href="shop/addShopInfo.jsp"><font size="15pt">添加餐厅信息</font></a><br>
<a href="shop/updateShopInfo.jsp"><font size="15pt">更新餐厅信息</font></a><br>
<a href="shop/shopInfo.jsp"><font size="20pt">显示餐厅信息</font></a><br>
<hr>
<a href="dish/addMyDish.jsp"><font size="15pt">上传食物</font></a><br>
<a href="dish/updateDish.jsp"><font size="15pt">更新食物信息</font></a><br>
<a href="dish/showMyDish.jsp"><font size="15pt">显示食物</font></a><br>
<a href="dish/showAllMydish.jsp"><font size="15pt">显示所有食物</font></a><br>

</body>
</html>
