<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.assetinv_secinds"/></title>
</head>
<body>
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<h1><s:text name="label.assetinv_secinds"/></h1>
<s:url id="url" action="crudassetinv_secind_input" >
	<s:param name="industry.id" value="%{industry.id}"/>
	<s:param name="sector.id" value="%{sector.id}"/>
	<s:param name="assetinv.id" value="%{assetinv.id}"/>
</s:url>
<a href="<s:property value="#url"/>">Add New assetinv_secind</a>
<br/><br/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.assetinv_secind.sec_id"/></th>
        <th><s:text name="label.assetinv_secind.ind_id"/></th>
        <th><s:text name="label.assetinv_secind.amount"/></th>
        <th><s:text name="label.assetinv_secind.assetinv_id"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="assetinv_secinds" status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="secId"/></td>
            <td class="nowrap"><s:property value="indId"/></td>
            <td class="nowrap"><s:property value="amount"/></td>
            <td class="nowrap"><s:property value="assetinvId"/></td>
            <td onclick="javascript:stopPropagation(event);"  class="nowrap">
                <s:url action="crudassetinv_secind_input" id="url">
                    <s:param name="assetinv_secind.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <s:url action="crudassetinv_secind_delete" id="url">
                    <s:param name="assetinv_secind.id" value="id"/>
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
	e.cancelBubble = true; //Setting the cancelBubble property in browsers that don�t support it doesn�t hurt. The browser shrugs and creates the property. Of course it doesn�t actually cancel the bubbling, but the assignment itself is safe.
	if (e.stopPropagation) e.stopPropagation();
}
</script>
</body>
</html>

