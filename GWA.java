import java.util.Scanner;

public class GWA{

   public static void main (String [] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter IC111 grade: ");
      double ic111 = input.nextDouble();
      
      System.out.print("Enter EGE1 grade: ");
      double ege1 = input.nextDouble();
      
      System.out.print("Enter STS1 grade: ");
      double sts1 =  input.nextDouble();
      
      double gwa = (ic111 + ege1 + sts1) / 3;
      
      System.out.println(Math.round(gwa));
   
   }
}