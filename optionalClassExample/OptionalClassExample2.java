package optionalClassExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample2 {

    public static void main(String a[]) {

        // Creating a List of names
        List<String> list = Arrays.asList("Nithin", "Sohail", "kasim");


        /*
         * We can use Optional to handle the situation
         * where a value may or may not be present.
         *
         * findFirst() returns an Optional object.
         *
         * Here we are searching for a name containing "x".
         *
         * None of the names contain "x",
         * so Optional will be empty.
         */
        Optional<String> name = list.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst();

        /*
         * Printing Optional object.
         *
         * If value is present:
         *
         * Optional[value]
         *
         * If value is not present:
         *
         * Optional.empty
         */
        System.out.println(name);


        /*
         * orElse() is used when we want to provide
         * a default value if Optional is empty.
         *
         * If name exists:
         *     actual name will be printed.
         *
         * If name does not exist:
         *     "Not found the name" will be printed.
         */
        System.out.println(name.orElse("Not found the name"));


        /*
         * We can also directly use orElse()
         * after findFirst().
         *
         * Here we are searching for a name
         * containing "h".
         *
         * "Nithin" contains "h".
         *
         * findFirst() returns:
         * Optional[Nithin]
         *
         * orElse() extracts the value from Optional.
         */
        String name2 = list.stream()
                           .filter(str -> str.contains("h"))
                           .findFirst()
                           .orElse("Not found");

        System.out.println(name2);
    }
}