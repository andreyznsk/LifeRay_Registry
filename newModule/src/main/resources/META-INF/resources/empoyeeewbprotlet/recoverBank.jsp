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

<%
SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
%>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="newmodule.caption"/></b>
</p>

<h2>Восстановить из архива</h2>

<%
  List<Bank> banks = BankLocalServiceUtil.getArchivedBanks();
%>

        <liferay-ui:search-container total="<%=banks.size()%>" var="searchContainer" delta="7" deltaConfigurable="true"
                                     emptyResultsMessage="Oops. There Are No Users To Display, Please add Users">
            <liferay-ui:search-container-results results="<%=ListUtil.subList(banks, searchContainer.getStart(),searchContainer.getEnd())%>" />
            <liferay-ui:search-container-row className="DataBase.model.Bank" modelVar="bank" keyProperty="bank_id" >
                <liferay-ui:search-container-column-text name="Id банка" value="${bank.bank_id}"/>
                <liferay-ui:search-container-column-text name="Название банка" value="${bank.bankName}"/>
                <liferay-ui:search-container-column-text name="БИК" value="${bank.bic}"/>
                <liferay-ui:search-container-column-text name="Адрес" value="${bank.address}"/>
                <liferay-ui:search-container-column-text name="редактирование">
                    <liferay-ui:icon-menu>
                            <portlet:actionURL name="recoverBank" var="recoverBankURL">
                                <portlet:param name="bankId" value="${bank.bank_id}" />
                            </portlet:actionURL>
                        <liferay-ui:icon message="Восстановить" url="<%=recoverBankURL.toString()%>" />
                    </liferay-ui:icon-menu>
                </liferay-ui:search-container-column-text>
            </liferay-ui:search-container-row>
            <liferay-ui:search-iterator />
        </liferay-ui:search-container>
