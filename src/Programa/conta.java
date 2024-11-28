package Programa;

import utilitarios.util;

public class conta {

    private static int contadorDeContas;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public conta(Pessoa pessoa) {
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNúmero da conta:" + this.numeroConta +
               "\nNome:" + this.pessoa.getNome() +
               "\nCPF:" + this.pessoa.getCPF() +
               "\nEmail:" + this.pessoa.getEmail() +
               "\nSaldo:" + util.doubleToString(this.getSaldo()) +
               "\n";
    }

    public void depositar(Double valor){
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
            }else{
            System.out.println("Não foi possível realizar o depósito");
            }
        }
    }
