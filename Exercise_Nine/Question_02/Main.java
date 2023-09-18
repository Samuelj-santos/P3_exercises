package Exercise_Nine.Question_02;

public class Main {
    public static void main(String[] args) {
        ItemPedido sabao = new ItemPedido(8.0, "Sabão");
        ItemPedido ovos = new ItemPedido(10.0,"Bandeja de ovos");
        ItemPedido sabonete = new ItemPedido(4.0,"Sabonete");
        ItemPedido[] twei = new ItemPedido[]{sabao,sabonete,ovos};
        Pedido one = new Pedido(50, twei);

        ItemPedido brita = new ItemPedido(500, "Brita de construção");
        ItemPedido carvao = new ItemPedido(400,"Carvão");
        ItemPedido cimento = new ItemPedido(700,"Cimento de construção");
        ItemPedido[] twuu = new ItemPedido[]{brita,carvao,cimento};
        Pedido two = new Pedido(30,twuu);


        if (two.getValor() >= 500) {
            System.out.println("esse pedido tem valor maior que 500");
            System.out.println("O numero desse pedido é " + two.getNumero());
        }
    }
}
