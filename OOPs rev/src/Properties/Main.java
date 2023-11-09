package Properties;

public class Main {
    public static void main(String[] args) {
//        ChildBox obj = new ChildBox(2,5,3,25);
//        System.out.println(obj.l);
//        obj.weight = 45;
//        obj.l = 25;
//        System.out.println(obj.l);
//        Box obj = new Box();
//        Polymorphism obj = new Polymorphism();
//        obj.greeting();
//        obj.greeting("Rahul");
//        obj.greeting(24);
//        dynamic obj1 = new dynamic();
//        obj1.greeting();
        Encapsulation obj = new Encapsulation();
        obj.setCode(2023);obj.setName("karnrahul");
        System.out.println("Passcode: "+ obj.getCode());
        System.out.println("User-Name: "+obj.getName());


    }
}
