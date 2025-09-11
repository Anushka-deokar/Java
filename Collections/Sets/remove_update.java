import java.util.HashMap;
import java.util.Map;

public class remove_update {
    public static void main(String args[]) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("A", 10);
        data.put("b", 20);
        data.put("C", 30);
        System.out.println(data);
        data.remove("b");
        System.out.println(data);

        data.put("A", 100);
        System.out.println("Updated A : " + data.get("A")); // 100

    }

}
