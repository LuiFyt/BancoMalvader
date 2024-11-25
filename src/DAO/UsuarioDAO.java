/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.ConnectionFactory.desconectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Cliente;
import model.Funcionario;
import model.Usuario;

/**
 *
 * @author LuiF
 */
public class UsuarioDAO {
    public void save(Cliente c) throws Exception {
        String sql = "INSERT INTO usuario(nome,cpf,data_nascimento,telefone,tipo_usuario,senha) values(?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, String.valueOf(c.getDataNascimento()));
            stmt.setString(4, c.getTelefone()); 
            stmt.setString(5, c.getTipoUsuario());
            stmt.setString(6, c.getSenha());
            stmt.execute();
            desconectar(conn);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
    
    public void save(Funcionario f) throws Exception {
        String sql = "INSERT INTO usuario(nome,cpf,data_nascimento,telefone,tipo_usuario,senha) values(?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCpf());
            stmt.setString(3, String.valueOf(f.getDataNascimento()));
            stmt.setString(4, f.getTelefone()); 
            stmt.setString(5, f.getTipoUsuario());
            stmt.setString(6, f.getSenha());
            stmt.execute();
            desconectar(conn);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
    
        public void update(Cliente c) throws Exception {
        String sql = "update usuario set nome=?,cpf=?,data_nascimento=?,telefone=?,tipo_usuario=?,senha=? WHERE id_usuario=?";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, String.valueOf(c.getDataNascimento()));
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getTipoUsuario());
            stmt.setString(6, c.getSenha());
            stmt.setInt(7, c.getId());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void delete(Usuario u) throws Exception {
	String sql = "delete from usuario where id_usuario=?";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, u.getId());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public String conferirSenha(int id) {
        String senha = null;
        String sql = "SELECT senha FROM usuario WHERE cliente.id_usuario = ?";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet data = stmt.executeQuery();
            
            senha = data.getString("senha");
            desconectar(conn);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        
        return senha;
    }
    
    public Usuario findByCpf(String cpf) throws Exception {
        
        String id_usuario = null;
        String sql = "Select id_usuario from usuario where cpf=?";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet data = stmt.executeQuery();
            
            id_usuario = data.getString("id_usuario");
            desconectar(conn);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return findByCpf(cpf);
    }
}
