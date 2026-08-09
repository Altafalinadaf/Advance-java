package comparatorInterfaceExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SwapStrBasedOnLength {

    public static void main(String[] args) {

        // ==========================================================
        // Original List
        // ==========================================================

        List<String> str = Arrays.asList("Abc", "Ravi", "Kisan", "Sohail", "Rohit");

        // ==========================================================
        // 1. Using Anonymous Class
        // ==========================================================
        // An Anonymous Class is a class without a name.
        // It is used when an interface or abstract class
        // needs to be implemented only once.
        // Here, we are implementing the Comparator interface
        // without creating a separate class.

        Comparator<String> com = new Comparator<String>() {

            @Override
            public int compare(String a, String b) {

                if (a.length() > b.length()) {
                    return 1;
                } else if (a.length() < b.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(str, com);

        System.out.println("Sorting String based on Length (Anonymous Class)");
        System.out.println(str);

        // ==========================================================
        // 2. Using Lambda Expression
        // ==========================================================
        // Lambda Expression is a shorter way to implement
        // a Functional Interface.
        //
        // Functional Interface:
        // An interface that contains only one abstract method.
        //
        // Comparator is a Functional Interface because it has
        // only one abstract method: compare().
        //
        // Lambda expressions reduce boilerplate code and
        // improve readability.

        List<String> str2 = Arrays.asList("Abc", "Ravi", "Kisan", "Sohail", "Rohit");

        Comparator<String> com2 = (String a, String b) -> {

            if (a.length() > b.length()) {
                return 1;
            } else if (a.length() < b.length()) {
                return -1;
            } else {
                return 0;
            }
        };

        Collections.sort(str2, com2);

        System.out.println("\nSorting String based on Length (Lambda Expression)");
        System.out.println(str2);

        // ==========================================================
        // 3. Shortest Lambda Expression
        // ==========================================================
        // Since there is only one return statement,
        // we can remove:
        // 1. Curly braces {}
        // 2. return keyword
        // 3. Data types of parameters
        //
        // Integer.compare() returns:
        // Negative -> First comes before second
        // Zero     -> Both are equal
        // Positive -> First comes after second

        List<String> str3 = Arrays.asList("Abc", "Ravi", "Kisan", "Sohail", "Rohit");

        Comparator<String> com3 =
                (a, b) -> Integer.compare(a.length(), b.length());

        Collections.sort(str3, com3);

        System.out.println("\nSorting String based on Length (Shortest Lambda)");
        System.out.println(str3);

    }
}