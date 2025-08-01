import java.util.HashMap;

public class first {
    public static void main(String args[]) {
        HashMap<String, Integer> marks = new HashMap<>();

        // adding key-value pairs
        marks.put("Anushka", 90);
        marks.put("XYZ", 95);
        marks.put("ABC", 89);

        // Printing HashMap
        System.out.println(marks);

        // Get value by key
        System.out.println("Anushka's Marks " + marks.get("Anushka"));

        // checking key
        System.out.println("XYZ contains ?" + marks.containsKey("XYZ"));

        // checking size
        System.out.println("Total entries :" + marks.size());
    }

}
