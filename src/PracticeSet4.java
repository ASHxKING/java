import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int m1,m2,m3;
//        System.out.println("Enter The Marks of All the subjects out of 100");
//        m1 = sc.nextInt();
//        m2 = sc.nextInt();
//        m3 = sc.nextInt();
//        int percentage = m1+m2+m3/3;
//        if (m1>=33 && m2>=33 && m3>=33 && percentage>=40){
//            System.out.println("You passed ");
//        }else {
//            System.out.println("You failed");
//        }
        int year = sc.nextInt();
        if (year%4 == 0){
            if (year%100 != 0 || year%400 == 0){
                System.out.println("Its a leap year");
            }
        }else {
            System.out.println("Its not a leap year");
        }
    }
}
