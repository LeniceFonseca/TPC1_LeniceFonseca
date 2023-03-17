import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Horas: ");
        int hours = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutes = scanner.nextInt();

        System.out.println(getTimeName(hours, minutes));
    }

    static String getTimeName(int hours, int minutes) {
        String timeName = "";
        String[] horas = {"uma", "duas", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze"};

        if(minutes == 0) {
            timeName = "Sao " + horas[hours - 1] + " horas em ponto";
        }
        else if(minutes == 15) {
            timeName = "Sao quinze minutos passados das " + horas[hours - 1];
        }
        else if(minutes == 30) {
            timeName = "Sao " + horas[hours - 1] + " e meia";
        }
        else if(minutes == 45) {
            timeName = "faltam quinze para as " + horas[hours % 12];
        }
        else if(minutes < 30) {
            timeName = "Sao " + horas[hours - 1] + " e " + getMinutesName(minutes);
        }
        else {
            timeName = "Faltam " + getMinutesName(60 - minutes) + " para as " + horas[hours % 12];
        }

        return timeName;
    }

    static String getMinutesName(int minutes) {
        String minutesName = "";
        String[] minutos = {"uma", "duas", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
                "treze", "quatorze", "quinze", "dezasseis", "dezassete", "dezoitso", "dezanove", "vinte", "vinte e um",
                "vinte e dois", "vinte e tres", "vinte e quatro", "vinte e cinco", "vinte e seis", "vinte e sete",
                "vinte e oito", "vinte e nove"};

        if(minutes <= 29) {
            minutesName = minutos[minutes - 1] + " minutos";
        }
        else {
            minutesName = minutos[60 - minutes - 1] + " minutos";
        }
        return minutesName;
    }
}
