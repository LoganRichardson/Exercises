package SuperKeyword;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of apples: ");
        int appleN = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the number of bananas: ");
        int bananaN = Integer.parseInt(scanner.nextLine());
        
        Banana method = new Banana(appleN, bananaN);
    }
}
