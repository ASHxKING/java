import java.util.Scanner;
import java.util.Random;
class Game{
    Scanner s = new Scanner(System.in);

    public Game(){
        Random rand = new Random();
        int random_number=rand.nextInt(100)+1;
        System.out.println("A random number generated between 1-100");
        isCorrectNumber(random_number);
    }
    public int takeUserInput(){
        return s.nextInt();
    }
    public void isCorrectNumber(int n){
        int counter = 1;
        while (true){
            int guess = takeUserInput();
        if (guess == n ){
            System.out.println("You Won and your Score is : "+counter);
            break;
        } else if (guess>n) {
            System.out.println("Your guess is higher that the actual number");
            counter++;
        }else {
            System.out.println("Your guess is lower that the actual number");
            counter++;
        }
        }
        }
    }


public class GuessTheNumber {
    public static void main(String[] args) {
        new Game();
    }
}
