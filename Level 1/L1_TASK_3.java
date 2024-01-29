package Level_1;

import java.util.Scanner;
/*

 Cognifyz Level 1  Task 3 Student Grade Calculator
 Designed And Developed by Utkarsh Gaikwad
 Skills: Loops,arrays,basic arithmetic operations.

 */
public class L1_TASK_3 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of Subjects: ");
        int numAssignments = scanner.nextInt();

        double totalScore = 0;

        for (int i = 1; i <= numAssignments; i++) {
            System.out.print("Enter the score for Subject " + i + ": ");
            double assignmentScore = scanner.nextDouble();
            totalScore += assignmentScore;
        }

        double averageScore = totalScore / numAssignments;
        System.out.println("Average score: " + averageScore+" % " + " Grade: "+calculateGrade(averageScore));
    }
    public static String calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return "First Class Dist.";
        } else if (averageScore >= 80) {
            return "First Class.";
        } else if (averageScore >= 70) {
            return "Second Class.";
        } else if (averageScore >= 45) {
            return "Pass.";
        } else {
            return "Fail";
        }
    }
}
