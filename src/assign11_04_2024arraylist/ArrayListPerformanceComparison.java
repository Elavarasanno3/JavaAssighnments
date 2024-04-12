package assign11_04_2024arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPerformanceComparison {

    public static void main(String[] args) {
        int[] capacities = {1000, 10000, 100000}; // Different capacities to test
        int numElements = 10000; // Number of elements to insert

        // Perform tests for different capacities
        for (int capacity : capacities) {
            System.out.println("Capacity: " + capacity);
            ArrayList<Integer> arrayList = new ArrayList<>(capacity);

            // Insertion Test
            long startTime = System.nanoTime();
            for (int i = 0; i < numElements; i++) {
                arrayList.add(i);
            }
            long insertionTime = System.nanoTime() - startTime;
            System.out.println("Insertion Time: " + insertionTime / 1e6 + " milliseconds");

            // Random Access Test
            startTime = System.nanoTime();
            Random rand = new Random();
            for (int i = 0; i < numElements; i++) {
                arrayList.get(rand.nextInt(numElements));
            }
            long randomAccessTime = System.nanoTime() - startTime;
            System.out.println("Random Access Time: " + randomAccessTime / 1e6 + " milliseconds");

            // Sequential Access Test
            startTime = System.nanoTime();
            for (int i = 0; i < numElements; i++) {
                arrayList.get(i);
            }
            long sequentialAccessTime = System.nanoTime() - startTime;
            System.out.println("Sequential Access Time: " + sequentialAccessTime / 1e6 + " milliseconds");

            // Removal Test
            startTime = System.nanoTime();
            for (int i = numElements - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            long removalTime = System.nanoTime() - startTime;
            System.out.println("Removal Time: " + removalTime / 1e6 + " milliseconds");

            System.out.println();
        }
    }
}
