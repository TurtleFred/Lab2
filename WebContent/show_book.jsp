<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.Search" %>
<%@ page import="com.List" %>
<%@ page import="com.BookInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书目列表</title>
</head>
<body>
<%
	ArrayList<BookInfo> bookinfo = List.show_books();
 %>
<!--循环输出表格-->
<center><h4>您查找的作者： <s:property  value="Name" /> 的书目如下：</h4></center>
	<table border="1">
		<tr>
			<th>ISBN</th>
			<th>书名</th>
			<th>作者</th>
			<th>出版社</th>
			<th>出版日期</th>
			<th>售价</th>
		</tr>
               <%for(int i=0;i<bookinfo.size();i++){%>
			<tr>
				<th><%=bookinfo.get(i).getISBN() %></th>
				<th><%=bookinfo.get(i).getTitle() %></th>
				<th><%=bookinfo.get(i).getName() %></th>
				<th><%=bookinfo.get(i).getPublisher() %></th>
				<th><%=bookinfo.get(i).getDate() %></th>
				<th><%=bookinfo.get(i).getPrice() %></th>
			</tr>
			<%}%> 
	</table>
</body>
</html>