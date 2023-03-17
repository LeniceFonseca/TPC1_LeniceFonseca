import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Raio(r): ");
        double r = scanner.nextDouble();
        System.out.print("Altura(h): ");
        double h = scanner.nextDouble();

        System.out.println("Volume Esfera: " + sphereVolume(r));
        System.out.println("Area Esfera: " + sphereSurface(r));
        System.out.println();
        System.out.println("Volume Cilindro: " + cylinderVolume(r, h));
        System.out.println("Area Cilindro: " + cylinderSurface(r, h));
        System.out.println();
        System.out.println("Volume Cone: " + coneVolume(r, h));
        System.out.println("Area Cone: " + coneSurface(r, h));

    }

    static double sphereVolume( double r) {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;
    }

    static double sphereSurface( double r) {
        return (4 * Math.PI * Math.pow(r, 2));
    }

    static double cylinderVolume( double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h);
    }

    static double cylinderSurface( double r, double h) {
        return ((2 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h));
    }

    static double coneVolume( double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    static double coneSurface( double r, double h) {
        double g = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        return ((Math.PI * Math.pow(r, 2)) + (Math.PI * r * g));
    }
}
