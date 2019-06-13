package Structural.Adapter;

public class EmployeeFromDB implements  Employee {

    private String firstName;
    private String lastName;

    public EmployeeFromDB(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
