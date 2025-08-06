
class Car {
    String brand = "Toyota";

    void drive() {
        System.out.println("Driving");

    }
}

public class Class1 {
    public static void main(String args[]) {
        Car obj = new Car();
        System.out.println(obj.brand);
    }
}