import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight in kilogram: ");
        double weight = input.nextDouble();

        int pound = (int) (weight / 0.454);
        double ounce = weight * 35.274 % 16; 

        System.out.printf("Equivalent imperial weight is %d lb %.1f oz", pound, ounce);
        input.close();
    }    
}
