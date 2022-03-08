import java.util.Scanner;

public class Spheroid {
    public static void main(String[] args) {
        double a, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter equatorial radius in km: ");
        a = input.nextDouble();
        if (a <= 0) {
            System.out.println("Error: equatorial radius must be larger than 0");
            System.exit(1);
        }

        System.out.print("Enter polar radius in km: ");
        c = input.nextDouble();
        if (c <= 0) {
            System.out.println("Error: polar radius must be larger than 0");
            System.exit(1);
        }

        if (c > a) {
            System.out.println("Error: equatorial radius must be larger than polar radius");
            System.exit(1);
        }

        double eccentricity, volume;

        eccentricity = Math.sqrt(1 - Math.pow(c, 2) / Math.pow(a, 2));
        volume = (4.0 / 3.0) * Math.PI * Math.pow(a, 2) * c;

        System.out.printf("Eccentricity = %.2g\n", eccentricity);
        System.out.printf("Volume = %g cubic km\n", volume);

        input.close();

    }
}