import java.util.Scanner;

public class Question2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
        input.close();
    }
}
