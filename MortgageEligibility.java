//importing the scanner class
import java.util.Scanner;

class MortgageEligibility {

   public static void main(String[] args){

// Creating a Scanner object to receive input //

   Scanner input = new Scanner (System.in);

/* Declare variables of a total of three credit scores from TransUnion, Equifax, and Experian.  
Also, creating a variable that calculates the averagre of the three credit scores to determine 30-year mortgage eligibility and interest rate qualified*/

   int TransUnion;
   int Equifax;
   int Experian;
   
   
// Receiving input from consumers to input their three credit scores that will be within a range of 300 - 850 //

   System.out.println("Enter your credit score from TransUnion (300 - 850):  ");
   TransUnion= input.nextInt();
   
   System.out.println("Enter your credit score from Equifax (300 - 850):  ");
   Equifax= input.nextInt();
   
   System.out.println("Enter your credit score from Experian (300 - 850):  ");
   Experian= input.nextInt();
   
/* Calculating the three credit scores given from consumers from input to determine the average of the scores to determine 
what 30-year mortgage eligibility and interest rate qualify for */

   int sum = TransUnion + Equifax + Experian;
   int average = sum/3;
   
/* Output that will display message to the applicants on decision of mortgage eligibilty and interest qualify for. If average score falls between 740 - 850, the consumer
is eligible for an interest rate of 2.75%.  If the average score falls between 670 - 739, consumer is eligible with 3.15% rate.  If average score is between 580 - 669, consumer will be eligible with
interest rate of 3.50%.  Any less than 579 or below will not eligible for mortgage, no interest rate will be provided. */

   if(average >= 740) {   
      System.out.println("Congratulations!  You are eligbile for the 30-year mortgage at the interest rate of 2.75%.");
      }
      
   else if (average >=670) {
      System.out.println("Congratulations!  You are eligbile for the 30-year mortgage at the interest rate of 3.15%.");
      }
      
   else if (average >=580) {
      System.out.println("Congratulations!  You are eligbile for the 30-year mortgage at the interest rate of 3.50%.");
      }
   
   else {
      System.out.println("Sorry, you are not eligible, no mortgage rate will be provided.");
      }
   
   
   
   }

}

 