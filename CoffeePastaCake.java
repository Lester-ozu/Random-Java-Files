import java.util.Scanner;

public class CoffeePastaCake {

   public static void main (String [] args) {
         
        String option = "", want = "", input = "";
        int totalCoffee = 0, totalPasta = 0, totalCake = 0, grandTotal, change, cash;
         
        Coffee coffee = new Coffee();
        Pasta pasta = new Pasta();
        Cake cake = new Cake();
        
   
        Scanner scanner = new Scanner (System.in);
      
         while(true) {
      
            System.out.println("\n[1] Coffee \n[2] Pasta \n[3] Cakes \n[4] Exit");
            
            System.out.print("\nEnter an Option: ");
            option = scanner.next();

            switch (option) {
               case "1":
                  totalCoffee += coffee.order();
                  break;
               case "2":
                  totalPasta += pasta.order();
                  break;
               case "3":
                  totalCake += cake.order();
                  break;
               case "4":
                  break;
               default:
                  System.out.println("Invalid option. Please choose a valid option.");
               continue;
               }
               
         System.out.println("Do you still want to order? (yes/no)");
         want = scanner.next();
         input = want.toLowerCase();
      
         if(!input.equals("yes")) {
            break;

         }
         
      }
         
         grandTotal = totalCoffee + totalPasta + totalCake;
         System.out.println("Total Coffee Price: " + totalCoffee);
         System.out.println("Total Pasta Price: " + totalPasta);
         System.out.println("Total Cake Price: " + totalCake);
         System.out.println("\nGrand Total Price: " + grandTotal);
         
         while(true) {
         System.out.print("\nInput cash: ");
         cash = scanner.nextInt();
         
         if (cash < grandTotal) {
            System.out.println("Insufficient cash, Please input more.");
            continue;
         }
            
         else {
            change = cash - grandTotal;
            System.out.println("Change is " + change + ".");
            break;
            
         }
         
      }

   }
   
}