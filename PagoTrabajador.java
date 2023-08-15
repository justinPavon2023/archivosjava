//Codigo para calcular el pago de un trabajador segun su categoria y pago de horas extras

import java.util.Scanner;

public class PagoTrabajador {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar y almacenar el sueldo básico del trabajador
        System.out.print("Ingrese el sueldo básico del trabajador: ");
        double sueldoBasico = sc.nextDouble();

        // Solicitar y almacenar la categoría del trabajador (1-4)
        System.out.print("Ingrese la categoría del trabajador (1-4): ");
        int categoria = sc.nextInt();

        // Solicitar y almacenar las horas extras trabajadas por el trabajador
        System.out.print("Ingrese las horas extras trabajadas por el trabajador: ");
        int horasExtras = sc.nextInt();

        // Calcular el pago por horas extras según la categoría del trabajador
        double pagoHorasExtras = 0;
        switch (categoria) {
            case 1:
                pagoHorasExtras = horasExtras * 30;
                break;
            case 2:
                pagoHorasExtras = horasExtras * 38;
                break;
            case 3:
                pagoHorasExtras = horasExtras * 50;
                break;
            case 4:
                pagoHorasExtras = horasExtras * 70;
                break;
            default:
                // Mostrar un mensaje de categoría inválida y finalizar el programa
                System.out.println("Categoría inválida");
                return;
        }

        // Limitar el pago por horas extras a un máximo de 30 horas extras
        if (horasExtras > 30) {
            pagoHorasExtras = 30 * pagoHorasExtras / horasExtras;
        }

        // Calcular el pago total sumando el sueldo básico y el pago por horas extras
        double pagoTotal = sueldoBasico + pagoHorasExtras;

        // Mostrar el pago total del trabajador
        System.out.println("El pago total del trabajador es: " + pagoTotal);
    }
}
