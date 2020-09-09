<%--
  Created by IntelliJ IDEA.
  User: HP-PC
  Date: 2020/9/7
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>测试</h3>
    <a href="${pageContext.request.contextPath}/employee/findAll.do">查询所有</a>
    <button type="button" class="btn btn-default" title="添加" onclick="location.href='${pageContext.request.contextPath}/pages/add.jsp'">
        添加
    </button>

    <a href="${pageContext.request.contextPath}/pages/login.jsp">登录</a>
</body>
</html>
