package assign05_06_2024syncronization;

public class ResourceA {
    public void methodA(ResourceB resourceB) {
        synchronized (this) {
            System.out.println("ResourceA: Acquired lock on ResourceA");
            try {
                Thread.sleep(1000); // Introducing delay to increase the likelihood of deadlock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ResourceA: Trying to acquire lock on ResourceB");
            synchronized (resourceB) {
                System.out.println("ResourceA: Acquired lock on ResourceB");
            }
        }
    }
}
