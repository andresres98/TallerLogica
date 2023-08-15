package Taller;

public class ProduccionCarbon {
    public static void main(String[] args) {
        int [] produccionToneladas = {4,58,78,35,98,78,25,78,25,36,9,107};
        int totalProduccion = 0;
        for(int i = 0; i<produccionToneladas.length; i++){
            totalProduccion+=produccionToneladas[i];
        }
        double promedioCarbon = totalProduccion/produccionToneladas.length;
        System.out.println("El promedio del carbon producido en este año es de => " + promedioCarbon);
    }
}
