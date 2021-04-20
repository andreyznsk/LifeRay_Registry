<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="DataBase.service.BankLocalServiceUtil"%>
<%@page import="DataBase.model.*"%>
<%@page import="DataBase.model.Employee"%>
<%@page import="DataBase.service.EmployeeLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>

<%
SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
%>

<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>


<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="newmodule.caption"/></b>
</p>

<%
  List<Employee> employees = EmployeeLocalServiceUtil.getEmployees(-1,-1);
  List<Bank> banks = BankLocalServiceUtil.getBanks(-1,-1);
%>

<liferay-ui:search-container total="<%=employees.size()%>" var="searchContainer" delta="5" deltaConfigurable="true"
  emptyResultsMessage="Oops. There Are No Users To Display, Please add Users">

 <liferay-ui:search-container-results results="<%=ListUtil.subList(employees, searchContainer.getStart(),searchContainer.getEnd())%>" />

  <liferay-ui:search-container-row className="DataBase.model.Employee" modelVar="emp" keyProperty="prson_id" >
        <liferay-ui:search-container-column-text name="Id работника" value="${emp.prson_id}"/>
        <liferay-ui:search-container-column-text name="Имя" value="${emp.firstName}"/>
        <liferay-ui:search-container-column-text name="Фамилия" value="${emp.lastName}"/>
        <liferay-ui:search-container-column-text name="Дата рождения" value="${emp.date_of_birth}" />
    </liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row>
    <aui:button onClick="<%= addEntryURL.toString() %>" value="Добавить сотрудника"></aui:button>
</aui:button-row>