//package EmployeeManager;
//import Employee.Employee;
import java.util.*;

public class EmployeeManager {
    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println("------------");
        }
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void calculateAndDisplaySalary(int id) {
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            System.out.println("Salary Details:");
            System.out.println(emp);
        } else {
            System.out.println("Employee not found!");
        }
    }
}
