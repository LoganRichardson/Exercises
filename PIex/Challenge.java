package PIex;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String iName = scanner.nextLine();

        System.out.println("Enter unit price: ");
        Double iPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter weight: ");
        double iWeight = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Enter name: ");
        String jName = scanner.nextLine();

        System.out.println("Enter unit price: ");
        Double jPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter quantity: ");
        int jQuantity = Integer.parseInt(scanner.nextLine());
        
        
        WeighedItem method1 = new WeighedItem(iWeight, iName, iPrice);
        CountedItem method2 = new CountedItem(jQuantity, jName, jPrice);
        
        method1.toString();
        method2.toString();

    }
}
