package Exercise_Nine.Question_02;

public class ItemPedido {
    private double valor ;
    private String descrição;

     public ItemPedido(double valor, String descrição) {
        this.valor = valor;
        this.descrição = descrição;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
   
    
}
