package Exercise_Nine.Question_04;

public class Main {
    public static void main(String[] args) {
        Livro caspian = new Livro("Caspian e o tesouro escondido", "Amadeus shuar", true);
        Livro caspianM  = new Livro("Caspian e a mumia", "Amadeus Shaur",true);
        Livro amorsemFim = new Livro("Amor sem fim","Loretta Spikes",false);

        System.out.println(caspian.verificarDisponibilidade());
        System.out.println(caspianM.verificarDisponibilidade());
       System.out.println( amorsemFim.verificarDisponibilidade());
     }
}
