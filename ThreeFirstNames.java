/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threefirstnames;
import java.util.Scanner;

/**
 *
 * @author Lab6 - PC16
 */
public class ThreeFirstNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("Enter Three Names:");
        String a = scan1.next(); //John
        char a1 = a.charAt(0);
        String b = scan1.next(); //Matthew
        char b1 = b.charAt(0);
        String c = scan1.next(); //Peter
        char c1 = c.charAt(0);
        
        
        
        System.out.println("Possible Names are:");
        System.out.println("1." + a + " " +  b);
        System.out.println("2." + a + " " +  c);
        System.out.println("3." + b + " " +  c);
        System.out.println("4." + b + " " +  a);
        System.out.println("5." + c + " " +  b);
        System.out.println("6." + c + " " +  a);
        
        System.out.println("Enter 1-6 to select a name:");
        int number = scan1.nextInt();
        
        switch (number) {
            
            case 1: //a + b
                System.out.println("The initials for" + " " + a + " " + b + " " + "is" + " " + a1 + b1 );
                System.out.println("Suggested username: " + a + "_" + b);
                break;
                
            case 2: //a + c
                System.out.println("The initials for" + " " + a + " " + c + " " + "is" + " " + a1 + c1 );
                System.out.println("Suggested username: " + a + "_" + c);
                break;
                
            case 3: //b + c
                System.out.println("The initials for" + " " + b + " " + c + " " + "is" + " " + b1 + c1 );
                System.out.println("Suggested username: " + b + "_" + c);
                break;
                
            case 4: //b + a
                System.out.println("The initials for" + " " + b + " " + a + " " + "is" + " " + b1 + a1 );
                System.out.println("Suggested username: " + b + "_" + a);
                break;
                
            case 5: //c + b
                System.out.println("The initials for" + " " + c + " " + b + " " + "is" + " " + c1 + b1 );
                System.out.println("Suggested username: " + c + "_" + b);
                break;
                
            case 6: //c + a
                System.out.println("The initials for" + " " + c + " " + a + " " + "is" + " " + c1 + a1 );
                System.out.println("Suggested username: " + c + "_" + a);
                break;
        }
        
    }
    
}
