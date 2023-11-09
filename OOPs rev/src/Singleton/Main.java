package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.name);
        obj.name = "kunal kushwaha";
        System.out.println(obj.name);
    }
}
