
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

    }

}
