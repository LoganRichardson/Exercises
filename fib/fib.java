package fib;
public class fib {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(fib(num));
    }
    public static int fib(int value){
        if(value == 0){
            return 0;
        }
        if(value == 1){
            return 1;
        }
        return fib(value - 1) + fib(value - 2);
    }
    
}
