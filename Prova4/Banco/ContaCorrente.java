package Prova4.Banco;

public class ContaCorrente extends Conta{

    public final double taxaManuteção = 50;

    public ContaCorrente(int nConta, int nAgencia, double saldo, Cliente cliente) {
        super(nConta, nAgencia, saldo, cliente);
        
    }

     public double simularOperação(int meses){
       double  acumulador = 0;

       for(int i=0; i<meses; i++){
        acumulador = acumulador + this.taxaManuteção;
       }

       return this.getSaldo() - acumulador;

     }

     public String exibirSaldo(){
      return getCliente().getNome() +" " + getSaldo();
     }

    
}
