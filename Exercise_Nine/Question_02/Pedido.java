package Exercise_Nine.Question_02;

public class Pedido {
    private int numero;
    private ItemPedido[] itens;
    private double valor;


    public Pedido(int numero, ItemPedido[] itens) {
        this.numero = numero;
        this.itens = itens;
        this.valor = 0.0;
    }

      public int getNumero() {
        return numero;
    } 
    public double getValor() {

       for(int i =0;i<this.itens.length;i++){
        this.valor = this.valor + this.itens[i].getValor();
       }
       return this.valor;
    }



}
