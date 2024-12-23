import java.util.Scanner;

public class AverageofGrades{

   public static void main (String [] args){
   
      Scanner scanner = new Scanner (System.in);
   
      double num, i = 1, toAdd, sum=0;
   
      System.out.print("Enter # of grades to input: ");
      num = scanner.nextInt();
   
      while(i <= num){
         toAdd = scanner.nextInt();
         sum+=toAdd;
         i++;
         
      }
      
      sum/=num;
      System.out.println("Your Average is: " + sum);
      
      if (sum > 75){
         System.out.println("Congrats, you passed!");
      }   
      else{
         System.out.println("You failed, unfortunately");
      }
      
     
   }
}