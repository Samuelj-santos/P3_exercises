package Exercise_Twelve.Biblioteca;

public class ItemBiblioteca {
    protected String titulo;
    protected int  anodePublicaçao;
    protected int copiasDisponiveis;
    

    public ItemBiblioteca(String titulo, int anodePublicaçao, int copiasDisponiveis) {
        this.titulo = titulo;
        this.anodePublicaçao = anodePublicaçao;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public double calcularMulta(int dias){
        double result  = dias * 0.10;
        return result;
    }
    

}
