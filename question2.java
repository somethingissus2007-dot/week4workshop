import java.util.Scanner;

/**
 * Write a description of class question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question2
{
    public static void main (String args []){
        Scanner sc= new Scanner(System.in);
        int X = sc.nextInt ();
        
        
        if(X%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }       
    }