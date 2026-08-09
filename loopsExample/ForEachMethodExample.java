package loopsExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodExample {

    public static void main(String[] args) {

        // Creating a List of Integer values
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 6);


        // --------------------------------------------------
        // Consumer Interface
        // --------------------------------------------------

        /*
         * Consumer is a Functional Interface.
         *
         * It has only one abstract method:
         *
         * void accept(T t);
         *
         * Consumer takes one input but does not return anything.
         *
         * Consumer can be implemented using:
         * 1. Anonymous class
         * 2. Lambda expression
         */


        // --------------------------------------------------
        // 1. Consumer using Anonymous Class
        // --------------------------------------------------

        Consumer<Integer> con = new Consumer<Integer>() {

            @Override
            public void accept(Integer n) {

                System.out.println("Hello " + n);
            }
        };

        /*
         * forEach() takes a Consumer as an argument.
         *
         * Each element of the list is passed to
         * the accept() method of Consumer.
         */
        list.forEach(con);


        // --------------------------------------------------
        // 2. Consumer using Lambda Expression
        // --------------------------------------------------

        System.out.println("Using Lambda Expression");

        /*
         * Lambda is a shorter way of implementing
         * the Consumer's accept() method.
         *
         * This:
         *
         * n -> System.out.println("Bye " + n)
         *
         * is equivalent to:
         *
         * public void accept(Integer n) {
         *     System.out.println("Bye " + n);
         * }
         */
        Consumer<Integer> con2 =
                n -> System.out.println("Bye " + n);

        // Passing Consumer object to forEach()
        list.forEach(con2);
    }
}