    import java.util.Scanner;


public class Reservas {


    public static void mostrar() {
        System.out.println();
        System.out.println("=== MARTA'S PELUQUERIA ===");
        System.out.println("1. Agendar reserva");
        System.out.println("2. Listar reservas");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Ver reporte del dia");
        System.out.println("5. Salir");
    }

    public static int leerOpcion(Scanner sc) {
        return validador.leerEntero(sc, "Elige una opcion: ");
    }
}

