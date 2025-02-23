import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your grade is: " + grade);
    }

    public static double getStudentScore() {
        Scanner input = new Scanner(System.in);
        double score;
        
        while (true) {
            System.out.print("Enter your score: ");
            if (input.hasNextDouble()) {
                score = input.nextDouble();
                if (score >= 0 && score <= 100) {
                    break;
                } else {
                    System.out.println("Invalid score. Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                input.next();
            }
        }
        
        input.close();
        return score;
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
