package Properties;
 public class Box {
     float l;float b;float h;
     Box(){
         this.l = -1;
         this.b = -1;
         this.h = -1;
     }

      Box(float l, float b, float h) {
         this.l = l;
         this.b = b;
         this.h = h;
     }
     Box(Box old){
         this.l = old.l;
         this.b = old.b;
         this.h = old.h;
     }
     public static void greeting(){
         System.out.println("Hello i am method in class Box");
     }
 }
class ChildBox extends Box{
     int weight;

    public ChildBox(float l, float b, float h, int weight) {
        super(l, b, h);//only one line instead of this keyword
//        this.l = l;//this is workable but not fine idea for child class to access parent class
//        this.b = b;
//        this.h = h;
        this.weight = weight;
    }
}

