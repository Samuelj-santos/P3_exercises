package Question_03;

public class Itens {
    private int codigo;
    private String descrição;
    private double preço;

      public Itens(int codigo, String descrição, double preço) {
        this.codigo = codigo;
        this.descrição = descrição;
        this.preço = preço;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString(){
        return "o codigo é " + this.codigo + " o seu produto é " + this.descrição  + " e seu preço " + this.preço; 
    }

  

    
}
