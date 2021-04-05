package factorial;

public class index2 {
    public static void main(String[] args) {
        int value = 10;
        System.out.println(factorial(value));
    }
    public static int factorial(int value){
        if(value == 0){
            return 1;
        }
        return value * factorial(value - 1);
    }
}
