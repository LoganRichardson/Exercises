package fib;

public class fib2 {
    public static void main(String[] args) {
        int value = 10;
        System.out.println(fib(value));
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
