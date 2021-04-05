package misc;

import java.util.Scanner;

public class Challenge{

 public static void main(String args[]){
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter first name:");
 String first = scanner.nextLine();
 System.out.println("Enter last name:");
 String last = scanner.nextLine();
 System.out.println("Enter monthly salary:");
 double salary = scanner.nextDouble();
 Employee e1 = new Employee(first,last,salary);
 
 System.out.println("First name:"+e1.getFirst());
 System.out.println("Last name:"+e1.getLast());
 System.out.println("Salary:"+e1.getSalary());
 
 }
}

class Employee{
    String firstName;
    String lastName;
    double salary;
    
    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public String getFirst(){
        return firstName;
    }
    
    public String getLast(){
        return lastName;
    }
    
    public double getSalary(){
        if(salary < 0){
            return 0;
        }
        return salary;
    }
}