import java.util.Scanner;

import java.lang.Math;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if(checkArmstrong(numero)){
            System.out.println(numero + " eh Aemstrong");
        }
        else {
            System.out.println(numero + " nao eh Aemstrong");
        }

    }

    static boolean checkArmstrong(int numero){
        String digit = Integer.toString(numero);
        int qtdDigit = digit.length();

        int somaP = 0;
        int potencia;
        int aux = numero;

        while(aux > 0) {
            potencia = aux % 10;
            somaP += Math.pow(potencia, qtdDigit);
            aux /= 10;
        }

        if(somaP == numero){
            return true;
        }
        else {
            return false;
        }
    }

}
