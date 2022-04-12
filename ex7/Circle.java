public class Circle {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        if ( radius <= 0.0 ) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.4f)", radius);
    }

    @Override   
    public boolean equals(Object obj) {
        if ( obj == null ) {
            return false;
        }
        if ( !(obj instanceof Circle) ) {
            return false;
        }
        Circle other = (Circle) obj;
        double diffRadius = Math.abs(radius - other.radius);
        return diffRadius < 0.00005;
    }
}
