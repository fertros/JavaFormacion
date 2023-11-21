package EJERCICIOS;

public class EJERCICIO6 {
    public static void main(String[] args) {
        final double PULGADAS_POR_METRO = 39.37;
        final int PULGADAS_POR_LINEA = 12;

        for (int pulgadas = 1; pulgadas <= 144; pulgadas++) {
            double metros = pulgadas / PULGADAS_POR_METRO;
            System.out.println(pulgadas);
            System.out.println(metros);
            // Agregar espacio después de cada 12 pulgadas
            if (pulgadas % PULGADAS_POR_LINEA == 0) {
                System.out.println();
            }
        }
    }
}

