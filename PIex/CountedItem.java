package PIex;

public class CountedItem extends PurchaseItem {

    private int quantity;
    private String name;
    private double unitPrice;

    public CountedItem(int quantity, String name, double unitPrice) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        return this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.getName() + "@ " + quantity + " kg " + "" + super.getPrice() + " $";
    }

}
