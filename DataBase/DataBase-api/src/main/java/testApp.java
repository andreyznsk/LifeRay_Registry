import DataBase.model.Bank;
import DataBase.model.Employee;
import DataBase.service.BankLocalServiceUtil;
import DataBase.service.EmployeeLocalServiceUtil;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class testApp {
    public static void main(String[] args) {

        List<String> banks = new ArrayList<>();
        banks.add("123");
        banks.add("qwer");
        System.out.println(banks.size());
        //ListUtil

        List<Employee> employees = EmployeeLocalServiceUtil.getEmployees(-1,-1);
    }
}
