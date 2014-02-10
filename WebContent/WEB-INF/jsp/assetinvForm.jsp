<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="assetinv==null || assetinv.id == null">
	<s:set name="title" value="%{'Add new assetinv'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update assetinv'}"/>
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
<s:form action="crudassetinv_save" method="post">
    <s:textfield name="assetinv.asofdate" value="%{assetinv.asofdate}" label="%{getText('label.assetinv.asofdate')}" size="10.0"/>
    <s:textfield name="assetinv.amount" value="%{assetinv.amount}" label="%{getText('label.assetinv.amount')}" size="18.0"/>
	<s:if test="#action.asset eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv.assetid" label="%{getText('label.assetinv.assetid')}" value="%{assetinv.assetid}" list="assets" listKey="id" listValue="assetname"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv.assetid')}"  value="%{asset.id}"/>
		<s:hidden name="assetinv.assetid" label="%{getText('label.assetinv.assetid')}" value="%{asset.id}"  />
	</s:else>			 	
    <s:hidden name="assetinv.id" value="%{assetinv.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexassetinv')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


