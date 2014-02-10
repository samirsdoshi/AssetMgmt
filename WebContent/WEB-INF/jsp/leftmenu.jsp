<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
 <head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <style>td { white-space:nowrap; }</style>
</head>
<body>
<s:if test="#request.showMenu !=false">
<div class="leftmenu">
<br/>
<br/>
<br/>
<s:url id="url" action="indexalloctype" />
<a href="<s:property value="#url"/>">Alloctype</a>
	<br/>
	<s:url id="url" action="indexasset" />
<a href="<s:property value="#url"/>">Asset</a>
<br/>
<s:url id="url" action="indexassetinv" />
<a href="<s:property value="#url"/>">Assetinv</a>
<br/>
<s:url id="url" action="indexassetinv_alloc" />
<a href="<s:property value="#url"/>">Assetinv_alloc</a>
<br/>
<s:url id="url" action="indexassetinv_inter" />
<a href="<s:property value="#url"/>">Assetinv_inter</a>
	<br/>
<s:url id="url" action="indexassetinv_secind" />
<a href="<s:property value="#url"/>">Assetinv_secind</a>
	<br/>
<s:url id="url" action="indexindustry" />
<a href="<s:property value="#url"/>">Industry</a>
<br/>
<s:url id="url" action="indexinstitution" />
<a href="<s:property value="#url"/>">Institution</a>
<br/>
<s:url id="url" action="indexinter" />
<a href="<s:property value="#url"/>">Inter</a>
<br/>
<s:url id="url" action="indexsector" />
<a href="<s:property value="#url"/>">Sector</a>
<br/>
<s:url id="url" action="indextemplate" />
<a href="<s:property value="#url"/>">Template</a>
<br/>
<s:url id="url" action="indextemplatedetails" />
<a href="<s:property value="#url"/>">Templatedetails</a>
<br/>
</div>
</s:if>
</body>
</html>


