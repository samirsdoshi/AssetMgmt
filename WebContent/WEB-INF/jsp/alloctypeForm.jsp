<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="alloctype==null || alloctype.id == null">
	<s:set name="title" value="%{'Add new alloctype'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update alloctype'}"/>
</s:else>

<html>
 <head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <style>td { white-space:nowrap; }</style>
    <title><s:property value="#title"/></title>
</head>
<body>
<script type="text/javascript" language="javascript" src="http://code.jquery.com/jquery-1.5.1.min.js"></script> 
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<h1><s:property value="#title"/></h1>
<s:actionerror />
<s:actionmessage />
<s:form action="crudalloctype_save" method="post">
    <s:textfield name="alloctype.description" value="%{alloctype.description}" label="%{getText('label.alloctype.description')}" size="45.0"/>
    <s:hidden name="alloctype.id" value="%{alloctype.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexalloctype')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


