import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        int ii = 2;
        System.out.print("Enter your numbers: ");
        int tmp = input.nextInt();
        if (tmp < 100) {
            System.out.println("Error: number must be between 100 and 999");
            System.exit(1);
        }

        while (tmp != 0) {
            int a = tmp / 10;
            int b = tmp % 10;
            numbers[ii] = b;
            tmp = a;
            ii--;
        }

        Random rand = new Random();
        int[] lottery = new int[3];
        for (int i = 0; i < 3; i++) {
            lottery[i] = rand.nextInt(10);
        }

        System.out.println("Lottery numbers: " + lottery[0] + " " + lottery[1] + " " + lottery[2]);

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] == lottery[i]) {
                cnt++;
            }
        }

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
