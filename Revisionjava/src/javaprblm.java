//import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;


public class javaprblm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Local date time
//        LocalDateTime x = LocalDateTime.now();
//        System.out.println(x);
        //ASCII VALUE OF CHAR
//        char ch = in.next().charAt(0);
//        int ascii = ch;
//        System.out.println(ascii);
        //MILLISECONDS TO MIN AND SECOND
        long mil = in.nextInt();
        long min = mil/60000;
        long sec = mil/1000;
        System.out.println("minutes = "+min+" seconds = "+sec);
        //FIND REMAINDER AND QUOTIENT
//        System.out.print("Enter dividend: ");
//        int n= in.nextInt();
//        System.out.print("Enter divisor: ");
//        int n2 = in.nextInt();
//        int rem = n/n2;
//        int quo = n-n2*rem;
//        System.out.println("The quotient is "+quo+" and the remainder is "+rem);
        //SWAP TWO NUMBERS
//        int n = in.nextInt();
//        int n2 = in.nextInt();
//        int temp = n;
//        n = n2;
//        n2 = temp;
//        System.out.println(n+" "+n2);
        //even or odd
//        int n = in.nextInt();
//        if (n%2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//        char ch =in.next().charAt(0);
//        if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//            System.out.println("vowel");
//        }else{
//            System.out.println("consonant");
//        }
        //largest among three nos
//       int n1 = in.nextInt();
//       int n2 = in.nextInt();
//       int n3 = in.nextInt();
//        if (n1>n2&&n1>n3){
//            System.out.println("max is"+n1);
//        }else if(n2>n1&&n2>n3){
//            System.out.println(n2);
//        }else{
//            System.out.println(n3);
//        }
        //roots of quadratic equations
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();double x1,x2;
//        System.out.println("Quadratic equation is "+a+"x^2+"+b+"x+"+c+"=0");
//        double D = b*b-4*a*c;
//        if (D>=0){
//            x1 = (-b-Math.sqrt(D))/2*a;
//            x2= (-b+Math.sqrt(D))/2*a;
//            System.out.println(x1+" "+x2);
//        }else{
//            System.out.println("imaginary roots");
//        }
        //check leap year
       //check positive or negative
//        float n= in.nextFloat();
//       if (n<0){
//           System.out.println("negative");
//       }else if(n>0){
//           System.out.println("positive");
//       }else{
//           System.out.println("It's zero");
//       }

//        char ch = in.next().charAt(0);
//        if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
//            System.out.println("Alphabet");
//        }else{
//            System.out.println(" not an Alphabet");
//        }
        //sum of natural numbers
//        int n = in.nextInt();
//        int ans = (n*(n+1))/2;
//        System.out.println(ans);
        //factorial of a number
//        int n  = in.nextInt();
//        long fact=1;
//        if (n<0){
//            System.out.println("factorial not exist");
//        }else if(n==0||n==1){
//            System.out.println("1");
//        }else{
//            for (int i = 1; i <=n; i++) {
//                fact = fact*i;
//            }
//        System.out.println(fact);
//        }
        //generate multiplication table
//        int n = in.nextInt();
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(n+"x"+i+" = "+n*i);
//        }
        //fibonacci numbers
//        int fib1=1,fib2 = 1;int counter = 0;
//        int n = in.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            System.out.println(fib1);
//            int fib = fib1+fib2;
//            fib1 = fib2;
//            fib2 = fib;
//        }
        //GCD
//        int n1= in.nextInt();int gcd=1;
//        int n2 = in.nextInt();
//        for (int i = 1; i <=n1&&i<=n2 ; i++) {
//            if (n1%i==0&&n2%i==0){
//                gcd=i;
//            }
//        }
//            System.out.println(gcd);
        //ALPHABETS USING LOOPS

//        for ( char ch = 'A'; ch <='Z' ; ch++) {
//            System.out.print(" "+ch);
//        }
        //count no of digits
//        int n = in.nextInt();
//        int counter = 0;
//        while (n!=0){
//
//            n = n/10;
//            counter++;
//        }
//        System.out.println(counter);
        //reverse a number
