import java.util.Scanner;

public class MP4Precursor {
   
   public static void main (String [] args) {
   
      int toFind, toExclude, numAdded = 0, count = 0, exclude = 0, temp;
      String toPrint = "";
      
      Scanner scanner = new Scanner (System.in);
      
      int [] numbers = new int [5]; // This size is just the initial
      
      System.out.println("Enter numbers in the search list:");
      
      while (true) {
      
         toFind = scanner.nextInt();
         
         if(toFind == 0) {
            break;
         } 
         
         // makes the size of the numbers array expands
         if (numbers[numbers.length-1] != 0) {
            int [] numbers2 = new int [numbers.length*2];
            
            for (int i = 0 ; i < numbers.length ; i++) {
               numbers2[i] = numbers[i];
            }
            
            numbers = numbers2;//
         }
         
         numbers[numAdded] = toFind;
         numAdded++;// this variable is responsible for the index of the numbers array
      }
      
      // removes number
      System.out.println("Enter numbers to be excluded from the search list:");
      
      while (true) {
         
         toExclude = scanner.nextInt();
         
         if (toExclude == 0) {
            break;
         }
         
         for (int i = 0 ; i < numbers.length ; i++) {
            if (toExclude == numbers[i]) {
               numbers[i] = 0;
               exclude++; // this variable count the numbers that the user excluded
            }
         }
      }//
   
      //count the numbers that the user inputted that is non zero
      
      for (int i = 0 ; i < numbers.length ; i++) {
         if (numbers[i] != 0) {
            count++;
         }
      }//
      
      //the section above makes a new array, that just transfer the non zero number from number array to the numbers
      
      for (int i = 0 ; i < numbers.length ; i++) {
         for (int j = i ; j > 0 ; j--) {
            if (numbers[j] < numbers[j-1]) {
               temp = numbers[j-1];
               numbers[j-1] = numbers[j];
               numbers[j] = temp;
               
            }
         }
      }
      
      // responsible for the printing. 
      
      for (int i = 0 ; i < numbers.length ; i++) {
         if (numbers[i] != 0) {
            toPrint += numbers[i] + " ";
         }
      }

      System.out.println("Found " + count + " numbers:");
      System.out.println(toPrint);
   }
}