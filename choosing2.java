import java.util.Scanner;

public class choosing2{

   public static void main (String [] args){
   
      int option, option2, option3, option4, total, total2, total3, cash, totalTotal;
      int price = 0, price2 = 0, price3 = 0, change = 0;
      int quantity = 0, quantity2 = 0, quantity3 = 0;
      String want = "", input = "";
   
      Scanner scanner = new Scanner (System.in);
      
      while (true) {
      
      System.out.println("\n[1] Coffee \n[2] Pasta \n[3] Cakes \n[4] Exit");
      
      System.out.print("\nEnter an Option: ");
      option = scanner.nextInt();
      
      if (option == 1){
         System.out.println("\n[1] Americano - 100 \n[2] Mocha - 120 \n[3] Spanish Latte - 110");
         System.out.print("Choose a coffee: ");
         option2 = scanner.nextInt();
         System.out.print("Quantity: ");
         quantity = scanner.nextInt();
         
            if(option2 == 1){
            price += 100;
             } else if (option2 == 2){
            price += 120;
            } else if (option2 == 3){
            price += 110;  
            } else {
               System.out.println("Invalid coffee option.");
               continue;
            }
       
         
      } else if (option == 2){
         System.out.println("\n[1] Spaghetti Bolognaise - 200 \n[2] Lasagne - 150 \n[3] Ravioli - 170");
         System.out.print("Choose a pasta: ");
         option3 = scanner.nextInt();
         System.out.print("Quantity: ");
         quantity2 = scanner.nextInt();
         
            if(option == 1){
            price2 += 200;
            } else if (option == 2){
            price2 += 150;
            } else if (option == 3){
            price2 += 170;
            } else {
            System.out.println("Invalid pasta option.");
            continue;
            }
            
      } else if (option == 3){
         System.out.println("\n[1] Vanilla cake - 250 \n[2] Red Velvet Cake - 240 \n[3] Strawberry Cake - 300");
         System.out.print("Choose a cake: ");
         option4 = scanner.nextInt();
         System.out.print("Quantity: ");
         quantity3 = scanner.nextInt();
         
            if (option4 == 1){
            price3 += 250;
            } else if (option == 2){
            price3 += 240;
            } else if (option == 3){
            price3 += 300;
            } else {
            System.out.println("Invalid cake option.");
            continue;
            }
         
        } else if (option == 4) {
            break;
       } else {
            System.out.println("Invalid option. Please choose a valid option.");
            continue;
         
        }
         System.out.println("Do you still want to order? (yes/no)");
         want = scanner.next();
         input = want.toLowerCase();
         
         if(!input.equals("yes")){
            break;
            
        }
      }
       
      
      total = price * quantity;
      total2 = price2 * quantity2;
      total3 = price3 * quantity3;
      
      totalTotal = total + total2 + total3;
            
      System.out.println("\nTOTAL IS " + totalTotal);
      
      while (true) {
      System.out.print("Input cash: ");
      cash = scanner.nextInt();
      
      if (cash < totalTotal){
         System.out.println("Insufficient cash. Please input more");
         continue;
      
        } else {
         change = cash- totalTotal;
         System.out.println("\nChange is " + change);
         
         }
         
         break;
         
      }
   }
}