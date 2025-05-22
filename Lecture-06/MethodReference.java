interface Sayable {
    void say();
}

public class MethodReference {
    public static void SaySomething() {
        System.out.println("joooooooooo");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference::SaySomething;
        sayable.say();

    }

}
