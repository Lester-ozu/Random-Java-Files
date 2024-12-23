import java.util.Scanner;

public class Palindrome {

   public static void main (String [] args) {
   
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String input =  scanner.nextLine();
      scanner.close();
      
      char[] charArray = input.toCharArray();
      // The toCharArray() method is a built-in method in Java that belongs to
      // the String class. It is used to convert a String into a character array
      // (char array). Each character in the resulting array represents a character in the original string.
      
      int originalWord = 0;
      int reversedWord = charArray.length - 1;
      boolean isPalindrome = true;
      
      while (originalWord < reversedWord) {
      
         if (charArray[originalWord] != charArray[reversedWord]) {
            isPalindrome = false;
            break;
         }
         
         originalWord++;
         reversedWord--;
      }
      
      if (isPalindrome) {
         System.out.println(input + " is a palindrome.");
      }
      else {
         System.out.println(input + " is not a palindrome.");
      }
   
   }
}