//a^2-b^2 = 

import java.util.Scanner;
import java.text.NumberFormat;

public class try2{

   public static void main(String[] args){
   
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Base (a): ");
      int base1 = scanner.nextInt();
      
      System.out.print("Base (b): ");
      int base2 = scanner.nextInt();
      
      System.out.print("Height (h): ");
      int height = scanner.nextInt();
      
      int areaOfTrapezoid = ((base1 + base2) / 2) * height;
      
      String areaOfTrapezoidFormatted = NumberFormat.getInstance().format(areaOfTrapezoid);
      
      System.out.println("Area of Trapezoid: " + areaOfTrapezoidFormatted + "inch");
   }
}