import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double CalculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", Id=" + id + ", Salary=" + CalculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double CalculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursworked;
    private double hoursrate;

    PartTimeEmployee(String name, int id, int hoursworked, double hoursrate) {
        super(name, id);
        this.hoursworked = hoursworked;
        this.hoursrate = hoursrate;
    }

    public double CalculateSalary() {
        return hoursrate * hoursworked;
    }
}

class PayRollSystem {
    private ArrayList<Employee> employeeList;

    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            System.out.println("Employee with ID " + id + " removed successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the system.");
            return;
        }
        System.out.println("Current Employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem = new PayRollSystem();
        Scanner scanner = new Scanner(System.in);

        // Add some initial employees for demonstration
        payRollSystem.addEmployee(new FullTimeEmployee("Ram", 1, 100000));
        payRollSystem.addEmployee(new PartTimeEmployee("Shyam", 2, 40, 500));

        while (true) {
            System.out.println("\nPayroll System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployeeMenu(payRollSystem, scanner);
                    break;
                case 2:
                    removeEmployeeMenu(payRollSystem, scanner);
                    break;
                case 3:
                    payRollSystem.displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting payroll system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployeeMenu(PayRollSystem payRollSystem, Scanner scanner) {
        System.out.println("\nAdd Employee:");
        System.out.println("1. Full-time Employee");
        System.out.println("2. Part-time Employee");
        System.out.print("Enter employee type: ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        if (type == 1) {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            payRollSystem.addEmployee(new FullTimeEmployee(name, id, salary));
            System.out.println("Full-time employee added successfully.");
        } else if (type == 2) {
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();
            payRollSystem.addEmployee(new PartTimeEmployee(name, id, hours, rate));
            System.out.println("Part-time employee added successfully.");
        } else {
            System.out.println("Invalid employee type.");
        }
    }

    private static void removeEmployeeMenu(PayRollSystem payRollSystem, Scanner scanner) {
        System.out.println("\nRemove Employee");
        payRollSystem.displayEmployees();
        System.out.print("Enter employee ID to remove: ");
        int id = scanner.nextInt();
        payRollSystem.removeEmployee(id);
    }
}