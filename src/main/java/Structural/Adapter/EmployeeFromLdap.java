package Structural.Adapter;

public class EmployeeFromLdap {

    private String givenName;

    private String surname;

    public EmployeeFromLdap(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }
}
