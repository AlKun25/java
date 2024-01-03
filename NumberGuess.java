import java.util.Scanner;

public class NumberGuess {
    public static void numberGuessGame(){
        // Scanner class 
        Scanner sc = new Scanner(System.in);

        // Generate numbers
        int number = 1 + (int)(100 * Math.random());
        
        // Number of trials
        int K = 5;

        int i, guess;

        System.out.println("A number is chosen between 1-100. Guess the number between 5 trials.");

        // Iterate over K trails
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess){
                System.out.println("Congratualtions! You have guessed the number correctly.");
                break;
            }
            else if (number > guess && i != K-1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != K-1) {
                System.out.println("The number is less than " + guess);
            }
        }
        if (i==K) {
            System.out.println("You have exhausted 5 trials.");
            System.out.println("The number was " + number);
        }

        // Scanner closed
        sc.close();
    }

    // Driver code
    public static void main(String[] args) {
        // Function call 
        numberGuessGame();
    }
}
