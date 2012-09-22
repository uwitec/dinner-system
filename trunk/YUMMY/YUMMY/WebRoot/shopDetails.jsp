<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>店铺展示页面</title>
</head>
<body>
<h1>店铺展示页面</h1>
<hr>
	<table border=1>
		<tr>
			<td>店名</td>
			<td>图片</td>
			<td>简介</td>
			</tr>
		
			<tr>
				<td>${shop.shopname}</td>
				<td><img src="${shop.logo}" /></td>
				<td>${shop.introduction}</td>
	</table>
</body>
</html>