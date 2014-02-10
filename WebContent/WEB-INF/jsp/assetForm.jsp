<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="asset==null || asset.id == null">
	<s:set name="title" value="%{'Add new asset'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update asset'}"/>
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
<s:form action="crudasset_save" method="post">
    <s:textfield name="asset.ticker" value="%{asset.ticker}" label="%{getText('label.asset.ticker')}" size="10.0"/>
    <s:textfield name="asset.assetname" value="%{asset.assetname}" label="%{getText('label.asset.assetname')}" size="80.0"/>
    <s:textfield name="asset.benchmark" value="%{asset.benchmark}" label="%{getText('label.asset.benchmark')}" size="10.0"/>
    <s:textfield name="asset.beta" value="%{asset.beta}" label="%{getText('label.asset.beta')}" size="5.0"/>
    <s:textfield name="asset.rsq" value="%{asset.rsq}" label="%{getText('label.asset.rsq')}" size="5.0"/>
    <s:textfield name="asset.stddev" value="%{asset.stddev}" label="%{getText('label.asset.stddev')}" size="5.0"/>
	<s:if test="#action.template eq null">    
	    <s:select headerKey="" headerValue="Select" name="asset.templateid" label="%{getText('label.asset.templateid')}" value="%{asset.templateid}" list="templates" listKey="id" listValue="description"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.asset.templateid')}"  value="%{template.id}"/>
		<s:hidden name="asset.templateid" label="%{getText('label.asset.templateid')}" value="%{template.id}"  />
	</s:else>			 	
	<s:if test="#action.institution eq null">    
	    <s:select headerKey="" headerValue="Select" name="asset.heldat" label="%{getText('label.asset.heldat')}" value="%{asset.heldat}" list="institutions" listKey="id" listValue="instName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.asset.heldat')}"  value="%{institution.id}"/>
		<s:hidden name="asset.heldat" label="%{getText('label.asset.heldat')}" value="%{institution.id}"  />
	</s:else>			 	
    <s:hidden name="asset.id" value="%{asset.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="crudasset_cancel" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</body>
</html>


