<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'shopWorkerReg.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<%
	String er1 = "*";
	String er2 = "*";
	String er3 = "*";
	String er4 = "*";
	/*shopWRegE:1用户名为空
	 *      	2：密码为空
	 *      	3：确认密码为空
	 *      	4：密码与确认密码不符
	 *      	5：用户名已存在
	 *			6:店铺名字为空
	 */
	if (session.getAttribute("shopWRegE") != null) {
		int i = (Integer) (session.getAttribute("shopWRegE"));
		switch (i) {
		case 1:
			er1 += "用户名为空!";
			break;
		case 2:
			er2 += "密码为空!";
			break;
		case 3:
			er3 += "确认密码为空!";
			break;
		case 4:
			er3 += "密码与确认密码不符";
			break;
		case 5:
			er1 += "用户名已存在!";
			break;
		case 6:
			er4 += "店铺名字为空！";
			break;
		}
	}
	session.removeAttribute("shopWRegE");
%>
<body>
	<a href="index.jsp"><img src="picture/logo.jpg" width="250"
		height="88">
	</a>
	<center>
		<h1>店铺员工注册页面</h1>
	</center>
	<br>
	<br>
	<form method="post" action="shopWorkerReg" name="shopWorkerReg">
		<table border="1" width="400">
			<tbody>
				<tr >
					<td align="right">用户名:</td>
					<td>&nbsp;<input type="text" name="username">
					</td>
					<td style="color:red"><%=er1%></td>
				</tr>
				<tr>
					<td align="right">密码:</td>
					<td>&nbsp;<input type="password" name="password">
					</td>
					<td style="color:red"><%=er2%></td>
				</tr>
				<tr>
					<td align="right">重复密码:<br>
					</td>
					<td>&nbsp;<input type="password" name="repass">
					</td>
					<td style="color:red"><%=er3%></td>
				</tr>
				<tr>
					<td align="right">店铺名字: <br>
					</td>
					<td>&nbsp;<input type="text" name="shopName">
					</td>
					<td style="color:red"><%=er4%></td>
				</tr>
				<tr>
					<td align="right">电子邮箱:<br>
					</td>
					<td>&nbsp;<input type="text" name="email">
					</td>
				</tr>
				<tr>
					<td><br>
					</td>
					<td><input type="reset" value="重置" name="reset"><input
						type="submit" value="注册" name="submit">
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
