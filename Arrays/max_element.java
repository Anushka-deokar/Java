
import java.util.Scanner;

public class max_element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 105, 76, 34, 4, 67, 45, 34, 45 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is " + max);

    }
}
