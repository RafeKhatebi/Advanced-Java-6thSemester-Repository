public class MainThreadExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Current thread is: " + mainThread.getName());
    }
}