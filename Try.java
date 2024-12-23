import java.util.Scanner;

public class Try{

   public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter your IC111 Grade: ");
      int grade = scanner.nextInt();
      
      if(grade >= 98){
      System.out.println("Marked Excellence!");
      }
      
      else if (grade >= 95)
      System.out.println("Outstandinng!");
      
      else if (grade >= 92)
      System.out.println("Very Good Work!");
      
      else if (grade >= 89)
      System.out.println("Very Satisfactory Work!");
      
      else if (grade >= 86)
      System.out.println("Quite Good Work!");
      
      else if (grade >= 83)
      System.out.println("Good Work!");
      
      else if (grade >= 80)
      System.out.println("Satisfactory Work!");
      
      else if (grade >= 77)
      System.out.println("Moderately Satisfactory Work!");
      
      else if (grade >= 75)
      System.out.println("You Passed!");
      
      else
      System.out.println("You failed!");

   }
}