package SuperKeyword;

public class Banana extends Apple{
    int number_of_items;    
    
    public Banana(int number_of_items, int number_of_apples){
        this.number_of_items = number_of_items;
        super.number_of_items = number_of_apples;
    }
    
    public void show(){
        System.out.println("Number of apples: " + number_of_items);
        System.out.println("Number of Bananas: " + super.number_of_items);
    }
    
    
}