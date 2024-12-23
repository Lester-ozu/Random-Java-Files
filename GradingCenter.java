import java.util.Scanner;

public class GradingCenter{
   
   public static void main (String [] args) {
   
      int i, num;
      double gwa = 0, sum = 0 , grade = 0;
      String input;
      
      Scanner scanner = new Scanner (System.in);
      
      while (true) {
      
      sum = 0;
      
      System.out.print("Enter how many subjects to input: ");
      num = scanner.nextInt();
      System.out.println();
         
         for (i = 1 ; i <= num ; i++) {
            System.out.print("Subject " + i + ": ");
             grade = scanner.nextDouble();
             
           if (grade < 50 || grade > 100) {
            System.out.println("Invalid Input, grade must be between 50 to 100.\n");
            i--;
            }
           else {
            sum += grade;
            }
         }
         
         gwa = sum / num;
         
      if (gwa >= 97.6 && gwa <= 100) {
         System.out.println ("GWA is " + gwa + " , rating is 1.0");
         } 
      else if (gwa >= 94.6 && gwa <= 97) {
         System.out.println ("GWA is " + gwa + " , rating is 1.25");
         } 
      else if (gwa >= 91.6 && gwa <= 94.5) {
         System.out.println ("GWA is " + gwa + " , rating is 1.50");
         } 
      else if (gwa >= 88.6 && gwa <= 91.5) {
         System.out.println ("GWA is " + gwa + " , rating is 1.75");
         } 
      else if (gwa >= 85.6 && gwa <= 88.5) {
         System.out.println ("GWA is " + gwa + " , rating is 2.0");
         } 
      else if (gwa >= 82.6 && gwa <= 85.5) {
         System.out.println ("GWA is " + gwa + " , rating is 2.25");
         } 
      else if (gwa >= 79.6 && gwa <= 82.5) {
         System.out.println ("GWA is " + gwa + " , rating is 2.50");
         } 
      else if (gwa >= 76.6 && gwa <= 79.5) {
         System.out.println ("GWA is " + gwa + " , rating is 2.75");
         } 
      else if (gwa >= 74.6 && gwa <= 76.5) {
         System.out.println ("GWA is " + gwa + " , rating is 3.0");
         } 
      else if (gwa <= 74.6 && gwa >= 49.6) {
         System.out.println ("GWA is " + gwa + " , rating is 5.0");
         }
      else {
         System.out.println ("Error, grade cannot be below 50");
         }
    
         System.out.print("\n");
         System.out.println("Nice, do you want to try again? [y/n]");
         input = scanner.next();
         if (input.matches("n")) {
            System.out.print("\n");
            break;   
            }
        
      }
   
   }
}