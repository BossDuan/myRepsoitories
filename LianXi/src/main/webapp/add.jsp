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
<title>Insert title here</title>

<script type="text/javascript">
$(function(){
	$.post("findtype.do",function(msg){
		for ( var i in msg) {
			$("#type").append("<option value='"+msg[i].tid+"'>"+msg[i].tname+"</option>")
		}
	},"json")
	
})
</script>

</head>
<body>
<table>
	<tr>
		<td>影片名<input type="text" name="mname"></td>
	</tr>
	<tr>
		<td>导演<input type="text" name="name"></td>
	</tr>
	<tr>
		<td>票价<input type="text" name="price"></td>
	</tr>
	<tr>
		<td>上映时间<input type="date" name="uptime"></td>
	</tr>
	<tr>
		<td>时长<input type="text" name="longtime"></td>
	</tr>
	<tr>
		<td>类型<input type="text" name="mtype"></td>
	</tr>
	<tr>
		<td>区域<input type="text" name="address"></td>
	</tr>
	<tr>
		<td>状态<select id="type" name="type"></select></td>
	</tr>
	<tr>
		<td><input type="button" value="添加"></td>
	</tr>
</table>
</body>
</html>