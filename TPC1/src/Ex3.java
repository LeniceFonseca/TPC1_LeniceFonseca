import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Maior: " + maiorDeTres(num1, num2, num3));
    }

    static int maiorDeTres(int num1, int num2, int num3){
        int maior = 0;
        if((num1 == num2) && (num2 == num3)) {
            System.out.println("Os numeros nao sao distintos!");
        }
        else {
            if((num1 > num2) && (num1 > num3)) {
                maior = num1;
            }
            else if((num2 > num1) && (num2 > num3)) {
                maior = num2;
            }
            else {
                maior = num3;
            }
        }

        return maior;
    }
}
