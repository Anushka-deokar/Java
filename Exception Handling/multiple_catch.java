
public class multiple_catch {
    public static void main(String args[]) {
        try {
            int[] arr = { 1, 2, 3, 4 };
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException\

        } catch (ArithmeticException e) {
            System.out.println("Arithmatic error ");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index error");
        } catch (Exception e) {
            System.out.println("General error");
        }
    }
}
