import java.util.Scanner;

public class ErrorsInJava {
    public static void main(String[] args) {
//        int a = 5000;
        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        try {
//            System.out.println(a/b);
//        }catch (Exception e){
//            System.out.println(e);
//        }

        int index = 9;
        int i=0;
        while(i<=5){
            System.out.println("Enter a value between 0-9");
            int tries = sc.nextInt();
            if (tries == index){
                break;
            }
            i++;
        }
    }
}
