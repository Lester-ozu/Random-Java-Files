import java.util.Scanner;

public class Pasta {

   String option3 = "";
   int quantity2, price2 = 0;
   
   Scanner scanner = new Scanner (System.in);

   int order() {
   
      while (true) {

      System.out.println("\n[1] Spaghetti Bolognaise - 200 \n[2] Lasagne - 150 \n[3] Ravioli - 170");
      System.out.print("Choose a pasta: ");
      option3 = scanner.next();
      System.out.print("Quantity: ");
      quantity2 = scanner.nextInt();
               
      switch (option3) {
         case "1":
            price2 += 200;
            break;
         case "2":
            price2 += 150;
            break;
         case "3":
            price2 += 170;
            break;
         default:
            System.out.println("Invalid option");
            continue;
            }
            break;
            
         }
         
         return price2;
         
      }
   
}