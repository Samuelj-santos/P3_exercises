package Exercise_Seven.Question_03;

public class Lutador {
    private String nome;
    private int energia;
    private int força;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public Lutador(String nome,int energia,int força){
        this.energia = energia;
        this.força = força;
        this.nome = nome;
    }

    public void aplicarGolpe(Lutador outro){
        outro.energia = outro.energia - this.força;
    }
    
}
