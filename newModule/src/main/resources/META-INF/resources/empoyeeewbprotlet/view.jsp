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

<%
SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
%>

<portlet:renderURL var="addEmployeeURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/add_employee.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="recoverEmployeeURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/recover_employee.jsp"></portlet:param>
</portlet:renderURL>


<portlet:renderURL var="addBankURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/add_bank.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="addPositionURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/add_position.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="deleteBankURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_bank.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="recoverBankURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/recover_Bank.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="editEmployeeURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_employee.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="recoverPositionURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/recover_Position.jsp"></portlet:param>
</portlet:renderURL>

<!--=====================Сообщения=============================================-->
<liferay-ui:success key="employeeAdded" message="employee-added" />
<liferay-ui:success key="employeeUpdated" message="employee-updated" />
<liferay-ui:success key="employeeDeleted" message="employee-deleted" />
<liferay-ui:success key="bankAdded" message="bank-added" />
<liferay-ui:success key="bankUpdated" message="bank-updated" />
<liferay-ui:success key="bankDeleted" message="bank-deleted" />
<liferay-ui:success key="bankRecovered" message="bank-recovered" />
<liferay-ui:success key="positionAdded" message="position-added" />
<liferay-ui:success key="positionUpdated" message="position-updated" />
<liferay-ui:success key="positionDeleted" message="position-deleted" />

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="newmodule.caption"/></b>
</p>

<%
  List<Employee> employees = EmployeeLocalServiceUtil.getNotAchiveEmployee(0,-1,-1);
  List<Bank> banks = BankLocalServiceUtil.getBanks(-1,-1);
  List<Positions> positions = PositionsLocalServiceUtil.getNotArchivedPositionses(0,-1,-1);
%>
<liferay-ui:tabs names="Реестр сотрудников,Реестр должностей,Реестр банков">
    <liferay-ui:section>

       <liferay-ui:search-container total="<%=employees.size()%>" var="searchContainer" delta="20" deltaConfigurable="true"
          emptyResultsMessage="Нет данных, добавьте данные">

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
              <liferay-ui:search-container-column-text name="редактирование">
              <liferay-ui:icon-menu>

                  <portlet:renderURL var="editEmployeeURL">
                      <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_employee.jsp"></portlet:param>
                      <portlet:param name="employeeId" value="${emp.prson_id}" />
                  </portlet:renderURL>
                  <liferay-ui:icon message="редактировать" url="<%=editEmployeeURL.toString()%>" />

                  <portlet:actionURL name="deleteEmployee" var="deleteEmployeeURL">
                      <portlet:param name="employeeId" value="${emp.prson_id}" />
                  </portlet:actionURL>
                  <liferay-ui:icon-delete message="Отправить в архив" url="<%=deleteEmployeeURL.toString()%>" />

              </liferay-ui:icon-menu>
              </liferay-ui:search-container-column-text>
          </liferay-ui:search-container-row>
         <liferay-ui:search-iterator />
        </liferay-ui:search-container>

        <aui:button-row>
            <aui:button onClick="<%= addEmployeeURL.toString() %>" value="Добавить сотрудника"></aui:button>
        </aui:button-row>

        <aui:button-row>
            <aui:button onClick="<%= recoverEmployeeURL.toString() %>" value="Восстановить сотркдника из архива"></aui:button>
        </aui:button-row>

