 package Exercise_Extra;

 public class Caixa {
    protected String identificador;
    protected String conteudo;
    protected double kg;
    protected double altura;
    
   
    public Caixa(String identificador, String conteudo, double kg, double altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.kg = kg;
        this.altura = altura;
    }

     public String getIdentificador() {
        return identificador;
     }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public double getKg() {
        return kg;
    }
    public void setKg(double kg) {
        this.kg = kg;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String exibirEtiqueta(){
        return "o conteudo " + this.conteudo + " De identificador " + this.identificador + " De peso " + this.kg + " De altura " + this.altura;
    }

    
}