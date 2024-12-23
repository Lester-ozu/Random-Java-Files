import java.util.Scanner;

public class Temp2 {

   public static void main (String [] args) {
   
      int num, i, grade = 0;
      boolean validGrades;
   
      Scanner scanner = new Scanner (System.in);
      
      while (true) {
      
         System.out.print("Enter number of subjects: ");  
         num = scanner.nextInt();
         
         validGrades = true;
         
         for (i = 1 ; i <= num ; i ++) {
         
            System.out.print("Subject " + i + ": ");
            grade = scanner.nextInt();
            
            if (grade < 50 || grade > 100) {
            
               validGrades = false;
               break;
            
            }
         
         }
         
         if(!validGrades) {
            continue;
            }
         else {
            break;
            }
      }   
         
      

   }
}