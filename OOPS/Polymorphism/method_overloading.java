//Method Overloading: When a class has multiple methods with the same name but different parameters (different type, number, or both), it is known as method overloading. The correct method is chosen at compile time based on the arguments passed.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

}

public class method_overloading {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 6));
        System.out.println(c.add(5.5, 6.3));
    }

}
