public class Deal {
    private double width;
    private double length;
    private int price;
    private double cost;
    private boolean fairness;

    public Deal(double width, double length, int price, int recommendPrice) {
        this.width = width;
        this.length = length;
        this.price = price;
        this.fairness = getCost() > (double) recommendPrice;
    }

    @Override
    public String toString() {
        return "Deal {" +
                "width=" + Math.round(width) +
                ", length=" + Math.round(length) +
                ", cost=" + getCost() +
                ", fairness=" + fairness +
                '}';
    }

    public double getCost() {
        return Math.round(width * length * price);
    }
}