package assign05_06_2024syncronization;

public class PrinterWithSync {
    private int documentCounter = 0;

    public void printDocument(String documentName) {
        synchronized (this) {
            System.out.println("Printing document: " + documentName);
            try {
                Thread.sleep(1000); // Simulating document printing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PrinterWithSync printer = new PrinterWithSync();

        // Creating 5 threads
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                String documentName;
                synchronized (printer) {
                    documentName = "Document " + (++printer.documentCounter);
                }
                printer.printDocument(documentName);
            });
            threads[i].start();
        }

        // Waiting for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
