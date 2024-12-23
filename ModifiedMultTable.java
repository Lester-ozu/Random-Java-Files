import java.util.Scanner;

public class ModifiedMultTable{

   public static void main (String [] args){
   
      int i, multiplicand, multiplier;
   
      Scanner scanner = new Scanner (System.in);
   
      System.out.print("Enter a number: ");
      multiplicand = scanner.nextInt();
      
      System.out.print("How many times: ");
      multiplier = scanner.nextInt();
      System.out.println("");
      
      for (i = 1 ; i <= multiplier ; i++){   
         System.out.println(multiplicand + " x " + i +  " = " + (multiplicand * i));
         }
   
   }
}