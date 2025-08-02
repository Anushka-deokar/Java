import java.util.HashMap;

public class frequency_count {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1, 1, 4 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
    }

}
