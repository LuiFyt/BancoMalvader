package model;

public class Cliente extends Usuario {

    private String cliente;
    private Conta conta;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double consultarSaldo() {
        return conta.getSaldo();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            conta.depositar(valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            conta.sacar(valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }
}
