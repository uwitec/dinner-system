<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>在线点餐系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <a href="login.jsp">登陆</a> <br>
    <a href="register.jsp">注册</a> <br>
    <input name="search"><a href="search.jsp">搜索</a><br>
    <a href="shoppingCart.jsp">我的篮子</a><br>
    <a href="accountCenter.jsp">我的账户</a><br>
    <a href="giftCenter.jsp">礼品中心</a>
    <hr>
    
  </body>
</html>
