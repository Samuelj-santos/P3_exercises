package Exercise_Thirteen.Question_03;

import java.util.ArrayList;

public class cadastroAluno {
   private  ArrayList <Aluno> alunoList;

   public cadastroAluno (){
    alunoList = new ArrayList<Aluno>();
   }

   public void cadastroAluno(Aluno aluno){
    alunoList.add(aluno);
   }
   public void exibir(){
    for(int i=0; i<alunoList.size(); i++){
        System.out.println(alunoList.toArray()[i]);
    }
   }
}
