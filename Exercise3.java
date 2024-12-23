import java.util.Scanner;

public class Exercise3{

   public static void main (String [] args) {
      
      char select;
      int num;
   
   do{
   
      double numbers = 0, sum = 0;
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Enter numbers to input: ");
      num = scanner.nextInt();
      
      for (int i = 1 ; i <= num ; i++) {
         numbers = scanner.nextDouble();
         sum += numbers;
      }
      
      if (sum < 3000) {
         System.out.println("Sorry, it cannot reach 3000.");
         }
      else if (sum >= 3000) {
         System.out.println("This exeeds 3000! Sum of all numbers \ninputted is " + sum + ".");
         }
         
      System.out.print("Try again? [y/n]: ");
      select = scanner.next().charAt(0);
      } while (select == 'y' || select == 'Y');
        
   }
   
}