package Singleton;

public class Singleton {
    public String name;
    public int age;
    private Singleton(){
       name = "Rahul";
       age = 24;
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
