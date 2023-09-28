package Exercise_Eleven;

public class Professor  extends Funcionario{

     private String disciplina;
    public Professor(String nome, String inscrições, double salario, String turno , String disciplina ) {
        super(nome, inscrições, salario, turno);
        //TODO Auto-generated constructor stub
        this.disciplina = disciplina;
    }

   

    @Override
    public String horariosDisponiveis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'horariosDisponiveis'");
    }

    @Override
    public String horarioTrabalho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'horarioTrabalho'");
    }

    @Override
    public String informaçõesFuncionarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'informaçõesFuncionarios'");
    }

    @Override
    public String funçãoDesempenhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'funçãoDesempenhar'");
    }
    public void lecionar(){

    }
    public void criarAtividades(){
        
    }
}
