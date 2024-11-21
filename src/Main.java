//import Employee.Employee;
//import EmployeeManager.EmployeeManager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Employee Salary Calculation ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Calculate and Display Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    double basicSalary = sc.nextDouble();
                    System.out.print("Enter Allowances: ");
                    double allowances = sc.nextDouble();
                    System.out.print("Enter Tax Rate (%): ");
                    double taxRate = sc.nextDouble();
                    System.out.print("Enter Provident Fund Rate (%): ");
                    double providentFundRate = sc.nextDouble();

                    manager.addEmployee(new Employee(id, name, designation, basicSalary, allowances, taxRate, providentFundRate));
                    break;
                case 2:
                    manager.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    manager.calculateAndDisplaySalary(id);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
