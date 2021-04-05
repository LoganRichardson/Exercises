package PIex;

public class WeighedItem extends PurchaseItem {

    private double weight;


    public WeighedItem(double weight, String name, double unitPrice) {
        super(name, unitPrice);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double setWeight(double weight) {
        return this.weight = weight;
    }

    @Override
    public String toString() {
        return super.getName() + "@ " + weight + " kg " + "" + super.getPrice() + " $";
    }

}
