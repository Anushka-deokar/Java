import java.util.Scanner;

public class control_flow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is a Positive number ");

        } else if (num < 0) {
            System.out.println(num + "is Negative number ");

        }

        else {
            System.out.println(num + " is zero");
        }
    }
}
