import java.util.Scanner;

public class gasolinahan {

   public static void main (String [] args ) throws InterruptedException {
   
      int kindOfGas, i, j, k;
      double liter, literprice = 0, cash;
   
      Scanner scanner = new Scanner (System.in);
   
      while(true) {
      
         System.out.println("Welcome to Gasolinahan");
         System.out.println("[1] Unleaded - 67.00 \n[2] Diesel - 65.00 \n[3] Premium - 68.00");
         System.out.print("Please choose the kind of gasoline: ");
         kindOfGas = scanner.nextInt();
         
         switch (kindOfGas) {
            
            case 1:
               literprice = 67.00;
            case 2:
               literprice = 65.00;
            case 3:
               literprice = 68.00;
         }
         
         System.out.print("Input the amount of cash you want for the gasoline: ");
         cash = scanner.nextDouble();
         
         liter = cash / literprice;
         
         for (i = 1 ; i <= cash ; i++) {
            System.out.println("Cash  : " + i);
            System.out.println("Liter : ");
            System.out.println("Input : " + cash); 
            Thread.sleep(20);
            addSpace();
         }
      }
   
   }
   
    public static void addSpace() {
      
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
   } 

}