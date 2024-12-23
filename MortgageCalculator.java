//Mortage Calculator

import java.util.Scanner;
import java.text.NumberFormat;


public class MortgageCalculator{

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Principal: ");
      int principal = scanner.nextInt();
      
      System.out.print("Annual Interest Rate(%): ");
      double annualInterestRate = scanner.nextDouble();
      double monthlyInterestRate = annualInterestRate / 100 / 12;
      
      System.out.print("Period (Years): ");
      int years = scanner.nextInt();
      int months = years * 12;
     
      double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months))
                                    / (Math.pow (1 + monthlyInterestRate, months) - 1);
      
      String mortgageFormatted = NumberFormat.getInstance().format(mortgage);
      
      System.out.println("Mortgage Payment: " + mortgageFormatted);
   
   }
}