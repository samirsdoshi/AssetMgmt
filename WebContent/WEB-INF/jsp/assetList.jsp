<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.assets"/></title>
</head>
<body>
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<h1><s:text name="label.assets"/></h1>
<s:url id="url" action="crudasset_input" >
	<s:param name="template.id" value="%{template.id}"/>
	<s:param name="institution.id" value="%{institution.id}"/>
</s:url>
<a href="<s:property value="#url"/>">Add New asset</a>
<br/><br/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.asset.ticker"/></th>
        <th><s:text name="label.asset.assetname"/></th>
        <th><s:text name="label.asset.heldat"/></th>
        <th><s:text name="label.asset.benchmark"/></th>
        <th><s:text name="label.asset.templateid"/></th>
        <th><s:text name="label.asset.beta"/></th>
        <th><s:text name="label.asset.rsq"/></th>
        <th><s:text name="label.asset.stddev"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="assets" status="status">
          <s:url action="crudasset_select" id="url">
            <s:param name="asset.id" value="id"/>
         </s:url>
        <tr style="cursor:hand;" onclick="javascript:location.href='<s:property value="#url"/>';"
        	class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="ticker"/></td>
            <td class="nowrap"><s:property value="assetname"/></td>
            <td class="nowrap"><s:property value="heldat"/></td>
            <td class="nowrap"><s:property value="benchmark"/></td>
            <td class="nowrap"><s:property value="templateid"/></td>
            <td class="nowrap"><s:property value="beta"/></td>
            <td class="nowrap"><s:property value="rsq"/></td>
            <td class="nowrap"><s:property value="stddev"/></td>
            <td onclick="javascript:stopPropagation(event);" class="nowrap">
                <s:url action="crudasset_input" id="url">
                    <s:param name="asset.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <s:url action="crudasset_delete" id="url">
                    <s:param name="asset.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Delete</a>
            </td>
        </tr>
    </s:iterator>
    </table>
</div>
<script language="javascript">
function stopPropagation(e){
	if (!e) var e = window.event;
	e.cancelBubble = true; //Setting the cancelBubble property in browsers that don’t support it doesn’t hurt. The browser shrugs and creates the property. Of course it doesn’t actually cancel the bubbling, but the assignment itself is safe.
	if (e.stopPropagation) e.stopPropagation();
}
</script>
</body>
</html>

