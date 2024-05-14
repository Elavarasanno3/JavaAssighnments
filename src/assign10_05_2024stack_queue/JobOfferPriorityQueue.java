package assign10_05_2024stack_queue;

import java.util.PriorityQueue;

class Job implements Comparable<Job> {
    private int processingTime;

    public Job(int processingTime) {
        this.processingTime = processingTime;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    @Override
    public int compareTo(Job other) {
        // Jobs with lower processing times have higher priority
        return Integer.compare(this.processingTime, other.processingTime);
    }
}

class CPUScheduler {
    private PriorityQueue<Job> jobQueue;
    private int currentTime;

    public CPUScheduler() {
        jobQueue = new PriorityQueue<>();
        currentTime = 0;
    }

    public void addJob(Job job) {
        jobQueue.offer(job);
    }

    public void runScheduler() {
        while (!jobQueue.isEmpty()) {
            Job currentJob = jobQueue.poll();
            System.out.println("Processing job with processing time: " + currentJob.getProcessingTime());
            int waitingTime = currentTime;
            currentTime += currentJob.getProcessingTime();
            int turnaroundTime = currentTime;
            System.out.println("Waiting Time: " + waitingTime);
            System.out.println("Turnaround Time: " + turnaroundTime);
        }
    }
}

public class JobOfferPriorityQueue {
    public static void main(String[] args) {
        CPUScheduler scheduler = new CPUScheduler();

        // Adding some jobs with different processing times
        scheduler.addJob(new Job(5));
        scheduler.addJob(new Job(10));
        scheduler.addJob(new Job(3));
        scheduler.addJob(new Job(7));

        // Running the scheduler
        scheduler.runScheduler();
    }
}
