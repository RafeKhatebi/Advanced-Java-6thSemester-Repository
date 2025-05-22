public class MultiThreadEx {
    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {

        // Thread thread = new Thread(() -> {
        // System.out.println("Thread is in :" + Thread.currentThread().getId());
        // });
        // thread.start();
        // }
        // Out put will be something like that:Thread is in :22
        // Thread is in :21
        // Thread is in :23
        // Thread is in :24
        // Thread is in :26

        // New Task:
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000); // TIMED_WAITING
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(thread.getState()); // NEW
        thread.start();
        System.out.println(thread.getState()); // Runnable
    }
}
