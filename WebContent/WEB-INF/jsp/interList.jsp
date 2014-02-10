<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.inters"/></title>
</head>
<body>
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<h1><s:text name="label.inters"/></h1>
<s:url id="url" action="crudinter_input" >
</s:url>
<a href="<s:property value="#url"/>">Add New inter</a>
<br/><br/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.inter.inter_name"/></th>
        <th><s:text name="label.inter.inter_desc"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="inters" status="status">
          <s:url action="crudinter_select" id="url">
            <s:param name="inter.id" value="id"/>
         </s:url>
        <tr style="cursor:hand;" onclick="javascript:location.href='<s:property value="#url"/>';" 
        	class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="interName"/></td>
            <td class="nowrap"><s:property value="interDesc"/></td>
            <td onclick="javascript:stopPropagation(event);"  class="nowrap">
                <s:url action="crudinter_input" id="url">
                    <s:param name="inter.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <s:url action="crudinter_delete" id="url">
                    <s:param name="inter.id" value="id"/>
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

