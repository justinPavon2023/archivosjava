
// Este es un codigo de selectiva multiple en donde se le da a escoger al usuario una figura para que luego ingrese los datos y ser encontrada su area y perimetro 
import java.io.*;
import java.util.Scanner;

public class DemoFiguras {
    public static double ra, ba, al, la;
    public static int op;
    public static Figuras f = new Figuras();

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        try {
            f.menu();

            // Ciclo para seleccionar la figura (1: Circunferencia, 2: Romboide, 3: Cilindro)
            do {
                System.out.println("Seleccione la figura");
                op = s.nextInt();
            } while (op <= 0 || op > 3);

            switch (op) {
                case 1: {
                    // Cálculos para la Circunferencia
                    do {
                        System.out.println("Digite el radio");
                        ra = s.nextDouble();
                        f.setr(ra);
                    } while (ra <= 0);

                    System.out.println("El area de la Circunferencia es: " + f.AC());
                    System.out.println("El Perimetro de la Circunferencia es: " + f.PC());
                    break;
                }
                case 2: {
                    // Cálculos para el Romboide
                    do {
                        System.out.println("Digite la base");
                        ba = s.nextDouble();
                        f.setb(ba);
                    } while (ba <= 0);

                    do {
                        System.out.println("Digite la altura");
                        al = s.nextDouble();
                        f.seth(al);
                    } while (al <= 0);

                    do {
                        System.out.println("Digite el lado");
                        la = s.nextDouble();
                        f.setl(la);
                    } while (la <= 0);

                    System.out.println("El Area del Romboide es: " + f.AR());
                    System.out.println("El Perimetro del Romboide es: " + f.PR());
                    break;
                }
                case 3: {
                    // Cálculos para el Cilindro
                    do {
                        System.out.println("Digite el radio");
                        ra = s.nextDouble();
                        f.setr(ra);
                    } while (ra <= 0);

                    do {
                        System.out.println("Digite la altura");
                        al = s.nextDouble();
                        f.seth(al);
                    } while (al <= 0);

                    System.out.println("El Area del Cilindro es: " + f.ACi());
                    System.out.println("El Perimetro del Cilindro es: " + f.PCi());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
