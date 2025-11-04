
import java.util.Scanner;
public class PracticeSet1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Write a program to sum three numbers in Java.
/*
        System.out.println("Please Enter 3 Numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println("Sum of 3 numbers is "+sum);
*/

        //Write a program to calculate CGPA using marks of three subjects (out of 100)
/*
        System.out.println("Please Enter Marks of 3 subjects out of 100");
        double m1 = sc.nextInt();
        double m2 = sc.nextInt();
        double m3 = sc.nextInt();
        double cgpa = ((m1+m2+m3)/300)*100;
        System.out.println("CGPA will be"+cgpa/9.5);
*/
        //Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
/*
        System.out.println("Please Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Good day! "+name);
*/
        //Write a Java program to convert Kilometers to miles.
/*
        System.out.println("Enter the distance in Kilometer");
        double km = sc.nextDouble();
        System.out.println("Distance in Miles :"+(0.621371*km));
 */
        //Write a Java program to detect whether a number entered by the user is an integer or not.

        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());

    }
}
