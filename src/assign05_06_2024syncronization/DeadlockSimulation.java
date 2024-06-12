package assign05_06_2024syncronization;

public class DeadlockSimulation {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            resourceA.methodA(resourceB);
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            resourceB.methodB(resourceA);
        });

        thread1.start();
        thread2.start();
    }
}