</liferay-ui:section>
    <!--========================Реестр должностей========================================================= -->
    <liferay-ui:section>
        <liferay-ui:search-container total="<%=positions.size()%>" var="searchContainer" delta="20" deltaConfigurable="true"
                                     emptyResultsMessage="Oops. There Are No Users To Display, Please add Users">

            <liferay-ui:search-container-results results="<%=ListUtil.subList(positions, searchContainer.getStart(),searchContainer.getEnd())%>" />

            <liferay-ui:search-container-row className="DataBase.model.Positions" modelVar="pos" keyProperty="positions_id" >
                <liferay-ui:search-container-column-text name="Id должности" value="${pos.positions_id}"/>
                <liferay-ui:search-container-column-text name="Название должности" value="${pos.position_name}"/>
                <liferay-ui:search-container-column-text name="Зар. плата" value="${pos.salary}"/>
                <liferay-ui:search-container-column-text name="редактирование">
                    <liferay-ui:icon-menu>

                        <portlet:renderURL var="editPositionURL">
                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_position.jsp"></portlet:param>
                            <portlet:param name="positionId" value="${pos.positions_id}" />
                        </portlet:renderURL>
                        <liferay-ui:icon message="редактировать" url="<%=editPositionURL.toString()%>" />

                        <portlet:actionURL name="deletePosition" var="deletePositionURL">
                            <portlet:param name="positionId" value="${pos.positions_id}" />
                        </portlet:actionURL>
                        <liferay-ui:icon-delete message="Отправить в архив" url="<%=deletePositionURL.toString()%>" />

                    </liferay-ui:icon-menu>
                </liferay-ui:search-container-column-text>
            </liferay-ui:search-container-row>
            <liferay-ui:search-iterator />
        </liferay-ui:search-container>

        <aui:button-row>
            <aui:button onClick="<%= addPositionURL.toString() %>" value="Добавить должность"></aui:button>
        </aui:button-row>

        <aui:button-row>
            <aui:button onClick="<%= recoverPositionURL.toString() %>" value="Восстановить из архива"></aui:button>
        </aui:button-row>
    </liferay-ui:section>
    <!--========================Реестр банков========================================================= -->
    <liferay-ui:section>
        <liferay-ui:search-container total="<%=banks.size()%>" var="searchContainer" delta="10" deltaConfigurable="true"
                                     emptyResultsMessage="Oops. There Are No Users To Display, Please add Users">
            <liferay-ui:search-container-results results="<%=ListUtil.subList(banks, searchContainer.getStart(),searchContainer.getEnd())%>" />
            <liferay-ui:search-container-row className="DataBase.model.Bank" modelVar="bank" keyProperty="bank_id" >
                <liferay-ui:search-container-column-text name="Id банка" value="${bank.bank_id}"/>
                <liferay-ui:search-container-column-text name="Название банка" value="${bank.bankName}"/>
                <liferay-ui:search-container-column-text name="БИК" value="${bank.bic}"/>
                <liferay-ui:search-container-column-text name="Адрес" value="${bank.address}"/>
                <liferay-ui:search-container-column-text name="редактирование">
                    <liferay-ui:icon-menu>

                        <portlet:renderURL var="editBankURL">
                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_bank.jsp"></portlet:param>
                            <portlet:param name="bankId" value="${bank.bank_id}" />
                            <portlet:param name="bankName" value="${bank.bankName}" />
                            <portlet:param name="bankAddress" value="${bank.address}" />
                            <portlet:param name="bic" value="${bank.bic}" />
                        </portlet:renderURL>
                        <liferay-ui:icon message="редактировать" url="<%=editBankURL.toString()%>" />

                        <portlet:actionURL name="deleteBank" var="deleteBankURL">
                                <portlet:param name="bankId" value="${bank.bank_id}" />
                            </portlet:actionURL>
                        <liferay-ui:icon-delete message="Отправить в архив" url="<%=deleteBankURL.toString()%>" />

                        <portlet:renderURL var="showBankEmpURL">
                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/show_bank_emp.jsp"></portlet:param>
                            <portlet:param name="bankId" value="${bank.bank_id}" />
                            <portlet:param name="bankName" value="${bank.bankName}" />
                        </portlet:renderURL>
                        <liferay-ui:icon message="Показать сотрудников" url="<%=showBankEmpURL.toString()%>" />

                    </liferay-ui:icon-menu>
                </liferay-ui:search-container-column-text>
            </liferay-ui:search-container-row>
            <liferay-ui:search-iterator />
        </liferay-ui:search-container>

        <aui:button-row>
            <aui:button onClick="<%= addBankURL.toString() %>" value="Добавить банк"></aui:button>
        </aui:button-row>
        <aui:button-row>
            <aui:button onClick="<%= recoverBankURL.toString() %>" value="Восстановить из архива"></aui:button>
        </aui:button-row>

    </liferay-ui:section>
</liferay-ui:tabs>