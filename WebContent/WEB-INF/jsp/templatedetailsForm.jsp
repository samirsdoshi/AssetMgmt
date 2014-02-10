<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

 <s:if test="templatedetails==null || templatedetails.id == null">
	<s:set name="title" value="%{'Add new templatedetails'}"/>
</s:if>
<s:else>
	<s:set name="title" value="%{'Update templatedetails'}"/>
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
<s:form action="crudtemplatedetails_save" method="post">
    <s:textfield name="templatedetails.prct" value="%{templatedetails.prct}" label="%{getText('label.templatedetails.prct')}" size="5.0"/>
	<s:if test="#action.template eq null">    
	    <s:select headerKey="" headerValue="Select" name="templatedetails.templateid" label="%{getText('label.templatedetails.templateid')}" value="%{templatedetails.templateid}" list="templates" listKey="id" listValue="description"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.templatedetails.templateid')}"  value="%{template.id}"/>
		<s:hidden name="templatedetails.templateid" label="%{getText('label.templatedetails.templateid')}" value="%{template.id}"  />
	</s:else>			 	
	<s:if test="#action.alloctype eq null">    
	    <s:select headerKey="" headerValue="Select" name="templatedetails.alloctypeid" label="%{getText('label.templatedetails.alloctypeid')}" value="%{templatedetails.alloctypeid}" list="alloctypes" listKey="id" listValue="description"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.templatedetails.alloctypeid')}"  value="%{alloctype.id}"/>
		<s:hidden name="templatedetails.alloctypeid" label="%{getText('label.templatedetails.alloctypeid')}" value="%{alloctype.id}"  />
	</s:else>			 	
	<s:if test="#action.sector eq null">    
	    <s:select headerKey="" headerValue="Select" name="templatedetails.secid" label="%{getText('label.templatedetails.secid')}" value="%{templatedetails.secid}" list="sectors" listKey="id" listValue="secName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.templatedetails.secid')}"  value="%{sector.id}"/>
		<s:hidden name="templatedetails.secid" label="%{getText('label.templatedetails.secid')}" value="%{sector.id}"  />
	</s:else>			 	
	<s:if test="#action.industry eq null">    
	    <s:select headerKey="" headerValue="Select" name="templatedetails.indid" label="%{getText('label.templatedetails.indid')}" value="%{templatedetails.indid}" list="industrys" listKey="id" listValue="indName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.templatedetails.indid')}"  value="%{industry.id}"/>
		<s:hidden name="templatedetails.indid" label="%{getText('label.templatedetails.indid')}" value="%{industry.id}"  />
	</s:else>			 	
	<s:if test="#action.inter eq null">    
	    <s:select headerKey="" headerValue="Select" name="templatedetails.interid" label="%{getText('label.templatedetails.interid')}" value="%{templatedetails.interid}" list="inters" listKey="id" listValue="interName"/>
	</s:if>    	
	<s:else>
		<s:label label="%{getText('label.templatedetails.interid')}"  value="%{inter.id}"/>
		<s:hidden name="templatedetails.interid" label="%{getText('label.templatedetails.interid')}" value="%{inter.id}"  />
	</s:else>			 	
    <s:hidden name="templatedetails.id" value="%{templatedetails.id}"/>
    <s:submit value="%{getText('button.label.submit')}"/>
    <s:submit value="%{getText('button.label.cancel')}" action="%{getLastAction('indextemplatedetails')}" name="Cancel" onclick="form.onsubmit=null"/>
</s:form>
</div>
</div>
</body>
</html>


