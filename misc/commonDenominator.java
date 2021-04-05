package misc;

public class commonDenominator {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 50;
        int max;
        int gcd = 0;
        
        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }
        
        for (int i = 1; i <= max; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        
        System.out.println("GCD: " + gcd);
    }
}
