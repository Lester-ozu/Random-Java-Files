import java.util.Scanner;

public class TheGWA {
   
   public static void main (String [] args) {
   
   Scanner scanner = new Scanner(System.in);
   
      while(true) {
      
      String rating = "", input = "", input2 = "";
      int i ;
      double gwa, numsub, subgrade, totalGrade = 0;
         
         boolean validGrade = true;
         
         System.out.print("\nEnter # of subj to input: ");
         numsub = scanner.nextInt();
         System.out.println();
         
         for( i = 1 ; i <= numsub ; i++ ) {
         
            System.out.print("Subj " + i + " - ");
            subgrade = scanner.nextInt();
            
            if (subgrade < 50 || subgrade > 100) {
               validGrade = false;
               break;
            }
            else {
               totalGrade += subgrade;
            }
         
         }
         
         if(!validGrade) {
         
            System.out.println("\nAn invalid input has been detected");
            System.out.print("Do you wish to input again? [y/n]: ");
            input = scanner.next();
            if(input.matches("n")) {
               break;
            }
            else {
               continue;
            }
         
         }
         
         else {
            gwa = totalGrade / numsub;
         }
         
         if (gwa >= 97.5 & gwa <= 100) {
            rating = "1.0";
         
         }
         
         else if (gwa >= 94.5 && gwa <= 97) {
            rating = "1.25";
         }
         
         else if (gwa >= 91.5 && gwa <= 94) {
            rating = "1.5";
         }
         
         else if (gwa >= 88.5 && gwa <= 91) {
            rating = "1.75";
         }
         
         else if (gwa >= 85.5 && gwa <= 88) {
            rating = "2.0";
         }
         
         else if (gwa >= 82.5 && gwa <= 85) {
            rating = "2.25";
         }
         
         else if (gwa >= 79.5 && gwa <= 82) {
            rating = "2.5";
         }
         
         else if (gwa >= 76.5 && gwa <= 79) {
            rating = "2.75";
         }
         
         else if (gwa >= 74.5 && gwa <= 76) {
            rating = "3.0";
         }
         
         else {
            rating = "5.0";
         }
         
         System.out.printf("\nGWA is %.2f", gwa);
         System.out.print(", rating is " + rating);
         
         System.out.print("\nDo you wish to input again? [y/n]: ");
         input2 = scanner.next();
         if(input2.matches("n")) {
            break;
         }
       }
   }
}