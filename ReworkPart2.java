import java.util.Scanner;
import java.text.NumberFormat;

public class ReworkPart2{

   public static void main (String [] args){
   
      String principalInput = "";
      int principal;
      
      Scanner scanner = new Scanner (System.in);
      
      while (true) {
         System.out.print("Principal ($1K - $1M): ");
         principalInput = scanner.next();
         
         try {
            principal = Integer.parseInt(principalInput); 
            if (principal < 1000 || principal > 1000000) {
               System.out.println("Please only input numbers between $1K to $1M");
               continue;
             }  
             
             break;
             
             }
             
             catch (NumberFormatException e) {
               System.out.println("Please enter only numeric values");
               
               }
               
          }
    
   
   }
}