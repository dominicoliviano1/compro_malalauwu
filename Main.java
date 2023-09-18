import java.util.Scanner;
class Main {
    public static void main(String [] args)     {
        Scanner Scanner1 = new Scanner(System.in);     //Create a Scanner object
    System.out.println("Enter Employee Name");
    String employeeName = Scanner1.nextLine();      //Employee Name
    
    System.out.println("Enter Hourly Rate");
    double hourlyRate = Scanner1.nextDouble();  //Hourly Rate
    
    System.out.println("Enter Total Hours");
    double totalHours=Scanner1.nextDouble();        //Total Hours
    
    double initialSalary = hourlyRate * totalHours;
        if (totalHours > 224){
            initialSalary = initialSalary*2;
        } else {
            initialSalary = initialSalary;
        }
    double insurance = initialSalary*.1;
    double finalSalary = initialSalary - insurance;
    
    System.out.println("Total Salary"+finalSalary);
    
    }
}