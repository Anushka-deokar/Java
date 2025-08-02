
public class first {
    public static void main(String args[]) {
        try {
            int result = 10 / 0; // Arithmetic Exception
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }

}
