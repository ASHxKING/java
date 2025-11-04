import java.util.Scanner;
import java.util.Random;
public class rpsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to a game of Rock Paper Scissor ");
        int rounds = 0;
        int win =0;
        int cpuwin=0;
        while(rounds < 3){
            System.out.println("Please enter your selection");
            String input = sc.next();
            int userIntValue = 0;
            if(input.equals("rock")) ;
            else if(input.equals("paper")) userIntValue = 1;
            else if(input.equals("scissor")) userIntValue = 2;
            else {
                System.out.println("Wrong input or spelling mistake");
            }
            int num = rand.nextInt(3);
            System.out.println(num);
            if (userIntValue == num){
                if (rounds == 0){
                    System.out.println("its a Draw");
                }else {
                    rounds-=1;
                    System.out.println("its a Draw");
                }
            } else if (userIntValue == 0 && num == 2 ) {
                System.out.println("you won this Round");
                win++;
            } else if (userIntValue == 1 && num == 0 ) {
                System.out.println("you won this Round");
                win++;
            } else if (userIntValue == 2 && num == 1 ) {
                System.out.println("you won this Round");
                win++;
            }else {
                System.out.println("you loose this round");
                cpuwin++;
            }
            rounds++;
//            System.out.println("round counts "+rounds);
        }
        System.out.println("The scores are as follows");
        System.out.println("You :"+win);
        System.out.println("CPU :"+cpuwin);
    }
}
