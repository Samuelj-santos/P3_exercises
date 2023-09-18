package Exercise_Nine.Question_04;

public class Livro {
    private String titulo;
    private String  autor;
    private boolean disponivel;
    
    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String verificarDisponibilidade(){
        if (this.disponivel == true) {
            return "Esta disponivel :)";
        }else{
            return "Nao esta disponivel :(";
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }   
 }

