package oops;

class Employee {
    String name;
    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    void conductMeeting() {
        System.out.println(name + " is conducting a meeting");
    }
}

public class Inheritence{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Rahul";
        m.work();
        m.conductMeeting();
    }
}
