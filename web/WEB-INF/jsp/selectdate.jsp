
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body >
<!--查询表单-->
<form action="${pageContext.request.contextPath}/question" method="post">
<table border="1" align="center">
    <tr>
        <td>今天是</td>
        <td><input type="date" id="date" name="date" value=""></td>
    </tr>
    <tr>
        <td>输入年</td>
        <td><input type="text" id="year" name="year" value=""></td>
    </tr>
    <tr >
       <td><input type="submit" value="查看"></td>
    </tr>
</table>
</form>
</body>
</html>
