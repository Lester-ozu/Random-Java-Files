import java.util.Scanner;

public class Findingx{

   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      
      System.out.print("a: ");
      double a = input.nextDouble();
      
      System.out.print("b: ");
      double b = input.nextDouble();
      
      System.out.print("c: ");
      double c = input.nextDouble();
      
      double discriminant = b * b - 4 * a * c;
      
      if (discriminant < 0){
         System.out.println("Discriminant is negative, No real root exist.");
         }
         
      else{
         double result = (-b * Math.sqrt(discriminant))
                        / (2 * a);
         System.out.println("Result: " + Math.round(result));
         
         }
      }
      
}