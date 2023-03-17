import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero total de criancas: ");
        int totC = scanner.nextInt();
        System.out.print("Tamanho dos grupos: ");
        int tamG = scanner.nextInt();

        int qtdG = totC / tamG;
        int semG = totC - (tamG * qtdG);

        System.out.println("Poderao ser formados " + qtdG + " grupos.");
        System.out.println("E " + semG + " criancas ficarao sem grupo.");
    }
}
