import java.util.Scanner;

public class invitadosTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVisitas = 0;
        double tiempoTotal = 0.0;

        // Declaración de variables
        String nombre;
        char genero;
        int visitas = 0;

        // Captura de datos del usuario
        System.out.print("Ingrese el nombre del visitante: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el género (M/F): ");
        genero = scanner.next().charAt(0);

        for (int i = 0; i < 7; i++) {
            System.out.println("¿Visitó el día " + (i + 1) + "? (S/N)");
            char visito = scanner.next().charAt(0);
            if (visito == 'S' || visito == 's') {
                visitas++;
                System.out.println("Ingrese la duración de la visita del día " + (i + 1) + " en minutos:");
                double duracion = scanner.nextDouble();
                tiempoTotal += duracion;
                totalVisitas++;
            }
        }

        double tiempoPromedio =
                tiempoTotal / totalVisitas;

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        String mayorMenor = (edad >= 18) ? "mayor" : "menor";

        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Cantidad total de visitas: " + totalVisitas);
        System.out.println("Cantidad de días que visitó: " + visitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos");
        System.out.println("La persona es " + mayorMenor + " de edad.");

        scanner.close();
    }
}

