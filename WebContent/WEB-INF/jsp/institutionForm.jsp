<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="institution==null || institution.id == null">
	<s:set name="title" value="%{'Add new institution'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update institution'}"/>
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
<s:debug/>
<s:form action="crudinstitution_save" method="post">
    <s:textfield name="institution.instName" value="%{institution.instName}" label="%{getText('label.institution.inst_name')}" size="80.0"/>
    <s:hidden name="institution.id" value="%{institution.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexinstitution')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</body>
</html>


