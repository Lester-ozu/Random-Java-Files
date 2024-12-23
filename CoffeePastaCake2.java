import java.util.Scanner;

public class CoffeePastaCake2 {

    public static void main (String [] args) {

      String option = "", want = "", input = "";
      int totalCoffee = 0, totalPastry = 0, totalCake = 0, grandTotal, cash, change;

      Scanner scanner = new Scanner (System.in);
      Coffee coffee = new Coffee();
      Pasta pastry = new Pasta();
      Cake cake = new Cake();

      while(true) {
         
         System.out.println("[1] Coffee \n[2] Pasta \n[3] Cake");
         System.out.print("Please choose an option: ");
         option = scanner.next();
         
            switch (option) {
               case "1":
                   totalCoffee += coffee.order();
                   break;
               case "2":
                   totalPastry += pastry.order();
                   break;
                case "3":
                    totalCake += cake.order();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid Input, please try again");
                    continue;

               }

          System.out.print("Do you still want to order? [yes/no]: ");
          want = scanner.next();
          input = want.toLowerCase();
          if (!input.matches("yes")) {
             break;
             
          }
      }

          grandTotal = totalCoffee + totalPastry + totalCake;
          System.out.println("Total Coffee Price: " + totalCoffee);
          System.out.println("Total Pastry Price: " + totalPastry);
          System.out.println("Total Cake Price: " + totalCake);
          System.out.println("Grand Total Price: " + grandTotal);

      while (true) {
          System.out.print("Input cash: ");
          cash = scanner.nextInt();

          if (cash < grandTotal) {
              System.out.println("Insufficient cash, please add more.");
              }
          else if (cash >= grandTotal) {
              change = cash - grandTotal;
              System.out.println("Change is " + change);
              break;
            }

     }
   
   }

}