package Question_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("bem vindo ao banco deseja abrir uma conta se sim digite 1 se nao digite 2");
        int a = s.nextInt();
         
        if (a == 1) {
            System.out.println("digite seu nome");
            String nome = s.next();
            System.out.println();
            System.out.println("Digite o numero da sua conta");
            int conta = s.nextInt();
            ContaBancaria one  = new ContaBancaria(nome, conta);
            System.out.println("Conta aberta :)");
            System.out.println("Deseja colocar saldo  na sua conta se sim digite 1 se nao digite 2 ");
            int b = s.nextInt();
            if (b == 1) {
                System.out.println("Digite quanto saldo vc quer colocar");
                double c = s.nextDouble();
                one.setSaldo(c);
                System.out.println("Seu saldo atual é :" + one.getSaldo());
            }else{
                System.out.println("ok");
            }

            System.out.println("Deseja ver informaçoes da sua conta? se sim digite 1 se nao digite 2" );
            int d = s.nextInt();
            if (d == 1) {
                System.out.println(one.toString());
            }else{
                System.out.println("Ok");
            }
        }else{
            System.out.println("ok");
        }
    }
}
