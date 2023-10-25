package Prova2;

public class Funcionario extends ClienteEspecial {
    
    private String setor;
    private int id;
    private double salario;


    public Funcionario(String nome, int idade, String cpf, boolean bomCliente, int pontos, double saldoDeCompras,String setor,int id,double salario) {
        super(nome, idade, cpf, bomCliente, pontos, saldoDeCompras);
        this.id = id;
        this.setor = setor;
        this.salario = salario;
    }

    public void renovarEstoque(int a , Item b ){
        b.aumentarestoque(a);
    }

    public void bloquearItem( Item a , boolean b){
     a.setDisponibilidade(b);
    }
}
