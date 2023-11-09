import javax.swing.*;

public class singletonmain {
    public static void main(String[] args) {

    Singleton obj = Singleton.getInstance();
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
//        System.out.println("obj1 = "+obj.hashCode());
//        System.out.println("obj2 = "+obj1.hashCode());
//        System.out.println("obj3 = "+obj2.hashCode());
//    oops3 cube = new oops3(2);
//        System.out.println(cube.l+" "+ cube.h+" "+ cube.w);
//        Boxweight cube2 = new Boxweight();
//        System.out.println(cube2.weight);
//        Boxweight cube3 = new Boxweight(2,3,5,6);
//        System.out.println(cube3.weight+" "+cube3.l+" "+cube3.w);
        Boxprice box = new Boxprice(2,4,5,65,100);
        System.out.println(box.l);

    }
    //all hashcodes are same which means all points to same object

    //all three variables obj,obj1,obj2 pointing to same object
    //only one object is created in singleton class

//    Singleton obj1 = Singleton.getInstance();


}
