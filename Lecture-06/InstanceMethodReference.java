interface Sayable {
    void say();
}

public class InstanceMethodReference {
    public void SaySomething() {
        System.out.println("Hello instance mehtod it is not static.");

    }

    public static void main(String[] args) {
        InstanceMethodReference imr = new InstanceMethodReference();
        System.out.println(imr);
        // it'll show error because the upper method is not static.
        // Sayable sayable1 = InstanceMethodReference::SaySomething;
        // sayable1.say();
        Sayable sayable2 = new InstanceMethodReference()::SaySomething;
        sayable2.say();
    }

}
