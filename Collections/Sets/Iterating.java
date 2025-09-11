import java.util.HashMap;
import java.util.Map;

public class Iterating {
    public static void main(String args[]) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington");
        capitals.put("Japan", "Tokyo");

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }

}
