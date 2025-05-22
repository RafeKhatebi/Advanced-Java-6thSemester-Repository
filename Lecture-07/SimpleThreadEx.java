public class SimpleThreadEx {
    public static void main(String[] args) {
        System.out.println("Main thread is runing.");
        Thread thread = new Thread(
                () -> {
                    System.out.println("New Thread is running.");
                });

        // Thread thread2 = Thread.currentThread();
        // System.out.println("This is the " + thread2.getName() + "thread.");
        // thread2.start();
        thread.start();

    }

}
