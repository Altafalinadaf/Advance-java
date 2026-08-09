package comparatorInterfaceExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Employee class
class Employee {

    int id;
    String name;
    int sal;

    // Parameterized Constructor
    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    // Used to print Employee details
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }

}

public class EmpDataShort {

    public static void main(String[] args) {

        // Creating List of Employee Objects
        List<Employee> emp = new ArrayList<>();

        // Adding Employee objects into the list
        emp.add(new Employee(1, "Sohail", 40000));
        emp.add(new Employee(2, "Rajesh", 20000));
        emp.add(new Employee(3, "Kisor", 2000000));
        emp.add(new Employee(4, "Varun", 10000));

        // Display Original Employee Details
        System.out.println("Original Employee Details");

        for (Employee s : emp) {
            System.out.println(s);
        }

        // ==========================================================
        // Sort Employee based on Length of Name
        // ==========================================================
        // Comparator is used for custom sorting.
        // Here employees are sorted based on the length of their names.

        Comparator<Employee> com =
                (a, b) -> a.name.length() > b.name.length() ? 1 : -1;

        Collections.sort(emp, com);

        System.out.println("\nEmployee Details Sorted Based on Name Length");

        for (Employee s : emp) {
            System.out.println(s);
        }

        // ==========================================================
        // Sort Employee based on Salary using Ternary Operator
        // ==========================================================
        // Employees are sorted from lower salary to higher salary.

        Comparator<Employee> com2 =
                (a, b) -> a.sal > b.sal ? 1 : -1;

        Collections.sort(emp, com2);

        System.out.println("\nEmployee Details Sorted Based on Salary (Ternary)");

        for (Employee s : emp) {
            System.out.println(s);
        }

        // ==========================================================
        // Sort Employee based on Salary using Integer.compare()
        // ==========================================================
        // Integer.compare() is a static method of Integer class.
        // It returns:
        // Negative -> First value is smaller
        // Zero     -> Both values are equal
        // Positive -> First value is greater
        //
        // This is the recommended and safest approach.

        Comparator<Employee> com3 =
                (a, b) -> Integer.compare(a.sal, b.sal);

        Collections.sort(emp, com3);

        System.out.println("\nEmployee Details Sorted Based on Salary (Integer.compare)");

        for (Employee s : emp) {
            System.out.println(s);
        }

    }
}