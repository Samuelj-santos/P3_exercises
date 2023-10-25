package Prova2;

public class ClienteEspecial extends Cliente {
    
    private int pontos ;
    private double saldoDeCompras;

    public ClienteEspecial(String nome, int idade, String cpf, boolean bomCliente, int pontos,double saldoDeCompras) {
        super(nome, idade, cpf, bomCliente);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }


    public double finalizarCompra(){
        double result = 0.0;
        for(int i =0;i<this.carrinhodeCompras.length;i++){
            if(this.carrinhodeCompras[i].getPontosQueVale() <= getPontos()){
               diminuirPontos(this.carrinhodeCompras[i].getPontosQueVale());
                this.carrinhodeCompras[i].reduzirEstoque();
            }else{
                result = result + this.carrinhodeCompras[i].getValor();
                this.carrinhodeCompras[i].reduzirEstoque();
            }
        }
           aumentarSaldo((0.05*result));
           if (getSaldoDeCompras() > 100 ) {
            aumentarPontos(5);
            diminuirSaldo(100);
           }
           result = (0.05 * result) - result;

        return result;
    }

     public int getPontos() {
        return pontos;
    }


    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void diminuirPontos(int a ){
        this.pontos = this.pontos - a;
    }

    public void aumentarPontos(int a ){
       this.pontos = this.pontos +a;
    }

    public void aumentarSaldo(double a){
       this.saldoDeCompras = this.saldoDeCompras + a ;
    }

    public void diminuirSaldo(double a ){
        this.saldoDeCompras = this.saldoDeCompras - a;
    }


    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }


    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }
    
}
