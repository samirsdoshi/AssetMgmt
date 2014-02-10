<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.industrys"/></title>
</head>
<body>
<s:include value="topBanner.jsp"/>
<s:include value="leftmenu.jsp"/>
<div class="${pageClass}">
<br/>
<h1><s:text name="label.industrys"/></h1>
<s:url id="url" action="crudindustry_input" >
</s:url>
<a href="<s:property value="#url"/>">Add New industry</a>
<br/><br/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.industry.ind_name"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="industrys" status="status">
          <s:url action="crudindustry_select" id="url">
            <s:param name="industry.id" value="id"/>
         </s:url>
        <tr style="cursor:hand;" onclick="javascript:location.href='<s:property value="#url"/>';" 
        	class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="indName"/></td>
            <td onclick="javascript:stopPropagation(event);"  class="nowrap">
                <s:url action="crudindustry_input" id="url">
                    <s:param name="industry.id" value="id"/>
                </s:url>
                <a href="<s:property value="#url"/>">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <s:url action="crudindustry_delete" id="url">
                    <s:param name="industry.id" value="id"/>
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

