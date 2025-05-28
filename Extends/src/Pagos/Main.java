package Pagos;

public class Main {

    public static void main(String[] args) {
        ListaEmpleados lis = new ListaEmpleados();
         VentanaAgregarEmpleado vae = new VentanaAgregarEmpleado(lis);
         vae.setVisible(true);
    }
}
