package primeNumbers;

public class index {
    public static void main(String[] args) {
        int value = 7;
        System.out.println(prime(value));
    }
    
    public static boolean prime(int value){
        if(value == 1){
            return true;
        }
        if(value == 0 || value == 2){
            return false;
        }
        for (int i = 2; i < value; i++) {
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
}
