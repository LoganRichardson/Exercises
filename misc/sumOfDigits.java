package misc;

import java.util.Scanner;

public class sumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date: ");
        int date = scanner.nextInt();
        int temp = 0;
        
        while(date > 0){
            temp = temp + (date % 10);
            date = date / 10;
        }
        if(date == 0){
            date = temp;
            temp = 0;
        }
        while(date > 0){
            temp = temp + (date % 10);
            date = date / 10;
        }
        
        System.out.println(temp);
    }
}
