<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册页面</title>
</head>
<body>
	<a href="index.jsp"><img src="picture/logo.jpg" width="250" height="88">
	<center><h1>用户注册页面</h1></center>
	</a>
	<%
		String er1 = "*";
		String er2 = "*";
		String er3 = "*";
		/*regerror:1用户名为空
		 *      2：密码为空
		 *      3：确认密码为空
		 *      4：密码与确认密码不符
		 *      5：用户名已存在
		 */
		if (session.getAttribute("regerror") != null) {
			int i = (Integer) (session.getAttribute("regerror"));
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
			}
		}
		session.removeAttribute("regerror");
	%>
	<center>
	<form action="register" method="post" name="register">
		<table border="1" width="350" height="150">
			<tbody>
				<tr>
					<td align="right">&nbsp;用户名:</td>
					<td>&nbsp;<input type="text" name="username">
					</td>
					<td style="color:red"><%=er1%></td>
				</tr>
				<tr>
					<td align="right">&nbsp;密码</td>
					<td>&nbsp;<input type="password" name="password">
					</td>
					<td style="color:red"><%=er2%></td>
				</tr>

				<tr>
					<td align="right">重复密码<br>
					</td>
					<td>&nbsp;<input type="password" name="repass">
					<td style="color:red"><%=er3%></td>
				</tr>
				<tr>
					<td align="right">性别 <br>
					</td>
					<td>&nbsp;<input type="radio" checked="checked" value="男"
						name="gender">男<input type="radio" value="女" name="gender">女</td>
				</tr>
				<tr>
					<td align="right">电子邮箱<br>
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
				</tr>
			</tbody>
		</table>
	</form>
	</center>
	<br>
	<br>
	<br>
</body>
</html>

