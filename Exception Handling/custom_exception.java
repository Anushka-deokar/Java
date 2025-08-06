class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class custom_exception {
    static void validate(int marks) throws MyException {
        if (marks < 40) {
            throw new MyException("Fail: Minimum 40 marks required");
        } else {
            System.out.println("Pass");
        }
    }

    public static void main(String[] args) {
        try {
            validate(30);
        } catch (MyException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }
    }
}
