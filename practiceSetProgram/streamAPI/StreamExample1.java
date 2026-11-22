package practiceSetProgram.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,5,6,7,8,9);
        Stream stream=list.stream();
        stream.forEach(n->System.out.println(n));
    //    stream.forEach(n->System.out.println(n));
       
        List<Integer> list2=new ArrayList<>();
        // for (Integer integer : list) {
        //     if(integer%2==0){
        //         list2.add(integer);
        //     }
        // }
        // list2.forEach(n->System.out.print(n));
        Stream<Integer> stream2=list.stream();
       Predicate<Integer> predicate=n->n%2==0;
        stream2.filter(n-> n%2==0).forEach(n->System.out.print(n));;
        System.out.println("he;;p");

        int res= list.stream().mapToInt(n->n).sum();
        System.out.println(res);
    }
}
