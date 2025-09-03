class Payment {
    void pay() {
        System.out.println("Generic payment");

    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

public class Main {
    public static void main(String args[]) {
        Payment p;
        p = new CreditCard();
        p.pay();
        p = new UPI();
        p.pay();
    }

}
