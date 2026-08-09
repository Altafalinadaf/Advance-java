package projects;

import java.util.Scanner;

public class EmployeeManagementSystem {

    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static String[] empDept = new String[100];
    static double[] empSalary = new double[100];

    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // Add Employee
    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department: ");
        empDept[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        empSalary[count] = sc.nextDouble();

        count++;

        System.out.println("\nEmployee Added Successfully.\n");
    }

    // View Employees
    static void viewEmployees() {

        if (count == 0) {
            System.out.println("\nNo Employee Records Found.\n");
            return;
        }

        System.out.println("\n----------- Employee Details -----------");

        for (int i = 0; i < count; i++) {

            System.out.println("--------------------------------------");
            System.out.println("Employee ID   : " + empId[i]);
            System.out.println("Employee Name : " + empName[i]);
            System.out.println("Department    : " + empDept[i]);
            System.out.println("Salary        : " + empSalary[i]);
        }

        System.out.println("--------------------------------------");
    }

    // Search Employee
    static void searchEmployee() {

        System.out.print("Enter Employee ID to Search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("\nEmployee Found");
                System.out.println("ID         : " + empId[i]);
                System.out.println("Name       : " + empName[i]);
                System.out.println("Department : " + empDept[i]);
                System.out.println("Salary     : " + empSalary[i]);

                return;
            }
        }

        System.out.println("\nEmployee Not Found.");
    }

    // Update Salary
    static void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.print("Enter New Salary: ");
                empSalary[i] = sc.nextDouble();

                System.out.println("\nSalary Updated Successfully.");
                return;
            }
        }

        System.out.println("\nEmployee Not Found.");
    }

    // Delete Employee
    static void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                for (int j = i; j < count - 1; j++) {

                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    empDept[j] = empDept[j + 1];
                    empSalary[j] = empSalary[j + 1];
                }

                count--;

                System.out.println("\nEmployee Deleted Successfully.");
                return;
            }
        }

        System.out.println("\nEmployee Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println(" EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateSalary();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    System.out.println("\nThank You! Exiting...");
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }

        } while (choice != 6);
    }
}