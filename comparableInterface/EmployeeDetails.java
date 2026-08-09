package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparable is used to define the default/natural sorting
class EmployeeData implements Comparable<EmployeeData> {

    int id;
    String name;
    String dept;
    int sal;
    int experience;

    public EmployeeData(String dept, int experience, int id, String name, int sal) {
        this.dept = dept;
        this.experience = experience;
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    // Used to print Employee object details
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", dept=").append(dept);
        sb.append(", sal=").append(sal);
        sb.append(", experience=").append(experience);
        sb.append('}');

        return sb.toString();
    }

    /*
     * Comparable uses compareTo().
     *
     * Here we are defining the default sorting
     * based on the LENGTH of employee name.
     *
     * Positive  -> this object is greater
     * Negative  -> this object is smaller
     * Zero      -> both are equal
     */
    @Override
    public int compareTo(EmployeeData that) {

        if (this.name.length() > that.name.length()) {
            return 1;
        }
        else if (this.name.length() < that.name.length()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}


public class EmployeeDetails {

    public static void main(String[] args) {

        // Creating a List to store Employee objects
        List<EmployeeData> emp = new ArrayList<>();

        emp.add(new EmployeeData("HR", 2, 1, "Rahul", 30000));
        emp.add(new EmployeeData("Finance", 1, 5, "Sangeeth", 40000));
        emp.add(new EmployeeData("Dev", 4, 4, "Rajesh", 60000));
        emp.add(new EmployeeData("Tester", 3, 2, "Rohit", 20000));


        // Display employees before sorting
        System.out.println("Before sorting employee data");

        for (EmployeeData data : emp) {
            System.out.println(data);
        }


        /*
         * Comparable sorting
         *
         * Collections.sort(emp) automatically calls
         * the compareTo() method of EmployeeData.
         *
         * So employees are sorted according to
         * name length.
         */
        System.out.println("\nAfter sorting employee data based on name length");

        Collections.sort(emp);

        for (EmployeeData data : emp) {
            System.out.println(data);
        }


        /*
         * Comparator sorting
         *
         * Here we don't use compareTo().
         *
         * We create a custom sorting rule using lambda.
         *
         * Sorting based on department name length.
         */
        System.out.println("\nSorting employee data based on department size");

        Collections.sort(emp,
                (e1, e2) ->
                        e1.dept.length() > e2.dept.length()
                                ? 1
                                : e1.dept.length() < e2.dept.length()
                                    ? -1
                                    : 0
        );

        for (EmployeeData data : emp) {
            System.out.println(data);
        }


        /*
         * Another Comparator
         *
         * Now sorting based on salary.
         *
         * We can create another sorting rule
         * without changing the EmployeeData class.
         */
        System.out.println("\nSorting employee data based on salary");

        Collections.sort(emp,
                (a, b) ->
                        a.sal > b.sal
                                ? 1
                                : a.sal < b.sal
                                    ? -1
                                    : 0
        );

        for (EmployeeData val : emp) {
            System.out.println(val);
        }
    }
}