package model;

public class Cliente extends Usuario {

    private String cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double consultarSaldo() {
        return 0.0;
    }

    public void depositar(double valor) {
        
    }
}
