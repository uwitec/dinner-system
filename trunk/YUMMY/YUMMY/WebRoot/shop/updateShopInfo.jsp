<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>修改餐厅信息</title>
</head>
<body>
<s:form action="saveShop">
<table>
<tr>
<td>餐厅名称：</td>
<td> <input type="text" name="shopname"  value="<s:property value="#attr.myShop.shopname"/>"/></td>
</tr>
<tr>
<td>餐厅logo:</td><td><input type="text" name="logo"  value="<s:property value='#attr.myShop.logo'/>"/></td></tr>
<tr>
<td>餐厅介绍：</td><td><input type="text"  name="introduction"  value="<s:property value='#attr.myShop.introduction'/>"/></td></tr>
<tr>
<td>地址：</td><td><input type="text"  name="address" value="<s:property value='#attr.myShop.address'/>"/></td></tr>
<tr>
<td>电话：</td><td><input type="text"  name="telephone" value="<s:property value='#attr.myShop.telephone'/>"/></td></tr>
<tr><td>QQ:</td><td><input type="text"  name="qq" value="<s:property value='#attr.myShop.qq'/>"/></td></tr>
<tr><td>服务范围：</td><td><input type="text"  name="deliveryRange" value="<s:property value='#attr.myShop.deliveryRange'/>"/></td></tr>
<tr><td><s:submit value="保存"></s:submit></td></tr>
</table>
</s:form>

</body>
</html>