package oops;

abstract class Smartphone {
    abstract void unlock();
}

class FingerprintPhone extends Smartphone {
    void unlock() {
        System.out.println("Unlocked with fingerprint");
    }
}

class FaceIDPhone extends Smartphone {
    void unlock() {
        System.out.println("Unlocked with face recognition");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Smartphone phone = new FaceIDPhone();
        phone.unlock();
    }
}

