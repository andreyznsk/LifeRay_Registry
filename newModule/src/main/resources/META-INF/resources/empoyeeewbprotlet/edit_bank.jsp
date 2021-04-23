<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/view.jsp"></portlet:param>
</portlet:renderURL>

<%
   String bank_id = ParamUtil.getString(request,"bankId");
   long bic = ParamUtil.getLong(request,"bic",-1);
   String bankName = ParamUtil.getString(request,"bankName");
   String bankAddress = ParamUtil.getString(request,"bankAddress");

    System.out.println("bank_id: "+ bank_id);
    System.out.println("bankName: "+ bankName);
    System.out.println("bankAddress: "+ bankAddress);

%>

<portlet:actionURL name="editBank" var="editBankURL">
    <portlet:param name="bankId" value="<%= bank_id %>" />
</portlet:actionURL>

<aui:form action="<%= editBankURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="id банка" value= "<%=bank_id%>" disabled="true" ></aui:input>
        <aui:input name="БИК банка" value= "<%=bic%>" disabled="true" ></aui:input>
        <aui:input name="Название банка" value= "<%=bankName%>" ></aui:input>
        <aui:input name="Адрес Банка"  value= "<%=bankAddress%>"></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>