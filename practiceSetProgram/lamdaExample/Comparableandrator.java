package practiceSetProgram.lamdaExample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
    int age;
    String name;
    Employee(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "age = "+age+"\n"
        +"name = "+name;
    }
    public int compareTo(Employee e){
        if(this.age>e.age){
            return 1;
        }
        return -1;
    }

    

}

public class Comparableandrator {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,51,1,34,13,1,12,3,12,6);
    
        System.out.println("hell");
        Comparator<Integer> com=(a,b)->a>b?-1:1;
        Collections.sort(list,com);
        System.out.println(list);

        List<Employee> list2=Arrays.asList(new Employee(24, "abc"),
        new Employee(54, "xyz"),
        new Employee(8, "raj"));
    

        List<Integer> list3=new ArrayList<>();
        list3.add(22);
        list3.add(24);
        list3.add(26);
        list3.add(23);
        Iterator itr=list3.iterator();
        int i=0;
        while(i<list3.size()){
            int n=list3.get(i);
            if(n%2==0){
                list3.remove(i);
            }
            i++;
        }

        System.out.println(list3);
        System.out.println("hello");



    

    // Collections.sort(list2);
    // list2.forEach(n->System.out.println(n));

    }


}
