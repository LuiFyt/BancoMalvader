package model;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double calcularRendimento() {
        taxaRendimento = 0.5;

        return getSaldo() * taxaRendimento;
    }
}
