package BasicThreadManagement;

public class DaemonThreadEx2 {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {

            System.out.println("User thread is starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("User thread ends");
        });
        Thread daemonThread2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

            }

        });
        // daemonThread.start();
        daemonThread2.setDaemon(true);
        daemonThread2.start();
        daemonThread.start();

    }
}
