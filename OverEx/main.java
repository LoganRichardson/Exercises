package OverEx;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int i = Integer.parseInt(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        System.out.println("Enter 2nd number:");
        int j = Integer.parseInt(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        System.out.println("Enter 3rd number:");
        int k = Integer.parseInt(scanner.nextLine());
        
        classB method = new classB(i, j, k);
        method.show();
    }
}
