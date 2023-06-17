//importing the scanner class
import java.util.Scanner;

class TN_MortgageDueDay {

   public static void main(String[] args){

// Creating a Scanner object to receive input //

   Scanner input = new Scanner (System.in);

/*Declaring variables of when first payment is due in 45 days and to 
input day number of current day */

   int dayNumber;
   int firstPayment;
   

/*Receiving input from user to input the day number of current day and 
duration till the first payment due*/
   System.out.print("Congratulations on your approval for your mortgage!");
   System.out.print("Please enter the day number in a week for today.");
   System.out.print("(Make sure you enter 0 for Sunday, 1 for Monday, 2 for Tuesday,... and 6 for Saturday.):");
   dayNumber= input.nextInt();
   
   System.out.print("In how many days is the first payment due?(Make sure you enter an integer number like 10, 20, etc.):");
   firstPayment= input.nextInt();
   
   
/*Using modulo operation to calculate the day number of the week for the
payment due date.*/

   int dueDate = (dayNumber + firstPayment)%7;
   
/*Switch creation of statements that will use the calculations to determine what 
day of the week will be due date*/
   
   switch (dueDate){
      case 0:  
         System.out.println("Your first payment is due on a Sunday.");
         break;
      case 1:  
         System.out.println("Your first payment is due on a Monday.");
         break;
      case 2:  
         System.out.println("Your first payment is due on a Tuesday.");
         break;
      case 3:  
         System.out.println("Your first payment is due on a Wednesday.");
         break;
      case 4:  
         System.out.println("Your first payment is due on a Thursday.");
         break;
      case 5:  
         System.out.println("Your first payment is due on a Friday.");
         break;
      case 6:  
         System.out.println("Your first payment is due on a Saturday.");
      
      
      }
   
   
   }

}
