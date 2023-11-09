public class Boxprice extends Boxweight {
    double price;

    public Boxprice(double length, double height, double width, double weight, double price) {
        super(length, height, width, weight);
        this.price = price;

    }
}
