package Taller;
import java.util.Random;
public class JuegoAleatorio {
    static int VIDAS= 5;
    static int PODER= 0;
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int contador= 0;
        while(VIDAS>0){
            int numero = numeroAleatorio.nextInt(11);
            if(numero==5){
                PODER++;
            } else if (numero==3) {
                VIDAS--;
            }
            contador++;
        }
        System.out.println("El poder suyo es de => " + PODER);
        System.out.println("El numero de intentos rondas fue de => " + contador);
    }
}
