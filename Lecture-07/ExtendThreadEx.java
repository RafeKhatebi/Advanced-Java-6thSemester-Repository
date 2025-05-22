class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class ExtendThreadEx {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}