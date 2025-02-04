import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int num = r.nextInt(10) + 1;
        int guessesLeft = 3;
        boolean correct = false;


            System.out.println("try to guess the random number in 3 guesses!");
            System.out.print("guess between 1 - 10: ");
        while (guessesLeft != 0){
            int guess = s.nextInt();
            if (guess == num){
                correct = true;
                break;
            }else if (guess > num){
                System.out.println("your guess was too high!");
                guessesLeft--;
            } else if (guess < num) {
                System.out.println("your guess was too low!");
                guessesLeft--;
            }
            if(guessesLeft == 0){
                break;
            }
            System.out.println("guesses left: " + guessesLeft);
            System.out.print("try again: ");
        }
        if (correct){
            System.out.println("you're correct! the number was " + num);
        }else{
            System.out.println("sorry, you're all out of guesses. The number was " + num);
        }
    }
}