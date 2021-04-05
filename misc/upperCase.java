package misc;

import java.util.Scanner;

public class upperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a sentance: ");
        String txt = scanner.nextLine();
        System.out.println(txt.toUpperCase());
    }
}
