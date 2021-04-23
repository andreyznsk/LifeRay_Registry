package newModule.portlet;
import DataBase.model.Bank;
import DataBase.model.Employee;
import DataBase.model.impl.EmployeeImpl;

import DataBase.service.*;
import DataBase.service.impl.EmployeeLocalServiceImpl;
import com.liferay.contacts.model.Entry;
import com.liferay.contacts.service.EntryLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import newModule.constants.NewModulePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=LIFERAY",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=NewModule",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/empoyeeewbprotlet/view.jsp",
		"javax.portlet.name=" + NewModulePortletKeys.NEWMODULE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class NewModulePortlet extends MVCPortlet {
	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Entry.class.getName(), request);

		String[] strings = new String[3];
		Date[] dates = new Date[2];
		long[] numbers = new long[3];

		DateFormat sdf = new SimpleDateFormat("y-M-d");
		strings[0] = ParamUtil.getString(request, "Имя");
		strings[1] = ParamUtil.getString(request, "Фамилия");
		strings[2] = ParamUtil.getString(request, "Отчество");
		String str1 = ParamUtil.getString(request, "Дата рождения");
		String str2 = ParamUtil.getString(request, "дата утсройства на работу");

		try {
			System.out.println(str1);
			dates[0] = sdf.parse(str1);
			dates[1] = sdf.parse(str2);
		} catch (ParseException e) {
			System.out.println("Неправильный формат даты: y-m-d");
			//SessionErrors.add(request, "Неправильный формат даты: y-m-d");
			//PortalUtil.copyRequestParameters(request, response);
		}
		numbers[0] = ParamUtil.getLong(request, "Домашний номер");
		numbers[1] = ParamUtil.getLong(request, "Рабочий номер");
		numbers[2] = ParamUtil.getLong(request, "Номер банка");
		try {
			_employeeLocalService.addEmployee(serviceContext.getUserId(),
					strings,dates,numbers,
					serviceContext);
			System.out.println("Add emp ok!");
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			System.out.println("Exception");
			System.err.println(e.getMessage());
			e.printStackTrace();
			response.setRenderParameter("mvcPath", "/empoyeeewbprotlet/edit_entry.jsp");
		}
	}
	public void addBank(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Entry.class.getName(), request);

		String bankName = ParamUtil.getString(request, "Название банка");
		String bankAddress = ParamUtil.getString(request, "Адрес Банка");
		long bic = ParamUtil.getLong(request, "БИК банка");

		try {
			_bankLocalServices.addBank(serviceContext.getUserId(),bankName,bankAddress,bic,serviceContext);
			System.out.println("Add bank ok!");
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			System.out.println("Exception");
			System.err.println(e.getMessage());
			e.printStackTrace();
			response.setRenderParameter("mvcPath", "/empoyeeewbprotlet/add_bank.jsp");
		}
	}
	public void editBank(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Entry.class.getName(), request);
		long id = ParamUtil.getLong(request,"bankId",-1);
		System.out.println("id: " + id);
		String bankName = ParamUtil.getString(request, "Название банка");
		String bankAddress = ParamUtil.getString(request, "Адрес Банка");

		try {
			_bankLocalServices.updateBank(id,bankName,bankAddress,-1l,serviceContext);
			System.out.println("Add bank ok!");
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			System.out.println("Exception");
			System.err.println(e.getMessage());
			e.printStackTrace();
			response.setRenderParameter("mvcPath", "/empoyeeewbprotlet/add_bank.jsp");
		}

	}
	public void addPosition(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Entry.class.getName(), request);

		String posissionName = ParamUtil.getString(request, "Название должности");
		long salary = ParamUtil.getLong(request, "Зар. плата");

		try {
			_positionLocalServices.addPositions(serviceContext.getUserId(),posissionName,salary,serviceContext);
			System.out.println("Add position ok!");
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			System.out.println("Exception");
			System.err.println(e.getMessage());
			e.printStackTrace();
			response.setRenderParameter("mvcPath", "/empoyeeewbprotlet/add_position.jsp");
		}
	}


	public void deleteEmployee(ActionRequest request, ActionResponse response) throws PortalException {
		long empId = ParamUtil.getLong(request, "employId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Entry.class.getName(), request);

		try {

			_employeeLocalService.deleteEmployee(empId);
		}

		catch (Exception e) {
			Logger.getLogger(NewModulePortlet.class.getName()).log(
					Level.SEVERE, null, e);
		}
	}


	@Reference(unbind = "-")
	protected void setEmployeeService(EmployeeLocalService employeeLocalService){
		_employeeLocalService = employeeLocalService;
	}
	@Reference(unbind = "-")
	protected void setBankService(BankLocalService bankLocalService){
		_bankLocalServices = bankLocalService;
	}

	@Reference(unbind = "-")
	protected void setPositionService(PositionsLocalService positionsLocalService){
		_positionLocalServices = positionsLocalService;
	}


	private PositionsLocalService _positionLocalServices;
	private BankLocalService _bankLocalServices;
	private EmployeeLocalService _employeeLocalService;
}

