package comparatorInterfaceExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator is used to define custom sorting logic.
// Here, we are sorting numbers based on their last digit.

class SwapDigit implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {

        // Compare the last digit of both numbers.
        // Example:
        // 34 -> 4
        // 22 -> 2

        if (n1 % 10 > n2 % 10) {
            // First number should come after the second number.
            return 1;
        } else {
            // First number should come before the second number.
            return -1;
        }

        // Best Practice:
        // if (n1 % 10 == n2 % 10)
        // return 0;
    }
}

public class SwapUsingSecDigit {

    public static void main(String[] args) {

        // Arrays.asList() creates a fixed-size List.

        List<Integer> list = Arrays.asList(23, 12, 43, 45, 10, 25, 35, 64);

        System.out.println("Original List = " + list);

        // Collections is a utility class.
        // sort() uses the natural ordering of Integer (Comparable).

        Collections.sort(list);

        System.out.println("Sorted List (Natural Order) = " + list);

        // -------------------------------------------------------

        // List to demonstrate custom sorting using Comparator

        List<Integer> list2 = Arrays.asList(34, 22, 41, 15, 24);

        System.out.println("\nOriginal List2 = " + list2);

        // Create Comparator object

        SwapDigit swapDigit = new SwapDigit();

        // Sort the list based on the last digit.

        Collections.sort(list2, swapDigit);

        System.out.println("Sorted Based on Last Digit = " + list2);

    }
}