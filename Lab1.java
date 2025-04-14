import java.util.*;

class Lab1{
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis());
        // Random rnd = new Random();
        // while(rnd.nextBoolean()){
        //     System.out.println(rnd.nextBoolean());
        // }
        StopandWait(5);
    }
    public static void StopandWait(int n){
        int frame = 1;
        Random rand = new Random();
        
        while(frame <= n){
            int outcome = rand.nextInt(3);
            switch (outcome) {
                case 0:
                    System.out.println("Frame "+frame+" acknowledged. Send next frame.");
                    frame++;
                    break;
                case 1:
                    System.out.println("Error sending frame: "+frame+" Resending ....");
                    break;
                case 2:
                    System.out.println("Timeout! No Ack recieved. Resending frame "+frame);
                    break;
            
                default:
                    break;
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        }
        System.out.println("All frames successfully transmitted.");
        
    }


    public static void GoBackN(){
        
    }
}
