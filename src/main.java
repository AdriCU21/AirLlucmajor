import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("✈️  ===== MENÚ DE GESTIÓN DE VUELOS DE AIRLLUCMAJOR ===== ✈️");
        System.out.println("1️⃣  ✍️ Añadir vuelos disponibles");
        System.out.println("2️⃣  📅 Consultar los vuelos disponibles por día y por semana");
        System.out.println("3️⃣  🎟️ Reservar un vuelo");
        System.out.println("4️⃣  🔍 Consultar vuelos reservados por usuario");
        System.out.println("5️⃣  ❌ Cancelar una reserva");
        System.out.println("6️⃣  📩 Enviar notificaciones a los usuarios");
        System.out.println("7️⃣  🚪 Salir");
        System.out.print("🛠️ Seleccione una opción: ");

        int opcion = scanner.nextInt();

        while (opcion != 7) {

                if (opcion == 1) {
                    System.out.println("🛫 Añadiendo vuelos disponibles...");
                    //Funcion 1

                    // Lógica para añadir vuelos Adri
                } else if (opcion == 2) {
                    System.out.println("📆 Consultando vuelos disponibles...");
                    //Funcion 2

                    // Lógica para consultar vuelos Miguel Angel
                } else if (opcion == 3) {
                    System.out.println("🛎️ Reservando un vuelo...");
                    //Funcion 3

                    // Lógica para reservar un vuelo Gemelo
                } else if (opcion == 4) {
                    System.out.println("🧐 Consultando vuelos reservados...");
                    //Funcion 4

                    // Lógica para consultar vuelos reservados Adri
                } else if (opcion == 5) {
                    System.out.println("🚫 Cancelando una reserva...");
                    //Funcion 5

                    // Lógica para cancelar una reserva Miguel Angel
                } else if (opcion == 6) {
                    System.out.println("📨 Enviando notificaciones...");
                    //Funcion 6

                    // Lógica para enviar notificaciones Gemelo
                } else if (opcion == 7) {
                    System.out.println("👋 Saliendo del sistema... ¡Hasta pronto!");
                    break;
                } else {
                    System.out.println("❌ Entrada no válida. Introduzca un número del 1 al 7.");
                }

            System.out.println("✈️  ===== MENÚ DE GESTIÓN DE VUELOS DE AIRLLUCMAJOR ===== ✈️");
            System.out.println("1️⃣  ✍️ Añadir vuelos disponibles");
            System.out.println("2️⃣  📅 Consultar los vuelos disponibles por día y por semana");
            System.out.println("3️⃣  🎟️ Reservar un vuelo");
            System.out.println("4️⃣  🔍 Consultar vuelos reservados por usuario");
            System.out.println("5️⃣  ❌ Cancelar una reserva");
            System.out.println("6️⃣  📩 Enviar notificaciones a los usuarios");
            System.out.println("7️⃣  🚪 Salir");
            System.out.print("🛠️ Seleccione una opción: ");
            opcion = scanner.nextInt();
        }


    }
}
