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
<title>添加菜单信息</title>
<script type="text/javascript" src="./jquery-1.7.js"></script>
<script type="text/javascript" src="./dishInfo.js"></script>
</head>
<body>

 <form action="saveMyDish" method="post">
 <table>
 <tr><td>名称<input type="text" name="name" value="${dishUpade.name }"></td></tr>
 <tr><td>图片<input type="file" id="logo_file" name="picOne"  value="${dishUpade.picOne }"><input type="button" id="upload" value="预览" /></td></tr>
 <tr><td colspan="5"><img id="logo_img" src="${dishUpade.picOne }"></td></tr>
 <tr><td>介绍<textarea rows="5" cols="100" name="introduction"  >${dishUpade.introduction}</textarea></td></tr>
 <tr><td>价格<input type="text" name="price" value="${dishUpade.price }">元</td></tr>
  <tr><td>分类
  <input type="checkbox" name="category" value="0">粥
    <input type="checkbox" name="category" value="1">粉
      <input type="checkbox" name="category" value="2">面
        <input type="checkbox" name="category" value="3">饭
         <input type="checkbox" name="category" value="3">饼
          <input type="checkbox" name="category" value="4">酸
            <input type="checkbox" name="category" value="5">甜
              <input type="checkbox" name="category" value="6">辣
                <input type="checkbox" name="category" value="7">粤菜
                  <input type="checkbox" name="category" value="8">湘菜
                    <input type="checkbox" name="category" value="9">川菜
                      <input type="checkbox" name="category" value="10">西餐
                        <input type="checkbox" name="category" value="11">快餐
                          <input type="checkbox" name="category" value="12s">清真
  </td></tr>
 <tr><td>标签<input type="text" name="tag" value="${dishUpade.tag }"></td></tr>
 <tr><td>积分<input type="text" name="point" value="${dishUpade.point }"></td></tr>
<!-- --------还没有登录功能  默认用户为dfs------------------ -->
 <!-- <tr><td><input type="hidden" name="shopname" value="#myShop.shopname"></td></tr> 
 <tr><td><input type="hidden" name="shopname" value="dfs"></td></tr>-->
 <tr><td><input type="submit" value="保存" ></td></tr>
 </table>
 </form>
</body>
</html>