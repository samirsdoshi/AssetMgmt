<%@page import="org.apache.commons.fileupload.RequestContext"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.templatedetailss"/></title>
</head>
<body>

<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<s:debug/>
<h1><s:text name="label.templatedetailss"/></h1>
<s:url var="url" action="crudtemplatedetails_input" >
	<s:param name="template.id" value="%{template.id}"/>
	<s:param name="alloctype.id" value="%{alloctype.id}"/>
	<s:param name="sector.id" value="%{sector.id}"/>
	<s:param name="industry.id" value="%{industry.id}"/>
	<s:param name="inter.id" value="%{inter.id}"/>
</s:url>
<a href="<s:property value="#url"/>">Add New templatedetails</a>
<br/><br/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.templatedetails.templateid"/></th>
        <th><s:text name="label.templatedetails.alloctypeid"/></th>
        <th><s:text name="label.templatedetails.secid"/></th>
        <th><s:text name="label.templatedetails.indid"/></th>
        <th><s:text name="label.templatedetails.interid"/></th>
        <th><s:text name="label.templatedetails.prct"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="templatedetailss" status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="templateid"/></td>
            <td class="nowrap"><s:property value="alloctypeid"/></td>
            <td class="nowrap"><s:property value="secid"/></td>
            <td class="nowrap"><s:property value="indid"/></td>
            <td class="nowrap"><s:property value="interid"/></td>
            <td class="nowrap"><s:property value="prct"/></td>
            <td class="nowrap">
                <s:url action="crudtemplatedetails_input" id="url">
                    <s:param name="templatedetails.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <s:url action="crudtemplatedetails_delete" id="url">
                    <s:param name="templatedetails.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Delete</a>
            </td>
        </tr>
    </s:iterator>
    </table>
</div>    
</div>
</body>
</html>

