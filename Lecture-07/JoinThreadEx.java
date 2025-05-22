public class JoinThreadEx {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is working ...");
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread done");

        });
        thread.start();
        System.out.println("Is thread Alive ?" + thread.isAlive());
        thread.join();
        System.out.println("Is thread Alive ?" + thread.isAlive());

    }
}
