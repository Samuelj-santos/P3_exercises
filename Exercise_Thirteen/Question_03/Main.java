package Exercise_Thirteen.Question_03;

public class Main {
    public static void main(String[] args) {
        cadastroAluno lista = new cadastroAluno();
        Aluno  one = new Aluno("12345", "Fernando", "administração", 25);
         Aluno two = new Aluno("1094382", "Andre", "C3", 30);
          Aluno three = new Aluno("983104", "celso", "medicina", 35);
           Aluno four = new Aluno("34012", "Sergio", "medicina", 45);
            Aluno five = new Aluno("09987", "paulo", "direito", 23);
             Aluno six = new Aluno("7452897", "sofia", "administração", 45);
              Aluno seven   = new Aluno("380212481", "Neuza", "c3", 24);
               Aluno eight = new Aluno("2813509", "nemeia", "direito", 25);
                Aluno nine = new Aluno("3058", "angelica", "recursos humanos", 26);
                 Aluno ten = new Aluno("993521", "camilo", "sociologia", 27);

                 lista.cadastroAluno(one);
                 lista.cadastroAluno(two);
                 lista.cadastroAluno(three);
                 lista.cadastroAluno(four);
                 lista.cadastroAluno(five);
                 lista.cadastroAluno(six);
                 lista.cadastroAluno(seven);
                 lista.cadastroAluno(eight);
                 lista.cadastroAluno(nine);
                 lista.cadastroAluno(ten);
                 lista.exibir();


    }
}
