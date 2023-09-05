package Exercise_Seven.Question_04;

public class Main {
    public static void main(String[] args) {
        Post one = new Post("Dia de cinema :)", "https://www.youtube.com/index");
        one.curtir();
        one.curtir();
        one.curtir();
        
        System.out.println(one.getNumeroCurtidas());

        one.compartilhar();
        one.compartilhar();

        System.out.println(one.getNumeroCompartilhamentos());
        
    }
}
