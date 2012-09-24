<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>搜索页面</h1>
		 <a href="index.jsp"><img src="picture/logo.jpg" width="250" height="88"></a>	
	<hr>
	<h2>搜索到的食物</h2>
		<table border=1>
		<tr>
			<td>食物名称</td>
			<td>食物价格</td>
			<td>店铺</td>
		</tr>
		<c:forEach var="item" items="${searchFoods}">
			<tr>
				<td><a href="dishDetails.jsp?id=${item.dishId}">${item.name}</a></td>
				<td>${item.price}</td>
				<td>${item.shop.shopname}</td>
		</c:forEach>
	</table>
	
	<hr>
	<h2>搜索到店铺</h2>
		<table border=1>
		<tr>
			<td>店铺</td>
			<td>联系电话</td>
			<td>配送范围</td>
			<td>简介</td>
		</tr>
		<c:forEach var="item" items="${searchShops}">
			<tr>
				<td><a href="dishDetails.jsp?id=${item.shopname}">${item.shopname}</a></td>
				<td>${item.telephone}</td>
				<td>${item.deliveryRange}</td>
				<td>${item.introduction}</td>
		</c:forEach>
	</table>
	
</body>
</html>