import java.util.Scanner;

public class SirTupas3 {

   public static void main (String [] args) {
   
        int option;
        char select;
   
        Scanner scanner = new Scanner (System.in);
        
        do { 
         System.out.print("[1] Coffee \n[2] Pastry");
        
         System.out.print("\nEnter an option: ");
         option = scanner.nextInt();
         
         if (option == 1) {
            System.out.println("You chose coffee!");
            }
         else if (option == 2) {
            System.out.println("You chose pastry!");
            }
         else {
            System.out.println("Invalid input!");
            }
       
         System.out.print("Do you want to input input again? [y/n]: ");
         select = scanner.next().charAt(0);
         
         } while (select == 'y' || select == 'Y');
        
   
   }
}