import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double f = scanner.nextDouble();

        System.out.println("Celsius: " + converter(f));
    }

    static double converter(double tempF){
        return (0.5555555555555556 * (tempF - 32));
    }
}