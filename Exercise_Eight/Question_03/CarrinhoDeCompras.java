package Question_03;

public class CarrinhoDeCompras {
    private Itens[] dados;
    private int cont;

     public CarrinhoDeCompras(){
        this.cont =0;
        this.dados = new Itens[50];
        
     }
     public void inserir(Itens one){
         
         this.dados[this.cont] = one;
          this.cont ++; 
       
     }
     public void lista(){
        for(int i =0;i<this.dados.length;i++){
            if (this.dados[i ] != null) {
               System.out.println(this.dados[i]);
            }

        }
     }

     public void remover(int a){
      this.dados[a] = null;
      avançar();
     }
     public void avançar(){
        for(int i =0;i<this.dados.length-1;i++){
         this.dados[i] = this.dados[i+1];
        }
      }
     
}
