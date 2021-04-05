package misc;

import java.util.Scanner;

public class quadrantPoint {

    int x;
    int y;

    public quadrantPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String quadrantValue(){
        if(x == 0 || y == 0){
            return "Quadrant 0";
        }else if(x > 0 && y > 0){
            return "Quadrant 1";
        }else if(x < 0 && y > 0){
            return "Quadrant 2";
        }else if(x < 0 && y < 0){
            return "Quadrant 3";
        }else if(x > 0 && y < 0){
            return "Quadrant 4";
        }
        return null;
    }
}

class Point {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value for x: ");
        int x = scanner.nextInt();
        System.out.println("Value for y: ");
        int y = scanner.nextInt();
        quadrantPoint quadrant = new quadrantPoint(x, y);
        String quad = quadrant.quadrantValue();
        System.out.println(quad);
    }
}
