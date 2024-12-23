import java.util.Scanner;

public class Exceed200{

   public static void main (String [] args){
   
      int number1, number2, number3, sum;
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.println("Enter three numbers with a sum that does not exceed 200.\n");
      
      System.out.print("Number 1: ");
      number1 = scanner.nextInt();
      System.out.print("NUmber 2: ");
      number2 = scanner.nextInt();
      System.out.print("Number 3: ");
      number3 = scanner.nextInt();
      
      sum = number1 + number2 + number3;
      
      if (sum > 200){
         System.out.println("Sum exceeds 200");
         }
      else {
         System.out.println("Sum is " + sum);
         }
         
   
   }
}