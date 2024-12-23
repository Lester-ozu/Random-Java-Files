import java.util.Scanner;

public class Multiply{

   public static void main (String [] args){
   
      Scanner scanner = new Scanner (System.in);
      
      int multiplicand, multiplier, product;
      
      System.out.print("Enter a number: ");
      multiplicand = scanner.nextInt();
      
      System.out.print("How many times?: ");
      multiplier = scanner.nextInt();
      
      for (int i = 1 ; i <= multiplier ; i++ ) {
         product = multiplicand * i;
         System.out.println(multiplicand + " x " + i + " = " + product);
      
      }
   
   }

}