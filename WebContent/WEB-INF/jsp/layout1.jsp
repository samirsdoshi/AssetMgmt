<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.templates"/></title>
</head>
<body>
<div class="titleDiv"><s:text name="application.title"/></div>
<div>
<div class="leftmenu">
	<jsp:include page="leftmenu.jsp"></jsp:include>
</div>
<div class="page">
	<s:action name="indextemplatedetails" executeResult="true"/> 
</div>
</div>
</body>
</html>

