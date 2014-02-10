<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.templates"/></title>
</head>
<body>
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<h1><s:text name="label.templates"/></h1>
<s:url id="url" action="crudtemplate_input" >
</s:url>
<a href="<s:property value="#url"/>">Add New template</a>
<br/><br/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.template.description"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="templates" status="status">
         <s:url action="crudtemplate_select" id="url">
            <s:param name="template.id" value="id"/>
         </s:url>
        <tr style="cursor:hand;" onclick="javascript:location.href='<s:property value="#url"/>';" 
        	class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="description"/></td>
            <td class="nowrap">
                <s:url action="crudtemplate_input" id="url">
                    <s:param name="template.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <s:url action="crudtemplate_delete" id="url">
                    <s:param name="template.id" value="id"/>
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

