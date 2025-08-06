public class throw_1 {

    public static void checkAge(int age)

    {
        if (age < 18) {
            throw new ArithmeticException("Underage : not eligible");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String args[]) {

    }

}
