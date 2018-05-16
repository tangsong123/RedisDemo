<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>

是否插入成功：
<c:if test="${result.success==false}">
    失败
</c:if>
<c:if test="${result.success==true}">
    成功
</c:if>
这是message：${result.message}
</body>
</html>
