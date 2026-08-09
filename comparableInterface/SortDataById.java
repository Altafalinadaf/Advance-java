package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Employee class implements Comparable
// Comparable is used for natural/default sorting
class Employee implements Comparable<Employee> {

    int id;
    String name;
    int sal;

    // Parameterized Constructor
    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    // Overriding toString() to display object details
    @Override
    public String toString() {
        return "Employee [Id=" + id +
                ", Name=" + name +
                ", Salary=" + sal + "]";
    }

    // Natural Sorting based on Salary (Ascending Order)
    @Override
    public int compareTo(Employee that) {

        // Returns:
        // Positive -> Current salary is greater
        // Negative -> Current salary is smaller
        // Zero     -> Both salaries are equal

        // Interger class has compare method to compare values
        //return Integer.compare(this.sal, that.sal);

        // OR
        return this.sal>that.sal ? 1:-1;

        // OR
        // if(this.sal > that.sal)
        //     return 1;
        // else if(this.sal < that.sal)
        //     return -1;
        // else
        //     return 0;
    }
}

public class SortDataById {

    public static void main(String[] args) {

        // Creating List of Employee Objects
        List<Employee> emp = new ArrayList<>();

        // Adding Employee Objects
        emp.add(new Employee(2, "Rajesh", 30000));
        emp.add(new Employee(1, "Rafik", 50000));
        emp.add(new Employee(5, "Sohail", 60000));
        emp.add(new Employee(3, "Raju", 45000));
        emp.add(new Employee(4, "Sunil", 5000));

        // Display Employee Details Before Sorting
        System.out.println("========== Before Sorting ==========\n");

        for (Employee e : emp) {
            System.out.println(e);
        }

        // Sorting Employee Objects using compareTo()
        Collections.sort(emp);

        // Display Employee Details After Sorting
        System.out.println("\n========== After Sorting (Salary Wise) ==========\n");

        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}