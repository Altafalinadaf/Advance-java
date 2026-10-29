package practiceSetProgram.arrays;


class Employee{
    int id;
    String name;
    int roll;
}

public class ArrayClassExample {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.id=101;
        emp1.name="abc";
        emp1.roll=23;

        Employee emp2=new Employee();
        emp2.id=102;
        emp2.name="xyz";
        emp2.roll=25;


        Employee emp3=new Employee();
        emp3.id=103;
        emp3.name="rohit";
        emp3.roll=26;

        Employee[] empList=new Employee[3];
        empList[0]=emp1;
        empList[1]=emp2;
        empList[2]=emp3;


        for(Employee e:empList){
            System.out.println(e.id + " "+e.name+" "+e.roll);
        }




    }


}
