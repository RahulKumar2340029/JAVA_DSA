import java.util.*;

class TokenBucketPractice{
    int capacity;
    int rate;
    int current;

    TokenBucketPractice(int capacity, int rate){
        this.capacity = capacity;
        this.rate = rate;
        this.current = capacity;
    }

    public void addTokens(){
        current = Math.min(capacity, current + rate);
        System.out.println("Added tokens. Current tokens: " + current);
    }

    public boolean consumeTokens(int datasize){
        if(datasize <= current){
            current -= datasize;
            System.out.println("Packet of size " + datasize + " sent. Remaining tokens: " + current);
            return true;
        }else{
            System.out.println("Insufficient tokens for packet of size " + datasize + ". Packet dropped.");
            return false;
        }
    }
}

public class TokenPractice {
    public static void main(String[] args) throws Exception{
        TokenBucketPractice bucket = new TokenBucketPractice(100,3);
        int[] data = {20,10,2,3,4};
        for(int i=0;i<data.length ; ++i){
            System.out.println("\nTime: " + i + "s");

            // Add tokens at the start of each second
            bucket.addTokens();

            // Process the packet
            bucket.consumeTokens(data[i]);

            // Wait for the next second to simulate real-time behavior
            Thread.sleep(1000);
        }

        System.out.println("\nSimulation complete.");
        }
}

