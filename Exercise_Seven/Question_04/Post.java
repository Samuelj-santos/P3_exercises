package Exercise_Seven.Question_04;

public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public void setNumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas = numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }

    public Post(String texto, String link){
        this.link = link;
        this.texto = texto;
        
    }

    public void curtir(){
        this.numeroCurtidas++;
    }
    public void compartilhar(){
        this.numeroCompartilhamentos++;
    }
}
