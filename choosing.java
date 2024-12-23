import java.util.Scanner;

public class choosing{

   public static void main (String [] args){
   
      int option;
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.println("[1] Coffee, \n[2] Pasta, \n[3] Cakes, \n[4] Exit");
      
      System.out.print("\nEnter an Option: ");
      option = scanner.nextInt();
      
      if (option == 1){
         System.out.println("\nYou chose Coffe!");
      } else if (option == 2){
         System.out.println("\nYou chose pasta!");
      } else if (option == 3){
         System.out.println("\nYou chose cakses!");
      } else {
         System.exit(1);
      }
   
   }
}