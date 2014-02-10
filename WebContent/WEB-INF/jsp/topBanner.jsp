<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.templates"/></title>
</head>
<body>
<s:if test="#request.showTopBanner != false">
<div class="titleDiv"><s:text name="application.title"/></div>
</s:if>
</body>
</html>

