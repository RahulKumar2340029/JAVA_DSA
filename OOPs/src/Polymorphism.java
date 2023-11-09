//METHOD OVERRIDING IN JAVA (RUNTIME/DYNAMIC POLYMORPHISM)
class A{
    public int age(int a){
        return a;
    }
    public void greeting(String name){
        System.out.println("Hi "+name);
    }
}
class B extends Demo {
    public int age(int a){
        return a*2;
    }
}
public class Polymorphism {
//METHOD OVERLOADING(COMPILE TIME POLYMORPHISM)
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Demo obj1 = new Demo();
//        obj1.age(45);
        B obj2 = new B();
        int ans = obj2.age(62);
        System.out.println(ans);
//        Polymorphism obj = new Polymorphism();
//        obj.sum(2,3);
//
//        System.out.println(   obj.sum(5,2,9));
    }
}
