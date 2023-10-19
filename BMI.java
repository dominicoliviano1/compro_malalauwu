package oliviano_activity;

import java.util.Scanner;
public class BMI  {
   public static void main(String [] args) {
     Scanner Scanner1 = new Scanner(System.in);
       System.out.print("Enter Height in cm:");
       int height = Scanner1.nextInt();
       
       System.out.print("\nEnter Weight in kg:");
       int weight = Scanner1.nextInt();
       
       double bmi_height = height * 0.01;
       double totalbmi = weight / (bmi_height * bmi_height);
       
       System.out.println("\nTotal BMI:" + String.format("%.2f",totalbmi));
       
      
       
       if (totalbmi <= 18.5) {
           System.out.println("\nYou are" + "[Underweight]");
       } 
       else if (totalbmi <= 24.9) {
           System.out.println("\nYou are" + "[Healthy]");
       }   
       else if (totalbmi <= 29.9) {
           System.out.println("\nYou are" + "[Overweight]");
       }
       else if (totalbmi <= 39.9) {
           System.out.println("\nYou are" + "[Obese]");
       }
       else if (totalbmi > 40) {
           System.out.println("\nYou are" + "[Obese++]");
       }
           
   } 
}
    