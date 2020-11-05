package company.Comparatorok.Pub;

public class Drink {
    private String type;
    private double quantity;
    private double alcoholLevel;
    private int price;


    public Drink(String type, double quantity, double alcoholLevel, int price) {
        this.type = type;
        this.quantity = quantity;
        this.alcoholLevel = alcoholLevel;
        this.price = price;
    }

    public String getType() {
        return type;
    }
}
