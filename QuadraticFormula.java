import java.util.Scanner;
class QuadraticFormula {
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      double a, b, c, discrim, x1, x2, x_real, x_imag;
      
      System.out.println("Input the following values for a, b and c, in the form:");
      System.out.println("ax^2 + bx + c = 0");
      
      System.out.print("a = ");
      a = input.nextDouble();
      System.out.print("b = ");
      b = input.nextDouble();
      System.out.print("c = ");
      c = input.nextDouble();
      
      discrim = (b*b) - (4*a*c);
      
      //solving the quadratic (yes this is shoddy as fuck sorry not sorry)
      
      if (discrim > 0) {
         x1 = (-b + Math.sqrt(discrim)) / (2*a);
         x2 = (-b - Math.sqrt(discrim)) / (2*a);
         System.out.print("The solutions are " + x1 + " and " + x2 + ".");
         
      } else if (discrim == 0) {
         x1 = (-b) / (2*a);
         System.out.print("The solution is " + x1 + ".");
         
      } else {
         x_real = (-b) / (2*a);
         x_imag = (Math.sqrt(-discrim)) / (2*a);
         System.out.print("The solutions are ");
         System.out.print(x_real + " + " + x_imag + "i, and ");
         System.out.print(x_real + " - " + x_imag + "i.");
         
      }
      
      
   }
}
      
      