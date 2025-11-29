import java.util.Scanner;

/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question3
{
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt ();
        int b= sc.nextInt ();
         
        if (a>b){
        System.out.println("positive");}
        else if (a<b){
            System.out.println("negative");
        }
        else{
            System.out.println("equal");
        }
        }
            
}  