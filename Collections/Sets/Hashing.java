// program for hashset

import java.util.*;

public class Hashing {
    public static void main(String args[]) {

        // creating
        HashSet<Integer> set = new HashSet<>();
        // set adds only unique elements
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search - contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contain 6");
        }
    }
}
