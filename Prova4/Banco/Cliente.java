package Prova4.Banco;

public class Cliente {

    private String nome;
    private String endereço;
    private String profissao;

    
    public Cliente(String nome, String endereço, String profissao) {
        this.nome = nome;
        this.endereço = endereço;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String  exibirAtributos(){
        return " nome: " + getNome() + " endereço: " + getEndereço() + " profissao: " + getProfissao();
    }

    
}