package PIex;

public class PurchaseItem {

    private String name;
    private double unitPrice;

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return unitPrice;
    }

    public double setPrice(double unitPrice) {
        return this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name + this.unitPrice;
    }
    
}
