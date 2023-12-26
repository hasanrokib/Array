import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.print("Enter the student's score: ");

        // Read the user input as a double (assuming a decimal score)
        double score = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Determine the grade based on the grading scale
        char grade = calculateGrade(score);

        // Print the result
        System.out.println("The student's grade is: " + grade);
    }

    // Method to calculate the grade based on the grading scale
    private static char calculateGrade(double score) {
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }

    }
