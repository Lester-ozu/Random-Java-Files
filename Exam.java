import java.util.Scanner;

public class Exam{
   
   public static void main (String [] args){
   
      double ic111, ege1, ic112, quiz1, quiz2, examAverage, quizAverage, examPercentage, quizPercentage;
      String name = "";

      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
      
      System.out.print("\n\n");
      
      System.out.println("Welcome, " + name + "!");
      
      System.out.println("Kindly enter the following exam scores for such subjects below:");
      
      System.out.print("IC111: ");
      ic111 = scanner.nextDouble();
      System.out.print("EGE1: ");
      ege1 = scanner.nextDouble();
      System.out.print("IC112: ");
      ic112 = scanner.nextDouble();
      
      System.out.print("\n");
      
      System.out.print("Enter quiz 1 score: ");
      quiz1 = scanner.nextDouble();
      System.out.print("Enter quiz 2 score: ");
      quiz2 = scanner.nextDouble();
      
      examAverage = ((ic111 + ege1 + ic112) / 3);
      quizAverage = ((quiz1 + quiz2) / 2);
      examPercentage = (examAverage * 0.6);
      quizPercentage = (quizAverage * 0.4);
      
      System.out.print("\n");
      
      System.out.println("Exam average: " + examAverage);   
      System.out.println("Quiz average: " + quizAverage);
      System.out.println(examPercentage + " + " + quizPercentage);
      
      System.out.print("The grade equivalent for the exam scores and quiz is " + (examPercentage + quizPercentage) + ".");
   }
}