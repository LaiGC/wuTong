<%--
  Created by IntelliJ IDEA.
  User: HP-PC
  Date: 2020/9/7
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <!--数据列表-->
    <table id="dataList"
           class="table table-bordered table-striped table-hover dataTable">
        <thead>
        <tr>
            <th class="" style="padding-right: 0px;"><input
                    id="selall" type="checkbox" class="icheckbox_square-blue">
            </th>
            <th class="sorting_asc">ID</th>
            <th class="sorting_desc">姓名</th>
            <th class="sorting_asc sorting_asc_disabled">年龄</th>
            <th class="sorting_desc sorting_desc_disabled">性别</th>
            <th class="sorting">地址</th>
            <th class="text-center sorting">电话号码</th>
            <th class="sorting">密码</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${list}" var="employee">
            <tr>
                <td><input name="ids" type="checkbox"></td>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.age}</td>
                <td>${employee.sex}</td>
                <td>${employee.address}</td>
                <td>${employee.phone}</td>
                <td>${employee.password}</td>
                <td class="text-center">
                    <button type="button" class="btn bg-olive btn-xs" onclick="location.href='${pageContext.request.contextPath}/pages/add.jsp'">添加</button>
                    <button type="button" class="btn bg-olive btn-xs" onclick="location.href='${pageContext.request.contextPath}/employee/delete.do?id=${employee.id}'">删除</button>
                    <button type="button" class="btn bg-olive btn-xs" onclick="location.href='${pageContext.request.contextPath}/employee/findById.do?id=${employee.id}'">更新</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
</body>
</html>
