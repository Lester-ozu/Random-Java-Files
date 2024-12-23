import java.util.Scanner;

public class popol {

   public static void main (String [] args) {
   
      int num, temp;
      String positiveNum = " ", negativeNum = " ", ans = " ";
   
      Scanner scanner = new Scanner(System.in);
      
      while(true) {
      
         System.out.print("\nEnter the number of elements: ");
         num = scanner.nextInt();
         
         if(num <= 2) {
         System.out.print("\nInvalid Input! Would you like to try again?[y/n]: ");
         ans = scanner.next().toLowerCase();
         
            if (ans.equals("y")) {
            continue;
            }
         
            else {
            break;
            }

         }
                  
         int [] numbers = new int [num];
         
         System.out.println("Enter the numbers: ");
         
         for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
         }
         
         for (int i = 1 ; i < numbers.length ; i++) {
            for (int j = i ; j > 0 ; j--) {
               if (numbers[j] < numbers[j-1]) {
                  temp = numbers[j-1];
                  numbers[j-1] = numbers[j];
                  numbers[j] = temp;
                  
               }
            }
         }
         
         System.out.print("\nMin is " + numbers[0]);
         System.out.print("\nMax is " + numbers[numbers.length-1]);
         
         for (int i = 0 ; i < numbers.length ; i++) {
           
            if (numbers[i] > 0) {
               positiveNum += numbers[i] + " ";
            }
            else if (numbers[i] < 0) {
               negativeNum += numbers[i] + " ";
            }
         }
         
         System.out.print("\nNumbers sorted: ");
         
         for (int print : numbers) {
            System.out.print(print + " ");
         }
         
         System.out.println("\n\nPositive numbers are: " + positiveNum);
         System.out.println("Negative numbers are: " + negativeNum);
         
         System.out.print("\nWould you like to try again?[y/n]: ");
         ans = scanner.next().toLowerCase();
         
         if (ans.equals("y")) {
         System.out.println();
         continue;
         }
         
         else {
         break;
         }

      }
      
   }
   
}