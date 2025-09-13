
//program for HashMap
//import java.util.HashMap;
import java.util.*;

public class Hashing1 {
    public static void main(String args[]) {
        // country(key), population (value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion - map.put() => if key already exists, it updates the value if not
        // inserts new key value pair
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map); // insertion order not preserved - are unordered

        map.put("China", 180);
        System.out.println(map); // updation of value

        // Search or lookup - map.get()
        if (map.containsKey("Indonesia")) {
            System.out.println("Key is present in map");

        } else {
            System.out.println("Key is not present in map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // returns null if key not present

        // for loop -> for( value : collection)
        int arr[] = { 12, 15, 18 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        for (int val : arr) {
            System.out.println(val + "");

        }
        System.out.println();

        // Iteration
        // Map.Entry<Integer, Integer> e : map.entrySet()
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // to make sets of only keys and pairs keyset through
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }

}
