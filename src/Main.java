import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Policia
        Policia policia1 = new Policia("Juan", "Pérez", 1234);
        Policia policia2 = new Policia("Marta", "Sabas", 2254);

        //  Arma Larga
        Larga armaLarga = new Larga(
                30,
                500.0,
                "Remington",
                12,
                "EN USO",
                policia1,
                "Defensa Personal",
                3,
                true
        );

        //  Arma Corta
        Corta armaCorta = new Corta(
                15,
                250.0,
                "Glock",
                9,
                "NUEVA",
                policia2,
                true
        );

        //Menu

        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---\n");
            System.out.println("1. Mostrar detalles del arma larga\n" +
                    "2. Mostrar detalles del arma corta\n" +
                    "3. Verificar si el arma larga está en condición\n" +
                    "4. Verificar si el arma corta está en condición\n" +
                    "5. Comprobar efectividad a distancia del arma corta\n" +
                    "0. Salir\n");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nDetalles del arma larga:\n" + armaLarga);
                    break;
                case 2:
                    System.out.println("\nDetalles del arma corta:\n" + armaCorta);
                    break;
                case 3:
                    System.out.println("\n¿El arma larga está en condición?: " + armaLarga.enCondicion() + "\n");
                    break;
                case 4:
                    System.out.println("\n¿El arma corta está en condición?: " + armaCorta.enCondicion() + "\n");
                    break;
                case 5:
                    System.out.println("\n¿El arma corta es efectiva a más de 200m?: " + armaCorta.efectivaADistancia() + "\n");
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa...\n");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, elija nuevamente.\n");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
