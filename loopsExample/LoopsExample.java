package loopsExample;

import java.util.Arrays;
import java.util.List;

public class LoopsExample {

    public static void main(String[] args) {

        // Creating a List using Arrays.asList()
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 4, 5, 6);


        // --------------------------------------------------
        // 1. NORMAL FOR LOOP
        // --------------------------------------------------

        System.out.println("Using normal for loop");

        // We use index to access each element
        // list.size() gives the total number of elements
        // list.get(i) returns the element at index i
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }


        // --------------------------------------------------
        // 2. ENHANCED FOR LOOP
        // --------------------------------------------------

        System.out.println("Using enhanced for loop");

        // Directly gets each element from the list
        // No need to use index or get()
        for (int i : list) {

            System.out.println(i);
        }


        // --------------------------------------------------
        // 3. forEach() METHOD
        // --------------------------------------------------

        System.out.println("Using forEach() method");

        // forEach() takes a Consumer
        // Lambda expression is used here
        // n represents each element of the list
        list.forEach(n -> System.out.println(n));
    }
}