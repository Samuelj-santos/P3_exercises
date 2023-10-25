package Exercise_Twelve.Biblioteca;

public class Livro  extends ItemBiblioteca{

     
     public String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Livro(String titulo, int anodePublicaçao, int copiasDisponiveis, String autor) {
        super(titulo, anodePublicaçao, copiasDisponiveis);
        this.autor = autor;
        
    }
    public double calcularMulta(int dias){
        double result = dias * 0.20;
        return result;
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

