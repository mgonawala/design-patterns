package Structural.Adapter;

public class EmployeeLdapAdapter implements Employee {

    private  EmployeeFromLdap employeeFromLdap;

    public EmployeeLdapAdapter(EmployeeFromLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }

    @Override
    public String getFirstName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getSurname();
    }
}