//        int n = in.nextInt();int sum=0;
//        while (n!=0){
//            int ld = n%10;
//            n /=10;
//            sum = sum*10+ld;
//        }
//        System.out.println(sum);
        //calculate the power of a number{IMPORTANT}
//        int n = in.nextInt();
//        int pow = in.nextInt();
//        int ans=1;
//        while (pow!=0){
//            ans = ans*n;
//            pow--;
//        }
//        System.out.println(ans);
        //check prime or not
//        int n = in.nextInt();
//        int count=0;
//        for (int i = 1; i <=n ; i++) {
//            if (n%i==0){
//                count++;
//            }
//
//        }
//        if (count==2){
//            System.out.println("Prime");
//        }else{
//            System.out.println("Non-Prime");
//        }
        //prime number between intervals
//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//        for (int i = n1; i <=n2 ; i++) {
//            if (isPrime(i)){
//                System.out.println(i);
//            }
//        }
        //Factors of a number
//        int n= in.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            if (n%i==0){
//                System.out.println(i);
//            }
//        }
        //Calculator using Switch-Case
//        System.out.print("Enter first no = ");
//        float first = in.nextFloat();
//        System.out.print("Enter second no = ");
//        float second = in.nextFloat();
//        System.out.println("Enter Op[first three letters of op i.e. addition=add]");
//        String n = in.next();
////        System.out.println("1=>+,2=>-,3=>x,4=>/,5=>%");
//        switch (n){
//            case "add":{
//                System.out.println(first+second);
//                break;
//            }
//            case "sub":{
//                System.out.println(first-second);
//                break;
//            }
//            case "mul":{
//                System.out.println(first*second);
//                break;
//            }
//            case "div":{
//                System.out.println(first/second);
//                break;
//            }
//            case "mod":{
//                System.out.println(first%second);
//                break;
//            }
//            default:{
//                System.out.println("Enter Valid expression!");
//            }
//
//        }

        //BOOLEAN TO DECIMAL
//        System.out.println("only 1 or 0 allowed");
//       int n = in.nextInt();int sum=0;int i=0;
//
//
//        while (n!=0){
//            int ld = n%10;
//            n = n/10;
//            sum+=ld*Math.pow(2,i);
//            ++i;
//        }
//        System.out.println(sum);
        //OCTAL TO DECIMAL
//        int n = in.nextInt();int i=0;int sum=0;
//        while (n!=0){
//            int ld = n%10;
//            n/=10;
//            sum+=ld*Math.pow(8,i);
//            ++i;
//        }
//        System.out.println(sum);
        //Decimal to Octal
//        int n = in.nextInt();
//        int octal=0;int i=1;
//        while (n!=0){
//
//            octal+=(n%8)*i;
//            n/=8;
//            i*=10;
//        }
//        System.out.println(octal);
//        System.out.println(power(2,4));
//        String name = in.nextLine();
//        if (name==null){
//            System.out.println(name);
//        }else if (name.trim().isEmpty()){
//            System.out.println("String is Empty");
//        }else{
//            System.out.println("Not Empty");
//        }
        //CONCATANATE TWO ARRAYS
//        int []arr1 = {1,2,3};
//        int []arr2 = {4,5,6,8,10,15};
//        int []ans = new int[arr1.length+arr2.length];
//        int pos=0;
//        for (int i = 0; i <arr1.length ; i++) {
//            ans[i] = arr1[i];
//            pos=pos+1;
//        }
//        for (int i = 0; i <arr2.length ; i++) {
//            ans[pos] = arr2[i];
//            pos++;
//        }
//        System.out.println(Arrays.toString(ans));

        //COMPARE STRINGS
//        String a =in.nextLine();
//        String b = in.nextLine();
//        if (a.equals(b)){
//            System.out.println("equal");
//        }else{
//            System.out.println("not equal");
//        }
        //STRING IS NUMERIC OR NOT=======================================================

    }
//    static int power(int b,int p){
//        if (p==0) return 1;
//        return b*power(b,p-1);
//    }


//    static boolean isPrime(int n){
//        if (n<=0){
//            return false;
//        }
//        for (int i = 2; i <=Math.sqrt(n) ; i++) {
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
}
