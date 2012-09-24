<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><a href="index.jsp">回到主页面</h2><br>
	<h1>我的账户</h1>
	<hr>
	<h1>已经成功订餐</h1>
	<h2>正在进行的订单：</h2><br>
	
	<table border=1>
		<tr>
			<td>餐厅名字</td>
			<td>总价格</td>
			<td>订餐时间</td>
			<td>详细食物</td>
		</tr>
		<c:forEach var="orderDetails" items="${currentOrders}">
			<tr>
				<td><a href="shopDetails?id=${orderDetails.shopname}">${orderDetails.shopname}</a></td>
				<td>${orderDetails.totalPrice}"</td>
				<td>${orderDetails.time}</td>
				<td>
					<table border="1">
						<c:forEach var="item" items="${orderDetails.items}">
							<tr>
								<td>食物</td>
								<td>数量</td>
							</tr>
							<tr>
								<td><a href="foodDetails?id=">${item.id}</a></td>
								<td>${item.orderCount}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
				</c:forEach>
	</table>
	
	<hr>
	<h2>已经完成的订单</h2>
	
</body>
</html>