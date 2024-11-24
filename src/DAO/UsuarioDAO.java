/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Usuario;

/**
 *
 * @author LuiF
 */
public class UsuarioDAO {
    public void save(Usuario u) throws Exception {
        String sql = "INSERT INTO usuario(id_usuario,nome,cpf,data_nascimento,telefone,tipo_usuario,senha) values(null,?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getCpf());
            stmt.setString(3, String.valueOf(u.getDataNascimento()));
            stmt.setString(4, u.getTelefone());
            //stmt.setString(5, u.getTipo);
            stmt.setString(6, u.getSenha());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
    
        public void update(Usuario u) throws Exception {
        String sql = "update usuario set nome=?,cpf=?,data_nascimento=?,telefone=?,senha=? WHERE id_usuario=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getCpf());
            stmt.setString(3, String.valueOf(u.getDataNascimento()));
            stmt.setString(4, u.getTelefone());
            stmt.setString(5, u.getSenha());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void delete(Usuario u) throws Exception {
	String sql = "delete from usuario where id_usuario=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, u.getId());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void findById(Usuario u) throws Exception {
        String sql = "Select from usuario where id_usuario=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, u.getId());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
