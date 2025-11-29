import java.util.Scanner;

/**
 * Write a description of class question8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA! Must be between 0.0 and 4.0.");
        } else {
            String grade;
            if (gpa >= 3.6) {
                grade = "A";
            } else if (gpa >= 3.0) {
                grade = "B";
            } else if (gpa >= 2.0) {
                grade = "C";
            } else if (gpa >= 1.0) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Your Grade is: " + grade);
        }

        sc.close();
    }
}