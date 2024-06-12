package assign05_06_2024syncronization;

public class ResourceB {
    public void methodB(ResourceA resourceA) {
        synchronized (this) {
            System.out.println("ResourceB: Acquired lock on ResourceB");
            try {
                Thread.sleep(1000); // Introducing delay to increase the likelihood of deadlock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ResourceB: Trying to acquire lock on ResourceA");
            synchronized (resourceA) {
                System.out.println("ResourceB: Acquired lock on ResourceA");
            }
        }
    }
}
