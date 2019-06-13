package Behavioral.Memento;

/**
 *
 * Memento pattern is used when you want to externalize
 * object's state and restore it at any later point.
 * Typically used to undo or rollback.
 *
 *
 * Originator,
 * Caretaker,
 * Memento
 */
public class MementoPattern {

    public static void main(String[] args) {

        Employee employee = new Employee("Mohini","1234");
        System.out.println("State 1:"+employee);

        CareTaker careTaker = new CareTaker();
        careTaker.save(employee);

        System.out.println("Chanding phone");
        employee.setPhone("456");

        System.out.println(employee);

        careTaker.revert(employee);
        System.out.println("Revert:"+employee);

    }
}
