<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>添加餐厅信息</title>
</head>
<body>
<s:form action="addShop">
<table>
<tr>
<td>餐厅名称：</td>
<td></td><s:textfield name="shopname" />
</tr>
<tr>
<td>餐厅logo:</td><td><s:textfield name="logo" /></td></tr>
<tr>
<td>餐厅介绍：</td><td><s:textfield name="introduction" /></td></tr>
<tr>
<td>地址：</td><td><s:textfield name="address" /></td></tr>
<tr>
<td>电话：</td><td><s:textfield name="telephone" /></td></tr>
<tr><td>QQ:</td><td><s:textfield name="qq" /></td></tr>
<tr><td>服务范围：</td><td><s:textfield name="deliveryRange" /></td></tr>
<tr><td><s:submit value="完成"></s:submit></td></tr>
</table>
</s:form>

</body>
</html>