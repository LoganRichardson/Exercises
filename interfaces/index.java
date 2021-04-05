package interfaces;

import java.text.DecimalFormat;
import java.util.Scanner;

interface Shape{
    double area(double length, double width, double radius, int choice);
    double peri(double length, double width, double radius, int choice);
        }

public class index implements Shape{

    public static void main(String[] args) {
        System.out.println("Cirlce [1]");
        System.out.println("Rectangle [2]");
        System.out.println("Square [3]");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        index math = new index();
        int x = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("0.0");
        if(x == 1){
            System.out.println("Enter the Radius");
            double r = scanner.nextInt();
            System.out.println("Area of circle is: " + df.format(math.area(0, 0, r, x)));
            System.out.println("Perimeter of circle is: " + df.format(math.peri(0, 0, r, x)));
        }
        else if(x == 2){
            System.out.println("Enter the length");
            double l = scanner.nextInt();
            System.out.println("Enter the width");
            double w = scanner.nextInt();
            System.out.println("The Area of the Rectangle is: " + df.format(math.area(l, w, 0, x)));
            System.out.println("The Perimeter of the Rectangle is: " + df.format(math.peri(l, w, 0, x)));
        }
        else if(x == 3){
            System.out.println("Enter the area.");
            int a = scanner.nextInt();
            System.out.println("The Area of the Square is: " + df.format(math.area(a, 0, 0, x)));
            System.out.println("The Perimeter of the Square is: " + df.format(math.peri(a, 0, 0, x)));
        }
        
    }
    
    @Override
    public double area(double length, double width, double radius, int choice) {
        if(choice == 1){
            return Math.PI * Math.pow(radius, 2);            
        }
        else if(choice == 2){
            return (length * width);
        }
        else if(choice == 3){
            return Math.pow(length, 2);
        }
        return 0;
    }

    @Override
    public double peri(double length, double width, double radius, int choice) {
        if(choice == 1){
            return 2 * Math.PI * radius;
        }
        else if(choice == 2){
            return 2 * (length + width);
        }
        else if(choice == 3){
            return 4 * length;
        }
        return 0;
    }

}
