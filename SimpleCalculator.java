import java.util.Scanner;

public class SimpleCalculator{

   public static void main (String [] args){
   
      Scanner scanner = new Scanner (System.in);
      
      int firstInt, secondInt;
      
      System.out.print("Enter the first integer: ");
      firstInt = scanner.nextInt();
      
      System.out.print("Enter the second number: ");
      secondInt = scanner.nextInt();
      
      System.out.println("Sum: " + (firstInt + secondInt));
      System.out.println("Difference : " + (firstInt - secondInt));
      System.out.println("Product: " + (firstInt * secondInt));
      System.out.println("Quotient : " + (firstInt / secondInt));
      System.out.println("Modulo : " + (firstInt % secondInt));
      
      
   }
}