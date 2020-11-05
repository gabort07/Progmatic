package company.Comparatorok.Pub;

public class Drink {
    private String type;
    private double quantity;
    private double alcoholLevel;
    private int price;
    private double dose;


    public Drink(String type, double quantity, double alcoholLevel, int price, double dose) {
        this.type = type;
        this.quantity = quantity;
        this.alcoholLevel = alcoholLevel;
        this.price = price;
        this.dose=dose;
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getAlcoholLevel() {
        return alcoholLevel;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", alcoholLevel=" + alcoholLevel +
                ", price=" + price +
                '}';
    }
}
