package Question_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ola digite uma senha , para confirmar que é vc");
        int  f = s.nextInt();
        int g = f;
        Itens a = new Itens(11, "arroz",14.5);
        Itens b = new Itens(13, "Feijão", 8.6);
        Itens c = new Itens(18, "carne bovina", 20);
        Itens d = new Itens(25, "aipo", 5);
        Itens e = new Itens(58, "Cotonete", 8);
        CarrinhoDeCompras h = new CarrinhoDeCompras();
        System.out.println("Calma la amigão digite sua senha novamnete");
        f = s.nextInt();
        if (f == g) {
            //inserçao
            h.inserir(a);
            h.inserir(b);
            h.inserir(c);
            h.inserir(d);
            h.inserir(e);
            //lista
            h.lista();
            //remoçao
            h.remover(1);
            h.remover(2);
            //listagem novamente
            h.lista();
        }

      
       
    }
}
