import java.util.Scanner;
/**
 * Write a description of class question7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marked price: ");
        float mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        char cat = sc.next().toUpperCase().charAt(0);

        float discountPercent;

        switch (cat) { // switch chooses case by category letter[web:44][web:46]
            case 'A':
                discountPercent = 60;
                break;
            case 'B':
                discountPercent = 40;
                break;
            case 'C':
                discountPercent = 20;
                break;
            case 'D':
                discountPercent = 10;
                break;
            default:
                System.out.println("Invalid category!");
                sc.close();
                return;
        }

        float sp = mp - (mp * discountPercent / 100);
        System.out.println("Selling price = " + sp);

        sc.close();
    }
}