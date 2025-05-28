package Mamiferos;

public class TestMamiferos {

    public static void main(String[] args) {

        Ballena mobydick = new Ballena("Moby Dick");

        mobydick.amamantarcrias();
        System.out.println(mobydick);

        Ornitorrinco orto1 = new Ornitorrinco("Perry el Ornitorrinco", 3);

        orto1.amamantarcrias();
        System.out.println(orto1);
        orto1.ponerhuevos();
        System.out.println(orto1);


    }


}

