import java.util.Scanner;
import java.util.Arrays;

public class FibonachiUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to print : ");
        int n = sc.nextInt();
        if (n<=0) {
            System.out.println("Please Enter a Valid Positive Number ");
        }else {
            int a =0,b=1;
            for (int i = 0; i < n ; i++) {
                System.out.print(a+" ");
                int next = a+b;
                a=b;
                b=next;
            }
        }

    }
}
