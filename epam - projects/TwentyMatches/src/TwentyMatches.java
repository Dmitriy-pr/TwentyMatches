
import java.util.Scanner;

public class TwentyMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The game started...");
        int sum = 17;
        System.out.println("Computer took 3 matches, 17 matches left");

        while (sum > 1) {
            if (!scanner.hasNextInt()) {
                System.out.println("You only need to enter integers.");
                break;
            }
            int player = scanner.nextInt();
            int countMatches = 0;
            if (player == 1) {
                sum -= player;
                System.out.println("Player took " + player + " match, " + sum + " matches left");
                countMatches = 3;
                sum -= countMatches;
                System.out.println("Computer took " + countMatches + " matches, " + sum + " matches left");
            } else if (player == 2) {
                sum -= player;
                System.out.println("Player took " + player + " matches, " + sum + " matches left");
                countMatches = 2;
                sum -= countMatches;
                System.out.println("Computer took " + countMatches + " matches, " + sum + " matches left");
            } else if (player == 3) {
                sum -= player;
                System.out.println("Player took " + player + " matches, " + sum + " matches left");
                countMatches = 1;
                sum -= countMatches;
                System.out.println("Computer took " + countMatches + " match, " + sum + " matches left");
            } else {
                System.out.println("Player took the wrong number of matches, try again.");
            }
            if (sum == 1) {
                System.out.println("The game is over. Computer won!");
                return;
            }
        }
    }
}