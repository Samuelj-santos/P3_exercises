package Exercise_Extra;

import java.util.ArrayList;

public class PilhaDeCaixas {
     private int alturaMaxima;
      private ArrayList <Caixa> lista ;

     public PilhaDeCaixas(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
           this.lista = new ArrayList<Caixa> (this.alturaMaxima);
    }

     public int getAlturaMaxima() {
        return  this.alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public boolean empilhar (Caixa one ){
          
    }

     
}
