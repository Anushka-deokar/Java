
import java.util.Scanner;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 105, 76, 34, 4, 67, 45, 34, 45 };
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Average of all element in array is " + (sum / (double) arr.length));

    }

}
