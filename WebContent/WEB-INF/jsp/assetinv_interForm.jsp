<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="assetinv_inter==null || assetinv_inter.id == null">
	<s:set name="title" value="%{'Add new assetinv_inter'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update assetinv_inter'}"/>
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
<s:form action="crudassetinv_inter_save" method="post">
    <s:textfield name="assetinv_inter.amount" value="%{assetinv_inter.amount}" label="%{getText('label.assetinv_inter.amount')}" size="18.0"/>
    <s:textfield name="assetinv_inter.assetinv_id" value="%{assetinv_inter.assetinvId}" label="%{getText('label.assetinv_inter.assetinv_id')}" size="10.0"/>
	<s:if test="#action.inter eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_inter.inter_id" label="%{getText('label.assetinv_inter.inter_id')}" value="%{assetinv_inter.inter_id}" list="inters" listKey="id" listValue="interName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_inter.inter_id')}"  value="%{inter.id}"/>
		<s:hidden name="assetinv_inter.inter_id" label="%{getText('label.assetinv_inter.inter_id')}" value="%{inter.id}"  />
	</s:else>			 	
	<s:if test="#action.assetinv eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_inter.inter_id" label="%{getText('label.assetinv_inter.inter_id')}" value="%{assetinv_inter.inter_id}" list="assetinvs" listKey="id" listValue="?"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_inter.inter_id')}"  value="%{assetinv.id}"/>
		<s:hidden name="assetinv_inter.inter_id" label="%{getText('label.assetinv_inter.inter_id')}" value="%{assetinv.id}"  />
	</s:else>			 	
    <s:hidden name="assetinv_inter.id" value="%{assetinv_inter.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexassetinv_inter')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


