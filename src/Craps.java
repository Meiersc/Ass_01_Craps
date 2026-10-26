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


                System.out.print("Would you like to roll again? (y/n): ");
                playAgain = scanner.nextLine();
                System.out.println();
            }
        }
    }

