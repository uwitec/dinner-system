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
	<h1>下单中心</h1>
	<hr>
	<s:form action="pay" method="post" >
	 		<s:textfield label="地址" name="address"/>
	 		<s:textfield label="联系电话" name="telephone"/>
	 		<s:textfield label="留言" name="message"/>
	 		<s:submit value="确定"/>
	 </s:form>
</body>
</html>