package Exercise_Seven.Question_01;
import Exercise_Seven.Question_01.*;

public class Main {
 public static void main(String[] args) {
     String codigo = "011";
     String nome  = "joao";
     String dataNascimento = "11/02/2002" ; 
     String sexo  = "homem";
     String planoSaude = "Premium";
     String alergia = "nenhuma";
     String tipoSanguineo = "A+";

     Paciente one = new Paciente(codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo);
     String result = one.toString();
     System.out.println(result);

     // mudar os atributos 

     codigo = "012";
     nome = "Maria";
     dataNascimento = "14/05/1998";
     sexo = "Mulher";
     planoSaude = "Basico";
     alergia = "crustaceos";
     tipoSanguineo = "o-";
    

     one.setAlergia(alergia);
     one.setNome(nome);
     one.setSexo(sexo);  
     one.setdatanascimento(dataNascimento);
     one.settiposanguineo(tipoSanguineo);
     one.setPlanoSaude(planoSaude);
     one.setCodigo(codigo);
     result = one.toString();
     System.out.println(result);


 }  
}
