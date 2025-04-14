import java.util.ArrayList;
import java.util.Random;

// Stop-and-Wait ARQ
class StopAndWaitARQ {
    public void simulate() {
        System.out.println("\n--- Stop-and-Wait ARQ Simulation ---");
        int frame = 0;
        Random random = new Random();

        while (frame < 5) { // Simulate sending 5 frames
            System.out.println("Sending frame: " + frame);

            if (random.nextBoolean()) { // Simulate acknowledgment received
                System.out.println("ACK received for frame: " + frame);
                frame++;
            } else { // Simulate timeout or error
                System.out.println("Timeout/Error: Resending frame: " + frame);
            }
        }

        System.out.println("All frames successfully sent using Stop-and-Wait ARQ!\n");
    }
}

// Go-Back-N ARQ
class GoBackNARQ {
    public void simulate(int windowSize) {
        System.out.println("\n--- Go-Back-N ARQ Simulation ---");
        int totalFrames = 10;
        int base = 0;
        int nextFrame = 0;
        Random random = new Random();

        while (base < totalFrames) {
            System.out.println("\nWindow: Base=" + base + ", NextFrame=" + nextFrame);

            for (int i = nextFrame; i < base + windowSize && i < totalFrames; i++) {
                System.out.println("Sending frame: " + i);
            }

            // Simulate acknowledgment and frame errors
            if (random.nextBoolean()) {
                System.out.println("ACK received for frame: " + base);
                base++;
            } else {
                System.out.println("Timeout/Error: Resending window from frame: " + base);
                nextFrame = base; // Reset nextFrame to base
            }

            nextFrame = Math.min(base + windowSize, totalFrames);
        }

        System.out.println("All frames successfully sent using Go-Back-N ARQ!\n");
    }
}

// Selective Repeat ARQ
class SelectiveRepeatARQ {
    public void simulate(int windowSize) {
        System.out.println("\n--- Selective Repeat ARQ Simulation ---");
        int totalFrames = 10;
        boolean[] received = new boolean[totalFrames];
        Random random = new Random();

        int base = 0;
        while (base < totalFrames) {
            System.out.println("\nWindow: Base=" + base);

            for (int i = base; i < base + windowSize && i < totalFrames; i++) {
                if (!received[i]) {
                    System.out.println("Sending frame: " + i);
                    if (random.nextBoolean()) {
                        System.out.println("ACK received for frame: " + i);
                        received[i] = true;
                    } else {
                        System.out.println("Timeout/Error: Frame " + i + " needs retransmission.");
                    }
                }
            }

            // Slide the window to the next unreceived frame
            while (base < totalFrames && received[base]) {
                base++;
            }
        }

        System.out.println("All frames successfully sent using Selective Repeat ARQ!\n");
    }
}

public class ARQProtocolsDemo {
    public static void main(String[] args) {
        StopAndWaitARQ stopAndWait = new StopAndWaitARQ();
        stopAndWait.simulate();

        GoBackNARQ goBackN = new GoBackNARQ();
        goBackN.simulate(4); // Window size = 4

        SelectiveRepeatARQ selectiveRepeat = new SelectiveRepeatARQ();
        selectiveRepeat.simulate(4); // Window size = 4
    }
}
