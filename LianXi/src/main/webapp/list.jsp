<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/css.css" type="text/css">
<script type="text/javascript">
	$(function(){
		$("#qx").toggle(
			function(){
				$("input:checkbox").attr("checked",true)
			},function(){
				$("input:checkbox").attr("checked",false)
			})
	})
	function add(){
		location.href="add.jsp"
	}
</script>
<title>Insert title here</title>
</head>
<body>
<input type="button" value="查询影片">
<input type="button" value="添加影片" onclick="add()">
<input type="button" value="删除影片">
<table>
	<tr>
		<td><input type="checkbox" id="qx" onclick="qx()"></td>
		<td>影片名</td>
		<td>导演</td>
		<td>票价</td>
		<td>上映时间</td>
		<td>时长</td>
		<td>类型</td>
		<td>年代</td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="l">
		<tr>
			<td><input type="checkbox" value="${l.mid }"></td>
			<td>${l.mname }</td>
			<td>${l.name }</td>
			<td>${l.price }</td>
			<td>${l.uptime }</td>
			<td>${l.longtime }长</td>
			<td>${l.mtype }</td>
			<td>${l.year }</td>
			<td>${l.address }</td>
			<td>${l.tname }</td>
			<td>
				<input type="button" value="详情">
				<input type="button" value="编辑">
				<c:choose>
					<c:when test="${l.type==2 }">
						<input type="button" value="下架">	
					</c:when>
					<c:otherwise>
						<input type="button" value="上架">
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>