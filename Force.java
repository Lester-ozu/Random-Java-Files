import java.util.Scanner;

public class Force{

   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      
      System.out.print("Mass: ");
      double mass = input.nextDouble();
      
      System.out.print("Acceleration: ");
      double acceleration = input.nextDouble();
      
      double force = mass * acceleration;
      
      System.out.println("Force: " + force + " N ");
   
   }
}