package Question_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Olá,faça oque for pedido");
        System.out.println("Insira a marca ");
        String a = s.next();
        System.out.println();
        System.out.println("Insira o modelo ");
        String b = s.next();
        System.out.println();
        System.out.println("Insira o ano ");
        int c = s.nextInt();
        System.out.println("Insira a velocidade");
        int  d = s.nextInt();

        Carro  one = new Carro(a, b, c, d);

        System.out.println("As suas opções são 1-Aumentar a velocidade , 2-Diminuir a velocidade , 3-Acabar o programa");
        int e = s.nextInt();
        switch (e) {
            case 1:
            System.out.println("Digite o valor do aumento");
            int f = s.nextInt();
                one.acelerar(f);
                System.out.println("Sua nova velocidade é :" + one.getVelocidade() + "Km/Hr");
                break;
        
            case 2:
            System.out.println("Digite o quanto voce deseja dimiuir ");
            int g = s.nextInt();
            one.desacelerar(g);
            System.out.println("Sua nova velocidade é :" + one.getVelocidade() + "Km/Hr");
                
                break;

            case 3:
                System.out.println("OK");
                break;    
        }
        System.out.println("FIm :)");
    }
}
