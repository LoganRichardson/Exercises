package reversePrograms;

public class numberReverse {
public static void main(String[] args) {
        int temp = 12345;
        int rev = 0;
        while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println(rev);
    }
}
