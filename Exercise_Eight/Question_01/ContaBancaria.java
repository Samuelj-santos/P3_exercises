package Question_01;

public class ContaBancaria {
private String nome ;
private int  conta;
private  double saldo;

public ContaBancaria(String nome, int conta) {
    this.nome = nome;
    this.conta = conta;
    this.saldo = 0.0;
}


public String getNome() {
    return this.nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getConta() {
    return this.conta;
}

public void setConta(int conta) {
    this.conta = conta;
}

public double getSaldo() {
    return this.saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

@Override
public String toString(){
    return "Seu nome é " + this.nome + " Sua conta é de numero " + this.conta + " Seu saldo é de " + this.saldo;
}




    
}
