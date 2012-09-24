<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>添加餐厅信息</title>
<script type="text/javascript" src="./jquery-1.7.js"></script>
<script type="text/javascript" src="./shopInfo.js"></script>
</head>
<body topmargin="80" leftmargin="100">
 <a href="#"><img src="/YUMMY/picture/logo.jpg" width="250" height="88"></a>
 <form action="addShop" method="post">
 <table>
 <tr><td>餐厅名称</td><td><input type="text" name="shopname"></td></tr>
 <tr><td>餐厅logo</td><td><input type="file" id="logo_file" name="logo"><input type="button" id="upload" value="预览" /></td></tr>
<tr><td colspan="3"><img id="logo_img" src="../images/shop/default_logo.jpg"  width="200" height="100"></td></tr>
 <tr><td>餐厅介绍</td><td><textarea rows="5" cols="80" name="introduction"></textarea></td></tr>
 <tr><td>餐厅地址</td><td><input type="text" name="address"></td></tr>
 <tr><td>餐厅电话</td><td><input type="text" name="telephone"></td></tr>
 <tr><td>餐厅QQ</td><td><input type="text" name="qq"></td></tr>
 <tr><td>经营范围</td><td><input type="text" name="deliveryRange"></td></tr>
 <tr><td><input type="submit" value="发布" ></td></tr>
 </table>
 </form>
</body>
</html>