package cp;

import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(t>0){
            t--;
            int a = in.nextInt();
            list.add(a);

        }
        List<Integer> result= removeConsecutiveDuplicates(list);
        System.out.println(result.size());

    }
    public static List<Integer> removeConsecutiveDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        if (list.isEmpty()) {
            return result;
        }
        result.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        Set<Integer> set = new HashSet<>();
//        boolean flag =false;
//        while (t>0){
//            t--;
//            int a = in.nextInt();
//            set.add(a);
//            if (set.contains(1)) {
//                flag = true;
//                System.out.println("HARD");
//                break;
//            }
//        }
//        if (!flag){
//            System.out.println("EASY");
//        }
//
//
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int year = in.nextInt();
//        year++;
//        while (!distinct(year)){
//            year++;
//        }
//        System.out.println(year);
//    }
//    public static boolean distinct(int year){
//        ArrayList<Integer> dis = new ArrayList<>();
//        while (year>0){
//            dis.add(year%10);
//            year/=10;
//        }
//        int size = dis.size();
//        Set<Integer> set = new HashSet<>();
//        while(!dis.isEmpty()){
//            set.add(dis.remove(0));
//        }
//        return size==set.size();
//    }
//    public static void main(String[] args) {
//        //vlad and the sum of sum of digits
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        int[] arr = new int[t];int k = 0;
//        while (t>0){
//            t--;
//            int a = in.nextInt();
//            arr[k++] = a;
//        }
//        int l = 0;
//        int[] sum = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int s = 0;
//            for (int j = 1; j <= arr[i]; j++) {
//                s += sumofsumofdigits(j);
//            }
//            sum[l++] = s;
//        }
//
//        for (int ele:sum){
//            System.out.println(ele);
//        }
//
//    }
//    public static int sumofsumofdigits(int n){
//        if (n<10){
//            return n;
//        }
//        int sum = 0;
//        while (n>0){
//            sum+=n%10;
//            n/=10;
//        }
//        return sumofsumofdigits(sum);
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        int k = 0;String[] arr = new String[t];
//        while (t>0){
//            String s = in.next();
//            arr[k++] = s;
//            t--;
//        }
//        for (int i = 0;i<arr.length;i++){
//            System.out.println(max(arr[i]));
//        }
//    }
//    public static char max(String s){
//        int counta = 0,countb = 0;
//        for(char ele:s.toCharArray()){
//            if (ele=='A') counta++;
//            else countb++;
//        }
//        if (counta>countb){
//            return 'A';
//        }else{
//            return 'B';
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input the friend's house location
//        int x = scanner.nextInt();
//
//        // Calculate the minimum number of steps needed
//        int minSteps = (x + 4) / 5; // Adding 4 before dividing ensures rounding up
//
//        // Output the result
//        System.out.println(minSteps);
//
//        scanner.close();
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
//        int price = in.nextInt();
//        int banana = in.nextInt();
//        long sum = 0;
//        for (int i = 0; i < banana; i++) {
//            sum+=(i+1)*k;
//        }
//        if (sum>price){
//            System.out.println(sum - price);
//        }else{
//            System.out.println(0);
//        }
//
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        int max = Integer.MIN_VALUE;
//        int initialcap = 0;
//        while (t>0){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            initialcap = initialcap - a + b;
//            max = Math.max(initialcap,max);
//            t--;
//        }
//        System.out.println(max);
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String s = in.next();
//        int counta = 0, countd = 0;
//        for (int ele : s.toCharArray()) {
//            if (ele == 'A') counta++;
//            else countd++;
//        }
//        if (counta > countd) {
//            System.out.println("Anton");
//        } else if (counta < countd) {
//            System.out.println("Danik");
//        } else {
//            System.out.println("Friendship");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        String s2 = in.next();
//        StringBuilder rev1 = new StringBuilder(s).reverse();
//        String rev = rev1.toString();
//        if (s2.equals(rev)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }

