/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalculator;

import java.util.Scanner;
/**
 *
 * @author Lab6 - PC16
 */
public class FactorialCalculator {

    static void factorial (int num1) {
        int factorial = num1;
        System.out.print(num1 + "! x ");
        for (int rep = 1; rep <= num1; rep++) {
            
            System.out.print(rep);
            if (rep <= (num1 - 1)){
                System.out.print(" x ");
                factorial *= rep;
                
            }
        }
        
        System.out.println("\nThe Factorial of " + num1 + " is: " + factorial);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<----- Factorial Calculator ----->");
        while (true) {
        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();
        
        if (num >= 0) {
            
            factorial(num);
        } else {
            System.out.println("Error: Negative value or Invalid input.");
            break;
        }
        }
    }
}

