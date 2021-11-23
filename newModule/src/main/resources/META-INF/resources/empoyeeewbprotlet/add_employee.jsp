<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployeeURL"></portlet:actionURL>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Имя"></aui:input>
        <aui:input name="Фамилия"></aui:input>
        <aui:input name="Отчество"></aui:input>
        <aui:input name="Дата рождения"></aui:input>
        <aui:input name="дата утсройства на работу"></aui:input>
        <aui:input name="Домашний номер"></aui:input>
        <aui:input name="Рабочий номер"></aui:input>
        <aui:input name="Номер банка"></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>