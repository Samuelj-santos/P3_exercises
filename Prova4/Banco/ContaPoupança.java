package Prova4.Banco;

public class ContaPoupança  extends Conta{
    private final  double taxadeRendimento = 0.05;

    public ContaPoupança(int nConta, int nAgencia, double saldo, Cliente cliente) {
        super(nConta, nAgencia, saldo, cliente);
       
    }

    public double simularoperação(int meses){
        double acumulador = 0.0;
       for(int i =0;i<meses;i++){
         acumulador = acumulador + (this.getSaldo()+(this.taxadeRendimento*getSaldo()));
       }
       return acumulador;
    }

    public String exibirSaldo(){
        return getCliente().getNome() +" " + getSaldo();
       }
}
