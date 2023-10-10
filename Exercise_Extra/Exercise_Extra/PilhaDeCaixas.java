package Exercise_Extra;



public class PilhaDeCaixas {
     private  double pesoMaximo , resultado;
      private boolean isFragil;
     private int alturaMaxima;
     private int alturaAtual;
      private Caixa[] lista ;

     public PilhaDeCaixas(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
           this.lista = new Caixa[alturaMaxima];
    }

     public int getAlturaMaxima() {
        return  this.alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    

    public  boolean empilhar (Caixa one ){
   
     CaixaFrágil temporario;
      
     if (one instanceof CaixaFrágil && this.isFragil == false) {
       for(int i =0;i<this.lista.length;i++){
         if(i!=0){
            if (this.lista[i-1] == this.lista[i]) {
                break;
            }
         }

        if (this.lista[i] == null) {
            this.isFragil = true;
            temporario = (CaixaFrágil) one;
            this.pesoMaximo = temporario.getPesoMax();
            this.lista[i] = one;
            this.alturaAtual ++;
            break;
            
        }
       }
       return true;
        
     }else if ( one instanceof Caixa) {
       
        for(int j =0 ; j<this.lista.length;j++){ 
            if (isFragil == true && this.lista[j] !=null ) {
            this.resultado = this.resultado + this.lista[j].getKg();
           }


           if (this.lista[j] == null) {
            this.lista[j] =one;
            this.alturaAtual++;
            break;
           }
          
            
        }
        if (this.resultado > this.pesoMaximo) {
            return false;
        }else{
            return true;
        }

     }
     return false;
    }


    public Caixa desempilhar(){
        Caixa temporaria = null;
        for(int i=0;i<this.lista.length-1;i++){
            if (this.lista[i+1]  == null) {
                 temporaria = this.lista[i];
                this.lista[i] = null;
                break;
            }
        }
        return temporaria;
    }

    public int alturaAtual(){
     return this.alturaAtual;
    }

    public double getPesoMaximo(){
        double pesoMaximo =0.0;
        for(int i =0;i<this.lista.length;i++){
            if (this.lista[i] == null) {
                break;
            }
           pesoMaximo = pesoMaximo + this.lista[i].getKg();
        }
        return pesoMaximo;
    }

    public void exibir(){
        for(int i =this.lista.length-2 ;i>0 ;i--){
            if (this.lista[i] != null) {
               System.out.println(this.lista[i].getConteudo());   
            }
           
        }
    }

  

   



   

     
}
