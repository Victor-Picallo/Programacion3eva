package Aritmetica;

public class Numero {

    //Atributos
    protected int num;

    //Constructor
    public Numero(int numero) {
        this.num = numero;
    }

    //Getters y setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //Metodos
    public Numero sumar (Numero numero) {
        return new Numero(this.getNum()+ numero.getNum());
    }
    public Numero restar (Numero numero) {
        return new Numero(this.getNum()- numero.getNum());
    }
    public Numero multiplicar (Numero numero) {
        return new Numero(this.getNum()* numero.getNum());
    }
    //OJO
    public Numero dividir (Numero numero){
        return new Numero(this.getNum()/ numero.getNum());
    }

    //ToString
    @Override
    public String toString() {
        return "Numero{" +
                "num=" + num +
                '}';
    }

    //Equals HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null)
            return false;

        if (getClass() != o.getClass())
            return false;

        Numero other = (Numero) o;
        return this.num == other.num;
    }
}