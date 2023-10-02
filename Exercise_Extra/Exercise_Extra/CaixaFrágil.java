package Exercise_Extra;

public class CaixaFrágil  extends Caixa {
      private double pesoMax;

       public CaixaFrágil(String identificador, String conteudo, double kg, double altura , double pesoMax) {
        super(identificador, conteudo, kg, altura);

        this.pesoMax = pesoMax;
    }
      
    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public String exibiretiqueta(){
        return " o conteudo " + this.conteudo + " De identificador " + this.identificador + " De peso " + this.kg + " De altura " + this.altura + " o peso maximo suportado é " + this.pesoMax;
     }

   


    
}
