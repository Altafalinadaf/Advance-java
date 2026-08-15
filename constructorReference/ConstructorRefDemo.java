package constructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {

    String name;
    int age;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name) {
        this.name = name;
    }

    // Used to print Employee object details
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');

        return sb.toString();
    }
}


public class ConstructorRefDemo {

    public static void main(String[] args) {

        // Creating a List of employee names
        List<String> names = Arrays.asList(
                "Rohit",
                "Kushl",
                "Chetan",
                "Mohan"
        );


        // --------------------------------------------------
        // 1. Normal Constructor
        // --------------------------------------------------

        /*
         * Creating Employee objects using
         * the parameterized constructor.
         *
         * new Employee(name)
         */
        List<Employee> emp = new ArrayList<>();

        for (String name : names) {

            emp.add(new Employee(name));
        }


        // Printing Employee objects
        // Method reference is used with forEach()
        emp.forEach(System.out::println);


        // --------------------------------------------------
        // 2. Lambda Expression
        // --------------------------------------------------

        System.out.println("adding values using method reference");

        List<Employee> emp2 = new ArrayList<>();

        /*
         * map() transforms every name into
         * an Employee object.
         *
         * Lambda expression:
         *
         * name -> new Employee(name)
         *
         * For every name, a new Employee object is created.
         */
        emp2 = names.stream()
                .map(name -> new Employee(name))
                .toList();

        // Printing Employee objects
        emp2.forEach(System.out::println);


        // --------------------------------------------------
        // 3. Constructor Reference
        // --------------------------------------------------

        System.out.println("adding values using contructor reference");

        List<Employee> emp3 = new ArrayList<>();

        /*
         * Constructor reference:
         *
         * Employee::new
         *
         * This is a shorter form of:
         *
         * name -> new Employee(name)
         *
         * Employee::new tells Java to use
         * the Employee constructor.
         */
        emp3 = names.stream()
                .map(Employee::new)
                .toList();


        // Printing Employee objects
        emp3.forEach(System.out::println);
    }
}