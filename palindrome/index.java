package palindrome;

public class index {
    public static void main(String[] args) {
        int value = 1234321;
        int check = value;
        int rev = 0;
        while(value != 0){
            rev = (rev * 10) + (value % 10);
            value = value / 10;
        }
        System.out.println("Original: " + check);
        System.out.println("New: " + rev);
        
        if(check == rev){
            System.out.println("Is a palindrome");
        }
    }
}
