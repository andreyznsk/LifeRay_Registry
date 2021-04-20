package newModule.portlet;
import DataBase.model.Employee;
import DataBase.model.impl.EmployeeImpl;

import DataBase.service.EmployeeLocalService;
import DataBase.service.EmployeeLocalServiceUtil;
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


import java.text.SimpleDateFormat;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=LIFERAY",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=NewModule",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
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

		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
		String firstName = ParamUtil.getString(request, "Имя");
		String lastName = ParamUtil.getString(request, "Фамилия");
		String thrdName = ParamUtil.getString(request, "Отчество");
		//Date dateOfBirth = ParamUtil.getDate(request, "Дата рождения",sdf);
		String dateOfStart = ParamUtil.getString(request, "дата утсройства на работу");
		long telNumber = ParamUtil.getLong(request, "Номер телефона");
		long bankNumber = ParamUtil.getLong(request, "Номер банка");
		try {
			_entryLocalService.addEntry( 3, firstName, lastName, thrdName);
		}
		catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
		}
	}


	@Reference(unbind = "-")
	protected void setEntryService(EntryLocalService entryLocalService) {
		_entryLocalService = entryLocalService;
	}


	private EntryLocalService _entryLocalService;
}

