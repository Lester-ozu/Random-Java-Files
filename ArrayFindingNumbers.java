import java.util.Scanner;

public class ArrayFindingNumbers {

   public static void main (String [] args) {
   
      int num, num2 = 0, input, toFind, i = 0, j = 0, temp;
      String print = "";
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Enter numbers: ");
      num = scanner.nextInt();
      
      int [] numbers = new int [num];
      int [] foundNumbers = new int [num];
      
      for (i = 0 ; i < numbers.length ; i++) {
         numbers[i] = scanner.nextInt();
      } 
      
      System.out.println("What number are you looking for?");
      
      while (true) {
      
         toFind = scanner.nextInt();
         
         if (toFind == 0) {
            break;
         }
         
         if (num >= numbers.length) {
            int [] newArray = new int [numbers.length * 2];
            System.arraycopy(numbers, 0, newArray, 0, numbers.length);
            foundNumbers = newArray;
         }
         
         for (i = 0 ; i < numbers.length ; i++) {
            if (toFind == numbers[i]) {
               foundNumbers[num2] = toFind;
               num2++;
            }
         }
      }
      
      for (i = 1 ; i < foundNumbers.length ; i++) {
         for (j = i ; j > 0 ; j--) {
            if (foundNumbers[j] < foundNumbers[j-1]) {   
               temp = foundNumbers[j];
               foundNumbers[j] = foundNumbers[j-1];
               foundNumbers[j-1] = temp;
            }
         }
      }
      
      for (i = 1 ; i < foundNumbers.length ; i++) {
         if (foundNumbers[i] == foundNumbers [i-1]) {
            foundNumbers[i-1] = 0;
         }
        
      }
      
      for (i = 0 ; i < foundNumbers.length ; i++) {
         if (foundNumbers[i] != 0) {
            print += foundNumbers[i] + " ";
         } 
      }
      
      System.out.println("Found numbers: " + print);
      
   }
}