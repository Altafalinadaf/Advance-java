package practiceSetProgram.comparableInterface;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Employee implements Comparable<Employee>{
    int id;
    String name;
    int rollno;

    Employee(int id,String name,int rollno){
        this.id=id;
        this.name=name;
        this.rollno=rollno;
    }
    public int compareTo(Employee that){
        if(this.id>that.id){
            return 1;

        }
        else{
            return -1;
        }
    }
}

public class Program {
    public static void main(String[] args) {

        List<Employee> empList=Arrays.asList(new Employee(3,"Ranjit",23),
        new Employee(2,"karim",24),new Employee(1, "prit", 43));

        // Collections.sort(empList,(a,b)->a.id>b.id?-1:1);
        // System.out.println("Employee name list = "+empList);
        // for(Employee emp:empList){
        //     System.out.println(emp.id + " " + emp.name+ " " +emp.rollno);
        // }


        Collections.sort(empList);
        for(Employee emp:empList){
            System.out.println(emp.id + " " + emp.name+ " " +emp.rollno);
        }

        System.out.println("Used comaprable interface ");

        List<Integer> list=Arrays.asList(2,3,4,1,3,1,34,43,43,53,23,243,2,53,23,65);

        // Comparator<Integer> comInt=new Comparator<Integer>() {
        //     public int compare(Integer a,Integer b){
        //         if(a>b){
        //             return -1;
        //         }
        //         else{
        //             return 1;
        //         }
        //     }
        // };

        

        System.out.println("unsorted list  = " + list);
        Collections.sort(list,(a,  b)->a>b?-1:1);
        System.out.println("descending order = "+list);
        Collections.sort(list);
        System.out.println("sorted list = " +list);

        List<String> names=Arrays.asList("sweeta","pooja","rohit","kartik","arkam","ravi","kishora");
        System.out.println("unsorted names list =  " +names);
        Collections.sort(names);
       

        // Comparator<String> com=new Comparator<String>() {
        //     public int compare(String a,String b){
        //         if(a.length()>b.length()){
        //             return -1;
        //         }
        //         else{
        //             return 1;
        //         }
        //     }
        // };



        Collections.sort(names,(a,b)->a.length()>b.length()?1:-1);

        System.out.println("sorted names list2 =  " +names);
    }
}
