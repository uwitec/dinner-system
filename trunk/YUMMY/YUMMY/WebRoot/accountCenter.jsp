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
body {
	font-family: Verdana;
	font-size: 12px;
	line-height: 1.5;
}

a {
	color: #000;
	text-decoration: none;
}

a:hover {
	color: #F00;
}

#menu {
	border: 1px solid #CCC;
	height: 26px;
	background: #eee;
}

#menu ul {
	list-style: none;
	margin: 0px;
	padding: 0px;
}

#menu ul li {
	float: left;
	padding: 0px 8px;
	height: 26px;
	line-height: 26px;
}
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

<body  background="picture/test/background.jpg">
	<div id="menu">
		<ul>
		<li class="logo"><a href="index.jsp"><img src="picture/logo.jpg" width="90" height="22"></a></li>
			<li class="home"><a href="index">Yummy首页</a>
			</li>
			<li class="shoucang"><a href="collection.jsp">我的收藏</a>
			</li>
			<li class="shoppingCart"><a href="addToCart">我的购物车<s:property value="highQualifiedFoodsList.size()" />
			</a>
			</li>
		</ul>
	</div>
	<title>Insert title here</title>
</head>
<body>
	<h1>我的账户</h1>
	<hr>
	<h2>正在进行的订单：</h2>
	<br>

	<c:forEach var="orderDetails" items="${currentOrders}">
		<table border=1>
			<tr>
				<td>餐厅名字</td>
				<td>总价格</td>
				<td>订餐时间</td>
			</tr>
			<tr>
				<td><a href="shopDetails?shopname=${orderDetails.shopname}">${orderDetails.shopname}</a>
				</td>
				<td>${orderDetails.totalPrice}</td>
				<td>${orderDetails.time}</td>
		</table>
		<table border="1">
			<c:forEach var="item" items="${orderDetails.items}">
				<tr>
					<td>食物</td>
					<td>数量</td>
				</tr>
				<tr>
					<td><a href="foodDetails?id=${item.id}">${item.itemname}</a>
					</td>
					<td>${item.orderCount}</td>
				</tr>
			</c:forEach>
		</table>
		<hr>
	</c:forEach>

	<hr>
	<hr>
	<hr>
	<h2>已经完成的订单</h2>

</body>
</html>