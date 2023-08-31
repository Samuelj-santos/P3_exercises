package Exercise_Seven;
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
      
 }   
}
