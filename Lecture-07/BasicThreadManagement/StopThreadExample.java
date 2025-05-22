package BasicThreadManagement;

class StoppableThreadEx implements Runnable {
    private boolean running = true;

    public void stopThread() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread is runnig.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

        }
    }

}

public class StopThreadExample {
    public static void main(String[] args) throws InterruptedException {
        StoppableThreadEx task = new StoppableThreadEx();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(3000);
        task.stopThread(); // Stop the thread safely
    }
}
