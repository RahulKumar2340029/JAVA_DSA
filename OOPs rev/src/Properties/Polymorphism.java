package Properties;

public  class Polymorphism {
     void greeting(){
        System.out.println("I am in parent class");
    }
     void greeting(String name){
        System.out.println("hi I am "+name);
    }

     void greeting(int age){
        System.out.println("I am "+age);
    }
}
class dynamic extends Polymorphism{
    @Override//if it is showing error then child class is not overridden(@Override is an annotation)
    void greeting(){
        System.out.println("I am in child class");
    }
}
