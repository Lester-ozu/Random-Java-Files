import java.util.Scanner;

public class WordReversal{
   
   public static void main (String [] args){
   
      int noOfWords;
      String word = "";
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.println("<-Welcome to Word Reversal->");
      System.out.print("\n");
      System.out.print("Please type the number of words that you want to put: ");
      noOfWords = scanner.nextInt();
      
      for (int i = 0 ; i > noOfWords ; i++) {
         System.out.println("Word: ");
         word = scanner.next();
         
         }
         
           
   
   }
}