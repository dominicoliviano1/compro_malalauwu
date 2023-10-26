package test;
import java.util.*;
public class Test {
    public  static void main (String [] args) {
        Scanner Scanner1 = new Scanner(System.in);
        int pin = 136725;
        
        System.out.print("Enter your pin: ");
        int pin1 = Scanner1.nextInt();
        if (pin == pin1){
            
        
        System.out.println ("1. Hiking");
        System.out.println ("2. Cycling");
        System.out.println ("3. Online Games");
        System.out.println ("4. Reading");
        System.out.println ("5. Sports");
        System.out.println ("What is your hobby in life?");
        int input = Scanner1.nextInt();
        
        
        
        switch (input) {
            
            case 1: //case 1 for hiking
                System.out.println("Wow that's interesting! Click here foor a free booking ===> hikingguide.com");
                break;
            
            case 2: //case 2 for cycling
                System.out.println("6. Mountain Bike");
                System.out.println("7. Road Bike");
                System.out.println("Please pick the bike of your choosing");
                int input2 = Scanner1.nextInt();
                
                    switch (input2){
                         
                        case 6:
                            System.out.println("Great Choice! Click here for Mountain Bikes ===> mountainbikeseller.com");
                            break;
                            
                        case 7:
                            System.out.println("Great choice! Click here for Road Bikes ===> roadbikeseller.com");
                            break;
                            
                            
                    }
                    break;
                    
            case 3: //case 3 for pc games
                System.out.print("8. PC Games");
                System.out.println("9. Console Games");
                System.out.println("What kind of medium do you play on?");
                int input3 = Scanner1.nextInt();
                
                    switch (input3) {
                        
                    case 8:
                        System.out.println("Click here to canvas your designated PC now!!! ===> easypczone.com");
                        break;
                        
                        case 9:
                            System.out.println("Click here to canvas your designated console now!!! ===> consolemasterrace.com");
                            break;
                    }
                    break;
                    
            case 4: //case 4 for reading
                System.out.println("10. Horror");
                System.out.println("11. Comedy");
                System.out.println("12. Mystery");
                System.out.println("13. Philosophy");
                System.out.println("14. Self Help");
                System.out.println("15. Romance");
                System.out.println("");
                System.out.println("What genre you like to read?");
                int input4 = Scanner1.nextInt();
                
                    switch (input4){
                        
                        case 10:
                            System.out.println("Ooooohhh you're the type of  person who needs a thrill in his life huh. No matter, click this link for horror books ===> freehorrorbooks.com");
                            break;
                            
                        case 11:
                            System.out.println("Laughter is the best medicine eh? Click here for more laughs ===> laughingbooks.com");
                            break;
                            
                        case 12:
                            System.out.println("We got Sherlock Holmes in the building! Click here to solve mysteries like never before ===> booksofmysteries.net");
                            break;
                            
                        case 13:
                            System.out.println("'" + "To know everything is to know nothing" + "'" + " - Socrates. Click here");
                            System.out.println("for more knowledge about philosophy ===> thinkingbooks.com");
                            break;  
                            
                        case 14:
                            System.out.println("Motivational today are we? Click here for more motivational books and self help ones ===> selfhelpbooks.com");
                            break;
                            
                        case 15:
                            System.out.println("Love is in the air! Click here if you feel romantic ===> romanceeverywhere.com");
                            break;
                    }
                    
            case 5:
                System.out.println("Ooooh we have an athlete here! Click here to train your specified sport today! ===> atlhetescorner.com");
                break;
                      
        }  
        
        } else {System.out.println("You entered an incorrect pin! Try again.");}
        
        
    }
    
}
