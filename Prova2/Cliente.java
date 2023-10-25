package Prova2;

public class Cliente {
    
    private String nome;
    private int idade;
    private String cpf;
    private boolean bomCliente;
    protected Item[] carrinhodeCompras;

    public Cliente(String nome, int idade, String cpf, boolean bomCliente) {
       this.nome = nome;
       this.idade = idade;
       this.cpf = cpf;
       this.bomCliente = bomCliente;
       this.carrinhodeCompras = new Item[100];
   }

   public void adicionar(Item one){
       for(int i =0;i<this.carrinhodeCompras.length;i++){
           if (this.carrinhodeCompras[i] == null) {
               this.carrinhodeCompras[i] = one;
               break;
           }
       }
   }

   public void cancelar(int codigo){
      for(int i =0;i<this.carrinhodeCompras.length;i++){
       if (this.carrinhodeCompras[i].getCodigo() == codigo) {
           this.carrinhodeCompras[i] = null;
           break;
       }
      }
   }

   public double  finalizarCompra(){
       double result = 0.0;
       for(int i =0;i<this.carrinhodeCompras.length;i++){
           if (this.carrinhodeCompras[i] != null) {
               result = result + this.carrinhodeCompras[i].getValor();
               this.carrinhodeCompras[i].reduzirEstoque();

           }
       }
       return result;
   }
}
