import java.util.Scanner;
import java.util.Random;

public class TN_additionWhileLoop{

public static void main(String[] args){

//Scanner object for input & Random numbers
   Scanner input = new Scanner (System.in);
   Random guess = new Random();
   
/*Declaration variables for needed data: two single digit numbers, anwser from student, correct
anwser, count of questions, number of right & wrong, lastly string question*/
   int answer;
   int count= 0;
   int right= 0;
   int wrong= 0;
   int i = 0;
   
//For do loop statement & declaring  variables for needed data: two single digit numbers,
   
   while (i < 10) {
      int n1 = guess.nextInt(10);
      int n2 = guess.nextInt(10);
      int correctAnswer = n1 + n2;
      String question = ("What is "+ n1 + "+" + n2 + "?");
        
   //Students input for math question
      System.out.println(question);
      answer = input.nextInt();
      i++;
      
   
      if(answer == correctAnswer){
         System.out.println("true");
         count++;
         right++;
      }
      
      else{
         System.out.println("false");
         count++;
         wrong++;
      }      
      }
      

   //Tally up of number of questions counted, right & wrong 
      System.out.println("Number of questions counted:  "+ count);
      System.out.println("Number of questions wrong:  "+ wrong);
      System.out.println("Number of questions right:  "+ right);   
      }
   }