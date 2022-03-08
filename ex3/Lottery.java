import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;

        String a = input.next();
        char[] test = a.toCharArray();
        int[] num = new int[3];

        for (int i = 0; i < test.length; i++) {
            num[i] = (test[i] - '0');
        }

        Random rand = new Random();
        int[] lottery = new int[3];
        for (int i = 0; i < 3; i++) {
            lottery[i] = rand.nextInt(10);
            if (lottery[i] == num[i]) {
                cnt++;
            }
        }

        System.out.println("lottery:" + " " + lottery[0] + " " + lottery[1] + " " + lottery[2]);

        if (cnt == 3) {
            System.out.println("You win a $10,000 prize!");
        } else if (cnt == 2) {
            System.out.println("You win a $5,000 prize!");
        } else if (cnt == 1) {
            System.out.println("You win a $1,000 prize!");
        } else {
            System.out.println("Sorry, no prize this time.");
        }
        input.close();

    }

}
