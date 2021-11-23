<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="DataBase.model.*"%>
<%@page import="DataBase.model.Employee"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="DataBase.service.*" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortletURLUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<!--=====================Сообщения=============================================-->
<liferay-ui:success key="employeeRecovered" message="employee-recovered" />


<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="newmodule.caption"/></b>
</p>

<h2>Восстановить сотрудника из архива</h2>

<%
  List<Employee> employees = EmployeeLocalServiceUtil.getNotAchiveEmployee(1,-1,-1);
%>
<liferay-ui:search-container total="<%=employees.size()%>" var="searchContainer" delta="10" deltaConfigurable="true"
                             emptyResultsMessage="Нет сотрудников в архиве">

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
                <liferay-ui:search-container-column-text name="Обслуживающий банк" value="${emp.bank_id}" />
              <liferay-ui:search-container-column-text name="Востановить">
              <liferay-ui:icon-menu>
                  <portlet:actionURL name="recoverEmployee" var="recoverEmployeeURL">
                      <portlet:param name="employeeId" value="${emp.prson_id}" />
                  </portlet:actionURL>
                  <liferay-ui:icon message="Восстановить" url="<%=recoverEmployeeURL.toString()%>" />
              </liferay-ui:icon-menu>
              </liferay-ui:search-container-column-text>

          </liferay-ui:search-container-row>
         <liferay-ui:search-iterator />
        </liferay-ui:search-container>
