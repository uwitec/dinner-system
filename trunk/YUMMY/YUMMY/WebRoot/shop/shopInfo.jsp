<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="com.yummy.dao.impl.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的餐厅</title>
</head>
<body>
	<h1>我的餐厅</h1>
	<a href="index.jsp"><img src="picture/logo.jpg" width="250"
		height="88">
	</a>
	<%
		Boolean readOnly = (Boolean) request.getAttribute("ReadOnly");
		if (readOnly == null)
			readOnly = false;
		if (readOnly) {
			//	Shop myShop = (Shop)request.getAttribute("MyShop");
	%>
	<!-- 
 餐厅名称：$(myShop.shopname);
 餐厅logo：$(myShop.logo);
 餐厅介绍：$(myShop.introdution);
 地址：$(myShop.address);
 电话：$(myShop.telephone);
 QQ:$(myShop.qq);
 服务范围：$(myShop.deliveryRange); -->

	<table>
		<tr>
			<td>餐厅名称：</td>
			<td>
				<!--   <s:property value="#attr.myShop.shopname"/>-->
				${shop_on.shopname }</td>
		</tr>
		<tr>
			<td>餐厅logo：</td>
			<td>
				<!--   <img alt="logo" src="<s:property value="#attr.myShop.logo"/>" >-->
				<img alt="logo" src="${shop_on.logo}"></td>
		</tr>
		<tr>
			<td>餐厅介绍：</td>
			<td>
				<!--    <s:property value="#attr.myShop.introduction"/>-->
				${shop_on.introduction }</td>
		</tr>
		<tr>
			<td>餐厅地址：</td>
			<td>
				<!--    <s:property value="#attr.myShop.address"/>-->
				${shop_on.address}</td>
		</tr>
		<tr>
			<td>电话：</td>
			<td>
				<!--   <s:property value="#attr.myShop.telephone"/>-->
				${shop_on.telephone}</td>
		</tr>
		<tr>
			<td>QQ:</td>
			<td>
				<!--    <s:property value="#attr.myShop.qq"/>--> ${shop_on.qq }</td>
		</tr>
		<tr>
			<td>服务范围：</td>
			<td>
				<!--    <s:property value="#attr.myShop.deliveryRange"/>-->
				${shop_on.deliveryRange }</td>
		</tr>
		<tr>
			<td><a href="./updateShopInfo.jsp">修改</a>
			</td>
		</tr>
	</table>

	<%
		} else {
	%>
	<h3>还没有填写餐厅信息,马上去填写吧</h3>
	<a href="./addShopInfo.jsp">编辑我的餐厅</a>
	<%} %>
</body>
</html>