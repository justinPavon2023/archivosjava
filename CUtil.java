//Este es una matriz en donde se muestran los ingresos, egresos y la utilidad de una persona 

import java.util.Scanner;

public class CUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglos para almacenar ingresos, egresos y utilidades
        double[] ingresos = new double[15];
        double[] egresos = new double[15];
        double[] utilidad = new double[15];

        // Captura de valores de ingresos
        do {
            System.out.println("Ingrese los valores de ingresos:");
            for (int i = 0; i < ingresos.length; i++) {
                double ingreso = 0;
                System.out.print("Ingreso " + (i + 1) + ": ");
                ingreso = scanner.nextDouble();
                ingresos[i] = ingreso;
            }
        } while (ingreso >= 100 || ingreso <= 500000);

        // Captura de valores de egresos
        do {
            System.out.println("Ingrese los valores de egresos");
            for (int i = 0; i < egresos.length; i++) {
                double egreso = -1;
                System.out.print("Egreso " + (i + 1) + ": ");
                egreso = scanner.nextDouble();
                egresos[i] = egreso;
            }
        } while (egreso >= 0 || egreso <= ingresos[i]);

        // Cálculo de utilidades
        for (int i = 0; i < utilidad.length; i++) {
            utilidad[i] = ingresos[i] - egresos[i];
        }

        // Mostrar encabezados de la tabla
        System.out.println("Ingresos\tEgresos\t\tUtilidad");

        // Mostrar valores de ingresos, egresos y utilidades
        for (int i = 0; i < ingresos.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", ingresos[i], egresos[i], utilidad[i]);
        }
    }
}
