package collectionsapiExample.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {

        // HashSet:
        // 1. Stores only unique values.
        // 2. Does not maintain insertion order.
        // 3. Does not store values in sorted order.
        // 4. Allows one null value.
        // 5. Internally uses a HashMap.

        System.out.println("HashSet: Unique values, no insertion order, no sorted order.");

        Set<Integer> n = new HashSet<>();

        n.add(20);
        n.add(50);
        n.add(10);
        n.add(10);   // Duplicate value, ignored
        n.add(100);
        n.add(200);

        for (Integer value : n) {
            System.out.println(value);
        }

        // TreeSet:
        // 1. Stores only unique values.
        // 2. Stores elements in ascending (sorted) order by default.
        // 3. Does not allow null values.
        // 4. Internally uses a Red-Black Tree.

        System.out.println("\nTreeSet: Unique values in sorted order.");

        Set<Integer> n2 = new TreeSet<>();

        n2.add(20);
        n2.add(50);
        n2.add(10);
        n2.add(10);  // Duplicate value, ignored
        n2.add(100);
        n2.add(200);

        for (Integer value : n2) {
            System.out.println(value);
        }
    }
}