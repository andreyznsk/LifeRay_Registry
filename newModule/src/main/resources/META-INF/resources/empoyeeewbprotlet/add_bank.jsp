<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addBank" var="addBankURL"></portlet:actionURL>

<aui:form action="<%= addBankURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Название банка"></aui:input>
        <aui:input name="Адрес Банка"></aui:input>
        <aui:input name="БИК банка"></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>