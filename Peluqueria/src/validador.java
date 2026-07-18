    import java.util.Scanner;


public class validador {

    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Elige una de las opciones dadas, intenta de nuevo: ");
                sc.nextLine();
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }


    public static boolean horaValida(int hora) {
        return hora >= 8 && hora <= 18;
 
    }

    public static boolean nombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    public static boolean servicioValido(int servicio) {
    switch (servicio) {
        case 1:
        case 2:
        case 3:
            return true;
        default:
            return false;
    }
}
}

