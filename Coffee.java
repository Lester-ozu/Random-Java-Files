import java.util.Scanner;

public class Coffee {
   
   String option2 = ""; 
   int quantity;
   int price = 0;
   
   Scanner scanner = new Scanner (System.in);
   
   int order() {
   
      while (true) {
      
      System.out.println("\n[1] Americano - 100 \n[2] Mocha - 120 \n[3] Spanish Latte - 110");
      System.out.print("\nChoose a coffee: ");
      option2 = scanner.next();
      System.out.print("Quantity: ");
      quantity = scanner.nextInt();
            
         switch (option2) {
            case "1":
               price += 100;
               break;
            case "2":
               price += 120;
               break;
            case "3":
               price += 110;
               break;
            default:
               System.out.println("Invalid option");
               continue;
            }
               break;
               
         }
         
         return price;
         
        }
        
      
   }