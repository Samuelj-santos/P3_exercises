package Exercise_Nine.Question_01;

import java.util.ArrayList;
//yeap
public class Main {
    public static void main(String[] args) {
        ArrayList <Funcionario> Funcionarios = new ArrayList<Funcionario>();
        Funcionario alan = new Funcionario("Alan",15.000 , 30);
        Funcionario nataly = new Funcionario("Nataly", 17.000, 25);
        Funcionario arthur = new Funcionario("Arthur", 35.000, 29);
        Funcionario nicolas = new Funcionario("Nicolas", 32.000, 24);
        Funcionario rodrigo = new Funcionario("Rodrigo", 37.000, 26);
        Funcionarios.add(rodrigo);
        Funcionarios.add(nicolas);
        Funcionarios.add(arthur);
        Funcionarios.add(nataly);
        Funcionarios.add(alan);

        for(int i =0;i<Funcionarios.size();i++){
           if ( Funcionarios.get(i).getSalarioAnual() >= 30.000 && Funcionarios.get(i).getIdade() <= 30 ) {
            System.out.println("O funcionario " + Funcionarios.get(i).toString());
           }
        }
    }
}
