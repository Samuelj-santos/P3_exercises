package Question_02;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;
    
     public Carro(String marca, String modelo, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public  void desacelerar(int n){
     if (this.velocidade < 0) {
        System.out.println("nao pode haver velocidade negativa");
     }
     this.velocidade = this.velocidade-n;
     }

     public void acelerar(int n){
        this.velocidade = this.velocidade + n;
     }


    public String getMarca() {
      return marca;
   }

   public String getModelo() {
      return modelo;
   }

   public int getAno() {
      return ano;
   }

   public int getVelocidade() {
      return velocidade;
   }

  
     @Override
     public String toString(){
        return "Seu carro de marca " + this.marca + " De modelo  " + this.modelo + " De ano" + this.ano + " E de velocidade " + this.velocidade;
      }
}
