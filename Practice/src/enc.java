public class enc {
    public static void main(String[] args) {
        int[] num = {10,21,31};
        System.out.println(sumOfEncryptedInt(num));
    }
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int ele:nums){
            sum+=encrypt(ele);
        }
        return sum;
    }
    public static int encrypt(int a){
        int max = Integer.MIN_VALUE;
        int count=0;
        while (a>0){
            count++;
            int ld = a%10;
            max = Math.max(ld,max);
            a/=10;
        }
        if (count == 0) {
            count = 1;
        }

        int encrypted = 0;

        // Construct the encrypted number using the maximum digit
        for (int i = 0; i < count; i++) {
            encrypted += (int) (Math.pow(10, i) * max);
        }

        return encrypted;
    }
}
