import java.util.Scanner;

/**
 * Write a description of class question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question1
{
 public static void main (String args []){
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Enter your marks ");
     int marks = sc.nextInt();
     
     //using ternary operator
     String result =(marks>=40 )?"pass":"fail";
     
     System.out.println("Result:"+result);
     
     
 }
}