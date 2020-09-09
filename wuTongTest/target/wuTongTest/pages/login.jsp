<%--
  Created by IntelliJ IDEA.
  User: HP-PC
  Date: 2020/9/8
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<script>
    function send() {
        var phoneNum=document.getElementById("phone").value;
        window.location.href="${pageContext.request.contextPath}/employee/sms1.do?phone="+phoneNum;
    }
</script>
<form action="${pageContext.request.contextPath}/employee/sms.do" method="post">
    手机号：<input type="text" id="phone" value="${phone}"><button onclick="send()">发送验证码</button><br/>
    验证码：<input type="text" id="checkNum"><br/>${flag}
    <button type="submit">登录</button>
</form>
</body>
</html>
