import java.util.Scanner;

public class GradingCalculator3 {

   public static void main (String [] args) {
   
   while (true) {
   
      String pointSystem = "", input = "";
      int i , j;
      double examAverage, quizzesAverage, gwa, oralRecitation, numExams, exam, totalExam = 0,numExam, numQuizzes, quizzes, totalQuizzes = 0, oralRecitation1;
      double examBase50 = 0, quizzesBase20 = 0, totalExamFinal, totalQuizzesFinal;
   
     Scanner scanner = new Scanner (System.in);
   
     System.out.print("Enter number of exams (out of 50 items): ");
     numExam = scanner.nextInt();
     
     for (i = 1 ; i <= numExam ; i++) {
         System.out.print("Exam " + i + " = ");
         exam = scanner.nextInt();
         examBase50 = numExam * 50;
         totalExam += exam;
     }
     
     totalExamFinal = ((totalExam / examBase50) * examBase50 + examBase50) / numExam;
     examAverage = totalExamFinal * 0.6;
     
     System.out.print("\nEnter number of quizzes (out of 20 items): ");
     numQuizzes = scanner.nextInt();
     
     for (j = 1 ; j <= numQuizzes ; j++) {
         System.out.print("Quiz " + j + " = ");
         quizzes = scanner.nextInt();
         quizzesBase20 = numQuizzes * 20;
         totalQuizzes += quizzes;
     }
     
     totalQuizzesFinal = ((totalQuizzes / quizzesBase20) * quizzesBase20 + quizzesBase20) / numQuizzes;
     quizzesAverage = totalQuizzesFinal * 0.2;
     
     System.out.print("\nEnter Oral recitation grade: ");
     oralRecitation1 = scanner.nextInt();
     
     oralRecitation = oralRecitation1 * 0.2;
     
     System.out.println("Congratulations!");
     
     gwa = examAverage + quizzesAverage + oralRecitation;
     
     if (gwa >= 98 && gwa <= 100) {
         pointSystem = "1.0";
         }
     else if (gwa >= 95 && gwa <= 97) {
         pointSystem = "1.25";
         }
     else if (gwa >= 92 && gwa <= 94) {
         pointSystem = "1.50";
         }
     else if (gwa >= 89 && gwa <= 91) {
         pointSystem = "1.75";
         }
     else if (gwa >= 86 && gwa <= 88) {
         pointSystem = "2.0";
         }
     else if (gwa >= 83 && gwa <= 85) {
         pointSystem = "2.25";
         }
     else if (gwa >= 80 && gwa <= 82) {
         pointSystem = "2.5";
         }
     else if (gwa >= 77 && gwa <= 79) {
         pointSystem = "2.75";
         }
     else if (gwa >= 75 && gwa <= 76) {
         pointSystem = "3.0";
         }
     else if (gwa < 75) {
         pointSystem = "5.0";
         }
         
     System.out.printf("GWA is %.2f", gwa);
     System.out.print(", Rating is " + pointSystem + ".");
   
     System.out.print("Do you want to input grades again? [y/n]: ");
     input = scanner.next();
     if (input.matches("n")) {
      break;
      }
      
     }   
   }
}