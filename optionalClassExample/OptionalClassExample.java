package optionalClassExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        // Creating a List of names
        List<String> name = Arrays.asList(
                "Kartik",
                "Rajesh",
                "Asif",
                "Kasim"
        );


        /*
         * stream() creates a Stream from the List.
         *
         * filter() checks each name.
         *
         * contains("x") checks whether the name
         * contains the character 'x'.
         *
         * None of the names contain 'x'.
         *
         * Therefore, findFirst() will not find any value.
         */
        Optional<String> n = name.stream()
                .filter(str -> str.contains("R"))
                .findFirst();


        /*
         * get() returns the value stored inside Optional.
         *
         * IMPORTANT:
         *
         * If Optional is empty, get() throws:
         *
         * NoSuchElementException
         *
         * So this line is unsafe when we are not sure
         * whether a value exists.
         */
        System.out.println(n.get());


        /*
         * orElse() provides a default value
         * when Optional is empty.
         *
         * If value exists:
         *
         *     value will be returned.
         *
         * If value does not exist:
         *
         *     "Not found" will be returned.
         */
        System.out.println(n.orElse("Not found"));
    }
}