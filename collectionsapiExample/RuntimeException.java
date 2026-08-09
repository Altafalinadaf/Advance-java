package collectionsapiExample;

import java.util.ArrayList;
import java.util.Collection;

// Example of ClassCastException (Runtime Exception)

public class RuntimeException {

    public static void main(String[] args) {

        Collection nums = new ArrayList<>();

        nums.add(20);
        nums.add(50);
        nums.add(10);
        //nums.add("Hello");   // Allowed because Collection is a raw type

        for (Object n : nums) {
            int val = (int) n;   // ClassCastException occurs here for "Hello"
            System.out.println(val);
        }
    }
}