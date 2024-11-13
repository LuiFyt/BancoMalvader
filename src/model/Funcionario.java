package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Usuario {
    private String codigoFuncionario;
    private String cargo;
    private List<Conta> contasGerenciadas = new ArrayList<>();
    private List<Cliente> clientesGerenciados = new ArrayList<>();

    public void abrirConta(Conta conta) {
        contasGerenciadas.add(conta);
        System.out.println("Conta aberta com sucesso: " + conta.getNumero());
    }

    public void encerrarConta(Conta conta) {
        if (contasGerenciadas.remove(conta)) {
            System.out.println("Conta encerrada com sucesso: " + conta.getNumero());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public Conta consultarDadosConta(int numeroConta) {
        for (Conta conta : contasGerenciadas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public Cliente consultarDadosCliente(int idCliente) {
        for (Cliente cliente : clientesGerenciados) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }

    public void alterarDadosConta(Conta conta) {
        for (Conta c : contasGerenciadas) {
            if (c.getNumero() == conta.getNumero()) {
                c.setSaldo(conta.getSaldo());
                System.out.println("Dados da conta atualizados com sucesso: " + conta.getNumero());
                return;
            }
        }
        System.out.println("Conta não encontrada para atualização.");
    }

    public void alterarDadosCliente(Cliente cliente) {
        for (Cliente c : clientesGerenciados) {
            if (c.getId() == cliente.getId()) {

                c.setNome(cliente.getNome());
                c.setCpf(cliente.getCpf());
                c.setTelefone(cliente.getTelefone());
                c.setEndereco(cliente.getEndereco());
                System.out.println("Dados do cliente atualizados com sucesso: " + cliente.getId());
                return;
            }
        }
        System.out.println("Cliente não encontrado para atualização.");
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        System.out.println("Funcionário cadastrado com sucesso: " + funcionario.getNome());
    }

    public void gerarRelatorioMovimentacao() {
        // falta implementar lógica para gerar relatório de movimentação
        System.out.println("Relatório de movimentação gerado com sucesso.");
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Conta> getContasGerenciadas() {
        return contasGerenciadas;
    }

    public void setContasGerenciadas(List<Conta> contasGerenciadas) {
        this.contasGerenciadas = contasGerenciadas;
    }

    public List<Cliente> getClientesGerenciados() {
        return clientesGerenciados;
    }

    public void setClientesGerenciados(List<Cliente> clientesGerenciados) {
        this.clientesGerenciados = clientesGerenciados;
    }
}
