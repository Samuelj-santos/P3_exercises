package Exercise_Thirteen.Question_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo one = new Circulo(10);
        Circulo two = new Circulo(20);
        Circulo three = new Circulo(30);
        Circulo four  = new Circulo(40);
        Circulo five  = new Circulo(50);

        ArrayList <Circulo> lista = new ArrayList();
        lista.add(one);
        lista.add(two);
        lista.add(three);
        lista.add(four);
        lista.add(five );

        System.out.println(lista);


    }
}
