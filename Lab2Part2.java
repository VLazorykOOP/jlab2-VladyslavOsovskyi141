
import java.util.Scanner;
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    // рівності
    public boolean equals(Rectangle other) {
        return this.width == other.width && this.height == other.height;
    }

    // подібності
    public boolean isSimilar(Rectangle other) {
        double ratio1 = this.width / this.height;
        double ratio2 = other.width / other.height;
        return Math.abs(ratio1 - ratio2) < 1e-6;
    }

    public void printInfo() {
        System.out.println("Rectangle: width=" + width + ", height=" + height +
                           ", area=" + area() + ", perimeter=" + perimeter());
    }
}

public class Lab2Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for first rectangle:");
        System.out.print("Width: ");
        double w1 = sc.nextDouble();
        System.out.print("Height: ");
        double h1 = sc.nextDouble();

        System.out.println("Enter dimensions for second rectangle:");
        System.out.print("Width: ");
        double w2 = sc.nextDouble();
        System.out.print("Height: ");
        double h2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(w1, h1);
        Rectangle r2 = new Rectangle(w2, h2);

        System.out.println("\nInfo");
        r1.printInfo();
        r2.printInfo();

        System.out.println("\n--- Comparison ---");
        System.out.println("Rectangles are equal? " + r1.equals(r2));
        System.out.println("Rectangles are similar? " + r1.isSimilar(r2));

        sc.close();
    }
}
