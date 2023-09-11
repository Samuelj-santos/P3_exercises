package Question_04;

public class BancoDeDados {
    private Alunos[] classe;
    private int cont;

    public BancoDeDados(int tam){
     this.classe = new Alunos[tam];
     this.cont = 0;
    }

    public void inserir(Alunos a){
      this.classe[this.cont] = a;
      this.cont++;
    }

    public void remover(int numero){
    this.classe[numero] = null;
    avançar();
    }
    public void listagem(){
        for(int i =0;i<this.classe.length;i++){
            if (this.classe[i] != null) {
                 System.out.println(this.classe[i]);
            }
           
        }
    }
    public void avançar(){
        for(int i =0;i<this.classe.length-1;i++){
         this.classe[i] = this.classe[i+1];
        }
      }
}
