package assign02_05_2024multithreading;

import java.util.ArrayList;
import java.util.List;

class Main {
    private static final int MAX_BUFFER_SIZE = 5;
    private static final int MAX_ITEMS = 10; // Maximum number of items to produce/consume
    private static List<Integer> buffer = new ArrayList<>();
    private static int itemsProduced = 0;
    private static int itemsConsumed = 0;

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        producer.start();
        consumer.start();
    }

    static class Producer extends Thread {
        @Override
        public void run() {
            while (itemsProduced < MAX_ITEMS) {
                synchronized (buffer) {
                    while (buffer.size() >= MAX_BUFFER_SIZE) {
                        try {
                            System.out.println("Buffer full, waiting for consumer...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int item = (int) (Math.random() * 100); // Produce a random item
                    buffer.add(item);
                    System.out.println("Produced " + item + ". Buffer: " + buffer);
                    itemsProduced++;
                    buffer.notify();
                }
            }
        }
    }

    static class Consumer extends Thread {
        @Override
        public void run() {
            while (itemsConsumed < MAX_ITEMS) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Buffer empty, waiting for producer...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int item = buffer.remove(0);
                    System.out.println("Consumed " + item + ". Buffer: " + buffer);
                    itemsConsumed++;
                    buffer.notify();
                }
            }
        }
    }
}
