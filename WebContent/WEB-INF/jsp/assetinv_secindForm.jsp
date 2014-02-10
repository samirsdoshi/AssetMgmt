<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="assetinv_secind==null || assetinv_secind.id == null">
	<s:set name="title" value="%{'Add new assetinv_secind'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update assetinv_secind'}"/>
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
<s:form action="crudassetinv_secind_save" method="post">
    <s:textfield name="assetinv_secind.amount" value="%{assetinv_secind.amount}" label="%{getText('label.assetinv_secind.amount')}" size="18.0"/>
	<s:if test="#action.industry eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_secind.ind_id" label="%{getText('label.assetinv_secind.ind_id')}" value="%{assetinv_secind.ind_id}" list="industrys" listKey="id" listValue="indName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_secind.ind_id')}"  value="%{industry.id}"/>
		<s:hidden name="assetinv_secind.ind_id" label="%{getText('label.assetinv_secind.ind_id')}" value="%{industry.id}"  />
	</s:else>			 	
	<s:if test="#action.sector eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_secind.sec_id" label="%{getText('label.assetinv_secind.sec_id')}" value="%{assetinv_secind.sec_id}" list="sectors" listKey="id" listValue="secName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_secind.sec_id')}"  value="%{sector.id}"/>
		<s:hidden name="assetinv_secind.sec_id" label="%{getText('label.assetinv_secind.sec_id')}" value="%{sector.id}"  />
	</s:else>			 	
	<s:if test="#action.assetinv eq null">    
	    <s:select headerKey="" headerValue="Select" name="assetinv_secind.assetinv_id" label="%{getText('label.assetinv_secind.assetinv_id')}" value="%{assetinv_secind.assetinv_id}" list="assetinvs" listKey="id" listValue="?"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.assetinv_secind.assetinv_id')}"  value="%{assetinv.id}"/>
		<s:hidden name="assetinv_secind.assetinv_id" label="%{getText('label.assetinv_secind.assetinv_id')}" value="%{assetinv.id}"  />
	</s:else>			 	
    <s:hidden name="assetinv_secind.id" value="%{assetinv_secind.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indexassetinv_secind')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


