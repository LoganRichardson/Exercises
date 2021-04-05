package misc;

import java.util.Scanner;

public class numToWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        numberToWord(number);
    }
    
    public static void numberToWord(int num){
        String[] ones = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {" ", " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
        
        
        if(num > 19){
            System.out.println(tens[num / 10] + " " +  ones[num % 10]);
        }else
            System.out.println(ones[num]);
            
    }
}
