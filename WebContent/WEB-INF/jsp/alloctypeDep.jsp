<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.templates"/></title>
</head>
<body>
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<s:set var="showMenu" value="false" scope="request"/>
<s:set var="showTopBanner" value="false" scope="request"/>
<%request.setAttribute("pageClass","page"); %>
<br/>
<div class="page">
<h1><s:text name="label.alloctypes"/> - <s:property value="%{alloctype.description}"/></h1>
</div>
<br/>
	<s:action name="crudassetinv_alloc_input" executeResult="true">
		<s:param name="alloctype.id" value="%{alloctype.id}"/>
	</s:action>
	<br/>
	<s:action name="indexassetinv_alloc" executeResult="true"/>
<br/>
	<s:action name="crudtemplatedetails_input" executeResult="true">
		<s:param name="alloctype.id" value="%{alloctype.id}"/>
	</s:action>
	<br/>
	<s:action name="indextemplatedetails" executeResult="true"/>
</body>
</html>


