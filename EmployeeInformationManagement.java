import java.util.Scanner;

public class EmployeeInformationManagement {
    // Private attributes
    private String name;
    private double salary;

    // Constructor to initialize employee with default values
    public EmployeeInformationManagement() {
        this.name = "";
        this.salary = 0.0;
    }

    // Method to set the employee's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }

    // Method to set the employee's salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Method to get the employee's salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeInformationManagement employee = new EmployeeInformationManagement(); // Create an Employee object

        while (true) {
            System.out.println("\nEmployee Information Management");
            System.out.println("1. Set Name");
            System.out.println("2. Get Name");
            System.out.println("3. Set Salary");
            System.out.println("4. Get Salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    // Set Name
                    System.out.print("Enter the employee's name: ");
                    String name = scanner.nextLine();
                    employee.setName(name);
                    break;

                case 2:
                    // Get Name
                    System.out.println("Employee Name: " + employee.getName());
                    break;

                case 3:
                    // Set Salary
                    System.out.print("Enter the employee's salary: ");
                    double salary = scanner.nextDouble();
                    employee.setSalary(salary);
                    break;

                case 4:
                    // Get Salary
                    System.out.println("Employee Salary: " + employee.getSalary());
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
