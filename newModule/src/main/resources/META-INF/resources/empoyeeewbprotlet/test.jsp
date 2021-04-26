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

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%
  List<Employee> employees = EmployeeLocalServiceUtil.getNotAchiveEmployee(0,-1,-1);
  PortletURL thisURL = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);
    System.out.println(employees.get(1).getDate_of_birth());

%>

<liferay-ui:search-container iteratorURL="<%= thisURL %>">
    <%
        searchContainer.setResults(employees);
        searchContainer.setTotal(employees.size());
    %>

    <liferay-ui:search-container-row className="DataBase.model.Employee">
    </liferay-ui:search-container-row>
    <liferay-ui:search-container-row className="DataBase.model.Employee">
        <liferay-ui:search-container-column-text name="Id работника" value="<%=model.getFirstName()%>"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
