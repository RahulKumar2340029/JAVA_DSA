import java.util.LinkedList;
import java.util.Queue;

class TokenBucket {
    private int bucketCapacity; // Maximum capacity of the bucket (number of tokens)
    private int fillRate;       // Rate at which tokens are added per second
    private int currentTokens; // Current number of tokens in the bucket

    public TokenBucket(int capacity, int rate) {
        this.bucketCapacity = capacity;
        this.fillRate = rate;
        this.currentTokens = capacity; // Initially, the bucket is full
    }

    // Add tokens to the bucket (called once every second to simulate time)
    public void addTokens() {
        currentTokens = Math.min(bucketCapacity, currentTokens + fillRate);
        System.out.println("Added tokens. Current tokens: " + currentTokens);
    }

    // Consume tokens for a packet of given size
    public boolean consumeTokens(int packetSize) {
        if (packetSize <= currentTokens) {
            currentTokens -= packetSize;
            System.out.println("Packet of size " + packetSize + " sent. Remaining tokens: " + currentTokens);
            return true;
        } else {
            System.out.println("Insufficient tokens for packet of size " + packetSize + ". Packet dropped.");
            return false;
        }
    }
}

public class TokenBucketDemo {
    public static void main(String[] args) throws InterruptedException {
        int bucketCapacity = 100; // Maximum tokens in the bucket
        int fillRate = 3;        // Tokens added per second

        // Packet sizes arriving at the bucket
        int[] packets = {12,12,12,12,12,12};

        TokenBucket tokenBucket = new TokenBucket(bucketCapacity, fillRate);

        for (int i = 0; i < packets.length; i++) {
            System.out.println("\nTime: " + i + "s");

            // Add tokens at the start of each second
            tokenBucket.addTokens();

            // Process the packet
            tokenBucket.consumeTokens(packets[i]);

            // Wait for the next second to simulate real-time behavior
            Thread.sleep(1000);
        }

        System.out.println("\nSimulation complete.");
    }
}
