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
	<hr>
	<h2>搜索到的食物</h2>
		<table border=1>
		<tr>
			<td>食物名称</td>
			<td>食物价格</td>
		</tr>
		<c:forEach var="item" items="${searchFoods}">
			<tr>
				<td><a href="dishDetails.jsp?id=${item.dishId}">${item.name}</a>
				</td>
				<td>${item.price}</td>
		</c:forEach>
	</table>
	
	<hr>
	<h2>搜索到店铺</h2>
		<table border=1>
		<tr>
			<td>物品名称</td>
		</tr>
		<c:forEach var="item" items="${searchShops}">
			<tr>
				<td><a href="dishDetails.jsp?id=${item.shopname}">${item.shopname}</a>
				</td>
		</c:forEach>
	</table>
	
</body>
</html>