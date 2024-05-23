package CODSOFT;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[]args){

        char grade=0;

     Scanner scanner = new Scanner(System.in);
     System.out.println("---------Enter your marks-----------");
         System.out.println("Enter your Physics marks : ");
        int physics = scanner.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scanner.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scanner.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scanner.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scanner.nextInt();

        float totalMarks=(physics+English+chemistry+mathematics+computer);
        float averagePercentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

        if (averagePercentage > 90.0f) {
            grade = 'A';
        } else if (averagePercentage >= 70.0f && averagePercentage < 90.0f) {
            grade = 'B';
        } else if (averagePercentage >= 40.0f && averagePercentage < 70.0f) {
            grade = 'C';
        } else if (averagePercentage < 40.0f) {
            grade = 'F';
        }

        System.out.println("totalMarks : "+totalMarks);
        System.out.println("averagePercentage : "+averagePercentage);
        System.out.println("grade : "+grade);
    }
}
