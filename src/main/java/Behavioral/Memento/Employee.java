package Behavioral.Memento;

//Originator
public class Employee {

    private String name;

    private String phone;

    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(name,phone);
    }

    public void revert(EmployeeMemento employeeMemento){
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
