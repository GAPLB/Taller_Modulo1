    import java.util.Scanner;


public class operaciones {

    static final int MAX = 10;
    static String[] clientes = new String[MAX];
    static int[] horas = new int[MAX];
    static int[] servicios = new int[MAX];
    static int total = 0;

    public static void agendar(Scanner sc) {
        if (total == MAX) {
            System.out.println("Agenda llena, No se pueden agregar mas reservas, lo lamentamos");
            return;
        }

        String nombre = validador.leerTexto(sc, "Nombre completo del cliente: ");
        if (!validador.nombreValido(nombre)) {
            System.out.println("Nombre invalido");
            return;
        }

        int hora = validador.leerEntero(sc, "Hora (8:00 AM a 17:00/(5:00) PM): ");
        if (!validador.horaValida(hora)) {
            System.out.println("La hora que fue elegida esta fuera de horario laboral, eliga otra, porfavor");
            return;
        }

        for (int i = 0; i < total; i++) {
            if (horas[i] == hora) {
                System.out.println("Esa hora ya está ocupada, intenta de nuevo");
                return;
        
    }
}

        int servicio = validador.leerEntero(sc, "Servicio (1=Corte, 2=Tinte, 3=Manicure): ");
        if (!validador.servicioValido(servicio)) {
            System.out.println("Servicio invalido");
            return;
        }

        clientes[total] = nombre;
        horas[total] = hora;
        servicios[total] = servicio;
        total++;
        System.out.println("Reserva agendada de forma correcta");
    }

 public static void listar() {
        if (total == 0) {
            System.out.println("Aun no hay reservas");
            return;
        }
        System.out.println("--- RESERVAS DEL DIA ---");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + clientes[i]
                    + " | hora: " + horas[i] + ":00" + " \n| servicio: " + nombreServicio(servicios[i]));
        }
    }

    public static String nombreServicio(int codigo) {
            switch (codigo) {
        case 1:
            return "Corte de cabello";
        case 2:
            return "Tinte";
        case 3:
            return "Manicure";
        default:
            return "No existe ese servicio en este momento, lo lamentamos.";
    }
}

   public static void cancelar(Scanner sc) {
        if (total == 0) {
            System.out.println("Aun no hay reservas");
            return;
        }
        listar();
        int pos = validador.leerEntero(sc, "Numero de reserva a cancelar: ");
        if (pos < 1 || pos > total) {
            System.out.println("Esa reserva no existe en la agenda");
            return;
        }

       int indice = pos - 1;
       for (int i = indice; i <= total - 2; i++) {
        clientes[i] = clientes[i + 1];
        horas[i] = horas[i + 1];
        servicios[i] = servicios[i + 1];
}


        total--;
        System.out.println("La reserva a sido cancelada");
    }

    public static double precioServicio(int codigo) {
    switch (codigo) {
        case 1:
            return 25000;
        case 2:
            return 60000;
        case 3:
            return 30000;
        default:
            return 0;
    }
}

 public static void reporte() {
    if (total == 0) {
        System.out.println("Aun no hay reservas");
        return;
    }
    double totalFacturado = 0;
    for (int i = 0; i < total; i++) {
        totalFacturado = totalFacturado + precioServicio(servicios[i]);
    }
    System.out.println("Total de citas: " + total);
    System.out.println("Total facturado: " + totalFacturado);
}
}


