import java.util.LinkedList;
import java.util.Queue;

class LeakyBucket {
    private int bucketCapacity; // Maximum capacity of the bucket (in Mbps)
    private int leakRate;       // Rate at which data leaks (fixed output rate in Mbps)
    private Queue<Integer> bucket; // Queue to simulate the bucket

    public LeakyBucket(int capacity, int rate) {
        this.bucketCapacity = capacity;
        this.leakRate = rate;
        this.bucket = new LinkedList<>();
    }

    // Add packets to the bucket
    public void addPackets(int[] packets) {
        for (int packet : packets) {
            if (getCurrentSize() + packet <= bucketCapacity) {
                bucket.add(packet);
                System.out.println("Packet " + packet + " Mbps added to the bucket.");
            } else {
                System.out.println("Bucket overflow! Packet " + packet + " Mbps dropped.");
            }
        }
    }

    // Process packets using the leaky bucket algorithm
    public void processPackets() throws InterruptedException {
        int iteration = 1;

        while (!bucket.isEmpty()) {
            System.out.println("\nIteration " + iteration + ": Bucket: " + bucket);

            int remainingLeakRate = leakRate;
            while (!bucket.isEmpty() && bucket.peek() <= remainingLeakRate) {
                System.out.println("Remaining Leak Rate: "+remainingLeakRate);
                int packet = bucket.poll();
                System.out.println("Sending packet of size " + packet + " Mbps to the network.");
                remainingLeakRate -= packet;
            }

            if (!bucket.isEmpty() && remainingLeakRate > 0) {
                int packet = bucket.peek();
                System.out.println("Partial leak: Packet at front of the queue (" + packet + " Mbps) exceeds remaining leak rate (" + remainingLeakRate + " Mbps). Waiting for next tick.");
            }

            System.out.println("After processing, remaining leak rate is " + remainingLeakRate + ".");
            System.out.println("Waiting for 1 second for next clock tick...");
            Thread.sleep(1000);
            iteration++;
        }

        System.out.println("\nAll packets processed. Bucket is now empty.");
    }

    // Get the current size of the bucket
    public int getCurrentSize() {
        int total = 0;
        for (int data : bucket) {
            total += data;
        }
        return total;
    }
}

public class LeakyBucketDemo {
    public static void main(String[] args) throws InterruptedException {
        int bucketCapacity = 10000; // Bucket capacity in Mbps
        int leakRate = 1000;        // Fixed output rate in Mbps

        // Data packets in the bucket
        int[] packets = {300, 400, 500, 400, 100};

        LeakyBucket bucket = new LeakyBucket(bucketCapacity, leakRate);

        System.out.println("Adding packets to the bucket...");
        bucket.addPackets(packets);

        System.out.println("\nProcessing packets...");
        bucket.processPackets();
    }
}