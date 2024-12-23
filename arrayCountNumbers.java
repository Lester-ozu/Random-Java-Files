import java.util.Scanner; 

public class arrayCountNumbers {

   public static void main (String [] args) {
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Enter the desired size of your array: ");
      int num = scanner.nextInt();
      int [] myArray = new int [5];
      
      int positive = 0, negative = 0, odd = 0, even = 0;
      
      for (int i = 0 ; i < myArray.length ; i++) {
         myArray[i] = scanner.nextInt();
         
         if (myArray[i] > 0) {
            positive++;
         }
         
         else if (myArray[i] < 0) {
            negative++;
         }
         
         if (myArray[i] % 2 == 0) {
            even++;
         }
            
         else if (myArray[i] % 2 != 0) {
            odd++;
         }
      }
      
      System.out.print("Positive: " + positive + "\nNegative " + negative + "\nEven: "+ even + "\nOdd: " + odd);
   
   }
}