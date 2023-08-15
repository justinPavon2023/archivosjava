// Este codigo lo que resuelve es que convierte la temperatura de celcius a fahrenheit y los muestra en un vector
import java.io.*;
import java.util.Scanner;

public class DemoCT {
    public static double TeC[], TeF[];
    public static TempV tv = new TempV();

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        TeC = new double[6];
        TeF = new double[6];

        try {
            for (int i = 1; i <= 4; i++) {
                System.out.println("Digite la temperatura # " + i);
                TeC[i] = s.nextDouble();
                tv.setTV(TeC);

                // Convertir temperatura de Celsius a Fahrenheit
                TeF[i] = tv.CT(TeC[i]);
            }

            // Mostrar temperaturas en Celsius
            for (int i = 1; i <= 4; i++) {
                System.out.print("\t" + TeC[i]);
            }

            System.out.println("");

            // Mostrar temperaturas en Fahrenheit
            for (int i = 1; i <= 4; i++) {
                System.out.print("\t" + TeF[i]);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
