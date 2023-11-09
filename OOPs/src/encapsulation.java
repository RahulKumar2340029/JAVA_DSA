class Demo {
    private int Age ;
    private String Name;
//    public void setAge(int age){
//        Age = age;
//    }
//    public void setName(String name){
//        Name = name;
//    }
//    public int getAge(){
//        return Age;
//    }
//    public String getName(){
//        return Name;
//    }


}
abstract class Car{//you cant create object of abstract class
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println(" Driving WagonR");
    }
}

public class encapsulation {
    public static void main(String[] args) {
//        Demo obj = new Demo();
//        obj.setAge(24);
//        obj.setName("Naveen Reddy");
//        System.out.println("Hi! my name is "+obj.getName()+" and my age is "+obj.getAge());
        Car obj = new WagonR();
        obj.drive();

    }
}
