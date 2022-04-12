public class CircleDemo {
    public static void main(String[] args) {
        try {
            Circle c = new Circle();
            
            Exception falseInstance = new Exception(); // invalid instance

            System.out.println("Different instance: " +c.equals(falseInstance)); // different instance 
            System.out.println("toString: " + c); // toString

            Circle c1 = new Circle(1.00004);
            Circle c2 = new Circle(1.00006);

            System.out.println("1.00004 compare with 1.0000: " + c.equals(c1)); // true
            System.out.println("1.00006 compare with 1.0000: " + c.equals(c2)); // false

            System.out.println("Invalid input: ");
            Circle invalidInputTest = new Circle(-1); // invalid input
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
