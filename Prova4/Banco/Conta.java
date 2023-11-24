package Prova4.Banco;


public class Conta {
    protected int NConta;
    protected int  NAgencia;
    protected double saldo;
    protected  Cliente cliente;
    
    public Conta(int nConta, int nAgencia, double saldo, Cliente cliente) {
       this. NConta = nConta;
       this. NAgencia = nAgencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public int getNConta() {
        return NConta;
    }
    public void setNConta(int nConta) {
        NConta = nConta;
    }
    public int  getNAgencia() {
        return NAgencia;
    }
    public void setNAgencia(int nAgencia) {
        NAgencia = nAgencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void deposito(double valor){
        if (valor < 0) {
            System.out.println("Error");
        }else{
            this.saldo = this.saldo + valor;
        }
    }

    public void saque(double valor){
        if (valor > this.saldo) {
            System.out.println("Error");
        }else if (valor< 0) {
            System.out.println("Error");
        } else{
             this.saldo = this.saldo - valor;
        }

        }


        public void transferencia(Conta outro,double valorTransferencia){
            if (valorTransferencia > this.saldo || valorTransferencia <=0) {
                System.out.println("Error");
            }else{
                outro.setSaldo(outro.getSaldo() + valorTransferencia);
            }
        }

        public  String exibirSaldo(){
        return this.cliente.getNome() + " saldo: " + this.saldo;
        }
    }


