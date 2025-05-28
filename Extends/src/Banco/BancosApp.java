package Banco;

import java.util.Scanner;

public class BancosApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial: ");
        float saldoInicialAhorros = input.nextFloat();

        System.out.println("Ingrese tasa de interes: ");
        float tasaAhorros = input.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);

        System.out.println("Ingresar cantidad a consignar: ");
        float cantidadDepositar = input.nextFloat();

        cuenta1.consignar(cantidadDepositar);

        System.out.println("Ingrese cantidad a retirar: ");
        float cantidadRetirar = input.nextFloat();

        System.out.println("Calcula el EXTRACTO del MES");
        cuenta1.extractoMensual();

        System.out.println(cuenta1.toString());

        //TODO FALTA TESTEAR LA CUENTA CORRIENTE
    }
}
