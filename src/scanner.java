import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total marks of each subject");
        byte totalMarks = sc.nextByte();
        System.out.println("Please enter the marks obtained in first subject");
        byte sub1 = sc.nextByte();
        System.out.println("Please enter the marks obtained in second subject");
        byte sub2 = sc.nextByte();
        System.out.println("Please enter the marks obtained in third subject");
        byte sub3 = sc.nextByte();
        System.out.println("Please enter the marks obtained in fourth subject");
        byte sub4 = sc.nextByte();
        System.out.println("Please enter the marks obtained in fifth subject");
        byte sub5 = sc.nextByte();
        System.out.println("marks entered are "+sub1+" "+sub2+" "+sub3+" "+sub4+" "+sub5);
        double sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println(sum);
        double percentage = (sum/(totalMarks*5))*100;
        System.out.println("percentage comes out to be "+ percentage);
    }
}
