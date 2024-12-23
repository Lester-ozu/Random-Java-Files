import java.util.Scanner;

public class VCipher {

   public static void main (String [] args) {
   
      Scanner scanner = new Scanner(System.in);
   
      String toBeDeciphered = "", deciphered = "", key;
        
      System.out.print("Encrypted:      ");
      toBeDeciphered = scanner.nextLine();
      System.out.print("Key:            ");
      key = scanner.nextLine();
      
      if ((key.length() % 2) != 0) {
      
         for (int i = toBeDeciphered.length()-1 ; i > 0 ; i--) {
         
            if (toBeDeciphered.charAt(i) == 'a' || toBeDeciphered.charAt(i) == 'e' || toBeDeciphered.charAt(i) == 'i' ) {
               continue;
            }
            
            deciphered += toBeDeciphered.charAt(i);
         }
      }
      
      else if ((key.length() % 2) == 0) {
      
         for (int i = 0 ; i < toBeDeciphered.length() ; i++) {
         
            if (toBeDeciphered.charAt(i) == 'o') {
            
               continue;
            }
            
            else if (toBeDeciphered.charAt(i) == 'u') {
            
               continue;
            }
            
            else if (toBeDeciphered.charAt(i) == 'r') {
            
               deciphered += "v";
            }
            
            else if (toBeDeciphered.charAt(i) == 'v') {
            
               deciphered += "r";
            }
            
            else {
            
               deciphered += toBeDeciphered.charAt(i);
            }
         }
      }
      
      System.out.println("\nDeciphered:     " + deciphered);
      
   }
}