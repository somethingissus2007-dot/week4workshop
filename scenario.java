import java.util.Scanner;
/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter age group (child / adult / senior): ");
        String ageGroup = sc.nextLine().trim().toLowerCase();

        
        System.out.println("Enter movie language (nepali / hindi / english): ");
        String language = sc.nextLine().trim().toLowerCase();

        
        System.out.println("Are you a student? (yes / no): ");
        String studentAns = sc.nextLine().trim().toLowerCase();
        boolean isStudent = studentAns.equals("yes");

        
        System.out.println("Is it a festival day? (yes / no): ");
        String festivalAns = sc.nextLine().trim().toLowerCase();
        boolean isFestival = festivalAns.equals("yes");

        double price = 0;

        
        if (ageGroup.equals("child")) {
            price = 150;
        } else if (ageGroup.equals("adult")) {
            price = 250;
        } else if (ageGroup.equals("senior")) {
            price = 200;
        } else {
            System.out.println("Invalid age group!");
            sc.close();
            return;
        }

        
        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (!language.equals("nepali")) {
            System.out.println("Invalid language!");
            sc.close();
            return;
        }

        
        if (isStudent) {
            price = price * 0.80; 
        }

        if (isFestival) {
            price = price * 0.85; 
        }

        System.out.println("Final ticket price: Rs. " + price);
        sc.close();
    }
}