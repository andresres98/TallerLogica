package Taller;

import java.util.Scanner;

public class CalcularAreaYPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el ancho del rectangulo");
        double base= sc.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo");
        double altura= sc.nextDouble();
        System.out.println("El area del rectangulo es => " + CalcularAreaRectangulo(base, altura));
        System.out.println("El perimetro del rectangulo es => " + CalcularPerimetroRectangulo(base, altura));

    }
    public static double CalcularAreaRectangulo(double base, double altura){
        return base*altura;
    }
    public static double CalcularPerimetroRectangulo(double base, double altura) {
        return (base*2)+ (altura*2);
    }
}
