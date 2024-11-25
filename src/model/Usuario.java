package model;

import DAO.UsuarioDAO;
import java.time.LocalDate;

public abstract class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private Endereco endereco;
    private String senha;
    private boolean logado;
    
    public enum tipoUsuario {
      FUNCIONARIO,
      CLIENTE
    };

    public boolean login(String senha) {
        UsuarioDAO u = new UsuarioDAO();
        String senhaDAO = u.conferirSenha(id);
	return senhaDAO.equals(senha);
    }

    public void logout() {
        if (logado) {
            logado = false;
            System.out.println("Logout realizado com sucesso.");
        } else {
            System.out.println("Usuário já está deslogado.");
        }
    }

    public String consultarDados() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento +
                "\nTelefone: " + telefone + "\nEndereço: " + endereco.toString();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }
}
