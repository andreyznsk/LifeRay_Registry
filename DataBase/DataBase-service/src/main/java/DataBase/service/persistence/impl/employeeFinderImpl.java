package DataBase.service.persistence.impl;

import DataBase.model.Employee;
import DataBase.service.EmployeeLocalServiceUtil;
import DataBase.service.persistence.EmployeeFinder;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

public class employeeFinderImpl extends EmployeeFinderBaseImpl implements EmployeeFinder {
    public long countEmployeeByBank(long bankId) {
        System.out.println("Вызвали поисковик");
       /* Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery employeeQuery = DynamicQueryFactoryUtil.forClass(Employee.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("Bank_Id", bankId))
                    .setProjection(ProjectionFactoryUtil.property("Prson_Id"));



            List<Employee> entries = EmployeeLocalServiceUtil.dynamicQuery(employeeQuery);

            return entries.size();
        }
        catch (Exception e) {
            try {
                throw new SystemException(e);
            }
            catch (SystemException se) {
                se.printStackTrace();
            }
        }
        finally {
            closeSession(session);
        }*/
        return 0;
    }

}
