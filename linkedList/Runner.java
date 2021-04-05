package linkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("2");
        list.insert("4");
        list.insert("6");
        list.insert("8");
        list.insert("10");
        list.insert("12");
        list.insert("14");
        list.show();
        
        System.out.println("");
        
        list.middleElement();
        System.out.println("");
        list.thirdToLast();
    }
}
