package Exercise_Seven.Question_05;

public class Aluno {
    private String nome;
    private String cpf;
    private  double nota1;
     private  double nota2;
      private  double nota3;
       private  double nota4;
       public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    private double result;

       public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
       
       }

       public double calcularMedia(int nota1,int nota2,int nota3,int nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.result = (this.nota1  + this.nota2 + this.nota3 + this.nota4)/4;
       return this.result;
       }
}

