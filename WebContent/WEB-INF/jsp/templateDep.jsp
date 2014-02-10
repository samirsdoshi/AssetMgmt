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
<h1><s:text name="label.templates"/> - <s:property value="%{template.description}"/></h1>
</div>
<div class="page borderall">
<br/>
	<s:action name="crudasset_input" executeResult="true">
		<s:param name="template.id" value="%{template.id}"/>
	</s:action>
</div>	
<br/>
<div class="page borderall">
	<s:action name="indexasset" executeResult="true"/>
</div>	
<br/>
<div class="page borderall">
	<s:action name="crudtemplatedetails_input" executeResult="true">
		<s:param name="template.id" value="%{template.id}"/>
	</s:action>
</div>
<br/>	
<div class="page borderall">
	<s:action name="indextemplatedetails" executeResult="true"/>
</div>	
</body>
</html>

