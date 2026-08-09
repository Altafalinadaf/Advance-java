package collectionsapiExample.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

    public static void main(String[] args) {

        // Hashtable:
        // 1. Stores data in key-value pairs.
        // 2. Keys are unique (duplicate keys are not allowed).
        // 3. Duplicate values are allowed.
        // 4. Does NOT allow null keys or null values.
        // 5. Does not maintain insertion order.
        // 6. Synchronized (Thread-Safe).
        // 7. Slower than HashMap due to synchronization.
        // 8. Used in multi-threaded applications where thread safety is required.

        Map<String, Integer> employee = new Hashtable<>();

        // put() - Adds key-value pairs
        employee.put("Sohail", 1);
        employee.put("Kartik", 2);
        employee.put("Sunil", 4);
        employee.put("Raju", 5);

        // Duplicate key - value will be updated
        employee.put("Raju", 6);

        System.out.println("HashMap : " + employee);

        // ---------------------------------------------------------

        // get() - Returns value for the given key
        int id = employee.get("Sunil");
        System.out.println("\nEmployee ID of Sunil : " + id);

        // ---------------------------------------------------------

        // keySet() - Returns all keys
        Set<String> keys = employee.keySet();
        System.out.println("\nKeys : " + keys);

        // ---------------------------------------------------------

        // values() - Returns all values
        Collection<Integer> values = employee.values();
        System.out.println("\nValues : " + values);

        // ---------------------------------------------------------

        // containsKey() - Checks whether key exists
        System.out.println("\nContains Key 'Raju' : "
                + employee.containsKey("Raju"));

        // containsValue() - Checks whether value exists
        System.out.println("Contains Value 4 : "
                + employee.containsValue(4));

        // ---------------------------------------------------------

        // size() - Returns number of key-value pairs
        System.out.println("\nSize : " + employee.size());

        // ---------------------------------------------------------

        // isEmpty() - Checks whether map is empty
        System.out.println("Is Empty : " + employee.isEmpty());

        // ---------------------------------------------------------

        // Iterating using keySet()

        System.out.println("\nUsing keySet()");

        for (String key : employee.keySet()) {

            System.out.println("Key = " + key +
                    " Value = " + employee.get(key));
        }

        // ---------------------------------------------------------

        // Iterating using entrySet() (Recommended)

        System.out.println("\nUsing entrySet()");

        for (Map.Entry<String, Integer> entry : employee.entrySet()) {

            System.out.println("Key = " + entry.getKey()
                    + " Value = " + entry.getValue());
        }

        // ---------------------------------------------------------

        // remove() - Removes key-value pair
        employee.remove("Sunil");

        System.out.println("\nAfter Removing Sunil");
        System.out.println(employee);

        // ---------------------------------------------------------

        // replace() - Updates value
        employee.replace("Sohail", 10);

        System.out.println("\nAfter Replacing Sohail's ID");
        System.out.println(employee);

        // ---------------------------------------------------------

        // clear() - Removes all entries
        employee.clear();

        System.out.println("\nAfter clear()");
        System.out.println(employee);

        // isEmpty() after clear()
        System.out.println("Is Empty : " + employee.isEmpty());
    }
}