import java.util.Scanner;

public class StatisticsGrade {
   
   public static void main (String [] args) {
   
      String name = "";
      double leScore, mp1Score, mp2Score, ps1Score, ps2Score, ps3Score, leScorePercentage, mpPercentage, psPercentage, finalGrade;
   
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Name: ");
      name = scanner.nextLine();
      System.out.print("Learning Evidence Score: ");
      leScore = scanner.nextDouble();
      System.out.print("Machine Problem #1 Score: ");
      mp1Score = scanner.nextDouble();
      System.out.print("Machine Problem #2 Score: ");
      mp2Score = scanner.nextDouble();
      System.out.print("Problem Set #1 Score: ");
      ps1Score = scanner.nextDouble();
      System.out.print("Problem Set #2 Score: ");
      ps2Score = scanner.nextDouble();
      System.out.print("Problem Set #3 Score: ");
      ps3Score = scanner.nextDouble();
      
      leScorePercentage = leScore * 0.6;
      mpPercentage = ((mp1Score + mp2Score) / 2) * 0.3;
      psPercentage = ((ps1Score + ps2Score + ps3Score) / 3) * 0.1;
      finalGrade = leScorePercentage + mpPercentage + psPercentage;
      
      System.out.println();
      
      System.out.println("_________________________________________");
      System.out.println( name + "'s" + " FINAL GRADE REPORT");
      System.out.println("_________________________________________");
      
      System.out.println("Learning Evidence Average: " + leScorePercentage);
      System.out.println("Machine Problem Average: " + mpPercentage);
      System.out.println("Problem Set Average: " + psPercentage);
      
      System.out.println("Final Grade: " + finalGrade);
      
      
   
   }
}