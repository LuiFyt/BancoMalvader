package model;

public class Conta {

    private int numero;
    private String agencia;
    private double saldo = 0.0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public boolean sacar(double valor) {
        if (saldo < valor) return false;

        saldo = saldo - valor;

        return true;
    }

    public double consultarSaldo() {
        return saldo;
    }
 }
