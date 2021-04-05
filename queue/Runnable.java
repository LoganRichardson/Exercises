package queue;

public class Runnable {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(1);
        q.enQueue(12);
        q.enQueue(6);
        
        q.deQueue();
        //q.deQueue();
        
        q.show();
        
        System.out.println("");
        System.out.println("Size is: " + q.getSize());
        System.out.println("");
    }
}
