package assign05_06_2024syncronization;

class Buffer {
    private int data;
    private boolean isEmpty = true;

    public synchronized void put(int value) {
        while (!isEmpty) {
            try {
                wait(); // Wait until buffer is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notify(); // Notify waiting consumers
    }

    public synchronized int get() {
        while (isEmpty) {
            try {
                wait(); // Wait until buffer is not empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = data;
        isEmpty = true;
        System.out.println("Consumed: " + value);
        notify(); // Notify waiting producers
        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.put(i);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.get();
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer1 = new Thread(new Producer(buffer));
        Thread producer2 = new Thread(new Producer(buffer));
        Thread consumer1 = new Thread(new Consumer(buffer));
        Thread consumer2 = new Thread(new Consumer(buffer));

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
