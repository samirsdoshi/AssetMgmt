<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="assetinv_alloc==null || assetinv_alloc.id == null">
	<s:set name="title" value="%{'Add new assetinv_alloc'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update assetinv_alloc'}"/>
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
<s:form action="crudassetinv_alloc_save" method="post">
    <s:textfield name="assetinv_alloc.amount" value="%{assetinv_alloc.amount}" label="%{getText('label.assetinv_alloc.amount')}" size="18.0"/>
	<s:if test="#action.alloctype eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_alloc.alloctype_id" label="%{getText('label.assetinv_alloc.alloctype_id')}" value="%{assetinv_alloc.alloctype_id}" list="alloctypes" listKey="id" listValue="description"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_alloc.alloctype_id')}"  value="%{alloctype.id}"/>
		<s:hidden name="assetinv_alloc.alloctype_id" label="%{getText('label.assetinv_alloc.alloctype_id')}" value="%{alloctype.id}"  />
	</s:else>			 	
	<s:if test="#action.assetinv eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_alloc.assetinv_id" label="%{getText('label.assetinv_alloc.assetinv_id')}" value="%{assetinv_alloc.assetinv_id}" list="assetinvs" listKey="id" listValue="?"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_alloc.assetinv_id')}"  value="%{assetinv.id}"/>
		<s:hidden name="assetinv_alloc.assetinv_id" label="%{getText('label.assetinv_alloc.assetinv_id')}" value="%{assetinv.id}"  />
	</s:else>			 	
    <s:hidden name="assetinv_alloc.id" value="%{assetinv_alloc.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexassetinv_alloc')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


