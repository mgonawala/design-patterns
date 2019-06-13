package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList(){
        Employee employeeFromDB = new EmployeeFromDB("abc","def");

        employeeList.add(employeeFromDB);

        EmployeeFromLdap employeeFromLdap = new EmployeeFromLdap("kljl","asdf");
        employeeList.add( new EmployeeLdapAdapter(employeeFromLdap));

        return  employeeList;
    }
}
