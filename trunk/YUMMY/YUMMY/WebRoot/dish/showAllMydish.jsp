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
<table>
<% int i=0; %>
<c:forEach var="dish_ite" items="${dishList}">
<% if(i%4==0){ %>
<tr>
<%} %>
<td>
<a href="updateMyDish?dishId=${dish_ite.dishId}" id="enter"><img src="${dish_ite.picOne}"><br>${dish_ite.name}&nbsp;&nbsp;&nbsp;${dish_ite.price}&nbsp;&nbsp;&nbsp;<span id="change_btn"></span></a>
</td>
<% if((i+5)%4==0){ %>
</tr>
<%}

i++; %>
</c:forEach>
</tr>
</table>
</body>
</html>