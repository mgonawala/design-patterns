package Structural.Adapter;

/**
 *
 * It's a great way to connect new code to legacy code
 * without changing the working contract of legacy code.
 *
 * Client, Adapter, Adaptee.
 *
 * Example: Arrays.asList()
 *  Arrays are legacy api
 *  List is new api
 *
 *  Adapter is very client centric.
 *  It is implemented to integrate a new client with old one.
 *
 *
 */
public class AdapterPattern {

    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        employeeClient.getEmployeeList().stream().forEach( e ->{
            System.out.println(e.getFirstName() +","+e.getLastName());
        });
    }
}
