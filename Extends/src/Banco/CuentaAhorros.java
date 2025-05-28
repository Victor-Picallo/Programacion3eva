package Banco;

public class CuentaAhorros extends Cuenta {

    /**
     * Atributo que indentifica si una cuenta esta activa;
     * lo esta si su saldo es superior a 10000
     * Atributos de la clase que a mayores tiene los de la clase padre
     */
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(10, 0, 0, saldo, tasaAnual);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }

    public CuentaAhorros(float comisionMensual, int numeroConsignaciones, int numeroRetiros, float saldo, float tasaAnual) {
        super(comisionMensual, numeroConsignaciones, numeroRetiros, saldo, tasaAnual);
        this.activa=activa;
    }

    @Override
    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);
    }

    @Override
    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }

    public void extractoMensual() {
        if ( numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000)
            activa = false;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "activa=" + activa +
                ", saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numeroRetiros=" + numeroRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
