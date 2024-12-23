import java.util.Scanner;
import java.text.DecimalFormat;

public class ModifiedCalcTable{
   
   public static void main (String [] args){
   
      double num, anotherNum, operator;
      
      DecimalFormat df = new DecimalFormat("#.##");
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Enter a numer: ");
      num = scanner.nextInt();
      
      System.out.print("Enter another number: ");
      anotherNum = scanner.nextInt();
      
      System.out.println("[1] Addition \n[2] Subtraction \n[3] Mulplication \n[4] Division");
      
      System.out.print("Enter an operator: ");
      operator = scanner.nextInt();
      
      for (int i = 1 ; i <= anotherNum ; i++) {
         if (operator == 1) {
            System.out.println(df.format(num) + " + " + i + " = " + df.format(num + i));
            }
         else if (operator == 2) {
            System.out.println(df.format(num) + " - " + i + " = " + df.format(num - i));
            }
         else if (operator == 3) {
            System.out.println(df.format(num) + " x " + i + " = " + df.format(num * i));
            }
         else if (operator == 4) {
            System.out.println(df.format(num) + " / " + i + " = " + df.format(num / i));
            }
         else {
            System.out.println("Invalid option");
            break;
            }
       }
   
   }
}