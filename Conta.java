package Encapsulamento;

public class Conta {
    private String numero, nome, cpf;
    private double saldo, deposito, saque, extrato;

    public void setNumero(String n){
        this.numero = n;
    }
    public String getNumero(){
        return this.numero;
    }
    public void setNome (String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf (String n){
        this.cpf = n;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setSaldo(double d){
        this.saldo = d;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setDeposito(double d){
        this.deposito = d;
        this.saldo += this.deposito;
    }
    public void setSaque(double d){
        this.saque = d;
        this.saldo -= this.saque;
    }
    public double getExtrato(){
        double ex = this.saldo;
        return ex;
    }
}
