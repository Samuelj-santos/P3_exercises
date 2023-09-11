package Question_04;

public class Alunos {
    private String nome;
    private String endereço;
    private String responsavel;
    private int NMatricula;

    public Alunos(String nome, String endereço, String responsavel, int nMatricula) {
        this.nome = nome;
        this.endereço = endereço;
        this.responsavel = responsavel;
       this. NMatricula = nMatricula;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getNMatricula() {
        return NMatricula;
    }

    public void setNMatricula(int nMatricula) {
        NMatricula = nMatricula;
    }

    @Override
    public String toString(){
        return "O aluno "+this.nome+" com a pessoa responsavel :"+this.responsavel+" e de endereço "+ this.endereço + " e de numero de matricula "+ this.NMatricula;
    }

    
}
