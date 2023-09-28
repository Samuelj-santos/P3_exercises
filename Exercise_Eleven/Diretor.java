package Exercise_Eleven;

public class Diretor extends Funcionario {
   
   private String segTurno;


    public Diretor(String nome, String inscrições, double salario, String turno , String segTurno) {
        super(nome, inscrições, salario, turno);
        this.segTurno = segTurno;
    }

    
    @Override
    public String horariosDisponiveis() {
        
        throw new UnsupportedOperationException("Unimplemented method 'horariosDisponiveis'");
    }

    @Override
    public String horarioTrabalho() {
        
        throw new UnsupportedOperationException("Unimplemented method 'horarioTrabalho'");
    }

    @Override
    public String informaçõesFuncionarios() {
        
        throw new UnsupportedOperationException("Unimplemented method 'informaçõesFuncionarios'");
    }

    @Override
    public String funçãoDesempenhar() {
   
        throw new UnsupportedOperationException("Unimplemented method 'funçãoDesempenhar'");
    }

    public void criarDescontos(){

    }
    public void encomerdarFardas(){

    }
    public void gerenciarProfessores(){

    }

    


}
