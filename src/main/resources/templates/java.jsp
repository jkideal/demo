<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <title>第一个 JSP 程序</title>
</head>
<body>
<%
    int a = 5;
    request.setAttribute("a","123");
    session.setAttribute("a","456");
%>
<c:out value="${a}"/>
</body>
</html>