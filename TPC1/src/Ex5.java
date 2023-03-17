import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Raio: ");
        double r = scanner.nextInt();

        System.out.println("Area: " + area(r));
    }

    static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
