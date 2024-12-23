import java.util.Scanner;

public class SirTupas2{

   public static void main (String [] args){
      
      int num, i;
   
      Scanner scanner = new Scanner (System.in);
   
      System.out.print("Input a number: ");
      num = scanner.nextInt();
      
      for (i = 0 ; i <= num ; i++){
         System.out.print("\t"i);
      }  
   
   }
}