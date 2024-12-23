import java.util.Scanner;

public class ArraySirTupas {

   public static void main (String [] args) {
   
      Scanner scanner = new Scanner(System.in);
      
      int [] numbers = new int[10];
      int i, sum = 0;
   
      System.out.println("Input 10 numbers: ");
      
      for (i = 0 ; i < numbers.length ; i++) {
         numbers [i] = scanner.nextInt();
         sum += numbers[i]; 
      
      }
      
      for (i = 0 ; i < numbers.length ; i++) {
         System.out.print(numbers [i] + " ");
         
      }
      
      
   
   }
}