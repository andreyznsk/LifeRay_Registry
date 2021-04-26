<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="DataBase.model.Positions" %>
<%@ page import="DataBase.service.PositionsLocalServiceUtil" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/view.jsp"></portlet:param>
</portlet:renderURL>

<liferay-ui:success key="positionUpdated" message="position-updated" />
<liferay-ui:error key="positionWarning" message="position_warning" />


<%
    long positionId = ParamUtil.getLong(request,"positionId",-1);
    Positions position = PositionsLocalServiceUtil.getPositions(positionId);

%>

<portlet:actionURL name="editPosition" var="editPositionURL">
    <portlet:param name="positionId" value="<%=String.valueOf(positionId)%>"></portlet:param>
</portlet:actionURL>

<aui:form action="<%= editPositionURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="id должности" value= "<%=position.getPositions_id()%>" disabled="true"></aui:input>
        <aui:input name="Название" value= "<%=position.getPosition_name()%>"></aui:input>
        <aui:input name="Зар.Плата" value= "<%=position.getSalary()%>" ></aui:input>

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>