import java.util.Scanner;

public class Addition{

   public static void main (String [] args){
   
      int numbers, sum = 0, toAdd;
   
      Scanner scanner = new Scanner (System.in);
      System.out.print("How many numbers you want to add: ");
         numbers = scanner.nextInt();
      
      for (int i = 1 ; i <= numbers ; i++){
         toAdd = scanner.nextInt();
         sum+=toAdd;
      }      
      
      System.out.println("Result: " + sum);
      
   }
}