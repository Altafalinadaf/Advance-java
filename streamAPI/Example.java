package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        List<Integer> names=Arrays.asList(2,3,4,55,34,53,24,53,53,5);
        List<Integer> nums=Arrays.asList(2,3,4,2,5);
        System.out.println("sum of even "+nums.stream().reduce((a,b)->a+b));
        names.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        System.out.println("odd into 2 "+nums.stream().filter(n->n%2!=0).map(n->n*2).reduce(0,(a,b)->a+b));;

        System.out.println("Own Implementation");
        Predicate<Integer> predicate=new Predicate<Integer>() {
            public boolean test(Integer a){
                if(a%2==0){
                    return true;
                }
                else
                    return false;
            }
        };

        Consumer<Integer> consumer=new Consumer<Integer>() {
            public void accept(Integer a){
                System.out.println(a);

            }
            
        };

        Function<Integer,Integer> function=(Integer a)->
        {
                return a*2;
    
            
        };
        nums.stream().filter(predicate).map(function).forEach(consumer);

    }

}
