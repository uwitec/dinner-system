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
	<a href="login.jsp">登陆</a>
	<br>
	<a href="register.jsp">注册</a>
	<br>
	<form action="search">
		<input name="searchItem">能否在输入框给点提示呀！！！
	</form>
	<br>
	<a href="shoppingCart.jsp">我的篮子</a>
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
			<td>物品价格</td>
			<td>评分</td>
			<td>所属店</td>
		</tr>
		<c:forEach var="item" items="${highQualifiedFoodsList}">
			<tr>
				<td><a href="dishDetails.jsp?id=${item.dishId}">${item.name}</a>
				</td>
				<td>${item.price}</td>
				<td>${item.point}</td>
				<td>${item.shopname}</td>
		</c:forEach>
	</table>



</body>
</html>
