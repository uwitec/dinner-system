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

	<h1>购物车</h1>
	<hr>
	<table border=1>
		<tr>
			<td>物品名称</td>
			<td>图片</td>
			<td>物品价格</td>
			<td>数量</td>
		</tr>
		<c:forEach var="item" items="${items}">
			<tr>
				<td><a href="foodDetails?id=${item.id}">${item.itemname}</a></td>
				<td><a href="foodDetails?id=${item.id}"><img src="${item.picPath}" /></a></td>
				<td>${item.price}</td>
				<td>${item.orderCount}</td>
				<form action="" method="post">
					<td><input name="newOrderCount" /></td>
					<td><input type="submit" value="确定"/></td>
				</form>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<form>
		<input type="submit" value="去结算"/>
		<input type="reset" value="继续看看"/>
	</form>
</body>
</html>