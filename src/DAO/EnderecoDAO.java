/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Endereco;

/**
 *
 * @author LuiF
 */
public class EnderecoDAO {
        public void save(Endereco en) throws Exception {
        String sql = "INSERT INTO endereco(id_endereco,cep,logradouro,numero_casa,bairro,cidade,estado) values(null,?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, en.getCep());
            stmt.setString(2, en.getLocal());
            stmt.setInt(3, en.getNumeroCasa());
            stmt.setString(4, en.getBairro());
            stmt.setString(5, en.getCidade());
            stmt.setString(6, en.getEstado());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
    public void update(Endereco en) throws Exception {
        String sql = "update endereco set cep=?,logradouro=?,numero_casa=?,bairro=?,cidade=?,estado=? WHERE id_endereco=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, en.getCep());
            stmt.setString(2, en.getLocal());
            stmt.setInt(3, en.getNumeroCasa());
            stmt.setString(4, en.getBairro());
            stmt.setString(5, en.getCidade());
            stmt.setString(6, en.getEstado());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void delete(Endereco en) throws Exception {
	String sql = "delete from endereco where id_endereco=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            //stmt.setInt(1,);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void findById(Endereco en) throws Exception {
        String sql = "Select from endereco where id_endereco=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            //stmt.setInt(1, ());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
