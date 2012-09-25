<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	<ul><li class="logo"><a href="index.jsp"><img src="picture/logo.jpg" width="90" height="22"></a></li>
        <li class="home"><a href="index">Yummy首页</a></li>
        <li class="shoucang"><a href="collection.jsp">我的收藏</a></li>     
        <li class="MyYummy"><a href="accountCenter.jsp">我的Yummy账户</a></li>
        <li class="login"><a href="login.jsp">登录</a></li>
        <li class="register"><a href="register.jsp">注册</a></li>
    </ul>
</div>
<title>Insert title here</title>
<body>
	<h1>购物车</h1>
	<hr>
	<table border=1>
		<tr>
			<td>物品名称</td>
			<td>图片</td>
			<td>物品价格</td>
			<td>数量</td>
			<td>修改数量</td>
		</tr>
		<c:forEach var="item" items="${items}">
			<tr>
				<td><a href="foodDetails?id=${item.id}">${item.itemname}</a></td>
				<td><a href="foodDetails?id=${item.id}"><img src="${item.picPath}" /></a></td>
				<td>${item.price}</td>
				<td>${item.orderCount}</td>
				<form action="addToCart" method="post">
						<input type="hidden" name="id" value="${item.id}"/>
						<input type="hidden" name="type" value="update"/>
					<td><input name="orderCount" /></td>
					<td><input type="submit" value="确定"/></td>
				</form>
				<form action="addToCart" method="post">
						<input type="hidden" name="id" value="${item.id}"/>
						<input type="hidden" name="type" value="delete"/>
					<td><input type="submit" value="删除"/></td>
				</form>
			</tr>
		</c:forEach>
	</table>
	<hr>
		<%
			Float totalPrice = (Float)session.getAttribute("totalPrice");
			if (totalPrice != null) {
				out.println("总金额是： " + totalPrice);
			}
		 %>
		 	<form action="addToCart" method="post">
		 			<input type="hidden" name="type" value="removeAll"/>
					<td><input type="submit" value="清空购物车"/></td>
		 	</form>
	<hr>
	<form action=" takeOrder" method="post">
		<input type="submit" value="去结算"/>
		<!-- <input type="reset" value="继续看看"/> --> <a href="#" onclick="history.back()">继续看看</a>
	</form>
	
</body>
</html>