interface Sayable {
    void say();
}

class Message {
    // String str = "Hi baba";

    void getName() {
        System.out.println("Hi welcome to constructor refrence.");
    }

}

public class ConstructorReference {
    public static void main(String[] args) {
        Sayable sayable = new Message()::getName;
        sayable.say();

    }
}
