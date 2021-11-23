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
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="newmodule.caption"/></b>
</p>

<h2>Восстановить из архива</h2>

<liferay-ui:success key="positionRecovered" message="position-recovered" />

<%
  List<Positions> positions = PositionsLocalServiceUtil.getNotArchivedPositionses(1,-1,-1);
%>

        <liferay-ui:search-container total="<%=positions.size()%>" var="searchContainer" delta="10" deltaConfigurable="true"
                                     emptyResultsMessage="В архиве нет позиций">
            <liferay-ui:search-container-results results="<%=ListUtil.subList(positions, searchContainer.getStart(),searchContainer.getEnd())%>" />
            <liferay-ui:search-container-row className="DataBase.model.Positions" modelVar="pos" keyProperty="positions_id" >
                <liferay-ui:search-container-column-text name="Id должности" value="${pos.positions_id}"/>
                <liferay-ui:search-container-column-text name="Название должности" value="${pos.position_name}"/>
                <liferay-ui:search-container-column-text name="Зар. плата" value="${pos.salary}"/>
                <liferay-ui:search-container-column-text name="редактирование">
                    <liferay-ui:icon-menu>
                            <portlet:actionURL name="recoverPosition" var="recoverPositionURL">
                                <portlet:param name="positionId" value="${pos.positions_id}" />
                            </portlet:actionURL>
                        <liferay-ui:icon message="Восстановить" url="<%=recoverPositionURL.toString()%>" />
                    </liferay-ui:icon-menu>
                </liferay-ui:search-container-column-text>
            </liferay-ui:search-container-row>
            <liferay-ui:search-iterator />
        </liferay-ui:search-container>
