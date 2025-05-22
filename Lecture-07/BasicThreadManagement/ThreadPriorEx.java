package BasicThreadManagement;

public class ThreadPriorEx {

    public static void main(String[] args) {
        Thread highPrioThread = new Thread(() -> {
            System.out.println(" \n High Priorty");
        });
        Thread lowPrioThread = new Thread(() -> {
            System.out.println("Low Priorty");
        });
        highPrioThread.setPriority(Thread.MAX_PRIORITY);
        lowPrioThread.setPriority(Thread.MIN_PRIORITY);
        highPrioThread.start();
        lowPrioThread.start();
        /// Set a name for a thread 
        // highPrioThread.setName("HighLevelThread");
        // Get the Name OF thread.
    // System.out.println(highPrioThread.getName());
    }
}