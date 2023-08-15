
// Este es un codigo para calcular la cantidad de dinero que se le abona al inss dependiendo de sus ingresos
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CInss {
    // Declaración de variables globales para ingreso y cálculo de Inss
    public static double Ing, Inss;

    public static void main(String args[]) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            do {
                // Solicitar al usuario que ingrese su ingreso
                System.out.println("Digite su ingreso");
                Ing = Double.parseDouble(br.readLine());

                // Repetir hasta que el ingreso esté en el rango válido
            } while (Ing < 4800 || Ing > 600000);

            // Calcular el Inss como el 7% del ingreso
            Inss = Ing * 0.07;

            // Mostrar el cálculo del Inss
            System.out.println("Su calculo de Inss es: " + Inss);

        } catch (IOException ex) {
            // Manejar excepciones de entrada/salida
        }
    }
}
