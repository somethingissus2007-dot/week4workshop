import java.util.Scanner;

/**
 * Write a description of class question9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter Attendance Percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Attitude Score (1–10): ");
        int attitude = sc.nextInt();

        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("The student is eligible for the scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score must be less than 5.");
                }
            } else {
                System.out.println("Not eligible: Attendance must be greater than 80%.");
            }
        } else {
            System.out.println("Not eligible: GPA must be 3.2 or above.");
        }

        sc.close();
    }
}