import java.util.Scanner;

public class SIrTupas1{
   
   public static void main (String [] args){
   
      //September 5, 2023 Programming Paradigm 1.
      //Relational Operators & Making decision structures in programming.
      
      Scanner scanner = new Scanner (System.in);
     
      int grade;
      
      System.out.print("Enter you IC111 grade: ");
      grade = scanner.nextInt();
      
      if (grade >= 75){
         System.out.println("You passed!");
         }
      else {
         System.out.println("You failed!");
         }
   }
}