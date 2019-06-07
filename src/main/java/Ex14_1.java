import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());
        System.out.println("Area of rectangle is: " + rectangle.getArea());
    }
}
