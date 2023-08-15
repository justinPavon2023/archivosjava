//Este codigo esta relacionado con el manejo de transacciones de compra y venta de dólares utilizando métodos de la clase TasaC

import java.io.*;
import java.util.Scanner;

public class DemoTC {
    public static double VentaD[], CompraD[];
    public static int cant, tt;
    public static TasaC tc = new TasaC();

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        VentaD = new double[6];
        CompraD = new double[6];

        try {
            // Configurar el tipo de cambio
            tc.tipot();

            // Solicitar la cantidad de transacciones a ejecutar
            do {
                System.out.println("Cuantas transacciones ejecutara");
                cant = s.nextInt();
            } while (cant <= 0 || cant > 3);

            // Solicitar el tipo de transacción
            do {
                System.out.println("Seleccione su transaccion (1: Venta, 2: Compra)");
                tt = s.nextInt();
            } while (tt <= 0 || tt > 2);

            switch (tt) {
                case 1: {
                    // Realizar transacciones de venta
                    for (int i = 1; i <= cant; i++) {
                        do {
                            System.out.println("Cuantos dolares vendera");
                            VentaD[i] = s.nextDouble();
                            tc.setC(VentaD[i]);
                        } while (VentaD[i] <= 0 || VentaD[i] > 11000);
                        System.out.println("Debera recibir " + tc.VDolar(VentaD[i]));
                    }

                    // Mostrar los montos de venta en dólares
                    for (int i = 1; i <= cant; i++) {
                        System.out.print("\t" + VentaD[i]);
                    }

                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
