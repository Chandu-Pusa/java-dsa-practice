package oops;

class Payment {
    void makePayment() {
        System.out.println("General payment");
    }
}
class CreditCardPayment extends Payment {
    void makePayment() {
        System.out.println("Payment made by Credit Card");
    }
}
class UPIPayment extends Payment {
    void makePayment() {
        System.out.println("Payment made by UPI");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.makePayment();
        p2.makePayment();
    }
}
