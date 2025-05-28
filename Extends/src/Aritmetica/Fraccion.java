package Aritmetica;

public class Fraccion extends Numero{

    //Define una clase fraccion que representa un numero fraccionario,
    //el cual hereda de la clase numerica y tiene dos atributos (int)
    //que representan el numerador y denominador de la faccion
    //Se deben implementar todos los metodos heredados
    //U crear una clase de prueba que utilice los metodos implementados

    private Numero numerador;
    private Numero denominador;

    public Fraccion(Numero numerador, Numero denominador) {
        super(numerador.getNum() / denominador.getNum());
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
