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

        // size
        System.out.println("size of set is " + set.size());

        // to print all elements
        System.out.println(set);
        // Search - contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contain 6");
        }

        // delete-remove
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Set does not contain 1 - we deleted 1 ");
        }
    }
}
