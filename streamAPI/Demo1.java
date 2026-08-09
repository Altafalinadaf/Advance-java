package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

    public static void main(String[] args) {

        // Creating a List of Integer values
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);


        // --------------------------------------------------
        // 1. forEach()
        // --------------------------------------------------

        /*
         * Stream is an interface.
         *
         * list.stream() creates a Stream object
         * from the List.
         */
        Stream<Integer> s1 = list.stream();

        /*
         * forEach() is a terminal operation.
         *
         * It takes each element from the Stream
         * and performs an action on it.
         *
         * Here we are simply printing each element.
         */
        s1.forEach(n -> System.out.println(n));


        // --------------------------------------------------
        // 2. filter()
        // --------------------------------------------------

        /*
         * A Stream cannot be reused after a terminal operation.
         *
         * Therefore, we create a new Stream.
         */
        Stream<Integer> s2 = list.stream();

        /*
         * filter() is an intermediate operation.
         *
         * It selects elements based on a condition.
         *
         * n % 2 == 0
         * means the number is even.
         *
         * Only numbers satisfying the condition
         * will be present in the resulting Stream.
         */
        System.out.println("Printing only even numbers");

        Stream<Integer> s3 = s2.filter(n -> n % 2 == 0);

        // forEach() prints the filtered elements
        s3.forEach(n -> System.out.println(n));


        // --------------------------------------------------
        // 3. map()
        // --------------------------------------------------

        /*
         * map() is an intermediate operation.
         *
         * map() is used to TRANSFORM/MODIFY each element.
         *
         * Here:
         *
         * n -> n * 2
         *
         * means every element will be multiplied by 2.
         */
        Stream<Integer> s4 = list.stream();

        Stream<Integer> s5 = s4.map(n -> n * 2);

        System.out.println("Printing n * 2");

        s5.forEach(n -> System.out.println(n));


        // --------------------------------------------------
        // 4. reduce()
        // --------------------------------------------------

        /*
         * reduce() is a terminal operation.
         *
         * It combines all elements of the Stream
         * and produces ONE final result.
         *
         * Here we are calculating the SUM of all numbers.
         *
         * 0 -> initial value
         *
         * a -> accumulated/result value
         *
         * b -> current element
         *
         * a + b -> addition
         */
        Stream<Integer> s6 = list.stream();

        int result = s6.reduce(0, (a, b) -> a + b);

        System.out.println("Total Sum");
        System.out.println(result);
    }
}