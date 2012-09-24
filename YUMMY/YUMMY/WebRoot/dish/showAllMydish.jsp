<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="./jquery-1.7.js"></script>
<script type="text/javascript" src="./dishInfo.js"></script>
</head>
<body>
<a href="/addMyDish.jsp">添加</a>
<table>
<tr>
<td>图片</td>
<td>名称</td>
<td>介绍</td>
<td>价格</td>
</tr>
<% int i=0; %>
<c:forEach var="dish_ite" items="${dishList}">
<tr>
<td><img src="${dish_ite.picOne}"></td>
<td><a href="updateMyDish?dishId=${dish_ite.dishId}" id="enter">${dish_ite.name}</a></td>
<td>${dish_ite.introduction}</td>
<td>${dish_ite.price}</td>
<td><a href="updateMyDish?dishId=${dish_ite.dishId}" >修改</a>
</td>
<td><a href="updateMyDish?dishId=${dish_ite.dishId}" >删除</a>
</td>
</tr>

</c:forEach>

</table>
</body>
</html>