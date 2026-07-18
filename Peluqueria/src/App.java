    import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            Reservas.mostrar();
            opcion = Reservas.leerOpcion(sc);
            switch (opcion) {
                case 1:
                    operaciones.agendar(sc);
                    break;
                case 2:
                    operaciones.listar();
                    break;
                case 3:
                    operaciones.cancelar(sc);
                    break;
                case 4:
                    operaciones.reporte();
                    break;
                case 5:
                    System.out.println("Gracias por visitar Martha's Peluqueria, hasta mañana.");
                    break;
                default:
                    System.out.println("Opcion no valida, elige entre 1 y 5.");
            }
        }
        sc.close();
    }
}

