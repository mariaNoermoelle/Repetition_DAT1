import java.util.Random;
import java.util.Scanner;

public class Game
{
    public int hands;
    public void pick() {
        System.out.println("Please pick: 1. Rock, 2.  Paper or 3. Scissors");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        switch (hands) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Pick something.");
        }



    }
        public int play() {
            Random random = new Random();
            int hands;
            hands = random.nextInt(3) + 1;
            System.out.println(hands);
            return hands;
        }
}