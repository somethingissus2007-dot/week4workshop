import java.util.Scanner;

/**
 * Write a description of class question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question4
{
    public static void main(String args []){
        Scanner sc= new Scanner (System.in);
        int X=sc.nextInt();
        
        if(X%3==0 & X%5==0) {
            System.out.println("Divisible by both 3 and 5");
        }
        else{
            System.out.println(" Not divisible by both 3 and 5");
        }
        }
        
        
    }
