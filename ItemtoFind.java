import java.util.Scanner;

public class ItemtoFind {
   
   public static void main (String [] args) {
      
      int num;
      
      Scanner scanner = new Scanner (System.in);
   
      int [] my_array1 = {1, 2, 3, -10, 5};
      
      System.out.print("Enter the number you want to find: ");
      num = scanner.nextInt();
      
      int itemToFind1 = num;
//      int itemToFind2 = 3;
      
      for (int i = 0 ; i < my_array1.length ; i++) {
         if (itemToFind1 == my_array1[i]) {   
            System.out.print("\nFound the " + itemToFind1);
         }
         
         if (itemToFind1 == my_array1[my_array1.length -1 ]) {
            System.out.print("\nNumber cannot be found");
         }
         
//          if (itemToFind2 == my_array1[i]) {
//             System.out.print("\nFound the " + itemToFind2);
//          }
      
      }  
   
   }
}