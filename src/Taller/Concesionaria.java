package Taller;
import java.util.Scanner;
public class Concesionaria {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de vehiculos que vendio este mes => ");
        int carrosVendidos = sc.nextInt();
        System.out.println("Ingrese el precio de venta ");
        double precioVenta = sc.nextDouble();
        double totalVenta = carrosVendidos * precioVenta;
        double comision = 0;
        if (totalVenta<=100000){
            comision = 0.015;
            System.out.println("Querido vendedor su total de ventas este mes fue de => " +totalVenta+ "\nQuerido vendedor su comision este mes es de " + comision +
                    "\nA su pago de nomina se le va a adicionar el bono de comisiones por un valor de => " + (totalVenta*comision));
        } else if ((totalVenta > 100000 )&& (totalVenta<=250000)) {
            comision = 0.018;
            System.out.println("Querido vendedor su total de ventas este mes fue de => " +totalVenta+ "\nQuerido vendedor su comision este mes es de " + comision +
                    "\nA su pago de nomina se le va a adicionar el bono de comisiones por un valor de => " + (totalVenta*comision));
        } else if (totalVenta>250000) {
            comision = 0.023;
            System.out.println("Querido vendedor su total de ventas este mes fue de => " +totalVenta+ "\nQuerido vendedor su comision este mes es de " + comision +
                    "\nA su pago de nomina se le va a adicionar el bono de comisiones por un valor de => " + (totalVenta*comision));
        } else {
            System.out.println("Ingrese valores validos señor vendedor");
        }
    }
}
