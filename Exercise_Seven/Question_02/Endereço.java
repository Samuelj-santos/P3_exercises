package Exercise_Seven.Question_02;

public class Endereço {
    private String rua;
    private int  numero;
    private String complemento;
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public Endereço(String rua, int numero, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    };
}
