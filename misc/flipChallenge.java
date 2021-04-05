package misc;

import java.util.Scanner;

class PointC{
    int x;
    int y;
    
    public PointC(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void flip(){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping:");
        System.out.println("x coordinate: " + x);
        System.out.println("y coordinate: " + y);
    }
}

public class flipChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.println("Enter y coordinate: ");
        int y = scanner. nextInt();
        PointC point = new PointC(x, y);
        point.flip();
    }
}
