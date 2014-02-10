<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="inter==null || inter.id == null">
	<s:set name="title" value="%{'Add new inter'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update inter'}"/>
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
<s:form action="crudinter_save" method="post">
    <s:textfield name="inter.inter_name" value="%{inter.interName}" label="%{getText('label.inter.inter_name')}" size="80.0"/>
    <s:textfield name="inter.inter_desc" value="%{inter.interDesc}" label="%{getText('label.inter.inter_desc')}" size="80.0"/>
    <s:hidden name="inter.id" value="%{inter.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexinter')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


