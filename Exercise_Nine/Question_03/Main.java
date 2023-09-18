package Exercise_Nine.Question_03;



public class Main {
    public static void main(String[] args) {
       
        Aluno alan = new Aluno("Alan", 8597,4);
        Aluno baixinho = new Aluno("Baixinho", 8967,4);
        Aluno rufus = new Aluno("Rufus", 9780,4);
        Aluno tobalo = new Aluno("Tobalo", 1089,4);
        Aluno[] alunos = new Aluno[]{alan,rufus,baixinho,tobalo};
       double[] alannotas = new double[]{10,8,5,9};
       double[ ] baixinhonotas = new double[]{5,6,7,8};
       double[] rufusnotas = new double[]{7,8,9,10};
       double[ ] tobalonotas = new double[]{1,2,3,4};
        
       
       alan.calcularMedia(alannotas);
       baixinho.calcularMedia(baixinhonotas);
       rufus.calcularMedia(rufusnotas);
       tobalo.calcularMedia(tobalonotas);

        for(int i =0;i<alunos.length;i++){
            
            if (alunos[i].getMedia() >= 7.0) {
                System.out.println(alunos[i].getNome() + " foi aprovado" + " Sua media foi " + alunos[i].getMedia());
            }
        }

        for(int j =0;j<alunos.length;j++){
            if (alunos[j].getMedia()< 7.0) {
                System.out.println(alunos[j].getNome() + " foi reprovado" + " Sua media foi " + alunos[j].getMedia());
            }
        }

     }
}
