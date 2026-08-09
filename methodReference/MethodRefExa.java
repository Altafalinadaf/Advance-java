package methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRefExa {

    public static void main(String[] args) {

        // Creating a List of names
        List<String> name = Arrays.asList("Rafik", "Mahiboob", "Sohail", "Kisor");


        // --------------------------------------------------
        // Using Lambda Expression
        // --------------------------------------------------

        /*
         * map() is used to transform each element.
         *
         * Here we are converting every name
         * into uppercase.
         *
         * str -> str.toUpperCase()
         *
         * str is the current String object.
         *
         * str.toUpperCase() calls the toUpperCase()
         * method on that String object.
         */
        List<String> uName = name.stream()
                .map(str -> str.toUpperCase())
                .toList();


        /*
         * forEach() is used to perform an action
         * on every element.
         *
         * Here we are printing each name.
         */
        uName.forEach(n -> System.out.println(n));


        System.out.println("Using method reference");


        // --------------------------------------------------
        // Using Method Reference
        // --------------------------------------------------

        /*
         * Method reference is a shorter way of writing
         * a lambda expression when the lambda only calls
         * an existing method.
         *
         * Lambda:
         *
         * str -> str.toUpperCase()
         *
         * Method reference:
         *
         * String::toUpperCase
         *
         * Both perform the same operation.
         */
        List<String> uName2 = name.stream()
                .map(String::toUpperCase)
                .toList();


        /*
         * Method reference can also be used with forEach().
         *
         * Lambda:
         *
         * n -> System.out.println(n)
         *
         * Method reference:
         *
         * System.out::println
         *
         * Both print each element.
         */
        uName2.forEach(System.out::println);
    }
}