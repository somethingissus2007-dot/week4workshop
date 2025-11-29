import java.util.Scanner;

/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5
{
    public static void main (String args []){
        Scanner input= new Scanner (System.in);
        
        System.out.println("Enter a number:");
        int number = input.nextInt ();
        
        if(number%3==0){
            
          if(number%5==0){
            System.out.println(number+" is divisible by both 3 and 5");
          }
          else {
            System.out.println(number +"is divisible by 3 but not by 5");
        }
        
    }
        else if(number % 5==0) {
            System.out.println(number +"is divisible by 5 but not by 3");
        }
        else
        {
            System.out.println(number+"is not divisible by both 3 and 5");
            
        }
    }
}
    