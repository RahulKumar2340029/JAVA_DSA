import java.util.Arrays;

// class Test{
//    static String name;
//    public Test(String name){
//        Test.name = name;
//    }
public class Static {
    String name;
    public void greeting(String name){
        System.out.println("Hi i am "+name);
    }
//        class A{
//            public void config(){
//                System.out.println("in configuration!");
//            }
            static class A{
            public void config(){
                System.out.println("in configuration!");
            }

    }


    public static void main(String[] args) {
//        Test A = new Test("Rahul");
//        Test B = new Test("Kunal");
//        System.out.println(A.name);
//        System.out.println(B.name);
        System.out.println(Arrays.toString(new int[]{1,2,3}));

        Static obj = new Static(){
            public void greeting(String name){
                System.out.println("hi"+name);
            }
        };
        obj.name = "kunal";
        obj.greeting("Rahul");
//        Static.A obj1= obj.new A();for non-static class A
        Static.A obj1 = new Static.A();//for static inner class A
        obj1.config();
    }

}
