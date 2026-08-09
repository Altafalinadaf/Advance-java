package arrayexamplesprogram;

class Employee{
    int empId;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        System.out.println("Stroing objects in arrays");
        Employee e1=new Employee();
        e1.empId=1;
        e1.name="Rohit";
        e1.age=24;

        Employee e2=new Employee();
        e2.empId=2;
        e2.name="Kartik";
        e2.age=34;

        Employee e3=new Employee();
        e3.empId=3;
        e3.name="Khaleel";
        e3.age=28;

        Employee e[]=new Employee[3];
        e[0]=e1;
        e[1]=e2;
        e[2]=e3;

        for(Employee n:e){
            System.out.println(n.empId+" "+n.name+" "+n.age);
        }


    }
}
