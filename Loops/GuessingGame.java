
import java.util.Scanner;

public class GuessingGame
{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GuessingGame");
        System.out.println("");
        System.out.println("---------------------------------");
        int num = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int guessNum = 0;
        System.out.println("I've picked a random number between 1 and 100.  Try to guess it!");
        while (guess != num) {
            System.out.print("What is your guess? ");
            guess = sc.nextInt();
            if (guess > num) {
                System.out.println("Too high...");
                guessNum ++;     

            } else if (guess < num) {
                System.out.println("Too low...");
                guessNum ++;

            }
            else if (guess == num) {
                System.out.println("You've guessed my number! Good job!It only took you " + (guessNum + 1) + " tries.");
            }

        }

    }
}
