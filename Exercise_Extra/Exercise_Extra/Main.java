package Exercise_Extra;

public class Main {
    public static void main(String[] args) {
      PilhaDeCaixas one = new PilhaDeCaixas(10);
      Caixa two = new Caixa("12345", "Tomate", 100, 5);
      Caixa three = new Caixa("67890", "Pepino", 200, 7);
      Caixa four = new Caixa("102030", "Beringela", 300, 9);
      CaixaFrágil five = new CaixaFrágil("405060", "iphone 15 pro plus max", 0.100, 0.15, 10);
       if (one.empilhar(three)) {
        System.out.println("Empilhado");
       }
    if (one.empilhar(five ) == true)  {
        System.out.println( "Inserido");
    }
    if (one.empilhar(two) == true) {
        System.out.println("inserido");
    }else{
        System.out.println("Nao ");
    }

   System.out.println(one.desempilhar().getKg()); 

   System.out.println(one.alturaAtual());
    one.exibir();


       
    }
}
