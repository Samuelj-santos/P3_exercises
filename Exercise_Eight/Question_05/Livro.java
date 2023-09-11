package Question_05;

public class Livro {
    private String titulo;
    private String autor;
    private String publicaçao;
    private char[] valid;

    public Livro(String titulo, String autor, String publicaçao) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicaçao = publicaçao;
        if (isValid() == false) {
            System.out.println("Data invalida");
        }
    }
    public boolean isValid(){
        valid = this.publicaçao.toCharArray();
        if (valid[2] == '/' && valid[5] == '/') {
           return true; 
        }
       return false;
    }

    @Override
    public String toString(){
        return "O livro " + this.titulo + " do autor " + this.autor + "e do ano de publicação "+this.publicaçao;
    }
}
