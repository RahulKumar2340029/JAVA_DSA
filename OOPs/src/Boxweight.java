public class Boxweight extends oops3{
    double weight;
    public Boxweight(){
        this.weight = 82;
    }

    public Boxweight(double length, double height, double width, double weight) {
        super(length, height, width);//call the parent class function
        this.weight = weight;
    }

}
