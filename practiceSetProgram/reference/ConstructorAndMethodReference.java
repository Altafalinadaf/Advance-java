package practiceSetProgram.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Employee{
    int age;
    String name;

    Employee(){

    }

    Employee(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }


}
public class ConstructorAndMethodReference {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Rashid","Altaf","Tohid","Karim");

        List<Employee> emps=new ArrayList<>();

        for(String name: names){
            emps.add(new Employee(name));
        }

        for(Employee emp:emps){
            System.out.println(emp.name);
        }


        System.out.println("New list ");
        emps.forEach(System.out::println);

        List<Employee> emps2=new ArrayList<>();
        emps2=names.stream().map(name->new Employee(name)).toList();
        System.out.println("stream api 1");
        emps2.forEach(System.out::println);


        List<Employee> emps3=new ArrayList<>();
        emps3=names.stream().map(Employee::new).toList();
        System.out.println("stream api 2");
        emps3.forEach(System.out::println);


        // optional class 
        String name2=names.stream().filter(name->name.contains("v")).findFirst().orElse("Not found");
        System.out.println("names " +name2);
        
        
        
        
    }

}
