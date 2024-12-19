import Formulario.Clientes;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Principal registro = new Principal();

        JFrame frame = new JFrame("Pantalla de ingreso");
        frame.setContentPane(new Clientes().ingresoC);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


        /*
        int opcion;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    // Agregar cliente
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese la cedula del cliente: ");
                        int cedula = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombre = scanner.nextLine();
                        registro.agregarCliente(cedula, nombre); //Llamamos a la funcion para agregar al cliente
                    }
                    break;

                case 2:
                    // Mostrar cliente
                    registro.mostrarCliente();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida, intenta de nuevo");
                    break;
            }
        } while (opcion != 3);
        */
    }
}