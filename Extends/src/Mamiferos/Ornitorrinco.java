package Mamiferos;

public class Ornitorrinco extends Mamifero implements Oviparo {

    private int numcrias;

    public Ornitorrinco(String nombre, int numero) {
        super(nombre);
        this.numcrias = numero;
    }


    public void amamantarcrias() {
        System.out.println("sudan leshe");
    }


    @Override
    public String toString() {
        return super.toString() + "ornitorrinco [numcrias=" + numcrias + "]";
    }


    public void ponerhuevos() {
// TODO Auto-generated method stub
        System.out.println("huevon");
    }


}

