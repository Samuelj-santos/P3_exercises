package Prova4.Banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteOperações {
   static  ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
   static  ArrayList<Conta> listaConta = new ArrayList<Conta>();

     public static void main(String[] args) {
          String[] opções = {"Sim","Não"};
        while (true) {
          apresentarMenu();
          
          String input = (String) JOptionPane.showInputDialog(null,"Deseja continuar" , "Opções " , JOptionPane.QUESTION_MESSAGE,null,opções,opções[0]);
          if (input.equals("Não")) {
               break;
          }
        }
          

     }

     public static void criarConta(){
       // estou utilizando Joption ao inves de Scanner para melhor interação usual

       JOptionPane.showMessageDialog(null, "Ola bem vindo ao banco ", "Banco", 1);

       String nome   = JOptionPane.showInputDialog(" Insira seu nome");
       String endereço = JOptionPane.showInputDialog("Insira seu endereço");
       String profissão = JOptionPane.showInputDialog("Insira profissão");

       Cliente novo = new Cliente(nome, endereço, profissão);
        listaClientes.add(novo);
         
     String[] opções = {"Conta corrente " , " Conta poupança"};
     String input = (String) JOptionPane.showInputDialog(null,"Selecione a opçaõ que deseja" , "Opções " , JOptionPane.QUESTION_MESSAGE,null,opções,opções[0]);



     if (input.equals("Conta corrente ")) {
         try {
          int nConta = Integer.parseInt(JOptionPane.showInputDialog("Insira  o numero da conta "));
           int nAgencia = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da agencia"));
           double nSaldo =(double) Integer.parseInt(JOptionPane.showInputDialog("Insira o saldo"));
           if (nSaldo == 0) {
               throw new Exception();
           }
        
          ContaCorrente a  = new ContaCorrente(nConta,nAgencia , nSaldo, novo);
          listaConta.add(a);
          JOptionPane.showMessageDialog(null, " Conta criada com sucesso", " Nova conta ", 1);
         } catch (Exception e) {
          System.out.println("Error: tente novamente"  );
         }
           
          
          
     }else if (input.equals(" Conta poupança")) {
          try {
           int nConta = Integer.parseInt(JOptionPane.showInputDialog("Insira  o numero da conta "));
           int nAgencia = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da agencia"));
           double nSaldo =(double ) Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo"));
           if (nSaldo == 0) {
               throw new Exception();
           }
          ContaPoupança b = new ContaPoupança(nConta,nAgencia , nSaldo, novo);
          listaConta.add(b);
          JOptionPane.showMessageDialog(null, " Conta criada com sucesso", " Nova conta ", 1);
          } catch (Exception e) {
                System.out.println("Error: tente novamente"  );
          }
           
     }
      
     
     }


     public static void realizarOperações(int nAgencia,Conta one,int nAgenciaDois,Conta two){
        boolean achou = false;
        boolean achoudois = false;


       for(int i =0;i<listaConta.size();i++){
         if (one == listaConta.get(i)) {
          achou = true;
          break;
         }
       }
       for(int j =0;j<listaConta.size();j++){
         if (two == listaConta.get(j)) {
          achoudois = true;
          break;
         }
     }


     if (achoudois == true  && achou == true) {
          double a  = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da transferencia"));
          one.transferencia(two,a);
     }
}

   public static void exibirSaldo(int nAgencia,Conta one ){
     Conta two = null;
     for(int i=0;i<listaConta.size();i++) {
       if (one.getNAgencia() == listaConta.get(i).getNAgencia()) {
          two = (Conta) listaConta.get(i);
          break;
       }
       }
       int a = Integer.parseInt(JOptionPane.showInputDialog("Insira os meses que vão ser simulados "));
       JOptionPane.showMessageDialog(null, two.exibirSaldo());
   

}


 public static void apresentarMenu(){
     String[] opções = {"Criar Conta","Realizar operações","Exibir saldo"};
      String input = (String) JOptionPane.showInputDialog(null,"Selecione a opçaõ que deseja" , "Opções " , JOptionPane.QUESTION_MESSAGE,null,opções,opções[0]);
     if (input.equals("Criar Conta")) {
        criarConta();  
     }else if (input.equals("Realizar operações")) {
          int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da agencia "));
          int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da agencia "));
          Conta one,two;
          one = null ;
          two = null ;

          for(int i =0;i<listaConta.size();i++){
           if (listaConta.get(i).getNAgencia() == a) {
               one = listaConta.get(i);
           }
           if (listaConta.get(i).getNAgencia() == b) {
               two = listaConta.get(i);
           }
          }
          

           realizarOperações(a, one, b, two); 
     }else if (input.equals("Exibir saldo")) {
           int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da agencia "));
           Conta one = null ;
             for(int i =0;i<listaConta.size();i++){
           if (listaConta.get(i).getNAgencia() == a) {
               one = listaConta.get(i);
               break;
           }
          
          }
          exibirSaldo(a, one);
     }
 }
}
