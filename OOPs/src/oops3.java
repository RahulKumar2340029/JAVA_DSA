public class oops3 {
    double l;
    double h;
    double w;
    oops3(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    oops3(double size){
        this.w = size;
        this.l = size;
        this.h = size;
    }
    oops3(double length,double height,double width){
        this.l = length;
        this.w = width;
        this.h = height;
    }
    //constructor that takes another constructor
    oops3(oops3 old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
