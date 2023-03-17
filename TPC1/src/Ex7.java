import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        double salary = readDouble("Por favor, insira o seu salario: ");
        System.out.println("Valor inserido foi " + salary);
    }

    static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        double valor = scanner.nextDouble();

        return valor;

    }
}
