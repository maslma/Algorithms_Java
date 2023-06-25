import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        String grade;
        if (score >= 85 && score <= 100) {
            grade = "A";
        } else if (score >= 75 && score < 85) {
            grade = "B";
        } else if (score >= 65 && score < 75) {
            grade = "C";
        } else if (score >= 60 && score < 65) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}