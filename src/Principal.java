public class Principal {
    int[] cedula = new int[3]; //Crear los arrays para guardar los datos de los clientes
    String[] nombre = new String[3];
    int totalClientes = 0;

    public void agregarCliente(int cedula, String nombre) {
        if (totalClientes < 3) { //Inicia desde cero (totalClientes)
            this.cedula[totalClientes] = cedula;
            this.nombre[totalClientes] = nombre;
            totalClientes++;
            System.out.println("Cliente agregado");
        } else {
            System.out.println("No se puede agregar mas clientes.");
        }
    }

    public void mostrarCliente() {
        if (totalClientes == 0) {
            System.out.println("No hay clientes registrados");
        }else{
            for (int i = 0; i < totalClientes; i++) {
                System.out.println("Cedula: " + cedula[i] + ", Nombre: " + nombre[i]);
            }
        }
    }

}
