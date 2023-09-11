package Question_04;

public class Main {
    public static void main(String[] args) {
        Alunos a = new Alunos("Ana Vitoria", "Rua divisoria , 36", "Maria Antonieta", 2345);
        Alunos b = new Alunos("Andre Marques", "Rua limoeiros , 90", "João Marques", 7890);
        Alunos c = new Alunos("Maria novantina", "Avenida Cadeira , 78", "João Otavio", 1928);

        BancoDeDados d = new BancoDeDados(30);
        d.inserir(a);
        d.inserir(b);
        d.inserir(c);

        d.listagem();
        d.remover(0);
        d.remover(0);
        d.listagem();
    }  
}
