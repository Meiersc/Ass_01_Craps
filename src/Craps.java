import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y")) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled: ");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lost.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {

                int point = sum;
                System.out.println("The point is now: " + point);
                boolean rollingForPoint = true;

                while (rollingForPoint) {
                    System.out.println("Trying for point");
                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    sum = die1 + die2;
                    System.out.println("Die 1: " + die1 + " | Die 2: " + die2 + " | Sum: " + sum);
                    if (sum == point) {
                        System.out.println("Made point and won!");
                        rollingForPoint = false;
                    } else if (sum == 7) {
                        System.out.println("Got a seven and lost.");
                        rollingForPoint = false;
                    }
                }
            }

            System.out.print("Would you like to play again? (y/n): ");
            playAgain = scanner.nextLine();
            System.out.println();
        }

    }
}