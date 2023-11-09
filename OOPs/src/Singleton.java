public class Singleton {
    private Singleton(){};
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance  = new Singleton();
        }
        return instance;
    };
//    private Singleton(){
//
//    };
//    static Singleton abc = new Singleton();
//    public static Singleton getInstance(){
//        return abc;
//    }
}

