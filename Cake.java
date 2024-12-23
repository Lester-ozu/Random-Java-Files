import java.util.Scanner;

public class Cake {

   Scanner scanner = new Scanner (System.in);
   
   String option4 = "";
   int quantity3, price3 = 0;

   int order() {

   while(true) {
   
      System.out.println("\n[1] Vanilla cake - 250 \n[2] Red Velvet Cake - 240 \n[3] Strawberry Cake - 300");
      System.out.print("Choose a cake: ");
      option4 = scanner.next();
      System.out.print("Quantity: ");
      quantity3 = scanner.nextInt();
                 
      switch (option4) {
         case "1":
            price3 += 250;
            break;
         case "2":
            price3 += 240;
            break;
         case "3":
            price3 += 300;
            break;
         default:
            System.out.println("Invalid option");
            continue;
         }
         break;
      
    }
    
    return price3;
    
  }
   
}