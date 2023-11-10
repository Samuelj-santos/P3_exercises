package Exercise_Thirteen.Question_05;

import java.util.HashMap;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        HashMap <String,Aluno> map = new HashMap<String,Aluno>();
        Scanner s = new Scanner(System.in);
        Aluno  one = new Aluno("12345", "Fernando", "administração", 25);
        Aluno two = new Aluno("1094382", "Andre", "C3", 30);
         Aluno three = new Aluno("983104", "celso", "medicina", 35);
          Aluno four = new Aluno("34012", "Sergio", "medicina", 45);
           Aluno five = new Aluno("09987", "paulo", "direito", 23);


           map.put(one.getMatricula(), one);
           map.put(two.getMatricula(), two);
           map.put(three.getMatricula(), three);
           map.put(four.getMatricula(), four);
           map.put(five.getMatricula(), five);

           System.out.println("Insira a matricula do aluno que deseja procurar");
           String yep = s.nextLine();   

           try{
            if (map.get(yep).getMatricula().equals(yep) == true  ) {
                System.out.println("Certo");
            }}catch (Exception e){ 
                System.out.println("Errado");
            }
            
    }
}
