package GrossPayCalculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String args []) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String employeeName = scanner1.nextLine();      //Employee Name
        
        System.out.println("Press P for Part Time or F for Full time:");
        char choice = scanner1.next().charAt(0);
        
        if (choice == 'P'){
            System.out.println("--- Part Time Employee ---");
            System.out.println("Enter rate per hour:");
            double rph = scanner1.nextInt();
            
            System.out.println("Enter no. of hours worked:");
            double hours = scanner1.nextInt();
            
            System.out.println("Enter no. of overtime:");
            double ot = scanner1.nextInt();
            
            double basicPay = rph * hours;
            double otPay = ot * (rph * 1.25);
            
            System.out.println("___________________________________");
            System.out.println("Employee Name:" + employeeName);
            System.out.println("Basic Pay:" + basicPay);
            System.out.println("Overtime Pay:" + otPay);
        }
        else if (choice == 'F') {
            System.out.println("--- Full Time Employee ---");
            System.out.println("Enter Basic Pay:");
            double bp = scanner1.nextDouble();
            System.out.println("__________________________");
            System.out.println("Employee Name:" + employeeName);
            System.out.println("Basic Pay:" + bp);
            System.out.println("__________________________");
            System.out.println("Gross Pay:" + bp);
                    }
        else {
            
           System.out.println("Oops! Wrong Keyword!"); 
        }
        
        
        
    }
    
}
