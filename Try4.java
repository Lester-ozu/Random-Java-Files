import java.util.Scanner;

public class Try4{

   public static void main (String [] args){
   
      Scanner scanner = new Scanner(System.in);
      Scanner input = new Scanner(System.in);
      
      System.out.print("Name: ");
      String name = scanner.nextLine();
      
      System.out.print("Age: ");
      int age = input.nextInt();
      
      System.out.print("Address: ");
      String address = scanner.nextLine();
      
      System.out.print("Course: ");
      String course = scanner.nextLine();
      
      System.out.println("Hi! I am " + "." + name + "\nI am " + age + " years old, from " + address + "." + "\nI enrolled in the " + course + " program of CIC."); 
   
   }
}