import java.util.Scanner;

public class Algoritm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);

        System.out.println("The area of a circle with radius " + area);


    }

}
