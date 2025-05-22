
class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running is in progress.");
    }
}

public class RunnableExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Myrunnable());
        thread.start();

    }
}