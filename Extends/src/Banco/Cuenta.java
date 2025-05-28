package Banco;

public class Cuenta {

    /**
     * Atributos de la clase
     */
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual = 0.1f;
    protected float comisionMensual = 10;

    public Cuenta(float comisionMensual, int numeroConsignaciones, int numeroRetiros, float saldo, float tasaAnual) {
        this.comisionMensual = comisionMensual;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numeroRetiros = numeroRetiros;
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo += cantidad; // Se actualiza con cada consigna
        numeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0){
            saldo -= cantidad;
            numeroRetiros++;
        } else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }

    @Override
    public String toString() {
        return "Extends1{" +
                "saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numeroRetiros=" + numeroRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
