package Exercise_Twelve.Biblioteca;

public class Revista extends ItemBiblioteca {

    public String edição;

    public String getEdição() {
        return edição;
    }

    public void setEdição(String edição) {
        this.edição = edição;
    }

    public Revista(String titulo, int anodePublicaçao, int copiasDisponiveis, String edição) {
        super(titulo, anodePublicaçao, copiasDisponiveis);
        this.edição = edição;
      
    }

    public double  calcularMulta(int dias){
        return dias * 0.40;
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
