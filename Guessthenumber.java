public class Guessthenumber {
    public static void main(String[] args) {

        int secretNumber = 7;
        int guess = 9;

        System.out.println("Secret Number: " + secretNumber);
        System.out.println("Your Guess: " + guess);

        if (guess == secretNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else if (guess < secretNumber) {
            System.out.println("Too low! Try a bigger number.");
        } else {
            System.out.println("Too high! Try a smaller number.");
        }
    }
}
