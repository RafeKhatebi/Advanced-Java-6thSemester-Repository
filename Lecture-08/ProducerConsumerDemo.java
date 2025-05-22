class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized void produce(int value) throws InterruptedException {
        while (!empty) wait(); // Wait if buffer is full
        data = value;
        empty = false;
        notifyAll(); // Notify waiting consumers
    }

    public synchronized int consume() throws InterruptedException {
        while (empty) wait(); // Wait if buffer is empty
        empty = true;
        notifyAll(); // Notify waiting producers
        return data;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    int value = buffer.consume();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
