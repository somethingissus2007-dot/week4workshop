import java.util.Scanner;
/**
 * Write a description of class question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marked price: ");
        float mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        char cat = sc.next().toUpperCase().charAt(0);

        float discountPercent;

        if (cat == 'A') {
            discountPercent = 60;
        } else if (cat == 'B') {
            discountPercent = 40;
        } else if (cat == 'C') {
            discountPercent = 20;
        } else if (cat == 'D') {
            discountPercent = 10;
        } else {
            System.out.println("Invalid category!");
            sc.close();
            return;
        }

        float sp = mp - (mp * discountPercent / 100);
        System.out.println("Selling price = " + sp);

        sc.close();
    }
}