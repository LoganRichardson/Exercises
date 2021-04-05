package interfaces;

interface WaterBottleInterface{
    String color = "Blue";
    
    void fillUp();
}

public class interfaceExample implements WaterBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);
        interfaceExample ex = new interfaceExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled up");
    }
}
