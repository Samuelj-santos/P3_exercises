package Exercise_Twelve.Biblioteca;

public class Dvd  extends ItemBiblioteca{
    
    public int duração;
    
    public int getDuração() {
        return duração;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public Dvd(String titulo, int anodePublicaçao, int copiasDisponiveis,int duração) {
        super(titulo, anodePublicaçao, copiasDisponiveis);
        this.duração = duração;
       
    }

    public double calcularMulta(int dias) {
        return dias * 0.30;
    }

    public void pegarEmprestado(){
        this.copiasDisponiveis--;
    }
    public void devolverEmprestado(){
        this.copiasDisponiveis++;
    }
    
    public boolean entregaCorreta(int dia ,int mes , int ano,int diahoje , int meshoje , int anohoje){
        if(dia == diahoje && mes == meshoje && ano == anohoje){
            return true;
        }
        return false;
    }
    public double  calcularMulta(int dia ,int mes , int ano,int diahoje , int meshoje , int anohoje){
        double result = 0.0;
         double multa = 0.0;
        if (mes == meshoje){ 
          multa = calcularMulta( (diahoje - dia) )  ;

        }else{
         
             multa = calcularMulta(((meshoje - mes) * 30) +(diahoje-dia)) ;
        }
          result = multa;
        return result;
    }

    
}
