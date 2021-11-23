<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="DataBase.model.Employee"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="DataBase.service.EmployeeLocalServiceUtil" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="newmodule.caption"/></b>
</p>

<%
  long bankId = ParamUtil.getLong(request,"bankId",-1);
  String bankName = ParamUtil.getString(request,"bankName");
    List<Employee> employees = EmployeeLocalServiceUtil.getEmpByBank(bankId);
    System.out.println(bankName);
%>
<h2>Список сотрудников обслуживающихся в банке: "<%=bankName%>"</h2>

<liferay-ui:search-container total="<%=employees.size()%>" var="searchContainer" delta="7" deltaConfigurable="true"
                             emptyResultsMessage="Данный банк не обслуживает сотрудников организации">

    <liferay-ui:search-container-results results="<%=ListUtil.subList(employees, searchContainer.getStart(),searchContainer.getEnd())%>" />

    <liferay-ui:search-container-row className="DataBase.model.Employee" modelVar="emp" keyProperty="prson_id" >
        <liferay-ui:search-container-column-text name="Id работника" value="${emp.prson_id}"/>
        <liferay-ui:search-container-column-text name="Имя" value="${emp.firstName}"/>
        <liferay-ui:search-container-column-text name="Фамилия" value="${emp.lastName}"/>
        <liferay-ui:search-container-column-text name="Дата рождения" value="${emp.date_of_birth}" />
        <liferay-ui:search-container-column-text name="Дата начала работы" value="${emp.date_of_start_work}" />
        <liferay-ui:search-container-column-text name="Рабочий телефон" value="${emp.workNumber}" />
        <liferay-ui:search-container-column-text name="Домашний номер" value="${emp.homeNumber}" />
        <liferay-ui:search-container-column-text name="Должность" value="${emp.position_Id}" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
