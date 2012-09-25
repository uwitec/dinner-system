<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yummy-登录</title>
<meta name="description" content="全宇宙最大、最安全的网上订餐系统，无污染，无残留，方便，有趣！" />
<meta name="keywords" content="订餐，外卖，美食，粥粉面饭，菜单，店铺" />
</head>
<body>
	<a href="index.jsp"><img src="picture/logo.jpg" width="250"
		height="88">
	</a>
	<hr>
	<center>
		<h2>登陆页面</h2>
		<s:fielderror />
		<s:form action="login" method="post">
			<s:textfield label="用户名" name="username" />
			<s:password label="密码" name="password" />
			<s:submit value="确定" />
		</s:form>
	</center>
</body>
</html>

