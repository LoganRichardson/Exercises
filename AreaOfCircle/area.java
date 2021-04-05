package AreaOfCircle;

import java.util.Scanner;

public class area {
    double radius;
    
    public double areaCalc(){
        Scanner scanner=new Scanner(System.in);      
        System.out.println("Enter radius:");
        this.radius = Double.parseDouble(scanner.nextLine()); 
        double area = 3.14 * (radius*radius);
        return area;
    }
}