<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="DataBase.model.Employee" %>
<%@ page import="DataBase.service.EmployeeLocalServiceUtil" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/view.jsp"></portlet:param>
</portlet:renderURL>

<%
   long emp_id = ParamUtil.getLong(request,"employeeId",-1);
    Employee employee = EmployeeLocalServiceUtil.getEmployee(emp_id);

%>

<portlet:actionURL name="editEmployee" var="editEmployeeURL">
    <portlet:param name="employeeId" value="<%=String.valueOf(emp_id)%>"></portlet:param>
</portlet:actionURL>

<aui:form action="<%= editEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Имя" value= "<%=employee.getFirstName()%>"></aui:input>
        <aui:input name="Фамилия" value= "<%=employee.getLastName()%>"></aui:input>
        <aui:input name="Отчество" value= "<%=employee.getPatronymic()%>"></aui:input>
        <aui:input name="Дата рождения" value= "<%=employee.getDate_of_birth()%>"></aui:input>
        <aui:input name="дата утсройства на работу" value= "<%=employee.getDate_of_start_work()%>"></aui:input>
        <aui:input name="Домашний номер" value= "<%=employee.getHomeNumber()%>" ></aui:input>
        <aui:input name="Рабочий номер" value= "<%=employee.getWorkNumber()%>" ></aui:input>
        <aui:input name="Номер должности" value= "<%=employee.getPosition_Id()%>" ></aui:input>
        <aui:input name="Номер банка" value= "<%=employee.getBank_id()%>" ></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>