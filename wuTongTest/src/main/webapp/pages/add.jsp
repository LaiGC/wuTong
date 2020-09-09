<%--
  Created by IntelliJ IDEA.
  User: HP-PC
  Date: 2020/9/8
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加员工信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/employee/save.do" method="post">
    <!-- 正文区域 -->
    <section class="content"> <!--员工信息-->

        <div class="panel panel-default">
            <div class="panel-heading">员工信息</div>
            <div class="row data-type">

                <div class="col-md-2 title">员工名称</div>
                <div class="col-md-4 data">
                    <input type="text" class="form-control" name="name"
                           placeholder="员工名称" value="">
                </div>

                <div class="col-md-2 title">员工年龄</div>
                <div class="col-md-4 data">
                    <input type="text" class="form-control" name="age"
                           placeholder="员工年龄" value="">
                </div>

                <div class="col-md-2 title">员工性别</div>
                <div class="col-md-4 data">
                    <input type="text" class="form-control" name="sex"
                           placeholder="员工性别" value="">
                </div>

                <div class="col-md-2 title">员工地址</div>
                <div class="col-md-4 data">
                    <input type="text" class="form-control" name="address"
                           placeholder="员工地址" value="">
                </div>

                <div class="col-md-2 title">员工手机</div>
                <div class="col-md-4 data">
                    <input type="text" class="form-control" name="phone"
                           placeholder="员工手机" value="">
                </div>

                <div class="col-md-2 title">密码</div>
                <div class="col-md-4 data">
                    <input type="text" class="form-control" name="password"
                           placeholder="密码" value="">
                </div>

            </div>
        </div>
        <!--员工信息/--> <!--工具栏-->
        <div class="box-tools text-center">
            <button type="submit" class="btn bg-maroon">保存</button>
            <button type="button" class="btn bg-default"
                    onclick="history.back(-1);">返回</button>
        </div>
        <!--工具栏/--> </section>
    <!-- 正文区域 /-->
</form>
</div>
<!-- 内容区域 /-->

</body>
</html>
