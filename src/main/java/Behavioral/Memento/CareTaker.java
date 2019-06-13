package Behavioral.Memento;

import java.util.ArrayDeque;
import java.util.Deque;

//Caretaker
public class CareTaker {

    private Deque<EmployeeMemento> stack = new ArrayDeque<>();

    public void save(Employee employee){
        stack.push(employee.save());
    }

    public void revert(Employee employee){
        employee.revert(stack.pop());
    }
}
