package oops;

class ATMCard {
    private int pin;

    public void setPin(int p) {
        pin = p;
    }

    public boolean validatePin(int p) {
        return pin == p;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        ATMCard card = new ATMCard();
        card.setPin(1234);
        System.out.println(card.validatePin(1111)); // wrong
        System.out.println(card.validatePin(1234)); // correct
    }
}

