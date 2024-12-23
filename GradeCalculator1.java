import java.util.Scanner;

public class GradeCalculator1 {
   
   public static void main (String [] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int subjects, i, modifiedSubjects;
        double examAverage = 0, oralAverage = 0, quizAverage = 0, gwa = 0, sum = 0;
        double exam, quiz, oral;
   
        System.out.print("Enter number of subjects: ");
        subjects = scanner.nextInt();
        
        modifiedSubjects = subjects + 1;
        
        double [] numbers = new double [modifiedSubjects];
        
        for (i = 1 ; i < modifiedSubjects ; i++) {
            
            System.out.print("\nSubject " + i + ":");
            System.out.print("\nExam = ");
            exam = scanner.nextInt();
            System.out.print("Quiz = ");
            quiz = scanner.nextInt();
            System.out.print("Oral = ");
            oral = scanner.nextInt();
            
            examAverage = ((exam / 50) * 50 + 50) * 0.6; 
            quizAverage = ((quiz / 30) * 30 + 30) * 0.2;
            oralAverage = oral * 0.2;
            
            numbers [i] = examAverage + quizAverage + oralAverage;
            
        }
        
        System.out.println("\nFinal Average of Subjects: ");
        
        for (i = 1 ; i < modifiedSubjects ; i++) {
            
            System.out.println("Subject " + i + " = " + numbers [i]);
            sum += numbers[i];
        
        }
        
        gwa = sum / subjects;
        
         if (gwa >= 97.6 && gwa <= 100) {
         System.out.println ("GWA is " + gwa + " , rating is 1.0");
         } 
         else if (gwa >= 94.6 && gwa <= 97) {
            System.out.println ("GWA is " + gwa + " , rating is 1.25");
            } 
         else if (gwa >= 91.6 && gwa <= 94.5) {
            System.out.println ("GWA is " + gwa + " , rating is 1.50");
            } 
         else if (gwa >= 88.6 && gwa <= 91.5) {
            System.out.println ("GWA is " + gwa + " , rating is 1.75");
            } 
         else if (gwa >= 85.6 && gwa <= 88.5) {
            System.out.println ("GWA is " + gwa + " , rating is 2.0");
            } 
         else if (gwa >= 82.6 && gwa <= 85.5) {
            System.out.println ("GWA is " + gwa + " , rating is 2.25");
            } 
         else if (gwa >= 79.6 && gwa <= 82.5) {
            System.out.println ("GWA is " + gwa + " , rating is 2.50");
            } 
         else if (gwa >= 76.6 && gwa <= 79.5) {
            System.out.println ("GWA is " + gwa + " , rating is 2.75");
            } 
         else if (gwa >= 74.6 && gwa <= 76.5) {
            System.out.println ("GWA is " + gwa + " , rating is 3.0");
            } 
         else if (gwa <= 74.6 && gwa >= 49.6) {
            System.out.println ("GWA is " + gwa + " , rating is 5.0");
            }
         else {
            System.out.println ("Error, grade cannot be below 50");
            }
    

   }
}