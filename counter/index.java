package counter;

public class index extends Counter {
    public static void main(String[] args) {
        Counter method = new Counter();
        int temp = 0;
        while(temp != 3){
            temp = method.increment().i;
            if(temp == 3){
                method.print();
            }
        }
        
        
    }
}