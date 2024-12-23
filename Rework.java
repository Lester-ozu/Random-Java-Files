import java.util.Scanner;
import java.text.NumberFormat;

public class Rework{

   public static void main(String[] args){
   
      Scanner scanner = new Scanner(System.in);
   
   //declaring the variables
      int principal = 0;
      double annualInterestRate = 0;
      int years = 0;
   
      while(true) {
         System.out.print("Principal ($1K - $1M): ");
         String principalInput = scanner.next();
      
      //checking if the input is numeric or not
         if (!principalInput.matches("\\d+")){
            System.out.println("Enter only numeric values");
            continue;
         }
      
      //converting the principalInput to integer
         principal = Integer.parseInt(principalInput); 
         if (principal < 1000 || principal > 1000000) {
            System.out.println("Enter a number between 1,000 and 1,000,000");
            continue;
            
         }
      
         break;
      
      }
   
      while(true) {
      
         System.out.print("Annual Interest Rate (%): ");
         String annualInterestRateInput = scanner.next();
      
      //checks if the input is numeric or not
         try{
            annualInterestRate = Double.parseDouble(annualInterestRateInput);
            if (annualInterestRate <= 0 || annualInterestRate >= 31) {
               System.out.println("Enter a number greater than 0 and less than or equal to 30");
               continue;
            
            }
         
            break;
         
         } catch (NumberFormatException e) {
            System.out.println("Enter only float or decimal values");
         
         }
      }
   
      double monthlyInterestRate = annualInterestRate / 100 / 12;
      
      while(true) {
      
         System.out.print("Period (Years): ");
         String yearsInput = scanner.next();
      
         if (!yearsInput.matches("\\d+")) {
            System.out.println ("Enter only numeric/integer values");
            continue;
         }
         
         years = Integer.parseInt(yearsInput);
         if (years <= 0 || years >= 30) {
            System.out.println("Enter only a number between 1 to 30");
            continue;
         }
      
         break;
      
      }
      
      int months = years * 12;
   
      double mortgage = principal * (monthlyInterestRate * Math.pow (1 + monthlyInterestRate, months))
                                 / (Math.pow(1 + monthlyInterestRate, months) - 1);
                                 
      String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
   
      System.out.println("Mortgage Payment: " + mortgageFormatted);
   
      scanner.close();
   
   }
}
